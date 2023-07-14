package PrototypePattern;

public class Client {
    public static void main(String[] args) {
        Student obj1 = new Student(20, 32, "Rakesh");
        Student cloneObj = (Student) obj1.clone();
    }
}
