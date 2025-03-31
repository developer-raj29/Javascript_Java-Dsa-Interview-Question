function vowelsFun(str) {
  const res = [];
  const string = str.split("");
  for (let i = 0; i < string.length; i++) {
    if (
      string[i] === "a" ||
      string[i] === "e" ||
      string[i] === "i" ||
      string[i] === "o" ||
      string[i] === "u"
    ) {
      res.push(string[i]);
    }
  }

  //   return res.join("");
  return res;
}

/*
APPROACH:
1. create a function vowelsFun and their parameter is str.
2. create an empty array res.
3. convert str into array using split method.
4. loop iterate the string from i = 0 to i < string.length ; i++.
5. check if string[i] is equal to a, e, i, o, u then push string[i] into res array.
6. other wise jump next iteration.
7. return res array.
*/

const str = "Hello, Raj! How are you?";
const res = vowelsFun(str);
console.log("Vowels:", res); // ➤ Vowels: [ 'e', 'o', 'a', 'o', 'a', 'e', 'o', 'u' ], eoaoaeou
