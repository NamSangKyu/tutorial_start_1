import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 하나 입력 > ");
		int n = sc.nextInt();
		int total = 0;
		for(int i=1;i<=n;i++)
			total += i;
		System.out.println("총합 : "+total);
	}

}
