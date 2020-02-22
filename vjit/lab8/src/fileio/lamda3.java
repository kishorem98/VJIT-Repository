package fileio;
public class lamda3 {

public static void main(String[] args) {
// TODO Auto-generated method stub
       lamda3 tester=new lamda3();
       MathOperation addition=(int a,int b)->a+b;
       MathOperation subtraction=(a,b)->a-b;
       MathOperation multiplication=(int a,int b)->{return a*b;};
       MathOperation division=(int a,int b)->a/b;
       System.out.println("10+5="+tester.operate(10,5,addition));
       System.out.println("10-5="+tester.operate(10,5,subtraction));
       System.out.println("10*5="+tester.operate(10,5,multiplication));
       System.out.println("10/5="+tester.operate(10,5,division));
       GreetingsService greetService1=message->System.out.println("Hello "+message);
       GreetingsService greetService2=message->System.out.println("Hello "+message);
    greetService1.sayMessage("kishore");
    greetService2.sayMessage("kumar");

}
interface MathOperation{
int operation(int a, int b);
}
interface GreetingsService{
void sayMessage(String message);
}
private int operate(int a,int b,MathOperation mathOperation){
return mathOperation.operation(a, b);
}

}

