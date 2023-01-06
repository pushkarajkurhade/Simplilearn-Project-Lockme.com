package lockme;

import java.io.File;
import java.util.Scanner;

public class Delete {
	Scanner sc = new Scanner(System.in);
	
	String fileName;
	File dir = new File ("C:\\Users\\munna\\eclipse-workspace\\simplilearn project phase1\\locker");
	
	public void deletingFile() {
		Delete d = new Delete();		
		System.out.println("Files Present : ");
		d.showfile();
		
		System.out.print("Enter file name : ");
		fileName = sc.next();		
		d.delete(fileName);
	} 
	
	public void delete(String fileName) {				
		File file = new File(dir, fileName); 
		
		if (file.delete())
			System.out.println("File Deleted : " + file.getName());      
	    else
	    	System.out.println("File not found.");
	}
	public void showfile() {		
      String[] children = dir.list();
      
      if (children == null) {
         System.out.println( "Directory Empty.");
      } else { 
         for (int i = 0; i< children.length; i++) {
            String filename = children[i];
            System.out.println(filename);
         }
      }
	}
	
}

