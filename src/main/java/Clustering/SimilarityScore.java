package Clustering;

import java.util.HashMap;

public class SimilarityScore {

	 public float finddocsimilarty(Document A,Document B){
		 
		 int cosinescore=0;
		 int dotproduct=0;
		 int rootscoreA=0;
		 int rootscoreB=0;
		 for(HashMap.Entry<String, Integer> map : A.getHm().entrySet()){
			 String key=map.getKey();
			 if(B.getHm().containsKey(key)){
				 dotproduct+=(A.getHm().get(key)*B.getHm().get(key));
			 }
		 }
		 for(HashMap.Entry<String, Integer> map : A.getHm().entrySet()){
			 rootscoreA+=Math.pow(map.getValue(), 2);
		 }
		 for(HashMap.Entry<String, Integer> map : B.getHm().entrySet()){
			 rootscoreB+=Math.pow(map.getValue(), 2);
		 }
		 return (float)((dotproduct)/(float)((Math.sqrt(rootscoreA))*(Math.sqrt(rootscoreB))));
	 }
}
