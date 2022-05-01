function calTip(amount, quality, number) {
    return amount * (quality / 100) / number;
}

$(function () {
    const $inputAmount = $(".input-amount");
    const $inputNumber = $(".input-number");
    const $selectQuality = $(".select-quality");
    const $tipPerson = $(".tip-person");
    const $btn = $(".btn-tip");
    
    function calculate() {
        let calculateTip = calTip($inputAmount.val(), $selectQuality.val(), $inputNumber.val());
        $tipPerson.text(calculateTip.toFixed(2));
    }

    calculate();
    $btn.on("click", calculate);
});
