import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		String str = "";
		s.close();
		
		for(int i=1;i<=n/4;i++) {
			str += "long ";
		}
		
		System.out.println(str + "int");
	}
}
