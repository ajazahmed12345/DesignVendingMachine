package org.example.equalsAndHashcode;

public class Client {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ajaz");
        Employee e2 = new Employee(2, "Ajaz");
        Employee e3 = null;

        System.out.println((e1 == e2) + " and " + e1.equals(e3));
    }
}
