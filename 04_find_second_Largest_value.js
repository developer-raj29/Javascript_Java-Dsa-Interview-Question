// How To find second Largest value in array|Javascript Coding Interview Question #4 |
const arr = [2, 8, 9, 10, 15];

let max = arr[0];
let secondMax = -1;

for (let i = 1; i < arr.length; i++) {
  if (arr[i] > max) {
    secondMax = max;
    max = arr[i];
  } else if (arr[i] > secondMax && arr[i] !== max) {
    secondMax = arr[i];
  }
}

console.log("Max:", max); // ➤ Max: 15
console.log("Second Max:", secondMax); // ➤ Second Max: 10
