package week6;

public class CG_Course extends Course{

    private String location;

    public CG_Course(String dept, int courseNumber, int credits, String location) {
        super(dept, courseNumber, credits);
        this.location = location;
    }

    public String toString() {
        String out = super.toString();
        out += " classes held in location " + this.location;
        return out;
    }
}
