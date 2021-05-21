
public class Operator3 {
	/*	증감연산자
	 * 		변수에 있는 정수값을 1씩 증가, 감소 시키는 연산자
	 * 						  ++      --
	 * 		후위형	    전위형
	 * 		num++		++num
	 * 		num--		--num
	 * 
	 * 		증감연산자는 = 없이 유일하게 바꾼값이 저장되는 연산자
	 */
	public static void main(String[] args) {
		int n1 = 10, n2 = 10;
		
		System.out.println(n1);//10
		System.out.println(n1++);//10 - n1이 해야될 일을 하고 난 뒤 증가
		System.out.println(n1);//11
		
		System.out.println(n2);//10
		System.out.println(++n2);//11 - n2가 먼저 증가 되고 그 후 해야될 일을 한다.
		System.out.println(n2);//11

		System.out.println("---------------------------");
		int num1 = 10, num2 = 5;
		//73 78 82
		//            10       5        12     12
		int result = num1++ + num2 * ++num1 + num1;
		System.out.println(result);
	}

}







