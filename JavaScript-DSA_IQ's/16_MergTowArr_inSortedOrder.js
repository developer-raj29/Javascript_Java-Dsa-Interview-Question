// Time
function mergedArr(arr1, arr2) {
  let res = [];
  for (let i = 0; i < arr1.length; i++) {
    res.push(arr1[i]);
  }
  for (let i = 0; i < arr2.length; i++) {
    res.push(arr2[i]);
  }
  res.sort((a, b) => a - b);
  return res;
  // Step 3: Sort using Bubble Sort
  //   for (let i = 0; i < res.length - 1; i++) {
  //     for (let j = 0; j < res.length - 1 - i; j++) {
  //       if (res[j] > res[j + 1]) {
  //         // Swap res[j] and res[j+1]
  //         let temp = res[j];
  //         res[j] = res[j + 1];
  //         res[j + 1] = temp;
  //       }
  //     }
  //   }

  //   return res;
}

const arr1 = [1, 3, 5, 7, 9];
const arr2 = [2, 4, 6, 8, 10];
// const mergedArr = arr1.concat(arr2).sort((a, b) => a - b);
// console.log("Merged Sorted Array:", mergedArr); // ➤ Merged Sorted Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

console.log("Merged Sorted Array:", mergedArr(arr1, arr2)); // ➤ Merged Sorted Array: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
