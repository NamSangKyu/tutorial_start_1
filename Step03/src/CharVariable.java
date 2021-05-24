
public class CharVariable {
	/*
	 * 	외부 변환 코드 : 문자코드 값을 이용하여 실제로는 숫자로 저장,
	 * 				  화면에 보여줄때는 글자 형태로 보여주는 것 
	 *
	 * A ---> 65		a ---> 97 ASCII 코드값
	 */
	public static void main(String[] args) {
		char ch1 = 'A', ch2 = 'a';
		int n1 = 'A', n2 = 'A';
		System.out.println(ch1 + " , " + n1);
		System.out.println(ch2 + " , " + n2);
		
		char 안녕 = '가';
		System.out.println(안녕);
	}

}


