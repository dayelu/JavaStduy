
import java.util.Scanner;
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a;
		int sum=0;
		System.out.println("������һ������");
		a=scanner.nextInt();
		
		for(int i=0;i<=a;i++){
			sum=sum+i;
		}
		System.out.println("��һ�ӵ�a�ĺ��ǣ�"+sum);
	}

}
