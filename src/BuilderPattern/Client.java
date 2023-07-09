package BuilderPattern;

public class Client {
    public static void main(String[] args) {

        Director obj1 = new Director(new engineeringStudentBuilder());
        Director obj2 = new Director(new mbaStudentBuilder());

        Student engineeringStudent = obj1.createStudent();
        Student mbaStudent = obj2.createStudent();

        System.out.println(engineeringStudent.toString());
        System.out.println(mbaStudent.toString());

    }
}
