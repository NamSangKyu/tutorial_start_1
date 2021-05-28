import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일반 라면 1, 계란 토핑 2, 계란 치즈 3,계란 치즈 콩나물 4> ");
		int n = sc.nextInt();
		
		switch(n) {
		case 4:
			System.out.println("콩나물");
		case 3:
			System.out.println("치즈");
		case 2:
			System.out.println("계란");
		case 1:
			System.out.println("물");
			System.out.println("면");
			System.out.println("건더기");
			System.out.println("수프");
		default:
			System.out.println("라면 나왔습니다.");
		}
			
		
	}

}
