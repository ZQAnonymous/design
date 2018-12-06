package abstractfactory.shape;

/**
 * @author: zhaoquan
 * @date: 18-12-6 14:43
 * @description:
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
