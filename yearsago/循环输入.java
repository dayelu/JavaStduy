
import java.util.Scanner;
public class 循环输入 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;

		System.out.println("请输入一个整数");
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextInt();
			while(a!=4567){
			if(a>4567){
				System.out.println("您猜大了，请再来一次。");
			}
			else if(a<4567){
				System.out.println("您猜小了，请再来一次。");
			}
						a=scanner.nextInt();	
				}
				System.out.println("恭喜您，猜对了!");
			
		}
}