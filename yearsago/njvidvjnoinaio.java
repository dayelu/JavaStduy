
import java.util.Arrays;
public class njvidvjnoinaio {
public static void main(String[] args) {
	njvidvjnoinaio hello = new njvidvjnoinaio(); 
        maxScore = hello.getMaxAge(max);
		System.out.println("最大年龄为：" + maxScore); 
	}
	public void getMaxAge(int max) {
	
    int[] ages={
        18,23,21,19,25,29,17
    };
    max=ages[0];
    for(int i=0;i<7;i++){
    if(ages[i]<ages[i+1]){
        max=ages[i+1];
        }
    }
	}
}
