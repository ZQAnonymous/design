package singleton;

/**
 * @author: zhaoquan
 * @date: 18-12-6 16:21
 * @description: 静态内部内。（建议使用）
 */
public class SingletonFive {

    private SingletonFive(){}

    private static class SingletionHolder{
        private final static SingletonFive singletonFive = new SingletonFive();
    }

    public static SingletonFive getInstance(){
        return SingletionHolder.singletonFive;
    }

}
