
async function geoLocation(city){

fetch('https://geocode.xyz/'+ city + '?json=1')
.then(response => response.json())
.then(json => console.log("The city of " + city + " has a latitude = " + json.latt + " and longitude = " + json.longt))
}

geoLocation("Austin"); 
geoLocation("Boston"); 
geoLocation("Seattle"); 
geoLocation("Monterey");
geoLocation("Urban Honolulu");