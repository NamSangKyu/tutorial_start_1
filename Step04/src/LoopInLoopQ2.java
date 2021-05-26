
public class LoopInLoopQ2 {

	public static void main(String[] args) {
		/*
		 * 			    *
		 * 			   **
		 * 			  ***
		 * 			 ****
		 * 			*****
		 */
		for(int i=0;i<5;i++) {
			String line = "";
			for(int j=0;j<5-1-i;j++) {
				line += " ";
			}
			for(int j=0;j<=i;j++) {
				line += "*";
			}
			System.out.println(line);
		}
	}

}
