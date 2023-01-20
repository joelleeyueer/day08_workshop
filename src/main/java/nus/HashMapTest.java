package nus;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public HashMapTest() {
    }

    public void HashMapExample(){
        Map<String, Integer> phones = new HashMap<>();

        phones.put("IPHONE", 10);
        phones.put("SAMSUNG", 20);
        phones.put("OPPO", 30);
        phones.put("GOOGLE", 30);
        phones.put("CAT", 30);
        phones.put("ASUS", 30);

        for (String keyIterator: phones.keySet()) {
            System.out.println("Value of " + keyIterator + " is " + phones.get(keyIterator));
        }

        if (phones.containsKey("IPHONE")) {
            System.out.println("Found " + phones.containsValue(10));
        }
    }
}
