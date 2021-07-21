// Class the defines object Card, its attributes and methods
class Card{
    constructor(value, suit, power, imgFileName){
      this.card_value = value;
      this.card_suit = suit;
      this.card_power = power;
      this.imgFileName = imgFileName;
    };
}
// Class the defines object Deck, its attributes and methods
class Deck{
    constructor(deck){
        this.deck = deck;
    };
}  
// Declares two new variables, to them make them instances of their respective classes
let card;
let deck;

// Array to then add filenames to objects Card
let arrayFileNames = [];

// Creates array with files images files names to letter add them to onject card
(function() {

    let fileName = "";
    // let arrayFileNames = [];

    const SUITS = ['H', 'S', 'C', 'D'];
    const VALUES = ['A', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K'];

    for (let suit in SUITS) {
        for (let value in VALUES) {
            fileName = "" + VALUES[value];
            fileName = fileName + SUITS[suit];
            fileName = fileName + ".jpg";
            console.log(fileName);
            arrayFileNames.push(fileName);

            fileName = "";
        };
    }
    // console.log(arrayFileNames);
      
})();



//Anonymous function to creates the object deck with a full set of objects cards
(function() {
    let i = 0;
    let arrayCards = [];
    const SUITS = ['Hearts', 'Spades', 'Clubs', 'Diamonds'];
    const VALUES = ['Ace', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'Jack', 'Queen', 'King'];

    for (let suit in SUITS) {
        for (let value in VALUES) {
            let power = 0;
            let fileName = "";
            if(VALUES[value] === 'Ace'){
                power = 14;
            }else if(VALUES[value] === 'Jack'){
                power = 11;
            }else if(VALUES[value] === 'Queen'){
                power = 12;
            }else if(VALUES[value] === 'King'){
                power = 13;
            }else{
                power = VALUES[value];
            }
            fileName = arrayFileNames[i];
            i++;
            card = new Card(VALUES[value], SUITS[suit], power, fileName);
            // console.log(card);
            // console.log(arrayCards);
            arrayCards.push(card);
        };
    }
    deck = new Deck(arrayCards);
    console.log(deck);
      
})();

let card01 = deck.deck[0];
let card02 = deck.deck[1];
console.log("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")
console.log("card01 is: " + card01.card_value + "  " + card01.card_suit + "  " + card01.card_power);
console.log("card02 i: " + card02.card_value + "  " + card02.card_suit + "  " + card02.card_power);

