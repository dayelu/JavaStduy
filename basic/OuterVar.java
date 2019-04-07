//外部类Outer
public class OuterVar{
    int b = 1;//外部类中的成员属性b
    //内部类Inner
    public class Inner{
        int b = 2;
        public void test(){
            System.out.println("访问外部类中的b：" + OuterVar.this.b);
            System.out.println("访问内部类中的b：" + b);
        }
    }

    public static void main(String[] args) {
        OuterVar ov = new OuterVar();
        Inner i = ov.new Inner();
        i.test();
    }
}