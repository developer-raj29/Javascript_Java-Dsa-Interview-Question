function letterCountLongString(str) {
  let letterCount = [];

  let op = str.split("");

  for (let i = 0; i < op.length; i++) {
    let char = op[i];
    if (char != " ") {
      if (letterCount[char]) {
        letterCount[char]++;
      } else {
        letterCount[char] = 1;
      }
    }
  }

  return letterCount;
}

const str = "welcome to the world of programming";
console.log(letterCountLongString(str));
