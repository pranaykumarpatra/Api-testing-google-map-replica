# Api-testing-google-map-replica
I just tested the response for the API which is a replica of google map API 
test API hosted on https://rahulshettyacademy.com/
////////////////////////////////////////////////////////////////////
==============================================================================
==============================================================================

HERE I AM POSTING THE API CONTRACT FOR THE TSEING 
=====================================================

Google Maps Add API (POST):
This API Will add new place into Server
 
Complete URL : https://rahulshettyacademy.com/maps/api/place/add/json?key= qaclick123

 
Base URL:  https://rahulshettyacademy.com  

Resource: /maps/api/place/add/json

Query Parameters: key =qaclick123

Http Method: POST

Sample Body :

{

  "location": {
  
    "lat": -38.383494,
    
    "lng": 33.427362
    
  },
  
  "accuracy": 50,
  "name": "Frontline house",
  "phone_number": "(+91) 983 893 3937",
  "address": "29, side layout, cohen 09",
  "types": [
    "shoe park",
    "shop"
  ],
  "website": "http://google.com",
  "language": "French-IN"
}
 
Sample Response
 
{
    "status": "OK",
    "place_id": "928b51f64aed18713b0d164d9be8d67f",
    "scope": "APP",
    "reference": "736f3c9bec384af62a184a1936d42bb0736f3c9bec384af62a184a1936d42bb0",
    "id": "736f3c9bec384af62a184a1936d42bb0"
}
 
 
 

Google Maps Delete API (POST):
This API Will delete existing place from Server
 
Complete URL: https://rahulshettyacademy.com/maps/api/place/delete/json?key=qaclick123
 
Base URL: https://rahulshettyacademy.com
Resource: /maps/api/place/delete/json
Query Parameters: key
Http request : POST
 
Sample Body :
{
    "place_id":"928b51f64aed18713b0d164d9be8d67f"
}
 Sample Response
{
    "status": "OK"
}
 
 
 
Google Maps get Place  API   (GET):
This API Will get existing place details from Server
 
 
Complete URL : http://rahulshettyacademy.com/maps/api/place/get/json?place_id=xxxx&key=qaclick123
 
Base URL:  https://rahulshettyacademy.com	  	
Resource: /maps/api/place/get/json
Parameters: key,  place_id  //( place_id  value comes from Add place response)
Http request: GET
Note: Key value is hardcoded and it is always qaclick123
Sample Response for the Provided Place_Id
{
 
    	"location":{
 
    	"lat" : -38.383494,
 
    	"lng" : 33.427362
 
    	},
 
    	"accuracy":50,
 
    	"name":"Frontline house",
 
    	"phone_number":"(+91) 983 893 3937",
 
    	"address" : "29, side layout, cohen 09",
 
    	"types": ["shoe park","shop"],
 
    	"website" : "http://google.com",
 
    	"language" : "French-IN"
 
}
 
 
Google Maps Put Place API  (PUT):
This API Will update existing place in Server with new values
 
Complete URL : http://rahulshettyacademy.com/maps/api/place/update/json?place_id=xxxx&key=qaclick123
 
Base URL :  https://rahulshettyacademy.com	 	
Resource: /maps/api/place/update/json
Query Parameters: key, place_id //(place_id  value comes from Add place response)
Http Method: PUT
Note: Key value is hardcoded and it is always qaclick123
 
 
Sample Request:
{
"place_id":"8d2573bdf6ceec0e474c5f388fa917fb",
"address":"70 winter walk, USA",
"key":"qaclick123"
}
 
 
Sample Response for the Provided Place_Id
{
 
    	"location":{
 
    	"lat" : -38.383494,
 
    	"lng" : 33.427362
 
    	},
 
    	"accuracy":50,
 
    	"name":"Frontline house",
 
    	"phone_number":"(+91) 983 893 3937",
 
    	"address" : "29, side layout, cohen 09",
 
    	"types": ["shoe park","shop"],
 
    	"website" : "http://google.com",
 
    	"language" : "French-IN"
 
}
 
 
 
 
 
 
 


