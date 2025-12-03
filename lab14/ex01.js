const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let arr = [];
let arrCount = 0;

const exclude = [20, 22, 69];

function input() {
  if (arrCount < 3) {
    rl.question("Enter numbers separated by comma: ", (inputStr) => {
      const array = inputStr.split(",").map(Number);
      arr.push(array);
      arrCount++;
      input();
    });
  } else {
    console.log("Arrays entered:");
    arr.forEach((a, index) => console.log(`Array ${index + 1}:`, a));

    let totalSum = 0;
    arr.forEach(a => {
      a.forEach(num => {
        if (!exclude.includes(num)) {
          totalSum += num;
        }
      });
    });

    console.log("Sum of all numbers (excluding 20, 22, 69):", totalSum);

    rl.close();
  }
}

input();
