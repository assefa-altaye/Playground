package OOP;
import java.util.*;

class Rectangle {
    private int height;
    private int width;

    //complete the constructors
    public Rectangle(){
        this.height=1;
        this.width=1;
    }

    public Rectangle(int height, int width){
        this.height=height;
        this.width=width;
    }

    public Rectangle(int randArea) {
    }

    //complete the getters
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    //complete the setters
    public void setHeight(int height){
        this.height=height;
    }
    public void setWidth(int width){
        this.width=width;
    }
    //complete getArea()
    public int getArea(){
        //int area=height*width;
        return height*width;
    }
    //complete toString()
    @Override
    public String toString(){
        return String.format("Rect [h=%d, w=%d] has an area of %d]", height, width, height*width);
    }
}
