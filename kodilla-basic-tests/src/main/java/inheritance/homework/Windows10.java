package inheritance.homework;

public class Windows10 extends WindowsXP {

    @Override
    public void turnOn() {
        System.out.println("The system turn on 15 applications.");
    }

    @Override
    public void turnOff() {
        System.out.println("The system turn off 15 applications.");
    }

    public Windows10(int year) {
        super(year);
    }
}
