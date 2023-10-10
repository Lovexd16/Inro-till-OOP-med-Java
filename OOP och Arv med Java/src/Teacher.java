public class Teacher extends Person{
    
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void sayHello() {
        System.out.println("Hej! Jag heter " + getName() + "! Och jag är " + getAge() + " år gammal! Och jag lär ut i " + this.subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
