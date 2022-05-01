// const myFamily = {
//   Joel: 32,
//   Fred: 33,
//   Reginald: 34,
//   Susan: 35,
//   Julian: 36,
// };


// function afterNYears(family, years) {
//   //tao 1 obj moi chua ket qua
//   let result = {};
//   for (let name in family) {
//      result[name] = family[name] + years;
//   }
//   return result;
// }
// console.log(afterNYears(myFamily, 10));

// const order = { 'sony': 6, 'samsung': 30 };

// function freeShipping(order) {
//   let total = 0;
//   for (let product in order) {
//     total += order[product];
//   }
//   return total >= 50;
// }

//   console.log(freeShipping(order));

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
//   name = name.toUpperCase();
//   let total = 0;
//   for (let i = 0; i < name.length; i++) {
//     total += scores[name[i]];
//   }
//   if (total <= 60) console.log('not good')
//   else if (total <= 300) console.log('good')
//   else if (total <= 599) console.log('very good')
//   else console.log('best')
// }
// nameScore('AAAAAAA')


// const obj = { a: 1, b: 2, c: 3, d: 4 };

// function invert(inputobj) {
//   let copy = {};
//   for (let key in inputobj) {
//     copy[inputobj[key]] = key;
//   }
//   return copy;
// }

// console.log((obj))
// console.log(invert(obj))

// const persons = {
//     Emma: 71,
//     Jack: 45,
//     Amy: 15,
//     Ben: 29
// };

// function oldest(persons) {
//     let result = {};
//     let max = 0;
//     for (let name in persons) {
//         if (persons[name] > max) {
//             max = persons[name];
//             result = {
//                 [name]: max
//             }
//         }
//     }
//     return result;
// }
// console.log(oldest(persons))

// function isUppercase(char) {
//     return char == char.toUpperCase();
// }

// let str = 'tH fOX iS cOMING fOR tHE cHICKEN';
// function reverseCase(str) {
//   let result = "";
//   for (let i = 0; i < str.length; i++) {
//     const char = str[i];
//     if (isUppercase(char)) {
//       result += str[i].toLowerCase();
//     } else {
//       result += str[i].toUpperCase();
//     }
//   }
//   return result;
//   const word = result.split(" "); // 'a b' => ['a','b']
//   const reverse = word.reverse(); // ['a','b'] => ['b','a']
//   result = reverse.join(" "); // ['b','a'] => 'b a'
// }

// console.log(reverseCase(str));

// const arr = ['nova', 'ann', 'anna'];
// function chatroomStatus(arr) {
//   if (arr.length == 0) return 'No more online';
//   else if (arr.length <= 2) return arr.join(' and ') + ' online';
//     // slice(from, to) dung de sao chep cac gia tri trong mang
//     //join(saperator) noi mang thanh chuoi
//   else return arr.slice(0, 2).join(", ") + " and " + (arr.length - 2) + ' more online';
// }
// console.log(chatroomStatus(arr))

// let arr = [30, 40, 60, 60];
// function secondLargest(numbers) {
//   let max = arr[0];
//   let secondmax;
//   for (let number of arr) {
//     if (number > max) {
//       secondmax = max;
//       max = number;
//     } else if (secondmax && number != max && number > secondmax) secondmax = number;
//     else if (isNaN(secondmax) && number != 0) secondmax = number;
//   }
//   return secondmax
// }
// console.log(secondLargest(arr))

let courses = [
  {
    id: 1,
    name: "javascript",
    coin: 250,
  },
  {
    id: 2,
    name: "html, css",
    coin: 0,
  },
  {
    id: 3,
    name: "php",
    coin: 0,
  },
  {
    id: 4,
    name: "ruby",
    coin: 0,
  },
  {
    id: 5,
    name: "php",
    coin: 0,
  },
];

courses.forEach(function (course, idx) {
    console.log(idx, course)
})

const isfree = courses.every(function (course, index) {
  return course.coin === 0;
});

console.log(`ket qua la ${isfree}`);

const isfree1 = courses.some(function (course, index) {
  return course.coin === 0;
});
console.log(`ket qua la ${isfree1}`);

let course = courses.find(function (course, index) {
    return course.name == 'ruby';
})
console.log(course)

let course1 = courses.filter(function (course, index) {
  return course.name == "php";
});
console.log(course1);

// phuong thuc map dung de chinh sua, thay doi element cua 1 array
let newCourse = courses.map(function (course, index) {
    return `<h2>${course.name}</h2>`
        //{ id: course.id,
        // name: `khoa hoc ${course.name}`,
        // coin: course.coin,
        // textCoin: `gia ${course.coin}`,}
})
console.log(newCourse);


let totalCoin = courses.reduce(function (total, course) {
  return total + course.coin;
}, 0);
console.log(totalCoin);

let depthArray = [1, 2, [3, 4], 5, 6, [7, 8, 9]];
let flatArray = depthArray.reduce(function (flatOutput, depthItem) {
  return flatOutput.concat(depthItem)
}, []);
 console.log(flatArray)

 //make reduce

const numbers = [1, 2, 3, 4, 5];

const result = numbers.reduce(function (total, number) {
  return total + number;
}, 0);

console.log(result)

let result1 = courses.forEach(function (course,idx) {
  console.log(course)
})


