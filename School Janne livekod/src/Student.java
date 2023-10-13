public class Student extends Person {
    private int year;

    Student(String name, int age, int year) {
        super(name, age);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void startYear() {
        System.out.println("Jag började år " + this.year + ".");
    }

}
