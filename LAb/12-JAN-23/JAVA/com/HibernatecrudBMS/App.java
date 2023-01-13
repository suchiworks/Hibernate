package com.HibernatecrudBMS;

import java.util.Scanner;

import com.HibernatecrudBMS.daoimpl.DaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	    	DaoImpl dao=new DaoImpl();
    	        char c;
    	        do {
    	        	Scanner sc=new Scanner(System.in);
    	        	System.out.println("Press 1 for add Account \n Press 2 for Show Account \n"
    	        			+"Press 3 for update \n Press 4 for delete \n Press 5 for exit");
    	        	int a=sc.nextInt();
    	        	switch(a) {
    	        	case 1:dao.addAccount();
    	        	break;
    	        	case 2:dao.fetchAccount();
    	        	break;
    	        	case 3:dao.updateAccount();
    	        	break;
    	        	case 4:dao.deleteAccount();
    	        	break;
    	        	case 5:System.exit(0);
    	        	break;
    	        	default:System.out.println("Invalid choice!");
    	        	}
    	        	System.out.println("Do you want to continue? Y/N");
    	        	c=sc.next().charAt(0);
    	        }while(c=='y'||c=='Y');
    	        System.out.println("Thank you");
    	        }
    	    
    }

