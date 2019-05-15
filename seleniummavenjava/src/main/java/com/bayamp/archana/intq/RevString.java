package com.bayamp.archana.intq;

public class RevString {

	public static void main(String[] args) {
		String sentence = "one two three four";
		String r = RevString.revSentWithTemp(sentence);
		System.out.println(r);

		String sentence2 = "Arya is Cute";
		String s = RevString.revSent(sentence2);
		System.out.println(s);
	}

	public static String revSentWithTemp(String sentence) {
		String[] spiltSentence = sentence.split("\\s", 3); 
	     for (String a : spiltSentence) 
	            System.out.print("After split:" +a + "\n");     
		String temp = "" ;
	
		for (int i = spiltSentence.length-1 ; i>=0; i--) {
	
        temp =  temp+spiltSentence[i] +" " ;
        if (i ==1) {
    		//temp = spiltSentence[i];
        	//break;
        	spiltSentence[i] ;
    	}
		}  
		return temp;	
	}

	public static String revSent(String sentence2) {
		String[] sentRev = sentence2.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i =sentRev.length-1; i>=0; i--) {
			sb.append(sentRev[i] + " ");	
		}
		return sb.toString();	
	}
}

