package abstractfactory.shape;

/**
 * @author: zhaoquan
 * @date: 18-12-6 14:44
 * @description:
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
