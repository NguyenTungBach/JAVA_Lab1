package Lab3.Ex2;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        String name;
        name = null;
        name = "Learn Java By Example";
        System.out.println("name lenght: " + name.length());
        System.out.println("name.equals(\"learn\") = " + name.equals("learn"));
        System.out.println("name.equals(\"Learn Java By Example\") = " + name.equals("Learn Java By Example"));
        System.out.println("name.equalsIgnoreCase(\"learn java BY EXAMPLE\") = " + name.equalsIgnoreCase("learn java BY EXAMPLE"));
        System.out.println("name.split(\" \") = " + Arrays.toString(name.split(" ")));
    }
}
