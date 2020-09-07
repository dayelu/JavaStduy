
import java.util.Scanner;
public class 阶乘 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int j=1;
		System.out.println("请输入一个整数");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		
		for(int i=1;i<=a;i++){
			j=j*i;
		}
		System.out.println("a的阶乘是："+j);
	}

}
