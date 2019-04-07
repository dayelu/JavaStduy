public class PSP implements IGameInterface{

    public  void PlayGame(){
        System.out.println("PSP可以玩游戏");
    }
    public static void main(String[] args) {
        //与抽象类相似，接口也不能直接被实例化，但是可以引用对象变量
        IGameInterface game = new PSP();
        game.PlayGame();
        // 或者使用匿名内部类的方法使用
        IGameInterface non = new IGameInterface(){
        
            @Override
            public void PlayGame() {
                System.out.println("使用引用匿名内部类的方法实现接口");
            }

        };
        non.PlayGame();

        new IGameInterface(){
        
            @Override
            public void PlayGame() {
                System.out.println("直接使用匿名内部类的方法实现接口");
            }
        }.PlayGame();

    }
}