package net.string;

public class Stringtopic {

    public static void main(Stringtopic[] args) {
        
        Stringtopic st="Welcome to String programming";//String constant pool
        Stringtopic st1=new Stringtopic("Welcome to String programming");//heap memory area
        
        Stringtopic st3=st1.intern();
        
        for(int i=0;i<st.length();i++)//length of the string
        {
            System.out.print(st.charAt(i));//Retrieve a particular character from the string
        }
        
        System.out.println(st.length());
        
        int spaces=0;
        for(int i=0;i<st.length();i++)//length of the string
        {
            char ch=st1.charAt(i);
            if(ch==' ')
            {
                spaces++;
            }
        }
        
        System.out.println("Number of blanks="+spaces);
        

    }

}
