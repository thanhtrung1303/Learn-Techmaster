// const myFamily = {
//   Joel: 32,
//   Fred: 44,
//   Reginald: 65,
//   Susan: 33,
//   Julian: 13,
// }

// function afterNYears(family, years) {
//   // tạo một object mới chứa kết quả
//   let result = {};
//   for (let name in family) {
//     result[name] = family[name] + years;
//   }
//   return result;
// }
// console.log(afterNYears(myFamily, 10));

// const order = { "Flatscreen TV": 399.99 };
// let total = 0;
// function freeShipping(order) {
//     for (let product in order) {
//         total += order[product];
//     }
//     return total <= 50;
// }
// console.log(freeShipping(order));

// const scores = {
//   A: 100,
//   B: 14,
//   C: 9,
//   D: 28,
//   E: 145,
//   F: 12,
//   G: 3,
//   H: 10,
//   I: 200,
//   J: 100,
//   K: 114,
//   L: 100,
//   M: 25,
//   N: 450,
//   O: 80,
//   P: 2,
//   Q: 12,
//   R: 400,
//   S: 113,
//   T: 405,
//   U: 11,
//   V: 10,
//   W: 10,
//   X: 3,
//   Y: 210,
//   Z: 23,
// };

// function nameScore(name) {
//     name = name.toUpperCase();
//     let total = 0;

//     for (let i = 0; i < name.length; i++) {
//         const char = name[i];
//         const score = scores[char];
//         total += score;
//     }
//     if (total <= 60) console.log('NOT TOO GOOD');
//     else if (total <= 300) console.log("PRETTY GOOD");
//     else if (total <= 599) console.log("VERY GOOD");
//     else console.log("THE BEST");
// }
// console.log(nameScore('aaaaaa'));

// let check = {a: 1, b: 2, c: 3};
// function reverse(inputObj) {
//     let copy = {};
//     for (let key in inputObj) {
//         let c = inputObj[key];
//         copy[c] = key;
//     }
// return copy;
// }

// console.log(reverse(check));

// Cho một đối tượng chứa tên và tuổi của một nhóm người, hãy trả về tên của người lớn tuổi nhất.
// // Ví dụ
// oldest({
// 	Emma: 71,
// 	Jack: 45,
// 	Amy: 15,
// 	Ben: 29
// }) // "Emma"

// let person = {
//   	Emma: 71,
//   	Jack: 45,
//   	Amy: 15,
//   	Ben: 29
// };

// function oldest(person) {
//     let result = null;
//     let max = 0;
//     for (let name in person) {
//         if (person[name] > max) {
//             max = person[name];
//             result = {
//                 [name]: max,
//             };
//         }
//     }
//     return result;
// }
// console.log(oldest(person));

let str = "tHE fOX iS cOMING fOR tHE cHICKEN";
function isUPPER(char) {
    return char == char.toUpperCase();
}
function reverseCase(str) {
    let result = '';
    for (let i = 0; i < str.length; i++) {
        const char = str[i];
  
        if (isUPPER(char)) {
            result += str[i].toLowerCase();
        } else {
            result += str[i].toUpperCase();
        }
    }

    return result.split(" ").reverse().join(' ');
}

console.log(reverseCase(str));

