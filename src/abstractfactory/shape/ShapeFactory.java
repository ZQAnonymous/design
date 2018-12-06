package abstractfactory.shape;

import abstractfactory.AbstractFactory;
import abstractfactory.color.Color;

/**
 * @author: zhaoquan
 * @date: 18-12-6 14:44
 * @description:
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
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
                System.out.println("null");
                break;
        }
        return shape;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
