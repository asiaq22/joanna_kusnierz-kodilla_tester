public class User {
    String name;
    int year;

    public User(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public static int averageAge(User[] users) {
        int numberOfUsers = users.length;
        int sum = 0;

        for (int i = 0; i < numberOfUsers; i++) {
            sum += users[i].year;
        }
        int averageAges = (int) (sum / (float)numberOfUsers);

        return (int) averageAges;
    }

    public static void belowAverage(User[] users) {
        int numberOfUsers = users.length;
        int averageAges = averageAge(users);

        for (int i = 0; i < numberOfUsers; i++) {
            if (users[i].year < averageAges) {
                System.out.println(users[i].name);

            }
        }
    }

    public static void main(String[] args) {

        User asia = new User("Asia", 30);
        User ania = new User("Ania", 32);
        User beata = new User("Beata", 28);
        User karol = new User("Karol", 34);
        User lucyna = new User("Lucyna", 57);
        User leszek = new User("Leszek", 57);
        User zofia = new User("Zofia", 82);
        User teofil = new User("Teofil", 92);
        User gizela = new User("Gizela", 84);
        User antoni = new User("Antoni", 88);

        User[] users = {asia, ania, beata, karol, lucyna, leszek, zofia, teofil, gizela, antoni};

        averageAge(users);
        belowAverage(users);

    }
}