// STAR PATTERN (NORMAL TYPE )
import java.util.Scanner;
public class starpat1{
		public static void main(String[] args){
				int i,j;
				Scanner lim= new Scanner(System.in);
				System.out.println("ENTER THE LIMIT:");
				int x=lim.nextInt();				
				for(i=0;i<=x;i++){
					for(j=0;j<=x;j++){
						System.out.print("$");
					}
						System.out.println("$");
				}
		}
}
