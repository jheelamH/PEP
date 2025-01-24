public class GraduateStudent extends Student {
    private String specialization;

    public GraduateStudent(String name, String college, String specialization) {
        super(name, college); // Call the constructor of the parent class
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the parent class method
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String[] args) {
        GraduateStudent gradStudent = new GraduateStudent("Jheelam", "LPU", "Computer Science");
        gradStudent.displayDetails();
    }
}
