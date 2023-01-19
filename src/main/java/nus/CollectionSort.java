package nus;

import java.util.*;

public class CollectionSort {

    public CollectionSort() {
    }

    public void collectionSort(){
        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            number.add((int) (Math.random() * 100));
        }

        System.out.print("Unsorted list: " + number);

        Collections.sort(number);

        System.out.println("Sorted list: " + number);


    }

    public void employeeSort(){
        Employee e = new Employee();


        List<Employee> employeesList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            Random random = new Random();
            employeesList.add(new Employee(random.nextInt(9999),
                    "minion" + (10-i), "SOC", "Lecturer",
                    "minion" + (10-i) + "@nus.edu.sg", random.nextInt(99999)));
        }

        System.out.println("Unsorted employees: " + employeesList);

        Collections.sort(employeesList);

        System.out.println("Sorted employees by name: " + employeesList);

        employeesList.sort(Comparator.comparing(employee -> employee.getSalary()));
        System.out.println("Sorted employees by salary: " + employeesList);

    }
}
