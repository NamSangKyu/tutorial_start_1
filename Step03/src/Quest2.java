import java.util.Scanner;

public class Quest2 {

	public static void main(String[] args) {
		/*
		 * 정수 두개를 입력 받아서
		 * 두수의 뺼셈 결과를 출력
		 * 단, 무조건 결과값이 양수가 나오겠끔 계산하시오.
		 */
		int n1, n2;
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		n2 = sc.nextInt();
		//답안1
//		int result = n1 > n2 ? n1 - n2 : n2 - n1;
		
		//답안2
		int result = n1 - n2;
		result = result < 0 ? -result : result;		
		
		System.out.println(result);
	}

}



