package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
    public boolean equal(String1 s) {
    	 
        if(length() != s.length()){
          return false;
        }
        if(length() == s.length()) {
        for(int i=0;i<s.length();i++){
         if(getChar(i) != s.getChar(i)){
          return false;
         }

        }
        }
        return true;
      }
    public void reverse() {

    	   
        int First = 0; int Last = length() -1;
        while (First<Last) {
           char temp = getChar(First);
           str[First] = str [Last];
           str[Last] = temp;
           First++;
           Last--;
        }
       }
}
