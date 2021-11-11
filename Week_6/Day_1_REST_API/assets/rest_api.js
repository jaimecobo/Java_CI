// Getting data with request-promise
const rp = require('request-promise');
var getData = function() {
return(rp('https://www.styvio.com/api/aapl'))
.then(body =>
console.log((JSON.parse(body))["ticker"] + " - " + 
(JSON.parse(body))["currentPrice"]),
                                                                        // document.getElementById("req_promise").innerHTML = JSON.parse(body))["ticker"] + " - " + (JSON.parse(body))["currentPrice"];
)
};
getData()
// The first line is the output from this first request



//Getting data with fetch

fetch("https://www.styvio.com/api/aapl")
  .then(response => response.json())
  .then(json => console.log(json))
                                                                        // .then(document.getElementById("req_promise").innerHTML = json)
// Everything else is the JSON file obtained 
// from this other request                                                                        