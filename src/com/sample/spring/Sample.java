package com.sample.spring;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sample {

	public static void main(String[] args){
		String[] str={"SRI","LAK","abc","SRI","SRI","LAK","obj","SRI","SRI","LAK","SRI","SRI"};
		//Set<String> set1=new HashSet<String>(Arrays.asList(str));
		Integer[] positionNR =new Integer[1000];
		Integer counter=-1; 
		System.out.println("Answer :" +str[0]);
		for(int i=0;i<str.length;i++){
			String s1=str[i];
			for(int j=i+1;j<str.length;j++){
				if(s1.equals(str[j])){
					for(int k=0; k<positionNR.length;k++){
						if(positionNR[k]!=j){
							counter=counter+1;
							positionNR[counter]=j;
							System.out.println(j+"-->"+str[j]);
						}
					}
					
				}else {
				//	System.out.println(j+"######-->"+str[j]);
				}
			}
			
			System.out.println("===>");
		}
	}
}
