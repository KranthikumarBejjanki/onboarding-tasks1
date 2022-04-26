package com.java8.tasks.test;

import com.java8.tasks.MyString;

public class StringRotationWithJava8 {
	public static String onRotateString(MyString rotateString, String A, String B) {


        return rotateString.myStringFunction(A, B);
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub


        MyString rotate = (A,B)->{

            String results ="";

            for(int i =0;i <A.length() ; ++i)

            for(int j = 0; j < B.length() ; ++j)

                 if (A.charAt((i+j) % A.length()) != B.charAt(i))

                	 results += A.charAt((i + j) % A.length());

            return results;

        };

        System.out.println(onRotateString(rotate,"abcde","abcde"));

    }
}
