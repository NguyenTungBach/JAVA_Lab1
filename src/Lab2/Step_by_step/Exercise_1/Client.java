package Lab2.Step_by_step.Exercise_1;

public class Client {
    public static void main(String[] args) {
        Student studentA = new Student(1,"Nguyen Van A",true);
        Student studentB = new Student(1,"Nguyen B B",false);

        studentA.printInfo();
        studentB.setName("Nguyen Van B");
        studentB.printInfo();
    }
}
