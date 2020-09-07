import java.util.Arrays;
public class gelaile{
public static void main(String[] args) {
		int i=1;
		int j=1;
		int[][] a=new int[i][j];
		for(i=1;i<=11;i++){
			for(j=1;j<=i;j++){
				a[1][j]=1;
				a[j][j]=1;
				System.out.println(a[i][j]);
				}
			System.out.println();
			}
		}
	}