import java.util.Scanner;

public class GetLetter {
    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first letter of the colour (W, R, Y, O, P, G or B):");
        String letter = String.valueOf(scanner.nextLine());
        return letter;
        }


    }

