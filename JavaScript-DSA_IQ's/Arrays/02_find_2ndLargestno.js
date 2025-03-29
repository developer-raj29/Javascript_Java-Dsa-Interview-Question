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

/*
 * Approaches:
 * max value = Integer.MIN_VALUE; or -infinity.
 * sec_max = Integer.MIN_VALUE; or -infinity.
 * arr[i] = 12;
 * 1. check if max value choti hai current value {arr[i]} se, toh update sec_max
 * ko max value dedo or max ko current value dedo.
 * if(max < arr[i]) sec_max = max; max = arr[i];
 *
 * 2. if current value {arr[i]} is less than max AND current value is greater
 * than sec_max, then update sec_max with current value.
 * else if (arr[i] < max && arr[i] > sec_max) sec_max = arr[i];
 */
