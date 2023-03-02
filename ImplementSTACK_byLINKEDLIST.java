public class ImplementSTACK_byLINKEDLIST {

    static public class Node{  // CREATING NODE CLASS
        int data;
        Node next;

         Node(int data){
this.data= data;
this.next = null;

        }
    }

    static public class Stack{  // STACK CLASS....
        static Node  head = null;
 public static boolean isEmpty() {   // IS EMPTY
    return head==null;
}
 public static void push(int data){  // PUSH
    Node newNode = new Node(data);
      if(isEmpty()){
         head=newNode ;
         return;
      }
   
      newNode.next= head;
      head = newNode;
 }
 public static int pop(){ // POP
    if(isEmpty()){
        return-1;
    }
    int top = head.data;
    head  = head.next ;
    return top;
 }

 public static int peek(){ //PEEK
    if(isEmpty()){
        return-1;
    }
    return head.data;

 }

    }

    public static void main(String args[]){

        Stack s = new Stack();
        s.push(1);
        s.push(10);
        s.push(12);
        s.push(16);
     //   s.pop();

while(!s.isEmpty()){
    System.out.println(s.peek());
    s.pop();
}
    }
    
}
