function finduniqueNo(arr) {
  let ans = 0;
  for (let i = 0; i < arr.length; i++) {
    ans ^= arr[i];
  }
  return ans;
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

const arr = [4, 1, 2, 1, 2];
const res = finduniqueNo(arr);
console.log(res); // Output: 4
