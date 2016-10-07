package Assignment4;
/*Design a java class that encapsulate the data structure Stack (Last in First out). The class has 2 methods:
(push): method for adding items to stack, the push operation adds items to the top of the list
(pop): method for retrieving items from the stack. The pop operation removes an item from the top of the list, and returns its value to the caller.
In the case of overflow the user should be informed with a message
In the case of underflow, the user should be informed with a message & a value of zero is returned.

Assumptions: The stack will hold up to 10 integer values.*/
public class Stack {

	private int[] values=new int[10];
	private int topOfStack;
	
	public Stack(){
		this.topOfStack=-1;
	}
	
	void push(int value){
		if(this.topOfStack>=9)
		System.out.println("Overflow!");
		else values[++this.topOfStack]=value;
	}
	int pop(){
		if(this.topOfStack<0) {System.out.println("Underflow!");return 0;}
		else return values[this.topOfStack--];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack();
		for(int i=0;i<10;i++) s.push(i);
		for(int i=0;i<10;i++) System.out.println("value "+s.pop()+" is popped out of stack");
	}

}
