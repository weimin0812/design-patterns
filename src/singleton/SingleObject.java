package singleton;

/**
 * @author weimin02
 * @date 2018/8/23
 * @project design-patterns
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello world");
    }


}
