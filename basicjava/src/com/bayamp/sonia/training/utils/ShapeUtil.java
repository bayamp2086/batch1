package com.bayamp.sonia.training.utils;

public class ShapeUtil {

	public static void printDiamond(int count) {

		int half = count / 2;
		int counthalf = half;
		String daimondStars = new String();
		for (int i = 0; i < count; i++) {
			daimondStars = daimondStars + "*";
		}

		while (count > 0) {

			String replace = new String();
			String replaceby = new String();
			for (int i = 0; i < half; i++) {
				replace = replace + "\\*";
				replaceby = replaceby + " ";
			}

			String daimondStars1 = daimondStars.replaceFirst(replace, replaceby);
			daimondStars1 = daimondStars1.substring(0, daimondStars.length() - half) + replaceby;

			System.out.println(daimondStars1);

			count--;

			if (count <= counthalf) {
				half++;
			} else {
				half--;
			}
		}

	}

	public static void printTriangle(int trianglSize) {
		// TODO Auto-generated method stub
		
		
		
		int counter=trianglSize/2;
		for(int i=0;i<4;i++) {
			String trainsleSide=new String();
			for(int j=0;j<trianglSize;j++) {
				
				trainsleSide=trainsleSide+"*";
				
			}
			String spaceby="";
			String space="";
			if(counter>0) {
				
				for(int k=0;k<counter;k++) {
					space=space+"\\*";
					 spaceby=spaceby+" ";
				}
			
			trainsleSide=trainsleSide.replaceFirst(space, spaceby);
			
			trainsleSide=trainsleSide.substring(0,trainsleSide.length()-counter)+spaceby;
			}
			System.out.println(trainsleSide);
			
			counter--;
		}
	}

}
