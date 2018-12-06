package abstractfactory;

import abstractfactory.color.ColorFactory;
import abstractfactory.shape.ShapeFactory;

/**
 * @author: zhaoquan
 * @date: 18-12-6 15:14
 * @description:
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }

}
