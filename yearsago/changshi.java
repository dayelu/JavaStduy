import java.util.Scanner;
	public class changshi{
	public static void mian (String[] args){
	int c;
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入一个字符");
	String a=scanner.nextLine();
	System.out.println("请输入一个整数");
	int b=scanner.nextInt();	
	c=a+b;
	System.out.println(c);
	}
}