import java.util.Random;
import java.util.Scanner;
public class updown {

	public static void main(String[] args) {
        int R,a;
      
		System.out.println(" 컴퓨터와 Up & Down 게임을 시작합니다! 숫자를입력해주세요!");

		Scanner sc = new Scanner(System.in);
		R = sc.nextInt();
        int i;
      
    		for(i=1;i<=1000;) {
    		a = (int)(Math.random()*1000+1);
    	
    		i++;
    		

		if(R<i) {
			System.out.println("Up!");
			Scanner sc1= new Scanner(System.in);
    		R = sc1.nextInt();

		}
		else if(R>i) {
			System.out.println("down!");
			Scanner sc2= new Scanner(System.in);
    		R = sc2.nextInt();

		}
	 if(i==R) {
				System.out.println("정답입니다!");
				break;
	        }

		
    		
		 
		 
		 
		 
		 
		
		}
		
		
	
	

	
	}
	}
		
