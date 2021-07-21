console.log(" Challenge 1 \n Do You Need More Coffee? Write a script that stores the number \n of cups (that a person has consumed) in a variable If the person has \n had *less than* 3 cups Log a message to the console saying: \n (\"Yes I'll take another cup of coffee.\") \n If not Log a message to the console saying (\"I think I'm okay for now.\") \n\n");


for(let coffeeCups = 1; coffeeCups <=3; coffeeCups++){
    console.log("coffeeCups = " + coffeeCups)
    if(coffeeCups < 3){
        console.log("Yes I'll take another cup of coffee.");
    }else{
        console.log("I think I'm okay for now.");
}
}

console.log("\n\n");

console.log(" Challenge 2 \n Does your car need an oil change? Write a script that stores the number \n of miles(that a car has) in a variable, if the car has \n *more than* 500 miles Log a message to the console saying:\n (\"Yes I think I need an oil change.\") \n if not Log a message to the console saying:\n (\"My car doesn't need an oil change yet.\")\n ");

let carsMiles = 451;
while(carsMiles <= 501){
    console.log("Car's miles are = " + carsMiles);
    if(carsMiles <= 500){
        console.log("My car doesn't need an oil change yet.");
    } else{
        console.log("Yes I think I need an oil change.");
    }
    carsMiles = carsMiles + 10;
}