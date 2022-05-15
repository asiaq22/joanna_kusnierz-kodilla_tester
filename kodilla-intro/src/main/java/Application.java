public class Application {
    public static void main(String[] args) {
        Person person = new Person("Adam", 40.5, 178);
        System.out.println(person.name + " " + person.age + " " + person.height);
        person.checkAgeHeight();
    }
}