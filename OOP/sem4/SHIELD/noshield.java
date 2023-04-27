package SHIELD;

public class noshield extends shields {

    private static noshield instance;

    private noshield(){
        super(0, 0);
    }

    public static noshield getInstance(){
        if (instance == null){
            synchronized (noshield.class){
                if (instance == null){
                    instance = new noshield();
                }
            }
        }
        return instance;
    }

}