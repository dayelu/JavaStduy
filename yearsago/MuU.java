import java.util.*;
public class MuU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] scores={12,456,78,66,56,18,94,77,-7,-78,-90,378,880,118};
	MuU jibaa=new MuU();
	int[] a=jibaa.paiming(scores);
	System.out.println(a);
	}
public int[] paiming(int[] scores){
	
		
		Arrays.sort(scores);
		int[] fScores={scores[0],scores[1],scores[2]};
		return fScores;
	}
	
}
