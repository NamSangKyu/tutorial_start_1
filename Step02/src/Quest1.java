import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수 두개 선언 후 숫자 두개를 입력 받아서 출력하는 코드를 작성
		int n1=0, n2=0;
		
		System.out.print("첫번째 숫자 입력 하세요 >");
		n1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 하세요 >");
		n2 = sc.nextInt();
		
		//해당 식의 결과를 출력
		//n1 + n2 * (n1 / n2)
		int result = n1 + n2 * (n1 / n2);
		System.out.println(result);

	}

}




