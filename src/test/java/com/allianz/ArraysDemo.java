package CoreJavaAutomation;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int a[] = new int[5];  //Declare array and allocated memory for the values
		
		a[0]= 2;
		a[1]= 6;
		a[2]= 1;
		a[3]= 9;
		a[4]= 12;
		
		int b[]= {1,4,3,5,6};
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println("The values of Index of Array a:" +a[i]);
		}
				
		System.out.println("----------------------------------");
		
		for(int j=0; j<b.length;j++)
		{
			System.out.println("The values of Index of Array b:" + b[j]);
		}
				
	}

}
