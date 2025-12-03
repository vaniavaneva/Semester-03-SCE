let pens = Number(prompt("Enter number of pens"));
let markers = Number(prompt("Enter number of markers"));
let chemical = Number(prompt("Enter number of chemicals"));
let sale = Number(prompt("Enter % off"));

function sum(){
    return (pens * 5.8 + markers * 7.2 + chemical * 1.2) * ((100 - sale) * 0.01);
}

console.log(sum());