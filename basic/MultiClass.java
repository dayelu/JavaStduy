public class MultiClass{
    // public static void main(String[] args) {
    //     System.out.println("我是与文件名同名的类");
    // }
    public MultiClass(){
        System.out.println("I'm the same name with file name");
    }
}

class AnotherClass{
    public static void main(String[] args) {
        MultiClass mc = new MultiClass();
        System.out.println("I'm the class who containing with main function");
    }
}

class ExtraClass{
    public ExtraClass(){
        System.out.println("I'm a ordinary class");
    }
}