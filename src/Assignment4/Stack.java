package Assignment4;

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
