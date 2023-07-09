package BuilderPattern;

import java.util.ArrayList;
import java.util.List;
public class mbaStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Economics");
        subs.add("Marketing");
        subs.add("English");
        this.subjects = subs;
        return this;
    }
}
