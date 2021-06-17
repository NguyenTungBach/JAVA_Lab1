package Lab3.Ex4;

import java.util.Scanner;

public class DemoGetStudentDetails {
    public static void main(String[] args) {
        String name;
        int age;
        float weight;
        Scanner keyBorad = new Scanner(System.in);
        System.out.println("student name:");
        name = keyBorad.nextLine();
        System.out.println("student age:");
        age = keyBorad.nextInt();
        keyBorad.nextLine();
        System.out.println("student weight:");
        weight = keyBorad.nextFloat();

        System.out.println("name: "+ name);
        System.out.println("age: "+ age);
        System.out.println("weight: "+ weight);
    }
}
