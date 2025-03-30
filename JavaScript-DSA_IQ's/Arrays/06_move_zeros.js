function moveZeros(arr) {
  let j = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] !== 0) {
      let temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      j++;
    }
  }
  return arr;
}

const arr = [0, 1, 0, 2, 3, 4];
const result = moveZeros(arr);
console.log(result); // Output: [1, 2, 3, 4, 0, 0]

/*
 * Approach:
 * 1. take 2 pointer approach.
 * 2. 1st pointer is assign with '0' and 2nd pointer is i, which is iterate
 * every using for loop,
 * 3. check if nums[i] current value != 0 zero ke equal nhi hai toh, swap kar
 * do.
 * 4. swap karne ke baad j ko increment kar do.
 * 5. After complete the loop then we get the final array.
 * 6. Time complexity is O(n) and space complexity is O(1).
 */
