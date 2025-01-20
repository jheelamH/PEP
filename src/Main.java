//abstract class Shape {
//    abstract void draw();
//}
//class Circle extends Shape{
//    void draw(){
//        System.out.println("Circle");
//    }
//}
//
//class Rectangle extends Shape{
//    void draw(){
//        System.out.println("Rectangle");
//    }
//}
interface Playable{
    void play();
    default void stop(){
        System.out.println("Stopping!");
    }
}
class VideoPlayer implements Playable{
    public void play(){
        System.out.println("Video");
    }

    @Override
    public void stop() {
        System.out.println("Stop video");
    }
}
class AudioPlayer implements Playable{
    public void play(){
        System.out.println("Audio");
    }

    @Override
    public void stop() {
        System.out.println("Stop audio");
    }
}
public class Main{
    public static void main(String[] args){
//        Shape circle = new Circle();
//        Shape rectangle = new Rectangle();
//        circle.draw();
//        rectangle.draw();
        Playable VideoPlayer = new VideoPlayer();
        Playable AudioPlayer = new AudioPlayer();

        VideoPlayer.play();
        VideoPlayer.stop();
        AudioPlayer.play();
        AudioPlayer.stop();
    }
}