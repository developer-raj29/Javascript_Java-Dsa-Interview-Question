// How To find duplicate elements in array in javascript|Javascript Coding Interview Question #1

const arr = [1, 2, 8, 2, 9, 8, 9];
const duplicate = arr.filter(
  (value, index, arr) => arr.indexOf(value) !== index
);
// console.log("Duplicate No : ", duplicate); // output: Duplicate No :  [ 2, 8, 9 ]

function removeDuplicateNo(array) {
  let i = 0;
  for (let j = 1; j < array.length; j++) {
    if (array[i] != array[j]) {
      i++;
      array[i] = array[j];
    }
  }
  return i + 1;
}
/*
 * Approach 1: Remove Duplicates from Sorted Array
 * 1. We apply 2 pointer approach.
 * 2. 1st pointer is i assign value with '0' and 2nd pointer is j, which is
 * interate every index in nums array.
 * 3. check if nums[i] != nums[j], then increment i by 1 and assign nums[i] =
 * nums[j].
 * 4. After complete the loop then return i + 1.
 * 5. Time complexity is O(n) and space complexity is O(1).
 */

// function findDuplicateNo(array) {
//   for (let i = 0; i < array.length; i++) {
//     for (let j = i + 1; j < array.length; j++) {
//       if (array[i] === array[j]) {
//         console.log(array[i]);
//         break;
//       }
//     }
//   }
// }

function findDuplicateNo(arr) {
  let res = [];
  for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[i] === arr[j]) {
        if (!res.includes(arr[i])) {
          res.push(arr[i]);
        }
        break;
      }
    }
  }
  return res;
}

function findDuplicate(arr) {
  let freq = {};
  let res = [];

  for (let num of arr) {
    freq[num] = (freq[num] || 0) + 1;
    if (freq[num] === 2) {
      res.push(num);
    }
  }

  return res;
}

const array = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4];

// const result = removeDuplicateNo(array);
// console.log(result); // Output: 5

// for (let i = 0; i < result; i++) {
//   console.log(array[i]); // Output: 0, 1, 2, 3, 4
// }
// console.log(findDuplicate(array)); // Output: [0, 1, 2, 3]

const duplicates = findDuplicateNo(array);

for (let i = 0; i < duplicates.length; i++) {
  console.log(duplicates[i] + " ");
}
