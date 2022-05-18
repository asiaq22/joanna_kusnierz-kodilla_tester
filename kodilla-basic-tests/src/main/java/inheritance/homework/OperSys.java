package inheritance.homework;

public class OperSys {

    public static void main(String[] args) {
        OperatingSystem windows = new OperatingSystem(1985);
        windows.displayYear();
        windows.turnOn();
        windows.turnOff();

        WindowsXP windowsXP = new WindowsXP(2001);
        windowsXP.displayYear();
        windowsXP.turnOn();

        Windows10 windows10 = new Windows10(2015);
        windows10.displayYear();
        windows10.turnOff();
    }
}
