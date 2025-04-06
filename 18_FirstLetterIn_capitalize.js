function firstLetterCapitalize(str) {
  const string = str.split(" ");

  for (let i = 0; i < string.length; i++) {
    string[i] = string[i].charAt(0).toUpperCase() + string[i].slice(1);
  }

  return string.join(" ");
}

const str = "hello, world!";
console.log(firstLetterCapitalize(str));
