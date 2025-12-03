let sentence = prompt("Enter a sentence");
let hidden = prompt("Hidden word");

function hide(sentence, hidden){
    let stars = "*".repeat(hidden.length);
    return sentence.replace(hidden, stars);
}

let result = hide(sentence, hidden);
console.log(result);