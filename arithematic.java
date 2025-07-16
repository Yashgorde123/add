package add;
class Add{
	int a;
	int b;
	void info(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("additoin "+c);
	}
}
	

public class arithematic {
public static void main (String [] args)
{
	Add a1=new Add();
	a1.info(2,2);
}
}


