public class FirstClass {                           // [1]
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println(notebook.weight + "g " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2015);
        System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1200, 500, 1995);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        Notebook youngNotebook = new Notebook(1000, 2200, 2010);
        System.out.println(youngNotebook.weight + "g " + youngNotebook.price + " " + youngNotebook.year);
        youngNotebook.checkPrice();
        youngNotebook.checkWeight();
        youngNotebook.checkYear();

        Notebook exampleNotebook = new Notebook (2500, 1200, 1234);
        System.out.println(exampleNotebook.weight + "g " + exampleNotebook.price + " " + exampleNotebook.year);
        exampleNotebook.checkPrice();
        exampleNotebook.checkWeight();
        exampleNotebook.checkYear();

        }

    }