public class Grades {
    private int[] grades;
    private int size;
    private int sum;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void lastGrade() {
        int numberOfGrades = this.size;
        int lastAddedGrade = 0;

        for (int k = 0; k < numberOfGrades; k++) {
            lastAddedGrade = this.grades[k];
        }
    }

    public void averageGrade() {
        int numberOfGrades = this.size;
        int sum = 0;

        for (int i = 0; i < numberOfGrades; i++) {
            sum += this.grades[i];
        }
        int averageGrades = sum / numberOfGrades;
        System.out.println(averageGrades);
    }
}