
import java.util.*;
public class λ��̽�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
int a;
int b=0;
System.out.println("������һ��10λ�����µ�����");
a=scanner.nextInt();
	while(a/10>=1){
		if(a<1){
		System.out.println("����һ��"+b+"λ��");	
		}
		else{
	b++;
	a=a/10;	
			}
		}
	System.out.println("����һ��"+(b+1)+"λ��");
	}

}
