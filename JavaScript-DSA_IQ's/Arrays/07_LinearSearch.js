function linearSearch(arr, target) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === target) {
      return true; // Return the index of the found element
    }
  }
  return false;
}

const arr = [1, 2, 3, 4, 6];
const target = 6;
const result = linearSearch(arr, target);
console.log(result); // Output: true

/*
 * Approach:
 * 1. We apply linear search to find the element in the array.
 * 2. Iterate every value in every index
 * 3. check if arr[i] == k, then return true.
 * 4. If not found value or key then return false.
 * 5. Time complexity is O(n) and space complexity is O(1).
 * 6. This is the best approach to find the element in the array.
 */
