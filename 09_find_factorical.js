function factorial(n) {
  let ans = 1;
  while (n > 0) {
    ans *= n;
    n--;
  }
  return ans;
}

const num = 5;
// const factorial = (n) => {
//   if (n === 0 || n === 1) {
//     return 1;
//   }
//   return n * factorial(n - 1);
// };

console.log("Factorial of", num, "is", factorial(num)); // ➤ Factorial of 5 is 120
