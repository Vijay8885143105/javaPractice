package Interview_Coding;
public class Repetition_Vowels32
{
public static void main(String[] args) {
String str ="mariajatrutha";
String vowels = "";
int count = 0;
for(char var:str.toCharArray())
{
   if("aeiou".indexOf(var) !=-1)
   {
       vowels +=var;
   }
}
System.out.println(vowels);

  int[] charcount = new int[256];
  for(char c:vowels.toCharArray()){
      charcount[c]++;
  }
  for(int i=0;i<charcount.length-1;i++){
      if(charcount[i]>0)
      {
          System.out.println((char)i+":"+charcount[i]+"times");
      }
  }
}
}
