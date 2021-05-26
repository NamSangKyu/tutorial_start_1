import java.util.Scanner;

public class WhileEx4 {

	public static void main(String[] args) {
		//숫자 하나 입력
		/*
			숫자입력 : 5

			입력한 숫자의 구구단 출력
			5 * 1 = 5
			5 * 2 = 10
			...
			5 * 9 = 45
			
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단 입력 : ");
		int dan = sc.nextInt();
		int i = 1;
		while(i<10) {
			System.out.println(dan + " * " + i + " = " + dan*i);
			i++;
		}
		
	}

}








