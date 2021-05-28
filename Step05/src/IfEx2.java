

public class IfEx2 {

	public static void main(String[] args) {
		int n = -10;
		if(n >= 0) {
			System.out.println("양수입니다.");
		}
		else {//위에 있는 조건들이 모두 거짓일때 실행되는 영역
			System.out.println("음수 입니다.");
		}
	}

}
