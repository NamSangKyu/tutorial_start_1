
public class IfFor {

	public static void main(String[] args) {
		//1~100까지 숫자 중 5와 7의 배수를 출력
		for(int i=1;i<101;i++) {
//			if(i%5==0)
//				System.out.println(i);
//			else if(i%7==0)
//				System.out.println(i);
			if(i%5==0 || i%7==0)
				System.out.println(i);
			
		}
	}

}
