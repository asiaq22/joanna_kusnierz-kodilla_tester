package inheritance.homework;

public class WindowsXP extends OperatingSystem {

    @Override
    public void turnOn() {
        System.out.println("The system turn on 7 applications.");
    }

    @Override
    public void turnOff() {
        System.out.println("The system turn off 7 applications.");
    }

    public WindowsXP(int year) {
        super(year);

    }
}
