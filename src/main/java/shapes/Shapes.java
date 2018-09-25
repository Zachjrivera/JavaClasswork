package shapes;

public class Shapes {
    //sides need a triangle rectangle
    private int sides;

    public Shapes(int sides){
        this.sides = sides;
    }


    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int calculateArea(){
        return sides ;
    }


}
