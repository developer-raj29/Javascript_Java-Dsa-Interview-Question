function missingNo(arr) {
  let n = arr.length;
  let submission = (n * (n + 1)) / 2;
  let sum = 0;
  for (let i = 0; i < n; i++) {
    sum += arr[i];
  }
  return submission - sum;
}

const arr = [3, 0, 1];
console.log(missingNo(arr)); // Output: 2

/*
 * Approach:
 * 1. find length of array and store it N.
 * 2. find the summation of using formula (N*(N+1))/2.
 * 3. create a variable sum2 and initialize it to 0.
 * 4. iterate each element in the array and add each element to sum2 and store also.
 * 5. return summition - sum2.
 * 6. Done.
 * 7. Time Complexity: O(N) and Space Complexity: O(1).
 */
