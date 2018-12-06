package factory;

/**
 * @author: zhaoquan
 * @date: 18-12-6 14:43
 * @description:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
