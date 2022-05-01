const tasks = [];

localStorage.setItem("tasks", JSON.stringify(tasks));

JSON.parse(localStorage.getItem("tasks"));

function createNewTask(text) {
  tasks.push({
    id: Math.floor(Math.random() * 9000),
    text,
  });
}

function createItem(task) {
  const $template = $(
    document.querySelector(".task-item-template").content.firstElementChild
  ).clone();

  $template.find(".task-text").text(task.text);
  $template.find(".btn-delete").on("click", function () {
    deleteTask(task.id);
  });

  return $template;
}

function createList() {
  const list = tasks.map(function (task) {
    return createItem(task);
  });

  return list;
}

function render() {
  const $list = $(".task-list");
  const list = createList();

  $list.html("");
  $list.append(...list);
}

function handleFormSubmit(e) {
  e.preventDefault();

  const $input = $(".form-text");
  const text = $input.val().trim();

  if (text.length == 0) return;

  createNewTask(text);
  render();
  $input.val("");
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
  render();
});
