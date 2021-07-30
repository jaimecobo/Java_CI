async function timedAction() {
    let promise = new Promise((resolve, reject) => {
      setTimeout(() => resolve("done!"), 2000);
    });
  
    let result = await promise; // Pauses and waits for the return value
    //   let result = promise; // Doesn't pause, doesn't get return value
  
    alert(result);
  }
  
  timedAction();