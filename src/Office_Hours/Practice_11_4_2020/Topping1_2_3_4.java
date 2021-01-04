package Office_Hours.Practice_11_4_2020;

import java.util.Map;

public class Topping1_2_3_4 {

        public Map<String, String> topping1(Map<String, String> map) {

            map.put("bread", "butter");
            // butter, bread


            if(map.containsKey("ice cream")) {
                map.put("ice cream", "cherry");
            }

            return map;

        }

    public Map<String, String> topping2(Map<String, String> map) {

        if(map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        if(map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;

        // get() != null or !get().isEmpty
    }

    public Map<String, String> topping3(Map<String, String> map) {

        if(map.get("potato") != null){
            map.put("fries", map.get("potato"));
        }

        if(map.get("salad") != null) {
            map.put("spinach", map.get("salad"));
        }

        return map;

    }


// null.isEmpty()  -> nullpointer




}