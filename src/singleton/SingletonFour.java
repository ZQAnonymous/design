package singleton;

/**
 * @author: zhaoquan
 * @date: 18-12-6 16:20
 * @description: 饿汉式（建议使用）
 */
public class SingletonFour {

    private static SingletonFour singletonFour = new SingletonFour();

    private SingletonFour(){}

    public static SingletonFour getInstance(){
        return singletonFour;
    }

}
