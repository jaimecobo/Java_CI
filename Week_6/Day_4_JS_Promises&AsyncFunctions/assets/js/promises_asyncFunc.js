
let promise = new Promise((resolve, reject) => {
    setTimeout(() => resolve("done!"), 2000);
  });

  
const getRandomNumber = setTimeout(()=> {randomNumber();}, 500);

function randomNumber(){
    console.log("randomNumber returns " + Math.floor(Math.random() * 99));
}

async function invokesGetRandomNumber(){
    let newRandom = getRandomNumber;
    console.log("First async function waits for getRandomNumber promise timeout")
}

invokesGetRandomNumber()