// Time Complexity :
//push() 	O(1)
//pop()   	O(1)
//isEmpty() 	O(1)
//size()	O(1)
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
public class StackAsLinkedList { 
  
    StackNode root; 
  
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            //Constructor here 
            this.data =data;
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
		if (root == null) {
			return true;
		}
		else
			return false;
  
    public void push(int data) 
    {  StackNode newNode = new StackNode(data);

        //Write code to push data to the stack. 
        if(root == null){
            root = newNode ;
        }else{
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
            
        }
        System.out.println(data + " pushed to stack");

    } 
  
    public int pop() 
    { 	
        
        int popped = Integer.MIN_VALUE;
	//If Stack Empty Return 0 and print "Stack Underflow"
    if(root == null){
        System.out.println("Stack is Empty");
    }
        //Write code to pop the topmost element of stack.
        else{
            popped = root.data ;
            root = root.next;
        }
	//Also return the popped element 
    return popped;

    } 
  
    public int peek() 
    { 
        //Write code to just return the topmost element without removing it.
        
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        StackAsLinkedList sll = new StackAsLinkedList(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack"); 
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
