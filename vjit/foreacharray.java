package vjit;

public class foreacharray {

	public static void main(String[] args) {
double[] mylist= {1.9,2.9,3.5,3.4};

char[] copyfrom= {'d','e','c','a','d','f','f','e','i','n','a','t','e','d'};
char[] copyto=new char[7];
for(double element:mylist)
	System.out.println(element);

System.arraycopy(copyfrom,2,copyto,0,7);
System.out.println(new String(copyto));
	}
	

}
