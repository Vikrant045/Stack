import java.util.*;
public class TrappingRainWater {

    public static int totalWater(int height[]){
        int leftmax [] = new int[height.length];
        int rightmax [] = new int[height.length];
        int minOfleft_right []= new int[height.length];
Stack<Integer> s= new Stack<>();
int max =0;
        for(int i=0;i<height.length;i++){ // leftmax
     while(!s.isEmpty()   && (height[s.peek()]<= height[i] && height[s.peek()]<=max) ){
                s.pop();
            }
            if(s.isEmpty()){
leftmax[i]= height[i];
max=height[i];
            }
            else{
                leftmax[i]= height[s.peek()];
                max=height[s.peek()];
            }
            s.push(i);
           // max=height[s.peek()];
        }
max=0;
        s= new Stack<>();
        for(int i=height.length-1;i>=0;i--){ // rightmax

            while(!s.isEmpty() &&  ( height[s.peek()]<= height[i] && height[s.peek()]<=max ) ){
                s.pop();
            }
            if(s.isEmpty()){
rightmax[i]= height[i];
 max=height[i];

            }
            else{
                rightmax[i]= height[s.peek()];
               max=height[s.peek()];
            }
            s.push(i);
        }

        for(int i=0;i<height.length;i++){ 
            minOfleft_right [i] = Math.min(leftmax[i],rightmax[i]);
        }
        int totalWater =0;
        for(int i=0;i<height.length;i++){ 
           // minOfleft_right [i] = Math.min(leftmax[i],rightmax[i]);
int barWater = minOfleft_right[i]-height[i];
totalWater += barWater;
        }
       return totalWater;
    }
    public static void main(String args[]){
        int height[]={7 ,0, 4, 2, 5, 0, 6, 4, 0, 6};

        System.out.println(totalWater(height));
        }
    
}
