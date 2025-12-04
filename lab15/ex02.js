let months = [];

function input(){
    while (months.length < Number(12)){
        value = prompt("Enter month");
        months.push(value);
    }
}

function output(){
    for(var i = 0; i < 12; i++){
        if(i == 5 || i == 8){
            //skip
        } else if(i <= 9) {
            console.log(" "+ i + "   " + months[i]);
        } else {
            console.log(i + "   " + months[i]);
        }
    }
}

input();
output();


//  0   January
//  1   February
//  2   March
//  3   April
//  4   May
//  6   July
//  7   August
//  9   October
// 10   November
// 11   December