package interview_Coding;
public class Char_Identification37
{
    public static void main(String args[])
    {
        String str="hello japan";
        char letter='o';
        boolean flag=false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==letter)
            {
        System.out.println( "letter found  At   "+i);
        flag=true;
        break;
            }
        }
            if(flag==false)
            {
    System.out.println( "letter not found "); 
            }      
    }
}