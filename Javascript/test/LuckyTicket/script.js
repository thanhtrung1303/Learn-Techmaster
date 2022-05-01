$(function () {
    $('.note span').hide();
    $('.note').append('<button>Click me</button>');
    // $(".note:first > button").on("click", function () {
    //   $(".note:first > span").show();
    //   $(".note:first > button").remove();
    // });
    // $(".note:last > button").on("click", function () {
    //   $(".note:last > span").show();
    //   $(".note:last > button").remove();
    // });
    $('.note').children('button').click(function () {
        $(this).prev().show();
        $(this).remove();
    })
});
