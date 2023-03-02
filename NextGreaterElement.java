import java.util.*;

public class NextGreaterElement {
    public static void nextGreater(int arr[],int nxtGreater[]){
        Stack <Integer> s = new Stack<>();
        for(int i= arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }
            else{
                nxtGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void main(String args[])
    {
        int arr[] = {6,8,0,1,3};
int nxtGreater [] = new int [arr.length];
nextGreater(arr, nxtGreater);
for(int i= 0;i<arr.length;i++){
System.out.print(nxtGreater[i]+" ");

    }
}
}
