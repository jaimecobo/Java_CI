// This is our initial string
let str = 'This is the string we want to turn into an array'

// We set a wait of 2 seconds and then pass the initial string and repective functions that we'll be calling back
setTimeout(() => {
    buildArray(str, console.log(str), buildString, document.getElementById("init_string").innerHTML = str); 
    //calls buildArray fuction, passing initial string + console.log() function + buildString() function.
  }, 2000);

// This is the first function that we are calling after the wait of two seconds, it will turn the initial string into an array
// it also adds more elements, and then pass the new array to the next callback function.
function buildArray(string, callback01, callback02, callback03){
    //immediately prints out the initial string, then execute its block, and then calls the function passed as callback02 parameter.
    array01 = string.split(" ");
    array01.push(",", "now", "fully", "converted", "to", "array", "in", 1, "step");
    console.log(array01);
    printAsArrayInDom(array01); //Calls function printAsArrayInDom()
    callback02(array01, addToSring); //calls the second function passed by setTimeout() function
}

// Rebuilds the string from the new array created in the previous function and calls the next function 
// passing the new string as a parameter.
function  buildString(array, callback){
let string = array.join(" ");
callback(string);
}

//Gets the new string from the previous function, concatenates it with another string, and prints everything as a single new string.
function addToSring(string){
    console.log(string + " and all the way back into string, everything made after 2 seconds.");
    document.getElementById("final_string").innerHTML = string + " and then all the way back into a string, everything made after 2 seconds.";
}

// This an additional function that is called from another function, but not necessarily as a callback function
// The purpose of this function is to display the array in an "array kind of format" in the DOM
function printAsArrayInDom(array01){
    let printsInDOM = "[&nbsp&nbsp&nbsp&nbsp";
    for(var i = 0; i < array01.length; i++){
        if(array01[i] === "," ){
            printsInDOM += ",<br>&nbsp&nbsp&nbsp&nbsp&nbsp";
        }else{
            printsInDOM += array01[i] + "&nbsp&nbsp&nbsp&nbsp";
        }
    }
    printsInDOM += "]";
    document.getElementById("array").innerHTML = printsInDOM;
}