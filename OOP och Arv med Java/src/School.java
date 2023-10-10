public class School {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher("Kalle", 56, "Matte");
        Teacher teacher2 = new Teacher("Anna", 35, "Svenska");

        Student student1 = new Student("Bengt", 20, 2022);
        Student student2 = new Student("Claes", 25, 2023);

        teacher1.sayHello();
        teacher2.sayHello();
        student1.sayHello();
        student2.sayHello();

    }
}
