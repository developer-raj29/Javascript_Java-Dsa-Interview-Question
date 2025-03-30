function findUnion(arr1, arr2) {
  const res = [];

  for (let i = 0; i < arr1.length; i++) {
    if (arr1[i] !== null && arr1[i] !== undefined) {
      res.push(arr1[i]); // Skip null and undefined values
    }
  }
  for (let i = 0; i < arr2.length; i++) {
    if (arr2[i] !== null && arr2[i] !== undefined) {
      if (!res.includes(arr2[i])) {
        res.push(arr2[i]);
      }
    }
  }
  return res;
}

const arr1 = [1, 2, 3, 4, null];
const arr2 = [3, 4, 5, 6, undefined];

const res = findUnion(arr1, arr2);
console.log(res); // Output: [1, 2, 3, 4, 5, 6]
