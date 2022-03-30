package dxc;

public class danli {

}
class bank {
    private bank() {
    }

    private static bank instance = null;

    // 方式1：
    public static synchronized bank getInstance() {

        //等同于方式1   synchronized (bank.class) {
//            if (instance==null){
//                instance=new bank();
//            }
//            return instance;
//        }
        // }
        // 效率稍微高一点
        if (instance == null) {
            synchronized (bank.class) {
                if (instance == null) {
                    instance = new bank();
                }
            }
        }
        return instance;
    }

}
