# JSON is commonly used with data APIS. Here how we can parse JSON into a Python dictionary
import json

#sample Json
userJSON = '{"first_name": "John", "last name": "doe", "age": 30}'

#parse to dictionary
user = json.loads(userJSON)

print(user)
