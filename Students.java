package Assignment;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Students {
	private int ID;
	
	/*private int stID;
	private String stFirst;
	private String stLast;
	private int stgrade1;
	private int stgrade2;
	private int stgrade3;
	private int stgrade4;
	private int stgrade5;
	
	
	
	public Students(int ID ,String name, String last,int grade1,int grade2,int grade3,int grade4,int grade5)
	{
		stID=ID;
		stFirst=name;
		stLast=last;
		stgrade1=grade1;
		stgrade2=grade2;
		stgrade3=grade3;
		stgrade4=grade4;
		stgrade5=grade5;
		
	}
	public String toString()
	{
		String temp="";
	    System.out.println(stID+" "+stFirst+" "+stLast+" "+stgrade1+" "+stgrade2+" "+stgrade3+" "+stgrade4+" "+stgrade5);
	    return temp;
	}
	*/
	
	
	public static void printmenu()
	{	
		System.out.println("Choose what you would like; ");
		System.out.println("1.  Show student information ");
		System.out.println("2.  Show ALL student information");
		System.out.println("3.  Update student information");
		System.out.println("4.  Delete student information");
		System.out.println("5.  Show GPA ");
		System.out.println("6.  Show the Average GPA ");
		System.out.println("7.  Exit Application ");
		System.out.println("Enter your choice:  ");
	}
	
	
	public void getMenu()
	{
	 	
		
		
			
	}
	public static void main(String[] args) throws IOException
	{
		String line;
		ArrayList<String> student = new ArrayList<String>();
		File stfile =new File("C:\\Users\\goktu\\OneDrive\\Desktop\\Assignment\\Students.txt");
		FileWriter fw = new FileWriter(stfile);		
		FileReader fr = new FileReader(stfile);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line1;
		ArrayList<String> grades = new ArrayList<String>();
		File grfile =new File("C:\\Users\\goktu\\OneDrive\\Desktop\\Assignment\\Grades.txt");
		FileWriter fw1 = new FileWriter(grfile);		
		FileReader fr1 = new FileReader(grfile);
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedWriter bw1 = new BufferedWriter(fw1);
		
	    while((line = br.readLine())!= null)
	    {
		  student.add(line);
		}
	    while((line1 = br1.readLine())!= null)
	    {
		  grades.add(line1);
		}
		
		
		Scanner keyboard=new Scanner(System.in);
		printmenu();
		int choice= keyboard.nextInt();
		switch(choice)
		{
		
		
		
		case 1:
			System.out.println("Enter Student's ID : ");
			int ID = keyboard.nextInt();
			System.out.print(student.get(ID-1));
			System.out.print(grades.get(ID-1));
			
			
			
			
		case 2:
			for(int i = 0 ; i > student.size() ; i++)
			{
				System.out.print(student.get(i));
				System.out.print(grades.get(i));
			}
			
			
			
		case 3: 
			System.out.println("Enter Student's ID : ");
			int ID1 = keyboard.nextInt();
			System.out.println("Information : "+student.get(ID1-1)+" "+grades.get(ID1-1));
			System.out.println("Enter Student's Updated Info (Write in order to ID,FirstName,LastName) : ");
			String upinfo = keyboard.nextLine();	
			System.out.println("Enter Student's Updated Grades :");
		    String upgrades = keyboard.nextLine();
		    student.remove(ID1-1);
		    grades.remove(ID1-1);
			student.add(ID1-1, upinfo);
			grades.add(ID1-1, upgrades);
			for(int in =0;in<student.size();in++)
            {
			 bw.write(student.get(in));
            }
			
			
			
		case 4:	
			System.out.println("Enter Student's ID : ");
			int ID2 = keyboard.nextInt();
			System.out.println("Information : "+student.get(ID2-1)+" "+grades.get(ID2-1));
			System.out.println("Are you sure you want to DELETE ? ");
			String answer = keyboard.nextLine();
			char letter = answer.charAt(0);
			if (letter == 'Y'||letter=='y')
			{
				student.remove(ID2-1);
			}	
			
			
			
		case 5:
			System.out.println("Enter ID : ");
		
			
			
		case 7:
			System.exit(0);
	     }
		
	}
}
