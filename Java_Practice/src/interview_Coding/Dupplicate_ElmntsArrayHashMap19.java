package interview_Coding;

import java.util.*;
class Dupplicate_ElmntsArrayHashMap19{
    public static void main(String[] args)
    {
        Integer[] arr={11,22,33,4,88,11,33,44};
        Map<Integer,Integer>infraMap=new HashMap<>();
        for(Integer e:arr)
        {
            Integer count=infraMap.get(e);
            if(count == null)
            {
                infraMap.put(e,1);
            }
            else
            {
                infraMap.put(e,++count);
            }
        }
        Set<Map.Entry<Integer,Integer>>entryset=infraMap.entrySet();
        for(Map.Entry<Integer,Integer> entry:entryset)
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
