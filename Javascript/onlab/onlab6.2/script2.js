// const tasks = [
//   {
//     id: 1,
//     text: "Buy new laptop",
//   },
//   {
//     id: 2,
//     text: "Complete all tasks",
//   },
// ];

const tasks = load();


function load() {
  const data = localStorage.getItem('tasks');
  if (data) {
    return JSON.parse(data);
  } else {
    return [];
  }
}

function save() {
  localStorage.setItem('task', JSON.stringify(tasks));
}

function createNewTask(text) {
  tasks.push({
    id: Math.floor(Math.random() * 9000),
    text,
  });

  return tasks[tasks.length - 1];
}

function createItem(task) {
  const $template = $(
    document.querySelector(".task-item-template").content.firstElementChild
  ).clone();

  $template.find(".task-text").text(task.text);
  $template.find(".btn-delete").on("click", function () {
    deleteTask(task.id);
    $template.remove();
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

  $list.append(...list);
  updateSummary();
}

function handleFormSubmit(e) {
  e.preventDefault();

  const $input = $(".form-text");
  const text = $input.val().trim();

  if (text.length == 0) return;

  const newTask = createNewTask(text);
  console.log(newTask);
  const $newItem = createItem(newTask);
  $(".task-list").append($newItem);

  $input.val("");
  updateSummary();
}

function deleteTask(id) {
  const index = tasks.findIndex(function (task) {
    return task.id == id;
  });

  if (index !== -1) {
    tasks.splice(index, 1);
  }

  save();
  updateSummary();
}

function updateSummary() {
  $(".task-numbers").text(tasks.length);
}

function clearAll() {
  tasks.length = 0;
  $(".task-list").html("");
  save();
  updateSummary();
}

$(function () {
  $(".task-form").on("submit", handleFormSubmit);
  $(".btn-clear").on("click", clearAll);
  render();
});
