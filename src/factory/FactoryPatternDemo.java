package factory;

/**
 * @author: zhaoquan
 * @date: 18-12-6 14:50
 * @description:
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.getInstance("CIRCLE");
        shape.draw();
    }

}
