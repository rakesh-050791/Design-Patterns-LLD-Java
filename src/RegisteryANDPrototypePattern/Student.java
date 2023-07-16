package RegisteryANDPrototypePattern;

import PrototypePattern.Prototype;

public class Student implements Prototype{
    private int age;
    private double psp;
    private String name;

    private String batch;

    private double batchAvgPsp;


    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setBatchAvgPsp(double batchAvgPsp) {
        this.batchAvgPsp = batchAvgPsp;
    }


    public Student(){};
    public Student(Student student){
        this.age = student.age;
        this.psp = student.psp;
        this.name = student.name;
        this.batch = student.batch;
        this.batchAvgPsp = student.batchAvgPsp;
    }


    @Override
    public Student clone() {
//        return new PrototypePattern.Student(age, rollnumber, name, batch, batchAvgPsp);
        return new Student(this);
    }
}
