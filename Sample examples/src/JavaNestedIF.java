
public class JavaNestedIF {

	public static void main(String[] args) {
   // creating to variables for age and weight
		int age=100;
		int weight=80;
		//applying condition age and weight 
		if (age>=18) 
		{
			if (weight >50)
			{
				System.out.println("You are elgible to donate blood");
			}
		else 
		{
			System.out.println("You are not eligible to donate blood");
		}
			}
			else{
			System.out.println("Age must be greater than 18");
		}
	}
	}

