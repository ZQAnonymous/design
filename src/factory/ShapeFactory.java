package factory;

/**
 * @author: zhaoquan
 * @date: 18-12-6 14:44
 * @description:
 */
public class ShapeFactory {

    public static Shape getInstance(String shapeType){
        Shape shape = null;
        if(null == shapeType){
            return null;
        }
        String noCase = shapeType.toUpperCase();
        switch (noCase){
            case "CIRCLE":
                shape = new Circle();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            case "SQUARE":
                shape = new Square();
                break;
            default:
                break;
        }
        return shape;
    }

}
