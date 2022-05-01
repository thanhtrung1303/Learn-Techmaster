    // CÂU1: Tính chỉ số BMI
// function BMI(w, h) {
//     return w / (h ** 2);
// }
// let bmi = BMI(60, 1.65);
// if (bmi <= 16) {
//   console.log(bmi, "gầy độ III");
// } else if (bmi > 16 && bmi <= 17.5) {
//   console.log(bmi, "gầy độ II");
// } else if (bmi > 17.5 && bmi <= 18.5) {
//   console.log(bmi, "gầy độ i");
// } else if (bmi > 18.5 && bmi <= 25) {
//   console.log(bmi, "bình thường");
// } else if (bmi > 25 && bmi <= 30) {
//   console.log(bmi, "hơi béo");
// } else if (bmi > 30 && bmi <= 35) {
//   console.log(bmi, "béo phi độ I");
// } else if (bmi > 35 && bmi <= 40) {
//   console.log(bmi, "béo phi độ II");
// }
// else {
//     console.log("béo phi độ III");
// }

    // CÂU 2: Tìm số lớn nhất
// function findmax(a, b, c) {
//     let max = a;
//     if (b > max) max = b;
//     if (c > max) max = c;
//     return max;
// }

    // CÂU 3: Xác định năm nhuận
// function isLeafYear(y) {
//     return y %  400 == 0 || (y % 100 != 0 && y % 4 == 0)
// }
// console.log(isLeafYear(2002));

    // CÂU 4: Xác định chẵn lẽ từ 1 đến 10
// for (let i = 0; i <= 10; i++) {
//     if (i % 2 == 0) {
//         console.log(i + " la so chan")
//     }
//     else {
//         console.log(i + " la so le")
//     }
// }

    // CÂu 5: in sô chia hết 15 = FizzBuzz, chia hết 3 = Fizz, chia hết 5 = Buzz
// for (let i = 0; i <= 15; i++) {
//     if (i % 3 == 0) {
//         if (i % 5 == 0) console.log(i + " FizzBuzz");
//         else {
//             console.log(i + " Fizz");
//         }
//     } else {
//         if (i % 5 == 0) {
//             console.log(i + " Buzz");
//         }
//         else {
//             console.log(i);
//         }
//     }
// }

// for (let i = 0; i <= 15; i++){
//     if (i % 15 == 0) console.log(i, "FizzBuzz");
//     else if (i % 5 == 0) console.log(i, "Buzz");
//     else if (i % 3 == 0) console.log(i, "Fizz")
//     else console.log(i);
// }

    // CÂU 6: Tìm số nguyên tố
// let n = 13;
// if (n < 2) console.log(n, "khong phai so nguyen to");
// else {
//     let isprime = true;
//     for (let i = 0; i <= n / 2; i++){
//         if (n % i == 0) {
//             isprime = false;
//             break;
//         }
//     }
//     if (isprime) console.log(n, "la so nguyen to");
//     else console.log(n, "khong phai so nguyen to");
// }

    // CÂU 7: tính số lần gấp giấy
// let paperThickness = 0.1;
// let count = 0;
// while (paperThickness < 1000) {
//     paperThickness *= 2;
//     count++;
// }
// console.log(count, paperThickness);

    // CÂU 8: Tìm số tuổi cha gấp đôi tuổi con
// let ageDad = 30;
// let ageSon = 2;
// let count = 0;
// while (ageDad != 2 * ageSon) {
//     ageDad++;
//     ageSon++;
//     count++;
// }
// console.log(count);

    // CÂU 9: Tìm số gà và chó
// for (let i = 0; i < 36; i++) {
//     if (2 * i + (36 - i) * 4 == 100) {
//         console.log("số gà: ", i);
//         console.log("số chó: ", 36 - i);
//     }
// }

    // CÂU 10: Tìm số fibonacci
// function fiboAt(n) {
//     let a = 0,
//         b = 1,
//         c;
//     if (n <= 0) return "N phai lon hon 0";
//     if (n == 1) return 0;
//     if (n == 2) return 1;
//     for (let i = 2; i < n; i++) {
//         c = a + b;
//         a = b;
//         b = c;
//     }
//     return c;
// }
// console.log(fiboAt(3));

    //  CÂU 11: tính lương
// function calcSalary(hoursWorked, hourlySalary){
// let grossSalary = hoursWorked * hourlySalary;
// let avgHours = hoursWorked / 25;
// if (avgHours >= 8) netSalary = grossSalary + 500000;
// else netSalary = grossSalary - 500000;
// return netSalary;
// }
// console.log(calcSalary(200, 25000));

    // CÂU 12: Tính điểm tốt nghiệp
// function calcGrade(p) {
//   if (p < 4) console.log("Xếp loại F");
//   else if (p < 5.5) console.log("Xếp loại D");
//   else if (p < 7) console.log("Xếp loại C");
//   else if (p < 8.5) console.log("Xếp loại B");
//   else console.log("Xếp loại A");
// }
// calcGrade(8.5);

    // CÂU 13: Tổng số nguyên tố
// function isprime(n) {
//     if (n < 2) return false;
//     for (let i = 2; i <= n / 2; i++) {
//         if (n % i == 0) return false;
//     }
//     return true;
// }
// function showPrimeNumbersInRange(a, b) {
//   for (let i = a; i <= b; i++) {
//     if (isprime(i)) console.log(i);
//   }
// }
// showPrimeNumbersInRange(0, 20);

// CÂU 14: Tính hóa đơn nước
// function calcWaterBill(m) {
//     if (m < 5) return money = 45000;
//     else if (m <= 10) return money = 45000 + 9000*(m - 5);
//     else if (m <= 20) return money = 45000 + 11000*(m - 10) + 9000*(m-5);
//     else if (m <= 30) return money = 45000 + 13000 * (m - 20) + 11000 * (m - 10) + 9000 * (m - 5);
//     else return money = 45000 + 15000* (m - 30) + 13000 * (m - 20) + 11000 * (m - 10) + 9000 * (m - 5);
// }

// console.log(calcWaterBill(11));

