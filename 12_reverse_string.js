function reverseString(str) {
  const string = str.split("");
  //   return string.reverse().join("");
  const res = [];
  for (let i = 0; i < string.length; i++) {
    res.unshift(string[i]);
  }
  return res.join("");
}

/*
 * Approach:
1. create a function reverseString then pass str in parameter.
2. convert the string into an array using split() method.
3. create an empty array res.
4. iterate through the string array using for loop.
5. use unshift() method to add each character to the beginning of the res array.    
6. finally, join the res array into a string using join() method and return it.
 */

const str = "hello, world!";
const res = reverseString(str);
console.log(res); // Output: !dlrow ,olleh
