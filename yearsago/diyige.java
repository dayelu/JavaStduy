import java.util.Scanner;
public class diyige{
	public static void main (String[] args){
	int b;
	int c;
	String a;
	Scanner scanner=new Scanner(System.in);
	System.out.println("请输入一个字符串");
	a=scanner.nextLine();
	System.out.println("请输入一个整数");
	b=scanner.nextInt();
	System.out.println("请输入你的号码");
	c=scanner.nextInt();
	if(c==5634)
	System.out.println("恭喜你，中大奖了！");
	else
	System.out.println("谢谢惠顾吧，呵呵。");
	}
}