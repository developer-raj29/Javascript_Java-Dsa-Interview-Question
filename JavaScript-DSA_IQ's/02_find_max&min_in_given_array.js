// How To find max/min in a given array in javascript| Coding Interview Questions - #2 |
// way to solve 1
const arrNum = [1, 97, 65, 98, 65, 87, 78];

const maxFunction = (arr) => {
  return arr.reduce((prev, curr) => {
    return prev > curr ? prev : curr;
  });
};

console.log("maxFunction: ", maxFunction(arrNum));

const minFunction = (arr) => {
  return arr.reduce((prev, curr) => {
    return prev < curr ? prev : curr;
  });
};

console.log("minFunction: ", minFunction(arrNum));

// way to solve 2
// let max = arrNum[0];

// for (let i = 1; i < arrNum.length; i++) {
//   if (arrNum[i] > max) {
//     max = arrNum[i];
//   }
// }

// console.log(max); // 98
