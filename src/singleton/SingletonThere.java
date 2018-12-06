package singleton;

/**
 * @author: zhaoquan
 * @date: 18-12-6 16:17
 * @description: 加同步锁时，前后两次判断实例是否存在（可行）
 */
public class SingletonThere {

    private static SingletonThere singletonThere = null;

    private SingletonThere(){

    }

    public static SingletonThere getInstance(){
        if(singletonThere == null){
            synchronized (SingletonThere.class){
                if(singletonThere == null){
                    singletonThere = new SingletonThere();
                }
            }
        }
        return singletonThere;
    }
}
