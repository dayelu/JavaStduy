//外部类Outer
public class SOuter{
    private int a = 99;//外部的私有属性
    static int b = 9;  // 外部的静态变量
    //静态内部类Inner
    public static class SInner{
        int b = 2;//内部类的成员属性
        public void test(){
            System.out.println("访问外部类中的a:" + new SOuter().a);
            System.out.println("访问外部类中的b:" + SOuter.b);
            System.out.println("访问内部类中的b:" + b);  
        }   
    }
    //测试静态成员内部类
    public static void main(String[] args){
        SInner si = new SInner();// 直接创建内部类对象
        si.test();// 调用内部类对象的test方法
    }
}