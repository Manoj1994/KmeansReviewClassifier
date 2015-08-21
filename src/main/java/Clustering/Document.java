package Clustering;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Document {
	 
	HashMap<String,Integer> hm = new HashMap();
	
	public HashMap<String, Integer> getHm() {
		return hm;
	}

	public void setHm(HashMap<String, Integer> hm) {
		this.hm = hm;
	}
	

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Document(String line) {
		    
		    super();	            
            String lineTrimmed = line.trim();
            String[] stringTokens = lineTrimmed.split(" ");
            
            for(int i=0;i<stringTokens.length;i++){
            	if(hm.containsKey(stringTokens[i].toLowerCase())){	            		
            		hm.put(stringTokens[i].toLowerCase(),hm.get(stringTokens[i].toLowerCase())+1);
            	}
            	else{
            		hm.put(stringTokens[i].toLowerCase(), 1);
            	}
            }
        
	}
	  
}
