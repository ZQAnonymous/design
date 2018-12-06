package abstractfactory.color;

import abstractfactory.AbstractFactory;
import abstractfactory.shape.Shape;

/**
 * @author: zhaoquan
 * @date: 18-12-6 15:12
 * @description:
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        Color color1 = null;
        if(null == color){
            return null;
        }
        String noCase = color.toUpperCase();
        switch (noCase){
            case "RED":
                color1 = new Red();
                break;
            case "GREEN":
                color1 = new Green();
                break;
            case "BLUE":
                color1 = new Blue();
                break;
            default:
                break;
        }
        return color1;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
