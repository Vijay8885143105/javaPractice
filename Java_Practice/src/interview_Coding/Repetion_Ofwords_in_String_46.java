package interview_Coding;

import java.util.*;
public class Repetion_Ofwords_in_String_46{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String words[]=str.split(" ");
        Map<String,Integer>infraMap=new HashMap<>();
        for(String w:words)
        {
            if(infraMap.containsKey(w))
            {
                infraMap.put(w,infraMap.get(w)+1);
            }
            else
            {
                infraMap.put(w,1);
            }
        }
        Set<Map.Entry<String,Integer>> entry=infraMap.entrySet();
        for(Map.Entry<String,Integer> each:entry)
        {
            if(each.getValue()>1)
            {
                System.out.println(each.getKey());
            }
        }
        
    }
}