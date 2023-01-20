package nus;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public void ConcurrentHashMapExample(){
        Map<String, Integer> phones = new ConcurrentHashMap<>();

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
            System.out.println("Found " + "IPHONE - " + phones.get("IPHONE"));
        }

        Enumeration<Integer> enumList= ((ConcurrentHashMap<String,Integer>) phones).elements();
        if (enumList.hasMoreElements()){
            System.out.println(enumList.nextElement());
        }
    }
}
