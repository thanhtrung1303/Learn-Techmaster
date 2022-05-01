let a = prompt("Mời nhập a: ");
let b = prompt("Mời nhập b: ");
let c = prompt("Mời nhập c: ");
let p = (Number(a) + Number(b) + Number(c)) / 2;
function findArea(a, b, c) {
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
}
alert("Diện tích hình tam giác là: " + findArea(a, b, c).toFixed(2));
console.log("Diện tích hình tam giác là: " + findArea(a, b, c).toFixed(2));
