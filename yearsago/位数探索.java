
import java.util.*;
public class 位数探索 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
int a;
int b=0;
System.out.println("请输入一个10位数以下的整数");
a=scanner.nextInt();
	while(a/10>=1){
		if(a<1){
		System.out.println("这是一个"+b+"位数");	
		}
		else{
	b++;
	a=a/10;	
			}
		}
	System.out.println("这是一个"+(b+1)+"位数");
	}

}
