let p = prompt("Mời nhập số tiền gốc ban đầu: ");
let r = prompt("Mời nhập lãi suất hàng năm: ");
let n = prompt("Mời nhập số lần ghép lãi 1 năm: ");
let t = prompt("Mời nhập số năm gửi ngân hàng: ");
function compoundInterest(p, r, n, t) {
  return (a = p * (1 + r / n) ** (n * t));
}
alert("lãi suất kép ngân hàng là: " + compoundInterest(p, r, n, t));
console.log(compoundInterest(p, r, n, t));
