
public class ShortCircuit {
	//단락회로 : 논리 수행시 이미 true나 false가 앞에 연산으로 
	//		   이미 결정된 경우에는 다음 조건 연산을 생략하고 넘어간다.
	public static void main(String[] args) {
		int n1 =10, n2 = 7;
		boolean result = n1 > 10 && ++n2 < 10;
		result =  n1 == 10 || ++n2 < 10;
		System.out.println(n2);
	}

}
