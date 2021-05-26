import java.util.Scanner;

public class Quest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0, num=0;
		
		do{
			//숫자 0을 입력할때까지 숫자를 입력
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			//입력할 떄 마다 숫자들을 total 누적
			total += num;
		}while(num != 0) ;
		//총합을 출력
		System.out.println("입력한 숫자들의 총합 : " + total);
	}
}
