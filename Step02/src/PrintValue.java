
public class PrintValue {
	/*
	 * 정수, 실수, 논리값, 문자, 문자열
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");// 문자열
		System.out.println('A');// 문자
		System.out.println(100);// 정수
		System.out.println(3.1415);// 실수
		System.out.println(true);// 논리값

		// 문자열과 + 연산을 하면 하나의 문자열로 만듬
		System.out.println("홍길동의 나이 : " + 20);

		System.out.println("Hello " + 'A');
		System.out.println("pi : " + 3.1415);
		System.out.println("참 : " + true);

		System.out.println("거짓 : " + false);
	}

}
