function secondLargest(arr, len) {
  let maxVal = -Infinity;
  let secondMaxVal = -Infinity;

  for (let i = 0; i < len; i++) {
    if (maxVal < arr[i]) {
      secondMaxVal = maxVal; // Update second largest before updating largest
      maxVal = arr[i]; // Update largest
    } else if (secondMaxVal < arr[i] && arr[i] != maxVal) {
      secondMaxVal = arr[i]; // Update second largest if current element is not equal to largest
    }
  }
  return secondMaxVal === -Infinity ? -1 : secondMaxVal; // Return the second largest number
}

let len = 6;
const arr = [12, 35, 1, 10, 34, 1];
console.log("Second Largest Value:", secondLargest(arr, len)); // Output: 34

// let len = 3;
// const arr = [10, 10, 10];
// console.log("Second Largest Value:", secondLargest(arr, len)); // Output: -1
