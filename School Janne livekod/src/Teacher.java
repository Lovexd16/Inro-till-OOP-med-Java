public class Teacher extends Person {
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void sayHello() {
        System.out.println("Hej jag heter " + getName() + " och jag är " + getAge() + " år gammal. Jag lär ut " + this.subject + "."); //Då name och age är från super använder man get, subject är i denna klassen och då används av this.
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    
}
