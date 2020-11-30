package DIT953.polygons.polygon;

public class PolygonFactory {

    public static Rectangle createRectangle(int x,int y){
        Rectangle newObj = new Rectangle(x,y);
        return newObj;
    }
    public static Square createSquare(int x,int y){
        Square newObj = new Square(x,y);
        return newObj;
    }
    public static Triangle createTriangle(int x,int y){
        Triangle newObj = new Triangle(x,y);
        return newObj;
    }






}
