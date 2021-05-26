import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		//숫자 하나를 입력 받은 후
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나 입력 > ");
		int n = sc.nextInt();
		//1부터 입력한 숫자까지의 합을 출력
		int total = 0;
		int i = 0;
		while(i<=n)
			total += i++;
		
		//10 입력 ---> 55가 출력
		System.out.println("총합 : "+total);
	}

}
