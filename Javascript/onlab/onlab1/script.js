console.log("1234")
// const my_name = "nova"; Hằng số, không thay đổi được giá trị
// let my_age = 28; Khai báo biến và không được phép khai báo lại


// console.log("my name is", name)
// console.log("my age is", myage)

let myself = {
    name: "nova",
    age: 28,
    job: "student",
    favorites: ["game", "music", "sleep"],
    phone: {
        brand: "iphone",
        color: "black",
    },
    study() {
        console.log("study js");
    },
};
function display(obj, key) {
    if (typeof (obj[key]) == "function") {
      obj[key]();
    } else {
      console.log(obj[key]);
    }
};

display(myself, "study");
display(myself, "name");

console.log(myself);
console.log(myself.favorites);
console.log(myself.phone.brand);

console.log(["name"]);

let a = 1,
b = (a * 2) / 2,
    c = a-- + b++,
    d = "-0";
console.log(a - b - c - d);
console.log(a + b - c + d);
console.log(a++ - (b++ / c) * d);
console.log(--a + -b/c -d)
console.log(d - --a - ++b * c);










