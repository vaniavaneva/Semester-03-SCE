function even(x){
    return x % 2 === 0;
}

function div5(x){
    return x % 5 === 0;
}

function div9(x){
    return x % 9 === 0;
}

function greater(x, y){
    return x > y ? x : y;
}

let x = Number(prompt("Enter a number:"));

console.log("x is even:", even(x));
console.log("x is divisible by 5:", div5(x));
console.log("x is divisible by 9:", div9(x));

let y = Number(prompt("Enter second number:"));
console.log("Greater number of the two:", greater(x, y));
