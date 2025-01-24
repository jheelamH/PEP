public class Student {
    private String name;
    private String college;

    public Student(String name, String college) {
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}
