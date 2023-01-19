package nus;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArraySort as = new ArraySort();
        CollectionSort cs = new CollectionSort();
        Employee e = new Employee();

        as.sortString();
        as.sortNumbers();
        cs.collectionSort();
        cs.employeeSort();



    }
}