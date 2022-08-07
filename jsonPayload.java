package test.restapitesting;

public class jsonPayload {

    public static String  addplace(){
        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -38.383494,\n" +
                "    \"lng\": 33.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Pranay kumar patra\",\n" +
                "  \"phone_number\": \"(+91) 9861132416\",\n" +
                "  \"address\": \"kulad,nalconagar,angul\",\n" +
                "  \"types\": [\n" +
                "    \"up school\",\n" +
                "    \"home\"\n" +
                "  ],\n" +
                "  \"website\": \"http://google.com\",\n" +
                "  \"language\": \"India-IN\"\n" +
                "}\n";
    }
    public static String updatePlace(String placeId){
        return "{\n" +
                "\"place_id\":\""+placeId+"\",\n" +
                "\"address\":\"70 winter walk, USA\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}\n";
    }
    public static String deletePlace(String placeId2){
        return "{\n" +
                "    \"place_id\":\""+placeId2+"\"\n" +
                "}\n";
    }
}
