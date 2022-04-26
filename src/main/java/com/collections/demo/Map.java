package com.collections.demo;

import java.util.HashSet;

public class Map {
	public static void main(String[] args) {  
	    HashSet<SetDemoBook> set=new HashSet<SetDemoBook>();  
	    //Creating Books  
	    SetDemoBook b1=new SetDemoBook(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    SetDemoBook b2=new SetDemoBook(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    SetDemoBook b3=new SetDemoBook(103,"Operating System","Galvin","Wiley",6);  
	    //Adding Books to HashSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);  
	    //Traversing HashSet  
	    for(SetDemoBook b:set){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	    }  
	}  
}


