package interview_Coding;
public class Char_Identification37
{
    public static void main(String args[])
    {
        String str="hello japan";
        char letter='o';
        boolean flag=false;   //Flag to indicate if the letter is found
        for(int i=0;i<str.length();i++)  //The for loop iterates through each character in the string.
        {
            if(str.charAt(i)==letter)
            {
        System.out.println( "letter found  At   "+i);
        flag=true;
        break;
            }
        }
            if(flag==false) //check if the letter was not found
            {
    System.out.println( "letter not found "); 
            }      
    }
}