function reverseArr(arr, st, e) {
  while (st < e) {
    let temp = arr[st];
    arr[st] = arr[e];
    arr[e] = temp;
    st++;
    e--;
  }
}

function rotateArray(arr, k, n) {
  k = k % n; // Handle cases where k > n
  reverseArr(arr, 0, n - 1); // Reverse the entire array
  reverseArr(arr, 0, k - 1); // Reverse the first k elements
  reverseArr(arr, k, n - 1); // Reverse the remaining elements
  return arr; // Return the modified array
}

const arr = [1, 2, 3, 4, 5, 6, 7];
const k = 3; // Number of positions to rotate
const n = arr.length;

const rotatedArr = rotateArray(arr, k, n);
console.log(rotatedArr); // Output: [5, 6, 7, 1, 2, 3, 4]
