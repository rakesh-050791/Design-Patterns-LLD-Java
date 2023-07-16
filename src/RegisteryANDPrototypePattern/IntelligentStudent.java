package RegisteryANDPrototypePattern;

public class IntelligentStudent extends Student{
    int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
