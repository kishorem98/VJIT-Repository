package vjit;

import static java.lang.System.*;

public class varargs {
	static void print( int a,String... s) {
	System.out.println(a);
		for (int i = 0; i < s.length; i++)
			out.print(s[i] + "\t");
		out.println();
	}

	public static void main(String[] arg) {
		print(3);
		//out.println("Next invoke");
		print(1,"b", "c", "d", "e");
	}
}
