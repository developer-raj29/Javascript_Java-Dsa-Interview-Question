function evenfun(arr) {
  //   return arr.filter((num) => num % 2 === 0);
  const res = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 === 0) {
      res.push(arr[i]);
    }
  }
  return res;
}

function oddfun(arr) {
  //   return arr.filter((num) => num % 2 !== 0);
  const res = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 !== 0) {
      res.push(arr[i]);
    }
  }
  return res;
}

const array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const evenAns = evenfun(array);
const oddAns = oddfun(array);

console.log("Even Numbers:", evenAns); // ➤ Even Numbers: [2, 4, 6, 8, 10]
console.log("Odd Numbers:", oddAns); // ➤ Odd Numbers: [1, 3, 5, 7, 9]
