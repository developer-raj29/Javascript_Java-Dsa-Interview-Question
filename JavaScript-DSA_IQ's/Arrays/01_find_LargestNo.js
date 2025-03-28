// 1 Approach
function largest(arr) {
  let maxValue = -Infinity; // Initialize with the first element of the array
  for (let num of arr) {
    // num directly holds the element value
    if (maxValue < num) {
      // Compare with the actual number
      maxValue = num; // Update maxValue if the condition is true
    }
  }
  return maxValue; // Return the largest number
}

const arr = [1, 8, 7, 56, 90];
console.log("Largest Value:", largest(arr)); // Output: 90
// Time Complexity: O(n) - Linear time complexity, where n is the number of elements in the array
// Space Complexity: O(1) - Constant space complexity, as we are using a fixed amount of space regardless of the input size

// 2 Approach using reduce inbuilt functions
let maxValue = arr.reduce((max, num) => (num > max ? num : max), -Infinity);
console.log(maxValue); // Output: 90

// 3 Approach using forEach inbuilt functions
let max_Value = -Infinity;
arr.forEach((num) => {
  if (num > max_Value) {
    max_Value = num;
  }
});

console.log("Max Value:", max_Value); // Output: 90
