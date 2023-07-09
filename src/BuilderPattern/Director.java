package BuilderPattern;

public class Director {
    StudentBuilder studentBuilder;

    public Director(StudentBuilder builder){
        this.studentBuilder = builder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof mbaStudentBuilder){
            return createMbaStudentBuilder();
        } else if (studentBuilder instanceof engineeringStudentBuilder) {
            return createEngineeringStudentBuilder();
        }
        return null;
    }

    public Student createMbaStudentBuilder(){
        return studentBuilder.setRollNumber(36).setAge(32).setName("Rakesh").setSubjects().build();
    }

    public Student createEngineeringStudentBuilder(){
        return studentBuilder.setRollNumber(32).setAge(22).setName("Lorem Ipsum").setSubjects().build();
    }
}
