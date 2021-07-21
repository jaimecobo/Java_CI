console.log("Hello world");
console.log("My name is Jaime");

// let is a keyword that tells JS we are seting up a variable
// x is the "name" of the variable, sometimes referred to as a reference
// = is know as the assignment operator
// 5 is the "literal" value, otherwise what the x literally represents
let x = 5;
y = 3;

// bellow is a template literal that shows the value of x
console.log(`the value of x is ${x}`)
// bellow is concatanation that does the same thing
console.log("the value of y is " + y)

const MY_CONST = 7;
console.log(MY_CONST);

//---------------------------------

// The code bellow is not legal
// you cannot reassign a const
// MY_CONST = 9;
// console.log(MY_CONST);

//---------------------------------

let z = 6 + 7;
console.log("the value of z is " + z);

// TYPES
// bellow we have a string
// this is a series of characters or numbers
// wrapped around quotes
let myString = "This is a string value";
console.log(myString);

// bellow we have a number
// numbers will generally respect aritmetic
let myNumber = 100;
let myDecimalValue = 0.45;

// bellow are boolean values
// they can be either true or false and nothing else
// which is either 0 or 1
let myBoolean = true;
let myOtherBoolean = false;

//TODO(write comment)
let myVariable = "abc";
console.log(typeof myVariable);

myVariable = 1;
console.log(typeof myVariable);

let coercedVariable = 7 + 7 + 7
console.log(`the value of coercedVariable is ${coercedVariable}`);

coercedVariable = 7 + 7 + "7";
console.log(`the value of coercedVariable is ${coercedVariable}`);
console.log(typeof coercedVariable);

coercedVariable = "7" + 7 + 7;
console.log(`the value of coercedVariable is ${coercedVariable}`);
console.log(typeof coercedVariable);

let parsedInt = parseInt("10");
console.log(parsedInt);
console.log(parsedInt + " is a " + typeof parsedInt);


let conditional = true;
if (conditional){
    console.log("The conditioal is true.");
}else{
    console.log("The conditional is false.");
}

let numberConditional = 2;

if(numberConditional === 5){
    console.log('The number is equal to 5');
}else if(numberConditional > 3){
    console.log("The number is at least bigger than 3");
}else if(numberConditional < 10){
    console.log('The number is less than 10')
}


let equalityCheckNumber = "10";
if(equalityCheckNumber == 10){
    console.log("The value is equal");
}
if(equalityCheckNumber === "10"){
    console.log("The value and type are equal");
}

if(true && false){
    console.log("This code will never be reached");
}

if(true && true){
    console.log("This code will always be reached");
}

if(true || false){
    console.log("As long as one of the conditions is true, this code will be executed");
}

for (let i=0; i<=9; i++) {
    console.log(i);
}

// Challenge 3 starter code
for (let i = 99; i > 0; i--){
    console.log(`${i} bottles of beer on the wall`);
}

let whileLoopVariable = 0;
while(whileLoopVariable < 10){
    console.log(whileLoopVariable);
    whileLoopVariable = whileLoopVariable + 1;
}

//do-while loops will always execute at least once
do {
    console.log("This will always print to the console.")
}while(false);

// Iteration: break ans continue
for(let i=0; i<10; i++){
    if(i===3){
        continue;
    }
    console.log(i);
    if(i===5){
        break;
    }
}

let switchVariable = 43;
switch(switchVariable){
    case 1:
        console.log("The variable is set to 1");
        break;
    case 2:
        console.log("The variable is set to 2");
        break;
    case 3:
        console.log("The variable is set to 3");
        break;
    case 43:
        console.log("The variable is set to 43");
        break;
    default:
        console.log("No cases where matched");
        break;
}

// Challenge 1
// Do You Need More Coffee?
// Write a script that:
// Stores the number of cups (that a person has consumed) in a variable
// If the person has had *less than* 3 cups
// Log a message to the console saying: ("Yes I'll take another cup of coffee.")
// If not
// Log a message to the console saying ("I think I'm okay for now.")


for(let coffeeCups = 0; coffeeCups <3; coffeeCups++){
    if(coffeeCups < 3){
        console.log("Yes I'll take another cup of coffee.");
    }else{
        console.log("I think I'm okay for now.");
}
}