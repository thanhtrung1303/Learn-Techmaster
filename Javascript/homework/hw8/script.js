let tasks = [];

function createItem(task) {
  const $template = $(
    document.querySelector(".task-item-template").content.firstElementChild
  ).clone();

  $template.find(".task-text").text(task.name);
  $template.find(".btn-delete").on("click", function () {
    deleteTask(task.id);
  });

  return $template;
}

function createList(tasks) {
  const list = tasks.map(function (task) {
    return createItem(task);
  });

  return list;
}

function render(tasks) {
  const $list = $(".task-list");
  const list = createList(tasks);

  $list.html("");
  $list.append(...list);
}

function handleFormSubmit(e) {
  e.preventDefault();

  const $input = $(".form-text");
  const title = $input.val().trim();

  if (title.length == 0) return;

  $.ajax("https://jsonplaceholder.typicode.com/users", {
    method: "POST",
    contentType: "application/json",
    data: JSON.stringify({ title }),
    success: function (data) {
      tasks.push(data);
      render(tasks);
      $input.val("");
    },
  });
}

function deleteTask(id) {
  const index = tasks.findIndex(function (task) {
    return task.id == id;
  });

  if (index !== -1) {
    tasks.splice(index, 1);
  }

  render();
}

function clearAll() {
  tasks.length = 0;
  render();
}

$(function () {
  $(".task-form").on("submit", handleFormSubmit);
  $(".btn-clear").on("click", clearAll);

  // tự kiểm tra trạng thái - status code
  // tự kiểm tra kiểu dữ liệu phản hồi và chuyển đổi cho phù hợp
  $.ajax("https://jsonplaceholder.typicode.com/users", {
    success(response) {
      tasks = tasks.concat(response);
      render(response);
    },
    error(error) {
      console.log("failure");
      console.log(error);
    },
  });
});
