
function coffeeCups(){
        document.getElementById('CofCups00').innerHTML = "<h4>Challenge 1</h4> <br> Do You Need More Coffee? <br>"+
        "Write a script that stores the number of cups (that a person has consumed) in a variable <br>" +
        "If the person has had *less than* 3 cups Log a message to the console saying: <br>" +
        "(\"Yes I'll take another cup of coffee.\") <br>" +
        "If not Log a message to the console saying: <br>" +
        "(\"I think I'm okay for now.\") <br>----------------------------------------------------------<br>"+
        
        "for(let coffeeCups = 1; coffeeCups <=3; coffeeCups++){ <br>" +
        "&nbsp&nbsp&nbsp&nbsp document.getElementById('CofCups01'+ coffeeCups).innerHTML = \"Coffee cups =\" + coffeeCups + \"; <br>" +
        "&nbsp&nbsp&nbsp&nbsp console.log(\"coffeeCups = \" + coffeeCups); <br>" +
        "&nbsp&nbsp&nbsp&nbsp if(coffeeCups < 3){ <br>" +
        "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp document.getElementById('CofCups02' + coffeeCups).innerHTML = \"Yes I'll take another cup of coffee.\"; <br>" +
        "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp console.log(\"Yes I'll take another cup of coffee.\"); <br>" + 
        "&nbsp&nbsp&nbsp&nbsp } else{ <br>" +
        "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp document.getElementById('CofCups03').innerHTML = \"I think I'm okay for now.\"; <br>" +
        "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp console.log(\"I think I'm okay for now.\"); <br>" +
        "&nbsp&nbsp&nbsp&nbsp} <br>"+
        "}\";<br>----------------------------------------------------------<br>"

     
    for(let coffeeCups = 1; coffeeCups <=3; coffeeCups++){
        document.getElementById('CofCups01'+ coffeeCups).innerHTML = "Coffee cups =" + coffeeCups + "<br>";
        console.log("coffeeCups = " + coffeeCups)
        if(coffeeCups < 3){
            document.getElementById('CofCups02' + coffeeCups).innerHTML = "Yes I'll take another cup of coffee.<br>";
            console.log("Yes I'll take another cup of coffee.");
        } else{
            document.getElementById('CofCups03').innerHTML = "I think I'm okay for now.<br>";
            console.log("I think I'm okay for now.");
    }
    }
}

function carsMiles(){
    document.getElementById('carMls00').innerHTML = "<h4>Challenge 2</h4> <br> Does your car need an oil change? <br>" +
    "Write a script that stores the number of miles(that a car has) in a variable, <br>" +
    "if the car has *more than* 500 miles Log a message to the console saying:<br>" +
    "(\"Yes I think I need an oil change.\") <br>" +
    "if not Log a message to the console saying: <br>" +
    "(\"My car doesn't need an oil change yet.\")<br>----------------------------------------------------------<br>" +

    "let carsMiles = 451; <br>" +
    "while(carsMiles <= 501){ <br>" +
    "&nbsp&nbsp&nbsp&nbsp document.getElementById('carMls01'+ carsMiles).innerHTML = \"Car's miles are = \" + carsMiles <br>" +  
    "&nbsp&nbsp&nbsp&nbsp console.log(\"Car's miles are = \" + carsMiles); <br>" +
    "&nbsp&nbsp&nbsp&nbsp if(carsMiles <= 500){ <br>" +
    "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp document.getElementById('carMls02'+ carsMiles).innerHTML = \"My car doesn't need an oil change yet.\"; <br>" +
    "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp console.log(\"My car doesn't need an oil change yet.\"); <br>" +
    "&nbsp&nbsp&nbsp&nbsp } else{ <br>" +
    "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp document.getElementById('carMls03').innerHTML = \"Yes I think I need an oil change.\"; <br>" +
    "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp console.log(\"Yes I think I need an oil change.\"); <br>" +
    "&nbsp&nbsp&nbsp&nbsp } <br>" +
    "&nbsp&nbsp&nbsp&nbsp carsMiles = carsMiles + 10; <br>" +
    "&nbsp&nbsp&nbsp&nbsp} <br>" +
    "}\";<br>----------------------------------------------------------<br>"

        
    let carsMiles = 451;
    while(carsMiles <= 501){
        document.getElementById('carMls01'+ carsMiles).innerHTML = "Car's miles are = " + carsMiles + "<br>" 
        console.log("Car's miles are = " + carsMiles);
        if(carsMiles <= 500){
            document.getElementById('carMls02'+ carsMiles).innerHTML = "My car doesn't need an oil change yet. <br>"
            console.log("My car doesn't need an oil change yet.");
        } else{
            document.getElementById('carMls03').innerHTML = "Yes I think I need an oil change.";
            console.log("Yes I think I need an oil change.");
        }
        carsMiles = carsMiles + 10;
    }
}


function odd_or_even(){
    // let longString = "";
    for (let i = 0; i<=99; i++) {
        if (i === 0) {
            document.getElementById('odd_even' + i).innerHTML = i + " is even<br>";
            // longString += i + " is even\n";
            console.log(i +  " is even");
        }
        else if (i % 2 === 0) {
            document.getElementById('odd_even'+ i).innerHTML = i + " is even<br>";
            // longString += i + " is even\n";
            console.log(i + " is even");   
        }
        else {
            document.getElementById('odd_even' + i).innerHTML = i + " is odd<br>";
            // longString += i + " is odd\n";
            console.log(i + " is odd");
        }
    }
}

function refreshPage(){
    window.location.reload();
} 