

let list = document.querySelector('ul');


function insert_item(){
    
    let new_item = document.getElementById('newItem').value;
    newItem.value = '';
    console.log("the item is: " + new_item);
    let new_li = document.createElement('li');
    console.log("New li created as: " + new_li);
    new_li.innerHTML = new_item;
    console.log(new_li.innerHTML);
    list.appendChild(new_li);
    new_li.addEventListener('click', crossOut);
    new_li.addEventListener("click", removeItem);


}

function crossOut(event){
    event.target.style.cssText += 'text-decoration:line-through';
}


function removeItem(event){
    sleep(1000).then(() => {
        event.target.remove();
    });
}

function sleep (time) {
    return new Promise((resolve) => setTimeout(resolve, time));
  }
