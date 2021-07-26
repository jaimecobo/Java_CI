import requests

httpResponse = requests.get("https://www.styvio.com/api/aapl")
pythonData = httpResponse.json()
print(pythonData['ticker'] + " - " + pythonData['currentPrice'])
