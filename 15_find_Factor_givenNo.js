// How to find factor of a given integer in javascript|Coding Interview Question #16

function factor(num) {
  const res = [];
  for (let i = 0; i <= num; i++) {
    if (num % i === 0) {
      res.push(i);
    }
  }
  return res;
}

const num = 12;
console.log("Factors of", num, "are:", factor(num)); // ➤ Factors of 12 are: [1, 2, 3, 4, 6, 12]
