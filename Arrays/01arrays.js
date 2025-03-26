// let strNum = "25";
// let no = 45;
// let parsedNum = parseInt(strNum);
// let parBoolean = parseFloat(no);
// console.log(typeof parBoolean);
// console.log(parBoolean);

// console.log(typeof parsedNum); // Output: number
// console.log(parsedNum);
// console.log(typeof strNum); // Output: string
// console.log(strNum);

// const mixed = [1, "apple", true, { name: "John" }];
// console.log(mixed);

// let personPrototype = {
//   name: "Mayank",
// };

// let person1 = Object.create(personPrototype);
// console.log(person1); // {}

// let person2 = personPrototype;
// console.log(person2); // {} { name: 'Mayank' }

// console.log(person1.name, person2.name); // Mayank Mayank

function fetchData(callback) {
  // Simulated asynchronous operation
  setTimeout(() => {
    const data = "Data fetched successfully";
    callback(data);
  }, 2000);
}

function processData(data) {
  console.log(`Processing data: ${data}`);
}

fetchData(processData); // Output: Processing data: Data fetched successfully
