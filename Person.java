import java.util.Scanner;
class person
{
	String name;
	private String password;
	int age;
	
	public void pers()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ,age and Password");
		name=sc.nextLine();
		age=sc.nextInt();
		sc.nextLine();
		password=sc.nextLine();
		
		System.out.println("Name : "+name+"\nage : "+age+"\nPassword : "+password);
	}
}
class student extends person{
	String name,Division;
	int Roll;
	public void stu()
	{
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ,roll and Divison");
		name=sc.nextLine();
		System.out.println(super.name);
		Roll=sc.nextInt();
		sc.nextLine();
		Division=sc.nextLine();
		
		System.out.println("Name : "+name+"\nage : "+Roll+"\nDiviosion : "+Division);
		System.out.print("Student name : "+name+"\nPerson name : "+super.name);
	}
}
class Main{
	public static void main(String[] args)
	{
		person p = new person();
		student k = new student();
		p.pers();
		k.stu();

		
	}
}