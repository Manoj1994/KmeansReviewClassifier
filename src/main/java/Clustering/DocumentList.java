package Clustering;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocumentList {
      
	List<Document> listofdocuments = new ArrayList();

	public DocumentList(String fileName) throws IOException {
		super();
		// TODO Auto-generated constructor stub
		LineReader linereader = new LineReader(fileName);
        String line;
        
        
		while ((line = linereader.nextLine()) != null) {
		        
            String lineTrimmed = line.trim();
            Document doc = new Document(lineTrimmed);
            listofdocuments.add(doc);
        }
	}

	public DocumentList(List<Document> listofdocuments) {
		super();
		this.listofdocuments = listofdocuments;
	}

	public List<Document> getListofdocuments() {
		return listofdocuments;
	}

	public void setListofdocuments(List<Document> listofdocuments) {
		this.listofdocuments = listofdocuments;
	}

}
