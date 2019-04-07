public class StatBlock {

    int num1;  // 声明变量num1
    int num2;  // 声明变量num2
    static int num3; // 声明静态变量num3
    public StatBlock(){
        num1 = 91;
        System.out.println("通过构造方法为变量num1赋值");
    }
    {//初始化快
        num2 = 74;
        System.out.println("通过初始化块为变量num2赋值");
    }
    static{// 初始化静态块
        num3 = 83;
        System.out.println("通过初始化静态块为变量num3赋值");
    }
    
    public static void main(String[] args){
    	StatBlock hello = new StatBlock();  //创建类的对象hello
        System.out.println("num1：" + hello.num1);
        System.out.println("num2：" + hello.num2);
        System.out.println("num3：" + num3);
        StatBlock hello2 = new StatBlock();  //创建类的对象hello2
    }
}