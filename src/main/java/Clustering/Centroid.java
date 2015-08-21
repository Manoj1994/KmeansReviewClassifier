package Clustering;

import java.util.ArrayList;
import java.util.List;

public class Centroid {

	List<Document> docs = new ArrayList();

	public List<Document> getDocs() {
		return docs;
	}

	public void setDocs(List<Document> docs) {
		this.docs = docs;
	}

	public Centroid() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Centroid(List<Document> docs) {
		super();
		this.docs = docs;
	}
	  
	public void add(Document doc){
		this.docs.add(doc);
	}
	
}
