package Interview_Coding;
import java.util.*;
public class Bubblesort22{
    public static void main(String[] args){
        int arr[] = {4,6,0,3,7,0,9};
        System.out.println(Arrays.toString(arr));
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }      
        System.out.println(Arrays.toString(arr));     
       /*for(int num :arr){
           // System.out.print(num+",");
       }*/
    }
}