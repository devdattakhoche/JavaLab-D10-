import java.util.Scanner;
class palindrome{
	public static void main(String args[])
	{
		String original,reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		original=sc.nextLine();
		int length = original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		boolean temp=false;
		System.out.println(original);
		System.out.println(reverse);
		/*for(int i=0;i<length;i++)
		{
		   if(original.charAt(i)==reverse.charAt(length-1-i))
		   {
			   temp=true;
		   }
		   else 
		   {
			   temp=false;
			   break;
		   }
		}
		System.out.println(temp);*/
		 if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
		
	}
}
