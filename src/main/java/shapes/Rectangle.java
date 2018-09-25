package shapes;

public class Rectangle extends Shapes {
    int length;
    int width;

    public Rectangle (int sides,int length,int width){
        super(sides);
        this.length = length;
        this.width =width;
    }



    @Override
    public int calculateArea(){
        return (length*width);
    }


}
