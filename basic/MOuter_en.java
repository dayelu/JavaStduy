
public class MOuter_en{

    public void show(){
        final int a = 25;
        int  b = 13;

        class MInner{
            int c = 2;
            public void print(){
                System.out.println("outClass var" + a);
                System.out.println("inner class default" + c);
            } 
        }
        MInner mi = new MInner();
        mi.print();
    }
    public static void main(String[] args){
        MOuter_en mo = new MOuter_en();
        mo.show();
    }
}