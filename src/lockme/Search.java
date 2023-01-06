package lockme;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Search {
	Scanner sc = new Scanner(System.in);
	
	File dir = new File ("C:\\Users\\munna\\eclipse-workspace\\simplilearn project phase1\\locker");
	ArrayList<String> fileList = new ArrayList<>();
	String fileName;
	
	public void searching() {
	
		System.out.print("Enter file name : ");
		fileName = sc.next();
		
		Search sf = new Search();
		sf.searchfile();
		sf.searchname(fileName);
	}
	public void searchfile() {				
      String[] children = dir.list();
      
      if (children == null) {
         System.out.println( "Directory Empty.");
      } else { 
         for (int i = 0; i< children.length; i++) {
            String filename = children[i];
            fileList.add(filename);
         }
      }  
      
	}
	public void searchname(String fileName) {
		boolean present = fileList.contains(fileName); 
		
		if (present) 
            System.out.println("File is Present in the System"); 
        else
        	System.out.println("File is not present in the System."); 
	}
	
}
	

