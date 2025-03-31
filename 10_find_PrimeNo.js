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
// console.log("Prime Numbers:", primeAns); // ➤ Prime Numbers: [2, 3, 5, 7]o

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

/*
APPROACH:
1. create a function primeNo and their parameter is arr.
2. create an empty array res.
3. loop iterate the arr from i = 0 to i < arr.length ; i++.
4. check if arr[i] isprime or condition is true then push arr[i] into res array.
5. other wise jump next iteration.
6. return res array
------------------------------------------------------------
7. create an isPrime function to check prime number.
8. check if num < 2 then return false. [ 0 and 1 are not prime]
9. loop iterate from i = 2 to i * i <= num; i++.
10. check if num % i === 0 then return false. [If divisible, not a prime]
11. return true.
12. call prime function and pass arr as argument.
13. print the result.
*/

const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const primeAns = prime(arr);
console.log("Prime Numbers:", primeAns);
// Output: Prime Numbers: [2, 3, 5, 7]
