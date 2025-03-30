function maxConsecutiveOnes(arr) {
  let maxCount = -Infinity,
    count = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === 1) {
      count++;
    } else {
      count = 0;
    }
    maxCount = Math.max(maxCount, count);
  }
  return maxCount;
}

/*
 * Approach:
 * 1. create a variable ans and initialize it to 0.
 * 2. iterate each element in the array and do XOR operation with ans and store
 * it in ans.
 * Ex: XOR operation: a ^ a= 0, a ^ 0 = a,
 * 3. return ans.
 * 4. Done.
 * 5. Time Complexity: O(N) and Space Complexity: O(1).
 */

const arr = [1, 1, 0, 1, 1, 1];
const res = maxConsecutiveOnes(arr);
console.log(res); // Output: 3
