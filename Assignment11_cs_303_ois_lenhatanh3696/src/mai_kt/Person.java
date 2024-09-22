package mai_kt;

import java.util.Date;

public abstract class Person implements IPerson {

    protected String id;
    protected String fullName;
    protected Date Date;

    Person() {
    }

    Person(String id, String fullName, Date Date) {
        this.id = id;
        this.fullName = fullName;
        this.Date = Date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public abstract void displayInfo();
}
