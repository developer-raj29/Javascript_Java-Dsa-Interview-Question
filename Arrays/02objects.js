let obj = {
  name: "John",
  age: 30,
  city: "New York",
  country: "USA",
  job: "Software Engineer",
  value: 0,
  greet: function () {
    console.log(
      "Hello, I am " +
        this.name +
        " from " +
        this.city +
        ", " +
        this.country +
        ". I am a " +
        this.job +
        "."
    );
  },
  counter: function () {
    this.value++;
    console.log(this.value);
  },
};

let obj2 = obj;
console.log("Object 2 : ", obj2);
// obj.greet(); // ➤ Hello, I am John from New York, USA. I am a Software Engineer.

// for (let i = 0; i < 5; i++) {
//   obj.counter(); // ➤ 1 2 3 4 5
// }

function outerFun() {
  let pre = 0;
  let post = 0;
  let str = "I am a string";
  function innerFun() {
    console.log(`Value : ${pre} : `, "++Pre Value: ", ++pre, `Value : ${pre}`);
    console.log(
      `Value : ${post} : `,
      "Post++ Value: ",
      post++,
      `Value : ${post}`
    );
    console.log("String: ", str);
  }

  return innerFun;
}

// const inner = outerFun();
// for (let i = 0; i < 5; i++) {
//   inner(); // ➤ Value: 0, String: I am a string
// }
