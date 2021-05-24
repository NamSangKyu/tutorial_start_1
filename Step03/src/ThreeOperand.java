import java.util.Scanner;

public class ThreeOperand {

	public static void main(String[] args) {
		//숫자 하나 입력 받는 코드 작성
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("나이 입력 : ");
		num = sc.nextInt();
		//나이가 19이상 '성인 입니다.', 19세 '미만 미성년자 입니다'
		String result = num >= 19 ? "성인 입니다." : "미성년자 입니다.";
		System.out.println(result);
	}

}
