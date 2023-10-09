public class Teacher {
    private String name;
    private String subject;
    private int age;

    public Teacher(String name, String subject, int age) {
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    public void print() {
        System.out.println("Läraren heter " + this.name + " och är " + this.age + " år gammal. Lär ut i ämnet " + this.subject + ". ");
    }

    public void salary() {
        System.out.println(this.name + " skall få " + this.age * 1000 + "kr i månadslön.");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

}
