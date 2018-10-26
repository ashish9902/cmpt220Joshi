package area;


public class Lab7_2 {
	
	public int[] elements;
	public int size;
	
	public Lab7_2() {
		elements = new int[10]; 
	}
	
	public Lab7_2(int size) {
		elements = new int[size];
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public int peek() {
		if (!empty())
			return elements[size - 1];
		return -1;
	}
	
	public void push(int value) {
		if (size != elements.length) {
			elements[size] = value;
			size++;
		}
	}
	
	public int pop() {
		if (!empty()) {
			size--;
			return elements[size];
		}
		return -1;
	}
	
	public int getSize() {
		return size;
	}

}
