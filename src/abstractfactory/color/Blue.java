package abstractfactory.color;

/**
 * @author: zhaoquan
 * @date: 18-12-6 14:56
 * @description:
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
