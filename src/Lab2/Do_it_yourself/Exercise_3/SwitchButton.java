package Lab2.Do_it_yourself.Exercise_3;
import Lab2.Step_by_step.Exercise_2.FlashLamp;

import java.util.Scanner;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void switchOn(){
        status = true;
        setStatus(status);
    }

    public void switchOff(){
        status = false;
        setStatus(status);
    }

    public void connectToLamp(ElectricLamp lamp){
        this.lamp = lamp;
    }

    public boolean getLampInfo() {
        return lamp.isStatus();
    }

    public static void main(String[] args) {
        SwitchButton testSwitchButton = new SwitchButton();
        ElectricLamp testElectricLamp = new ElectricLamp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Connect the SwitchButton object to the ElectricLamp");
        System.out.println("Please Wait 2s...\n");
        testSwitchButton.connectToLamp(testElectricLamp);

        System.out.println("Status Lamp = " + testSwitchButton.getLampInfo());
        SwitchButton.timeWait();

        while (true){
            System.out.println("Turn ON ElectricLamp Yes OR NO:  y/n");
            String choice = scanner.nextLine();
            if (choice.equals("y")){
                testSwitchButton.switchOn();
                testElectricLamp.turnOn();
                System.out.println("Status Lamp = " + testSwitchButton.getLampInfo());
                System.out.println("ElectricLamp ON and wait 10s");
                for (int i = 0; i <10; i++){
                    FlashLamp.timeWait();
                    System.out.println(i+1);
                }
                testSwitchButton.switchOff();
                testElectricLamp.turnOff();
                System.out.println("Status Lamp = " + testSwitchButton.getLampInfo());
                System.out.println("ElectricLamp OFF");
            } else if (choice.equals("n")){
                System.out.println("ElectricLamp FINNISH");
                break;
            } else {
                System.out.println("Enter Wrong, Again");
            }
        }

    }

    public static void timeWait() {
        try {
            Thread.sleep(500);
        }
        catch (Exception e){

        }
    }
}
