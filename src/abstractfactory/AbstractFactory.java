package abstractfactory;

import abstractfactory.color.Color;
import abstractfactory.shape.Shape;

/**
 * @author: zhaoquan
 * @date: 18-12-6 14:57
 * @description:
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
