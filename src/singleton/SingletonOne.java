package singleton;

/**
 * @author: zhaoquan
 * @date: 18-12-6 16:12
 * @description: 只适合单线程环境（不好）
 */
public class SingletonOne {

    private static SingletonOne singletonOne = null;

    private SingletonOne() {
    }

    public static SingletonOne getInstance(){
        if(singletonOne == null){
            singletonOne = new SingletonOne();
        }
        return singletonOne;
    }
}
