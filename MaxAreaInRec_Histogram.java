import java.util.*;
public class MaxAreaInRec_Histogram{

    public static int maxArea(int arr[]){

        int nextSmallerRyt[] = new int [arr.length];
        int nextSmallerLeft[] = new int [arr.length];

        Stack <Integer> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){ // nextSmallerRyt

            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerRyt[i]=arr.length;
            }
            else{
                nextSmallerRyt[i]= s.peek();
            }
            s.push(i);
        }
s= new Stack<>();

        for(int i=0;i<arr.length;i++){     // nextSmallerLeft

            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerLeft[i]=-1;
            }
            else{
                nextSmallerLeft[i]= s.peek();
            }
            s.push(i);
        }
        int max =0;
        for(int i=0;i<arr.length;i++){ 
int width = nextSmallerRyt[i]-nextSmallerLeft[i]-1;

         int area = arr[i] *width;
max = Math.max(max,area);
        }

        return max;
     



    }
    public static void main(String args[]){

        int arr[] ={2,1,5,6,2,3};

       System.out.println(maxArea(arr)); 
    }
}