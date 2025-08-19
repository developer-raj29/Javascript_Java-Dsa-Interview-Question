function calculator(a, b, operation) {
  switch (operation) {
    case "+":
      return a + b;
    case "-":
      return a - b;
    case "*":
      return a * b;
    case "/":
      return b !== 0 ? a / b : "Cannot divide by zero";
    case "%":
      return b !== 0 ? a % b : "Cannot perform modulus by zero";
    default:
      return "Invalid operation";
  }
}

const num1 = 6;
const num2 = 2;
const operation = "+"; // Change this to "sub", "mul", "div", or "mod" for other operations
console.log("Result:", calculator(num1, num2, operation)); // ➤ Result: 8
console.log("Result:", calculator(num1, num2, "-")); // ➤ Result: 4
console.log("Result:", calculator(num1, num2, "*")); // ➤ Result: 12
console.log("Result:", calculator(num1, num2, "/")); // ➤ Result: 3
console.log("Result:", calculator(num1, num2, "%")); // ➤ Result: 0
