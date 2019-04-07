public abstract class AbstractPhone {
    //抽象方法没有方法体以分号结束 
    public abstract void call();
    public abstract void message();
    /**
     * 抽象类可以有非抽象的方法
     */
    public void greet(){
        System.out.println("你好");
    }


}

class CellPhone extends AbstractPhone{
    
    @Override
    public void call(){
        System.out.println("通过键盘打电话");
    }

    @Override
    public void message(){
        System.out.println("通过键盘发短信");
    }
}

class SmartPhone extends AbstractPhone implements IGameInterface{
    
    @Override
    public void call(){
        System.out.println("通过语音打电话");
    }

    @Override
    public void message(){
        System.out.println("通过语音发短信");
    }
    @Override
    public void PlayGame(){
        System.out.println("智能手机可以玩游戏");
    }
}

class Initail{
    public static void main(String[] args) {
        //抽象类不能直接创建，可以定义引用变量
        AbstractPhone cp = new CellPhone();
        cp.call();
        cp.message();
        cp.greet();
        AbstractPhone sp = new CellPhone();
        sp.call();
        sp.message();
        sp.greet();
        IGameInterface game = new SmartPhone();
        game.PlayGame();
        
    }
}