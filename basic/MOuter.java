//外部类
public class MOuter{
    //外部类中的方法
    public void show(){
        final int a = 25;
        int  b = 13;
        //方法内部类
        class MInner{
            int c = 2;
            public void print(){
                System.out.println("访问外部类的方法中的常量a：" + a);
                System.out.println("访问内部中的常量c：" + c);
            } 
        }
        MInner mi = new MInner();//创建方法北部类的对象
        mi.print();//调用内部类的方法
    }
    public static void main(String[] args){
        MOuter mo = new MOuter();//创建外部类的对象
        mo.show();//调用外部类的方法
    }
}