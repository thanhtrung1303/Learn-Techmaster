// arr = [1, 2, 3, 4, 5];
// function minmax(arr) {
//   let min = arr[0];
//   let max = arr[0];
//   for (let value of arr) {
//     if (value < min) {
//       return min = value;
//     }
//     if (value > max) {
//       return max = value;
//     }
//   }
//   return [min, max];
// }
// console.log(minmax(arr));

// let arr = ["Adam", "Sarah", "Malcolm"];

// function societyName(arr) {
//     let sortedArr = Object.assign([], arr);
//     let name = "";
//     for (let value of sortedArr) {
//         name += value.charAt(0);
//     }
//     return name;
// }

// console.log(societyName(arr));

// 3. Viết hàm chatroomStatus(users) nhận một mảng chứa tên users trả về text cho biết số lượng users trong phòng trò chuyện dựa trên các quy tắc sau:
// Nếu không có ai thì kết quả là No one online
// Nếu có 1 người thì kết quả là user1 online
// Nếu có 2 người thì kết quả là user1 and user2 online
// Nếu có nhiều hơn 2 người thì kết quả là hai tên đầu tiên và thêm vào and n-2 more online.
// let arr = ["s234f", "mailbox2"];
// function chatroomStatus(arr) {
//     length = arr.length;
//     if (length == 0) {
//         console.log("No one online");
//     }
//     else if (length <= 2) {
//         return arr.join(' and ') + 'online';
//     }
//     else {
//         arr.slice(0, 2).join(', ') + ' and ' + (length - 2) + ' more online';
//     }
// }

// console.log(chatroomStatus(arr))

// 4.Viết hàm secondLargest(numbers) nhận một mảng các số bất kỳ, tìm và trả về số lớn thứ hai trong mảng (lưu ý trường hợp có nhiều giá trị trùng nhau)
// Ví dụ:

// secondLargest([10, 50, 40, 30, 20, 40, 50]) // result 40

// let arr = [10, 50, 40, 30, 20, 40, 50];

// function secondLargest(arr) {
//     let max = arr[0];
//     let secondmax;
//     for (let value of arr) {
//         if (value > max) {
//             secondmax = max;
//             max = value;
//         }
//         else if (secondmax && value != max && value > secondmax) secondmax = value;
//         else if (isNaN(secondmax) && value != max) secondmax = value;
//     }
//     return secondmax;
// }
// console.log(secondLargest(arr));

// 5.Cho một danh sách 2D gồm mảng các chữ cái và một danh sách chỉ mục, hãy tìm các chữ cái trên các chỉ mục đã cho và trả về dưới dạng một chuỗi
// Ví dụ:
// const arr = [
// 	["m", "u", "b"],
// 	["a", "s", "h"],
// 	["i", "r", "1"]
// ]
// const idx = [1, 3, 5, 8];

// function findByIndex(arr, idx) {
//     let stretchArray = [];
//     let char = '';
//     for (let i of arr) {
//         stretchArray = stretchArray.concat(i);
//     }
//     for (let i of idx) {
//         char += stretchArray[i - 1];
//     }
//     return char;
// }
// console.log(findByIndex(arr, idx))

// Viết hàm spelling(word) nhận vào một từ và đánh vần nó, bằng cách nối liên tiếp các chữ cái cho đến khi hoàn thành từ đầy đủ, kết quả trả về là một mảng
// Ví dụ:

// spelling("happy") -> ["h", "ha", "hap", "happ", "happy"]
// let str = 'happy';

// function spelling(word) {
//     let result = [];
//     for (let i = 1; i <= str.length; i++) {
//         result.push(str.slice(0, i))
//     }
//     return result;
// }
// console.log(spelling(str));


// 7. Món salad trái cây ngon nhất khi trái cây được thái thành hạt lựu nhỏ và trộn đều! Viết hàm fruitSalad(fruits) nhận vào một mảng các loại trái cây (tên), cắt mỗi quả làm đôi (cắt chuỗi), sau đó sắp xếp các phần theo thứ tự abc và nối vào thành một chuỗi duy nhất.
// Ví dụ:

// fruitSalad(["apple", "pear", "grapes"]) // "apargrapepesple"

// Cắt đôi ["ap", "ple", "pe", "ar", "gra", "pes"]
// Sắp xếp: ["ap", "ar", "gra", "pe", "pes", "ple"]
// Kết quả món salad: "apargrapepesple"

let vegettable = ["apple", "pear", "grapes"];
function fruitSalad(str) {
    let result = [];
    for (let i of vegettable) {
        let half = Math.floor(i.length / 2);  
        //push(value) them gia tri vao cuoi mang
        //slice(from, to) sao chep cac gia tri trong mang
        //join(saperator) noi mang thanh chuoi
        result.push(i.slice(0, half), i.slice(half));
    }
    return result.sort().join('');
}
console.log(fruitSalad(vegettable));



