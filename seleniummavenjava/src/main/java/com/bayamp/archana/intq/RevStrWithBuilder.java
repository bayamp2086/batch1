package com.bayamp.archana.intq;

public class RevStrWithBuilder {
	
	public static void main(String[] args) {
		String sentence = "Arys is Cute";
	
		String[] sentRev = sentence.split("\\s+");
		System.out.println(sentRev.length);
		StringBuilder sb = new StringBuilder();
		for (int i =sentRev.length-1; i>=0; i--) {
			sb.append(sentRev[i] + " ");	
		}
		System.out.println(sb.toString());	
		
	}

}
