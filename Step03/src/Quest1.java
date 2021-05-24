import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		/*
		 * 숫자 하나를 입력 받은 후
		 * 입력한 숫자가 짝수인지 홀수 인지 출력
		 */
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		
		String result = n % 2 == 0 ? "짝수" : "홀수";
		System.out.println("입력하신 숫자는 "+result + "입니다.");
	}

}
