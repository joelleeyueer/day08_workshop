package nus;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        ArraySort as = new ArraySort();
        CollectionSort cs = new CollectionSort();
        Employee e = new Employee();
        HashMapTest hmp = new HashMapTest();

//        as.sortString();
//        as.sortNumbers();
//        cs.collectionSort();
//        cs.employeeSort();
//            hmp.HashMapExample();

        ReadFromCSV rfc = new ReadFromCSV();
        rfc.ReadFromCSV();



    }
}