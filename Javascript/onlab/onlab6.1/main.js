// function creatListItem(Item) {
//   const $h1 = $('<h1/>', {
//     class: 'heading',
//     text: 'abcd',
//     onclick: function () {
//       console.log('click');
//     }
//   }); // tao 1 the h1, va truyen obj lam tham so thu 2 va cau hinh cho no
//   return $h1;
// }

const tasks = [
  {
    id: 1,
    text: "hoc jQuery",
    completed: false,
  },
  {
    id: 2,
    text: "hoc javacore",
    completed: true,
  },
  {
    id: 3,
    text: "hoc datbase",
    completed: true,
  },
];

function createTask(task) {
  // id, text, completed

  // const $li = $('<li/>', {
  //   text: task.text,
  // });
  const $li = $(`<li>${task.text}</li>`);
  const $btn = $('<button>Done</button>');
  $btn.on('click', function () {
    // chuyen task co id tuong ung thanh completed: true
    // kich hoat lai su kien de render lai trang
  });

  $btn.appendTo($li);
  return $li;
}

function createList(tasks) {
  const list = [];
  for (let i = 0; i < tasks.length; i++) {
    const $li = createTask(tasks[i]);
    list.push($li);
  }
  return list;
}

$(function () {
  const $list = $('.task-list');
  const list = createList(tasks);
  $.each(list, function (index, $item) {
    $item.appendTo($list);
  });
});

// $(function () {
//     const $username = $('.username');
//     $username.on('change', function (e) {
//         const value = $username.val().trim();

//         if (value.length < 6) {
//             $username.addClass('invalid');
//         } else {
//             $username.removeClass('invalid');
//         }
//     });
//     // const $h1 = creatListItem('abc');

//     // $username.after($h1);// chen the h1 sau the username
// })