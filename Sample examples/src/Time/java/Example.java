package Time.java;

public class Example {
	int a=20, b=10;
	int Sum, Sub, Multi, Div;
	public void Add ()
	{
		Sum= a+b;
		System.out.println("Sum of a&b:"+Sum);
			}
	public void Sub()
	{
	Sub= a-b;
	 System.out.println("Sub of a&b:" + Sub);
	}
	
	public void Multi ()
	{
		Multi= a*b;
		System.out.println("Multi of a&b" + Multi);
							
	}
	public void Div ()
	{
		Div= a/b; 
				System.out.println("Div of a&b"+ Div);
	}
	public static void main(String [] args)
	{
		Example PVR=new Example();
		PVR. Add();
		PVR. Sub();
		PVR. Multi();
		PVR. Div();
	}
	

}
