// what is the difference between '==' and '===' operaror|Javascript Coding Interview Question #3
const a = 1;
const b = "1";

a == b // loose equality
  ? console.log("Double == : ", true)
  : console.log(" Double == : ", false);

a === b // strict equality
  ? console.log("Triple === : ", true)
  : console.log("Triple === : ", false);

// Double == :  true
// Triple === :  false
