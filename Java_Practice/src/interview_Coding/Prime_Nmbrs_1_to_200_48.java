package interview_Coding;
public class Prime_Nmbrs_1_to_200_48{
    public static void main(String[] args)
    {
        for(int i=1;i<=100;i++)
        {
            boolean status=true;
            if(i>1)
            {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                       status=false;
                    }
                    
                }
            }
            else
            {
                status=false;
            }
            if(status)
            {
                System.out.print(i+" ");
            }
           
        }
         
    }
}


