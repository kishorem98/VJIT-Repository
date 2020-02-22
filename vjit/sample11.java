package vjit;

public class sample11 {
static int count =100;
public void inc()
{
count++;
}
	public static void main(String[] args) {
sample11 s=new sample11();
s.inc();
sample11 s1=new sample11();
s1.inc();
System.out.println(s1.count);
	}

}
