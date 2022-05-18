package inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnOn() {
        System.out.println("Turn on the system");
    }

    public void turnOff() {
        System.out.println("Turn off the system.");
    }

    public int getYear() {
        return year;
    }

    public void displayYear() {
        System.out.println("The year of publication: " + year);
    }
}
