package vjit;

public class checkarray {

	public static void main(String[] args) {
int iarray[]=new int[3];
byte barray[]=new byte[3];
short sarray[]=new short[3];
String starray[]=new String[3];
System.out.println(iarray.getClass());
System.out.println(iarray.getClass().getSuperclass());
System.out.println(barray.getClass());
System.out.println(sarray.getClass());
System.out.println(starray.getClass());
	}

}
