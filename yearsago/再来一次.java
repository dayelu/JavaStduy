public class 再来一次{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		for(a=1;a<=11;a++){
			for(int i=1;i<=a;i++){
				int c=a*i;
				System.out.printf("%d*%d=%d\t",i,a,c);
			}
			System.out.println();
		}
	}

}
