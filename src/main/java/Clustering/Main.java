package Clustering;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		String workingDirectory = "documents";
        if (!workingDirectory.endsWith("/")) workingDirectory = workingDirectory+"/";
        String fileName = workingDirectory+"training.txt";
        
        System.out.println("Text Clustering");
        
        DocumentList docs = new DocumentList(fileName);
        
        
	}

}
