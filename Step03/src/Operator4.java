
public class Operator4 {
	/*
	 * 	관계연산자(비교연산자) --> 양쪽 변수와 값을 부등식으로 비교
	 * 					   --> 결과 : 참(true) , 거짓(false) --> 변수 타입 : boolean
	 * 
	 * 			>		<		>=		<=		==		!=
	 */
	public static void main(String[] args) {
		//정수형 변수 두개 선언, 값을 자유롭게 초기화
		int n1=10, n2=7;
		
		System.out.println(n1 > n2); // true
		System.out.println(n1 < n2); // false
		System.out.println(n1 >= n2);// true
		System.out.println(n1 <= n2);// false
		System.out.println(n1 == n2);// false
		System.out.println(n1 != n2);// true
	}

}



