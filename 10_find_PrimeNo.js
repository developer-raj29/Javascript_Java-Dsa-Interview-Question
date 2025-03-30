// function prime(arr) {
//   const res = [];

//   for (let i = 0; i < arr.length; i++) {
//     if (arr[i] % 2 !== 0) {
//       res.push(arr[i]);
//     }
//   }
//   return res;
// }

// const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
// const primeAns = prime(arr);
// console.log("Prime Numbers:", primeAns); // ➤ Prime Numbers: [2, 3, 5, 7]

function isPrime(num) {
  if (num < 2) return false; // 0 and 1 are not prime
  for (let i = 2; i * i <= num; i++) {
    // Check divisibility up to sqrt(num)
    if (num % i === 0) return false; // If divisible, not a prime
  }
  return true;
}

function prime(arr) {
  const res = [];
  for (let i = 0; i < arr.length; i++) {
    if (isPrime(arr[i])) {
      res.push(arr[i]); // Add only prime numbers
    }
  }
  return res;
}

const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const primeAns = prime(arr);
console.log("Prime Numbers:", primeAns);
// Output: Prime Numbers: [2, 3, 5, 7]
