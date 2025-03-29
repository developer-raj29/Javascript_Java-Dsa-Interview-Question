function arrIsSorted(nums) {
  let ans = 0;
  let len = nums.length;
  if (nums[0] < nums[len - 1]) {
    ans++;
  }
  for (let i = 1; i < len; i++) {
    if (nums[i - 1] > nums[i]) {
      ans++;
      if (ans > 1) return false;
    }
  }
  return true;
}

// let arr = [1, 2, 3, 4, 5]; // true
// let arr = [3, 4, 5, 1, 2]; // true
let arr = [5, 3, 4, 2, 1]; // false
console.log(arrIsSorted(arr)); // true

/*
 * Approach:
 * 1. Check if first element is less than last element, then increment ans by 1.
 * 2. Apply loop from 1 to size,
 * 3. Check if previous element nums[i-1] is greater {<} than current element
 * nums[i] then increment ans by 1.
 * 4. Nested condition if ans is greater than 1 then return false.
 * 5. After completing loop, return true.
 */
