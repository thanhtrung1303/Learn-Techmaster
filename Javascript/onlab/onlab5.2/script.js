const directions = [
  "to right",
  "to left",
  "to bottom",
  "to top",
  "to right bottom",
  "to right top",
  "to left bottom",
  "to left top",
];

function getRandomDirection() {
  // trả về một hướng màu ngẫu nhiên
  return directions[Math.floor(Math.random() * directions.length)];
}

function getRandomHexColor() {
  // trả về một mã màu hex ngẫu nhiên
  let randomColor = Math.floor(Math.random() * 16777215).toString(16);

  return randomColor.padStart(6, "0");
}

$(function () {
  // truy vấn ra các thẻ cụ thể (body, các thẻ liên quan hướng, màu, nút)
  const $body = $("body");
  const $direction = $(".direction");
  const $from = $(".from");
  const $to = $(".to");
  const $btn = $(".btn-change");

  function changeColor() {
    const randomDirection = getRandomDirection();
    const from = getRandomHexColor();
    const to = getRandomHexColor();

    console.log(randomDirection, from, to);

    $body.css({
      backgroundImage: `linear-gradient(${randomDirection}, #${from}, #${to})`,
    });
    $direction.text(randomDirection);
    $from.text(from).css({ color: `#${from}` });
    $to.text(to).css({ color: `#${to}` });
  }

  changeColor();

  $btn.on("click", changeColor);
});
