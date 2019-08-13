package prob5;

public class MyStack {
	private int top=-1;
	private String[] buffer;

	public MyStack() {}
	public MyStack(int n) {
		buffer = new String[n];
	}

	public void push(String string) {

		String[] temp = buffer;

		if(top>=buffer.length-1) { 
			
			buffer = new String[top+2]; 
			
			for (int i = 0; i < temp.length; i++) {

				buffer[i] = temp[i]; 
			} 
		}
		buffer[++top] = string;

	}
	
	public String pop() throws MyStackException {
		if(top<0) {
			throw new MyStackException("stack is empty");
		}
		
		String result = buffer[top];
		buffer[top--] = null;
		return result;
	}
	
	public boolean isEmpty() {
		if(top<0) return false;
		return true;
	}

}