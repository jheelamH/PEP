class Animal{
    void move(){
        System.out.println("Animal is moving");
    }
}
class Bird extends Animal{
    void move(){
        System.out.println("Bird is flying");
    }
}
class Penguin extends Animal{
    void move(){
        System.out.println("Penguin is walking");
    }
}
public class MultipleInheritance {
    public static void main(String[] args){
        Animal animal=new Animal();
        animal.move();
        Bird bird=new Bird();
        bird.move();
        Penguin penguin =new Penguin();
        penguin.move();
    }
}
