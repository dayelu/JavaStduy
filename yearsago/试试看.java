
public class 试试看 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=1,y=2,z=3;
		double d;
		double c;
		d=y+=z--/++x;
		c=z++;//只能从高级到低级。不能从低级到高级.
		System.out.println(d);
		System.out.println(c);//c的值是在自增自减之后的那个值。
		System.out.println(z);
	}

}
