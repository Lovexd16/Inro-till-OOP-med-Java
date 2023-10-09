public class School {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Kalle", "Matte", 30);
        Teacher teacher2 = new Teacher("Anna", "Svenska", 45);

        teacher1.print();
        teacher2.print();

        teacher1.salary();

        teacher1.setAge(50);
        teacher1.salary();

        String showTeacherName = teacher2.getName();
        System.out.println("Läraren: " + showTeacherName);
    }
}
