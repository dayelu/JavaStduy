
public class 显式转换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=23;
		int c=453;
		double e=23.45;
		double b=(double)a;//注意：变量一定要在赋值以后才能使用，因为赋值也是一种运算，所以，必须先将a赋值才能进行转换。
		double d=e+c;
		int f=(int)e+c;
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
	}
}