


let username = document.getElementById("username");

username.nodeValue = "This is the new username"

let inputs = document.getElementsByTagName("input");

let firstButton = document.querySelectorAll("input.error");
let inError = document.getElementsByClassName("error");


console.log("Number of inputs: " + inputs.length);
console.log("First Button: " + firstButton);
console.log(firstButton);
console.log("Number of list itmes: " + inError.length);

let listItems = document.querySelector("ul").children;
if(inError.length > 0) demo.innerHTML = "There are some errors!";

console.log(listItems.length);
// let demo = document.getElementById("demo");
// demo.innerHTML = "Wow DOM manipulated!";


let selectedItem = document.querySelector("li.mainList");
let first = selectedItem.previousElementSibling;
let last = selectedItem.nextElementSibling;
let list = selectedItem.parentElement;
let header = selectedItem.parentElement.parentElement;
let section = selectedItem.parentElement.parentElement.nextElementSibling;

console.log("Selected item");
console.log(selectedItem);
console.log("First item");
console.log(first);
console.log("Last item");
console.log(last);
console.log("List: ");
console.log(list);
console.log("Header: ");
console.group(header);
console.log("Section: ");
console.group(section);
console.log(Math.round(7.25));
console.log(Math.max(35, 344));
