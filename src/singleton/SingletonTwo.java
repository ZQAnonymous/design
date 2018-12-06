package singleton;

/**
 * @author: zhaoquan
 * @date: 18-12-6 16:14
 * @description: 多线程的情况可以用。（懒汉式，不好）
 */
public class SingletonTwo {

    private static SingletonTwo singletonTwo = null;

    private SingletonTwo(){

    }

    public static synchronized SingletonTwo getInstance(){
        if(singletonTwo == null){
            singletonTwo = new SingletonTwo();
        }
        return singletonTwo;
    }

}
