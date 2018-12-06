package abstractfactory.color;

/**
 * @author: zhaoquan
 * @date: 18-12-6 14:55
 * @description:
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
