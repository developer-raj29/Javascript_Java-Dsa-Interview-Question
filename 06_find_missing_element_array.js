const arr1 = [1, 2, 4, 6, 7, 10];
const missing = [];

for (let i = 1; i <= 10; i++) {
  // console.log(!arr1.includes(i));
  if (!arr1.includes(i)) {
    missing.push(i);
  }
}

console.log("Missing Numbers:", missing); // ➤ Missing Numbers: [3, 5, 8, 9]

const arr = [
  "apple",
  "kiwi",
  "mango",
  "orange",
  "apple",
  "kiwi",
  "mango",
  undefined,
  null,
];

const newArr = {}; // Use an object instead of an array

for (let i = 0; i < arr.length; i++) {
  if (arr[i] === undefined || arr[i] === null) {
    continue; // Skip null and undefined values
  }

  newArr[arr[i]] = (newArr[arr[i]] || 0) + 1; // Count occurrences
}

console.log(newArr);
