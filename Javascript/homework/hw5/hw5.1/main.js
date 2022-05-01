function calBmi(weight, height) {
    return weight / height ** 2;
}

function getContent(bmi) {
  if (isNaN(bmi) || bmi == 0) return "Mời nhập chiều cao và cân nặng của bạn";
  else if (bmi <= 16) return "Quá Gầy";
  else if (bmi <= 18.5) return "Gầy";
  else if (bmi <= 23) return "Bình thường";
  else if (bmi <= 25) return "Béo";
  else return "Béo phì";
}

$(function () {
  const $Weight = $(".input-weight");
  const $Height = $(".input-height");
  const $bmi = $(".result-bmi");
  const $content = $(".content-bmi");
  const $btn = $(".btn-bmi");

  function calculate() {
    let bmi = calBmi($Weight.val(), $Height.val());
    let contentBmi = getContent(bmi);
    $bmi.text(bmi.toFixed(2));
    $content.text(contentBmi);
  }
  
  calculate();
  $btn.on("click", calculate);
});

