const employee = [
  { name: "honey", age: 31 },
  { name: "rohan", age: 34 },
  { name: "ravi", age: 20 },
  { name: "ruhan", age: 25 },
  { name: "rashi", age: 58 },
];

// filter method : filter the value in based on the condition;
const filterEmployee = employee.filter((item) => {
  return item.age > 30;
});

console.log(filterEmployee);
// [
//   { name: "rohan", age: 34 },
//   { name: "honey", age: 42 },
//   { name: "rashi", age: 58 },
// ];

// find method : find element or value based on condition. but when cond. is match then ignore rest of values.
const findEmployee = employee.find((item) => {
  return item.age > 30;
});

console.log(findEmployee);
// { name: 'rohan', age: 34 }
