package Interview_Coding;
public class Vowels31
{
public static void main(String[] args) {
String str ="mariajatrutha";
String vowels = "";
int count = 0;
for(char c:str.toCharArray())
{
   if("aeiou".indexOf(c) !=-1)
   {
       vowels +=c;
   }
}
System.out.println(vowels);

  int[] charcount = new int[256];
  for(char c:vowels.toCharArray()){
      charcount[c]++;
  }
  for(int i=0;i<charcount.length-1;i++){
      if(charcount[i]>0){
          System.out.println((char)i+":"+charcount[i]+"times");
      }
  }
}
}
