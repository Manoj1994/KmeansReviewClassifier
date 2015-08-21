package Clustering;

public class TFIDF {
      
	public int  findtfidf(Document doc,DocumentList docs,String term){
		int tf=termfrequency(doc, term);
		int idf=inversedocumentfrequency(docs, term);
		return tf*idf;
	}
	
	public int termfrequency(Document doc,String term){
		return doc.getHm().get(term);
	}
	
	public int inversedocumentfrequency(DocumentList docs,String term){
		
		int count=0;
		for(Document doc : docs.getListofdocuments()){
			if(doc.getHm().containsKey(term)){
				count++;
			}
		}
		return count;
	}
	
}
