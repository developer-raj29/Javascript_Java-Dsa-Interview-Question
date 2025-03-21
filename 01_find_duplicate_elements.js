// How To find duplicate elements in array in javascript|Javascript Coding Interview Question #1

const arr = [1, 2, 8, 2, 9, 8, 9];
const duplicate = arr.filter(
  (value, index, arr) => arr.indexOf(value) !== index
);
console.log("Duplicate No : ", duplicate); // output: Duplicate No :  [ 2, 8, 9 ]

// How To find duplicate elements in String in javascript|Javascript Coding Interview Question #1
const str = "welcome to the company";

const singleChar = [];
const op = str.split("");

op.filter((value, index) => {
  if (index === op.indexOf(value) && value !== " ") {
    singleChar.push(value, index);
  }
});

console.log(singleChar);
//  [
//   'w', 0,   'e', 1,   'l', 2,   'c',
//   3,   'o', 4,   'm', 5,   't', 8,
//   'h', 12,  'p', 18,  'a', 19,  'n',
//   20,  'y', 21
// ]
