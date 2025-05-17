let count = 0;

const add = (function () {
  if (count === 0) {
    count += 1;
  }
  return function () {
    count += 1;
    console.log(count);
  };
})();

add();
add();
add();
add();

function outerFunc() {
  let value = 0;
  let str = "I'm a string";

  function innerFunc() {
    console.log("Value : ", value++);
    console.log(str);
  }

  return innerFunc;
}

const callFunc = outerFunc();

for (let i = 0; i < 5; i++) {
  callFunc();
}
