
public class ForEx1 {

	public static void main(String[] args) {
		int i;
		//for문의 구성요소는 for(초기화; 조건식 ; 증감식) 
		//	--> 단 3가지 구성 요소중 이미 작성되거나 적용되서
		//		쓸필요가 없으면 해당 항목을 비워두면됨
		for(i=0;i<5;i++) {
			System.out.println("Hello World");
		}
		System.out.println("-------------------");
		for(int j=0;j<5;j++) {
			System.out.println("Hello World " + j);
		}
		//반복문이 끝나면 j는 사라짐 --> 지역변수
		//System.out.println(j);
	}

}






