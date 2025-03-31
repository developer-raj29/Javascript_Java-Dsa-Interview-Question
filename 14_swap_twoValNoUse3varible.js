let a = 5;
let b = 10;

console.log("a:", a); // Output: a: 5
console.log("b:", b); // Output: b: 10
a = a + b;
b = a - b;
a = a - b;
console.log("a:", a); // Output: a: 10
console.log("b:", b); // Output: b: 5
