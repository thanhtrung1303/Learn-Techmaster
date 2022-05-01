// $(function () {
//     const $tr = $('tr');
//     for (let i = 0; i < $tr.length; i++) {
//         const tr = $tr[i];
//         const $td = $(tr).children().eq(i);
//         $td.css({ backgroundColor: 'red' });
//     }
//     for (let i = 0; i < $tr.length; i++) {
//       const tr = $tr[i];
//       const $td = $(tr).children().eq($tr.length - i - 1);
//       $td.css({ backgroundColor: "red" });
//     }
// })

// $(function () {
//   $("tr").each(function (index, tr) {
//     let $td = $(tr).children();
//     $td
//       .filter(`:nth-child(${index + 1}), :nth-child(${$td.length - index})`)
//       .css({ backgroundColor: "red" });
//   });
// });

$(function () {
  const $box = $(".box");
  console.log($box.html()); //document.querySelector(".box").innerHTML
    $box.html("<p>Lol</p>"); // box.innerHTML = "<p>Lol</p>""
    
    console.log($box.text());
    $box.text("<p>hihihi</p>");

    console.log($box.attr("class"));
    $box.attr({ class: 'box1 box2 box3', id: 'hehe' });
    
    console.log($box.width());
    const $input = $('.text');

    console.log($box.val());
    
})