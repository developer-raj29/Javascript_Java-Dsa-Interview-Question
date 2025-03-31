function isPalindrome(str) {
  const arrLength = str.length;
  //   console.log(arrLength);
  for (let i = 0; i < arrLength / 2; i++) {
    if (str[i] !== str[arrLength - 1 - i]) {
      return false;
    }
  }
  return true;
}

const arr1 = "madam";
const arr2 = "18881";
const res = isPalindrome(arr1);
console.log(res); // Output: true
