class OldClass {
    @Deprecated
    void oldMethod(){
        System.out.println("This method is deprecated.Use new method");
    }
    void newMethod(){
        System.out.println("This is the new method");
    }
}
public class DeprecatedExample{
    public static void main(String[] args){
        OldClass obj=new OldClass();
        obj.oldMethod();
        obj.newMethod();
    }
}