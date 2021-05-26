import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		// 5! -> 1 * 2 * 3 * 4 * 5 -> 팩토리얼
		Scanner sc = new Scanner(System.in);
		//숫자 하나 입력 받은 다음
		System.out.println("팩토리얼 값을 구할 숫자 하나 입력 하세요>");
		int n = sc.nextInt();
		
		//입력한 숫자의 팩토리얼 값을 출력
		int fac=1;
		
		while(n>0) {
			fac *= n ;
			n--;
			
		}
		System.out.println(fac);
	}

}




