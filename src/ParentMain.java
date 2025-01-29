class Parent {
    void show(){
        System.out.println("Parent's method");
    }
}
class Child extends Parent{
    @Override
    void show(){
        System.out.println("Child's method");
    }
}
public class ParentMain {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show(); // Outputs: Parent's method

        Child obj2 = new Child();
        obj2.show(); // Outputs: Child's method

        Parent obj3 = new Child(); // Upcasting
        obj3.show(); // Outputs: Child's method (dynamic method dispatch)
    }
}

