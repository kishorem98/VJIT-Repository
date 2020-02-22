package fileio;
import java.util.*;
import java.util.function.Predicate;
 
public class lamda {
	public static void main(String a[])
	
	{
		List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("print all numbers");
		eval(l, n->true);
		System.out.println("print even numbers");
		eval(l, n->n%2==0);
		System.out.println("print  numbers greatre than 3");
		eval(l, n->n>3);
		
	}
public static void eval(List <Integer> l, Predicate<Integer> predicate) {
	for (Integer n: l)
	{
		if(predicate.test(n))
		{
			System.out.println(n+" ");
		}
	}
}
}
