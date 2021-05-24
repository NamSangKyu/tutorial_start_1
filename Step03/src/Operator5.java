
public class Operator5 {
	/*
	 *	논리연산자
	 *	 	AND		&&		---> 양쪽의 조건식이 모두 true일때 true가 되는 연산자
	 *		OR		||		---> 양쪽의 조건식 중 둘중에 하나라도 true면 결과가 true가 되는 연산자
	 *		NOT		!		---> true면 false로 false면 true로 변환
	 */
	public static void main(String[] args) {
		int n1 = 5,n2 = 7;
		
		//n1이 2보다 크고 10보다 작냐?
		//System.out.println(2 < n1 < 10); //비교연산을 동시에 여러개 할수 없음
		System.out.println(n1 > 2 && n1 < 10);
		System.out.println(n1 > 2 && n1 < 10 && n2 == 7);
		System.out.println(n1 < 5 || n2 == 7);
		System.out.println(n1 < 5 || (n2 == 7 && n1 != 5));
		
		boolean flag = n1 > 2;
		System.out.println(!flag);
		
	}

}



