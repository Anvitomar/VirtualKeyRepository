package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VirtualRepository {
	
  public static void main(String[] args) {
			System.out.println("               WELCOME TO LOCKEDME.COM PROJECT       ");
			System.out.println();
			System.out.println("              -DEVELOPED BY COMPANY LOCKERS-       ");
			
			List<String> list = new ArrayList<String>();
			list.add("abc.txt");
			list.add("mno.txt");
			list.add("pqr.txt");
			list.add("def.txt");
			list.add("xyz.txt");
			System.out.println();
			main(list);
}
public static void main(List list)
		{
	        System.out.println("1.Reteriving the file name in an ascending order");
			System.out.println("2.Business-level operations");
			System.out.println("3.Option to close the application\n");
			System.out.print("Choose a one option from-(1/2/3): ");
			String con;
 try{	
    		do {
    			
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		switch (a) {
	
case 1: 
			Collections.sort(list);
			System.out.println();
			System.out.println("The sorting order is-"+list);
			System.out.println();
			main(list);
			break;
case 2: 
	 while(true){
		       System.out.println();
               System.out.println("1. Add a file to the existing directory list");
               System.out.println("2. Delete a file from the existing directory list ");
               System.out.println("3. Search a file from the main directory");
               System.out.println("4. Exit to the main menu\n");
	           System.out.print("choose a one option from- (1/2/3/4):");
                  int b = sc.nextInt();
                      switch (b) {
   case 1: 
        	System.out.println();
			System.out.print("Enter a file name you want to add: ");
			String st1 = sc.next();
			list.add(st1);
			System.out.println();
			System.out.println(st1+" FILE ADDED SUCCESSFULLY\n");
			System.out.println(list);
			break;
		
			
	case 2: 
			System.out.println();
			System.out.print("Enter a file name you want to delete: ");
			String st2 = sc.next();
			int flag = 0;

			for (int i = 0; i < list.size(); i++) {
			   if (list.get(i).equals(st2)) {
					list.remove(st2);
					System.out.println();
					System.out.println("FILE DELETED SUCCESSFULLY\n");
					System.out.println(list);
					flag++;
				}}
			if (flag == 0) {
				System.out.println("FILE NOT FOUND");
			}
               break;
	case 3:
			int flag1 = 0;
			System.out.println();
			System.out.print("Enter a file name you want to search: ");
			String st3 = sc.next();
			
			for(int i=0; i<list.size();i++) {
				if(list.get(i).equals(st3)) {
					System.out.println();
					System.out.println("FILE SEARCHING SUCCESSFUL\n");
					System.out.println();
					System.out.println(list.get(i)+" file found");
					flag1++;
				}}
              if(flag1==0) {
				System.out.println("FILE NOT FOUND");
			      }
                break;
	 case 4:
			System.out.println();
			main(list);
			System.exit(0);
		default:
		System.out.println("INVALID INPUT");
		break;
	  }}
	
case 3: 
    System.out.println("Exit from the application");
	break;
 default:		
 System.out.println("Wrong choice");
 break;
}
    System.out.println("Do you want to continue?");
     con = sc.next();
}
    	while (con.equalsIgnoreCase("y"));

        System.out.println("Thank you ! Visit Again");
    	}

    	catch(Exception e) 
       {
          System.out.println("Please enter a valid choice");
           main(list);
}
}}



