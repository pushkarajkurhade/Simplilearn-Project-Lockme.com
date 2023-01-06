package lockme;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Add {
	Scanner sc = new Scanner(System.in);
	
	String fileName;
	
	public void addition() {
		System.out.print("Enter file name : ");
		fileName = sc.next();
		
		Add a = new Add();
		a.createFile(fileName);
	}
	
	
	public void createFile(String fileName) {
		File dir = new File ("C:\\Users\\munna\\eclipse-workspace\\simplilearn project phase1\\locker");
	    try {
	      File file = new File(dir, fileName);
	      
	      if (file.createNewFile()) {    	      	 
	    	  System.out.println("File Created : " + file.getName());
	      } else {
	    	  System.out.println("File already exists. Please enter another name");
	    	  Add a = new Add();
	    	  a.addition();
	      }
	    } catch (IOException e) {
	    	System.out.println(" error ");
	    	e.printStackTrace();
	    }
	  }
	
}
