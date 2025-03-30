function sumElement(array) {
  let sum = 0;
  for (let i = 0; i < array.length; i++) {
    sum += array[i];
  }
  return sum;
}

const array = [1, 2, 3, 4, 5];
const sum = array.reduce(
  (accumulator, currentValue) => accumulator + currentValue,
  0
);
console.log("Sum of all elements:", sum); // ➤ Sum of all elements: 15

const sumAns = sumElement(array);
console.log("Sum of all elements:", sumAns); // ➤ Sum of all elements: 15
