public class Students {
    private String name;
    private String college;
    public Students(String name, String college){
        super();
        this.name=name;
        this.college=college;
    }
    public String getName(){
        return name;
    }
    public String getCollege(){
        return college;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCollege(String college){
        this.college=college;
    }
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String name= sc.nextLine();
//        String college= sc.nextLine();
        Student student=new Student("Jheelam","LPU");
        System.out.println(student.getName());
        System.out.println(student.getCollege());
    }
}
