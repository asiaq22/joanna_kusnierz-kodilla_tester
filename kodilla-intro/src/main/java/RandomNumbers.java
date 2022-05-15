import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    static List<Integer> numbers = new ArrayList<>();


    public static int getRandom() {
        Random random = new Random();
        int sum = 0;
        int r = 0;

        while (sum < 5000) {
            r = random.nextInt(31);
            numbers.add(r);
            sum = sum + r;
        }

        return sum;
    }

    public static int maxRandom() {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); ++i)
            if (numbers.get(i) > max)
                max = numbers.get(i);
        return max;
    }

    public static int minRandom() {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); ++i)
            if (numbers.get(i) < min)
                min = numbers.get(i);
        return min;
    }

    public static void main(String[] args) {
        int result = getRandom();
        int min = minRandom();
        int max = maxRandom();
        System.out.println(result);
        System.out.println(min);
        System.out.println(max);

    }
}

