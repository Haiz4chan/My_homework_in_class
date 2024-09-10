package assignment10_cs_303_ois_lenhatanh3696;

public class Author {

    private String Name;
    private String DateofBirth;

    Author() {
    }

    Author(String Name, String DateofBirth) {
        this.Name = Name;
        this.DateofBirth = DateofBirth;
    }

    public String getName() {
        return Name;
    }

    public String getDateofBirth() {
        return DateofBirth;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDateofBirth(String DateofBirth) {
        this.DateofBirth = DateofBirth;
    }

    public String toString() {
        return "Author name=" + getName() + ", dateOfBirth=" + getDateofBirth();
    }

    void setDateOfBirth(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
