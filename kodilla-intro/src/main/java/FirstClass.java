public class FirstClass {                           // [1]
    public static void main(String[] args) {
        String text = "Hello from FirstClass";// [2]
        System.out.println(text); // [3]

        if (1 > 2) {
            System.out.println("Niesamowite! Jeden jest większe niż dwa!!!");
        } else {
            System.out.println("Wszystko po staremu, jeden jest mniejsze niż dwa.");
        }
    }
}