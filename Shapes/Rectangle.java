package Shapes;

public class Rectangle {
    private final int width;
    private final int height;
    
    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }
    
    public int getArea(){
        return this.height * this.width;
    }
}
