let names = [];
let value;
let n;

function input(){
    n = Number(prompt("Enter N"));
    do{
        value = prompt("Enter name");
        if(value) names.push(value);
    } while (value);
}

function output(){
    names.forEach(element => {
        if(element.length <= n) console.log(element);
    });
}

input();
output();