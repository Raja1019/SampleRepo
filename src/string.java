import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Alphabet
{
    int count = 0;
    int uniqueVowel(String str)
    {
        str=str.toLowerCase();
        int count= 0;
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if( ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u')
            {
                count=count+1;
            }
        }
        return count;
    }
    int uniqueConsonant(String str)
    {
        str=str.toLowerCase();
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch!='a'&& ch!='e'&&ch!='i'&& ch!='o'&&ch!='u')
            {
                count = count+1;
            }
        }
        return count;
        
    }
   
    }
    public class string {
	public static void main(String args[] ) throws Exception {
		Alphabet obj = new Alphabet();
		//Scanner sc = new Scanner(System.in);
		//String str = sc.next();
		
		
		System.out.println(obj.uniqueVowel("abacab"));
		
		System.out.println(obj.uniqueConsonant("abacab"));
		
		
	}
    }
