
import java.util.Scanner;
public class 输入数字 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a;
		int sum=0;
		System.out.println("请输入一个整数");
		a=scanner.nextInt();
		
		for(int i=0;i<=a;i++){
			sum=sum+i;
		}
		System.out.println("从一加到a的和是："+sum);
	}

}
