const arr = [1, 2, 8, 2, 9, 8, 9];
const duplicate = arr.filter(
  (value, index, arr) => arr.indexOf(value) !== index
);
console.log("Duplicate No : ", duplicate); // output: