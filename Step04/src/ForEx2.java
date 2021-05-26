import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 값을 구할 숫자 하나 입력 하세요>");
		int n = sc.nextInt();
		
		int fac=1;
			
		for(int i=1;i<=n;i++)
			fac *= i;
		
		System.out.println(fac);
	}

}




