public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 1000 && this.weight <= 1500) {
            System.out.println("This notebook is not very heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }
    public void checkYear() {
        if (this.price <= 1000 && this.year > 2000) {
            System.out.println("This notebook is cheap and not too old.");
        } else if (this.price >1000 && this.year > 2000) {
            System.out.println("This notebok is expensive but quite young.");
        } else {
            System.out.println("This notebook is just old.");
        }

    }
}