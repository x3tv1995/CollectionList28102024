package org.example.task3;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Employee employee1= new Employee("Alex",18,40000);
        Employee employee2= new Employee("Bob",21,35000);
        Employee employee3= new Employee("John",21,55000);
        Employee employee4= new Employee("Jane",21,70000);
        Employee employee5= new Employee("July",21,80000);
        Employee employee6= new Employee("Oleg",21,90000);
        Employee employee7= new Employee("Andrey",21,100000);
        Employee employee8= new Employee("Max",21,120000);
        Employee employee9= new Employee("Ivan",21,10000);
        Employee employee10= new Employee("Raf",21,120000);

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);


        for (Employee employee : employees) {
            if(employee.getSalary() <= 40000){
                employee.setSalary(employee.getSalary()+ 5000);
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
