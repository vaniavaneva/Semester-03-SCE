let evenSum = 0, oddSum = 0, input = 0;

do{
    input = Number(prompt());
    input % 2 === 0 ? evenSum += input : oddSum += input;
} while(input !== 0);

console.log("Even:", evenSum);
console.log("Odd:", oddSum);