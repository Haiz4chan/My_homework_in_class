package studentsystem;

public class Student {

    private String ID;
    private String name;
    private String major;

    public Student() {
    }

    public Student(String ID, String name, String major) {
        this.ID = ID;
        this.name = name;
        this.major = major;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String major) {
        this.major = major;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

}
