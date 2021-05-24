
public class StringValue {
	/*
	 * 	primitive : 최대값, 최소값이 정해짐
	 * 			    할당되는 바이트 수가 존재함
	 * 
	 * 	reference : 참조형
	 * 			    메모리 제약이 없음
	 */
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "안녕하세요";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 + str2);
	}

}
