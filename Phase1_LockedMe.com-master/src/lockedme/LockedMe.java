package lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe {

	public static void main(String[] args) {
		System.out.println("***Welcome To LockedMe.com***");
		System.out.println("  Powered by Lockers pvt.ltd.");
		System.out.println("\nDeveloper Details");
		System.out.println("**************************************");
		System.out.println("Name   	     : Nikita Gaonkar");
		System.out.println("Designation  : Full Stack Devleoper");
		System.out.println("***************************************");
		System.out.println("\n\nYou can Choose Following File Opertions From Main Menu");
		System.out.println("---------------------------------------");
		System.out.println("1) Display Exisiting files");
		System.out.println("2) Business-level operations");
		System.out.println("3) Exit Application");
		System.out.println("---------------------------------------");
		System.out.print("\nPlease choose an option from above : ");
				
		short ch = 0,innch = 0;
		
		lp : while(true)
		{
			Scanner sc = new Scanner(System.in);
			ch = sc.nextShort();
			switch(ch)
			{
			
			case 1: File file = new File("C:\\Simplilearn");
					String[] files = file.list();
					System.out.println("\n---------------------------------------");
					System.out.println("Displaying the files and directories from a directory");
					for(int i = 0; i<files.length;i++)
					{
						System.out.println(files[i]);
					}
					System.out.println("---------------------------------------");
					System.out.print("Please choose another option to continue : ");
					break;
			case 2: System.out.println("\n---------------------------------------");
					System.out.println("1) Add a file to directory");
					System.out.println("2) Delete a file from directory");
					System.out.println("3) Search a file from directory");
					System.out.println("4) Back to Main Menu");
					System.out.println("---------------------------------------");
					System.out.print("\nPlease choose an option from above : ");
					ip : while(true)
					{
						Scanner sca = new Scanner(System.in);
						innch = sca.nextShort();
						switch(innch)
						{
						case 1 : System.out.println("\n---------------------------------------");
								 System.out.println("Adding contents into file and saving into directory");
								 try
								 {
									 Scanner fadd = new Scanner(System.in);
									 System.out.print("Please enter the filename to be created with Extension(Eg:.txt,.doc etc) : ");
									 String name = fadd.nextLine();
									 File fe = new File("C:\\Simplilearn\\"+name);
									 if(fe.exists())
									 {
										 System.out.println("File already exists");
									 }
									 else
									 {
										 FileWriter fwrt = new FileWriter("C:\\Simplilearn\\"+name);
										 System.out.print("Please enter the file content : ");
										 String content = fadd.nextLine() + "\n";
										 fwrt.write(content);
										 fwrt.close();
										 System.out.println("File created with a name : "+ name);
									 }
									 
								 }
								 catch (Exception e)
								 {
									 e.printStackTrace();
								 }							 
								 System.out.println("---------------------------------------");
								 System.out.print("Please choose another option to continue : ");
								 System.out.println("\n---------------------------------------");
								 System.out.println("1) Add a file to directory");
								 System.out.println("2) Delete a file from directory");
							 	 System.out.println("3) Search a file from directory");
							 	 System.out.println("4) Back to Main Menu");
							 	System.out.println("---------------------------------------");
								System.out.print("\nPlease choose an option from above : ");
								 break;
						case 2 : System.out.println("\n---------------------------------------");
								 System.out.println("Deleting a file from directory");
								 Scanner fadd = new Scanner(System.in);
								 System.out.print("Please enter the filename to be deleted : ");
								 String deletename = fadd.nextLine();
								 File fd = new File("C:\\Simplilearn\\"+deletename);
								 if(fd.exists())
								 {
									 if(fd.delete())
								        {
								            System.out.println("File deleted successfully");
								        }
								        else
								        {
								            System.out.println("Failed to delete the file");
								        }
								 }
								 else
								 {
									 System.out.println("File does not exist in directory");
								 }
								 System.out.println("---------------------------------------");
								 System.out.print("Please choose another option to continue : ");
								 System.out.println("\n---------------------------------------");
								 System.out.println("1) Add a file to directory");
								 System.out.println("2) Delete a file from directory");
								 System.out.println("3) Search a file from directory");
								 System.out.println("4) Back to Main Menu");
								 System.out.println("---------------------------------------");
									System.out.print("\nPlease choose an option from above : ");
								 break;
						case 3 : System.out.println("\n---------------------------------------");
								 System.out.println("Searching a file in the directory");
								 try
								 {
									 File filesearch = new File("C:\\Simplilearn");
									 String[] search = filesearch.list();
									 System.out.print("Please enter filename to search With Extension (*case sensitive):");
									 Scanner fs = new Scanner(System.in);
									 String filese = fs.nextLine();
									 int flag = 0;
									 if(search == null)
										 System.out.println("Empty directory");
									 else
									 {
										 for(int i =0;i<search.length;i++)
										 {
											 String filename = search[i];
											 if(filename.equals(filese))
											 {
												 System.out.println("File found : " +filename);
												 flag = 1;
											 }
										 }
									 }
									 if (flag == 0)
										 System.out.println("File not found : "+filese);
								 }
						
								 catch(NullPointerException ne)
								 {
									 System.out.println("Please specify the correct folder name");
								 }	
								 System.out.println("---------------------------------------");
								 System.out.print("Please choose another option to continue : ");
								 System.out.println("\n---------------------------------------");
								 System.out.println("1) Add a file to directory");
								 System.out.println("2) Delete a file from directory");
								 System.out.println("3) Search a file from directory");
								 System.out.println("4) Back to Main Menu");
								 System.out.println("---------------------------------------");
								 System.out.print("\nPlease choose an option from above : ");
								 break;
						case 4 : System.out.println("\n---------------------------------------");
								 System.out.println("In Main Menu");
								 System.out.println("---------------------------------------");
								 break ip;
						default : System.out.print("Please select a number from above list : ");
						}
						
					}
					System.out.println("\n\nYou can Choose Following File Opertions From Main Menu");
					System.out.println("---------------------------------------");
					System.out.println("1) Display Exisiting files");
					System.out.println("2) Business-level operations");
					System.out.println("3) Exit Application");
					System.out.println("---------------------------------------");
					break;
			case 3: System.out.println("\n---------------------------------------");
					System.out.println("Thanks you for using Lockedme.com. \n**** Have a good day ****. \n   *** Visit Again ***  ");
					System.out.println("---------------------------------------");
					break lp;
			default:System.out.print("Invalid option please choose correct option from above:");
			}

		}
		
	}

}

