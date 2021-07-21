console.log("Script is loaded!");

// let a = 1;
// let b = 2;



function addTwoNumbers(a, b){
    // if(a > 5){
        return a + b;
    // } else return 0;
}
console.log(addTwoNumbers(2, 3));

//Define a function
function saySomething(something) {
	console.log(something);
}

function add_arg() {
	let sum = 0;
	for(let i = 0; i < arguments.length; i++) {
		sum += arguments[i];
	}
	return sum;
}
	
let result = add_arg(1,2,3,4,5,6,7,8);
console.log(result);

function addAllNumbers(...rest) {
    // console.log("The first two numbers are: " + a  + " + " + b);
	let sum = 0;
    // console.log("The rest of the numbers are: " = rest);
	for(let i = 0; i < rest.length; i++) {
		sum += rest[i];
	}
	return sum;
}
	
console.log(addAllNumbers(1,2,3,4,5,6,7,8,9));

function displayTwoNum_Add_the_rest(a, b, ...rest) {
    console.log("The first two numbers are: " + a  + " + " + b);
	let sum = 0;
    console.log("The rest of the numbers are: " + rest);
	for(let i = 0; i < rest.length; i++) {
		sum += rest[i];
	}
	return sum;
}
	
console.log(displayTwoNum_Add_the_rest(1,2,3,4,5,6,7,8,9));

let billAmount = Math.random() * 100;

function gratuity(){
    return billAmount * 0.2;
}

function gratuityToFixed2(){
    return (billAmount * 0.2).toFixed(2);
}

function totalWithGratuity() 
    {
    return parseFloat(billAmount + gratuity()).toFixed(2);
}

function totalWithGratuityToFixed2()
    {
    return billAmount + gratuity();
}

console.log("Bill amount: " + billAmount);
console.log("Gratuiy is equal to: " + gratuity(billAmount));
console.log("Your total with gratuity is: " + totalWithGratuity(billAmount));

console.log("Gratuiy is equal to: " + gratuityToFixed2(billAmount));
console.log("Your total with gratuity is: " + totalWithGratuityToFixed2(billAmount));


let add = function(a,b){return a + b};
// The difference between declaring a function this way (Function Assignment) 
// and the other syntax we’ve been using (Function Declaration) is that the latter (Function Declaration) 
// hoists both the declaration and definition. For example:

//Function Declaration
hoisted(); // logs "foo"
function hoisted() {
  console.log("foo");
}

//Function Assignment
// notHoisted(); // TypeError: notHoisted is not a function
let notHoisted = function() {
   console.log("bar");
};

// Anonymous Functions
// It's often handy to declare a function on the fly without a name.
let calculator = {
	add: function(a,b) {
		return a + b;
	}
}
console.log("The result of the anonymous function is: " + calculator.add(2,3)); // 5

// ##############################################################################################
// While anonymous functions might look strange, 
// you've actually already been doing this with Arrays and Objects. Functions are no different.
let arrayOfMystery = [
    ['anonymous','array'],
    { name: 'anonymous object' },
    function(){ return 'Anonymous Function!'}
];

//  [] creates an array in memory
//  {} creates an object in memory
//  function(){ } creates an object in memory

console.log(arrayOfMystery[0][1]); // array
console.log(arrayOfMystery[1].name); // anonymous object
console.log(arrayOfMystery[2]()); // anonymous function!


// Immediately Invoked Function Expressions (IIFE)
// Sometimes you want to create a scope so that you can have private variables. 
// One way to do that is to create an anonymous function and immediately execute it.
(function(){
	let myVar = "look mom, private variables!";

	//Do some stuff with myVar...
})();

console.log(myVar); //undefined;

// Scope Chain and Closures
// For example, the `city` variable is visible inside the `greet` function because the greet function creates a closure
let city = 'New Orleans';
let greet = function() {
	console.log('Hello ' + city);
}

greet(); // Hello New Orleans

//Nested Scope
function outer() {
	let x = 'x';
	function inner() {
		let y = 'y';
		console.log(x); //'x'
	}
	console.log(x); // 'x'
	console.log(y); // ReferenceError: y is not defined
}

// flat and mountain are functions only available within landscape.
// The result variable is available inside flat and mountain because they all live within the same scope.
let landscape = function() {
    let result = "";

    let flat = function(size) {
        for (let count = 0; count < size; count++)
            result += " _ ";
    };

    let mountain = function(size) {
        result += "/";
        for (let count = 0; count < size; count++)
            result += " '";
        result += "\\";
    };

    flat(3);
    mountain(4);
    flat(6);
    mountain(1);
    flat(1);
    return result;
};

console.log(landscape());

// This Keyword
// Inside a function, the keyword this refers to the executor of the function.
// Again, think of a function as a piece of paper with instructions, a procedure of sorts. 
// One of those instructions might say "touch your nose". 
// But who is this "you" it speaks of? Obviously, the person executing the instructions.
// Similarly, the keyword 'this' refers to the object that's executing the function.

let teacher = {
	name: 'Assaf',
	sayName: function() {
		console.log(this.name);
	}
}
teacher.sayName(); //'Assaf'


// Different objects can execute the same function, can produce different results because "this" is different.
function sayName() {
	console.log(this.name);
}

let teacher1 = {
	name: 'Assaf',
	speak: sayName
}

let teacher2 = {
	name: 'Shane',
	speak: sayName
}

teacher1.speak(); // 'Assaf'
teacher2.speak(); // 'Shane'