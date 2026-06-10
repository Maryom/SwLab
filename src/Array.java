
public class Array {
	private static int [] A;
	
	public Array() {
		A = new int [10];
	}
	
	public void setArray(int [] v) {
		A = v;
	}
	
	public int OCCUR( int key) {
		int count = 0;
		for (int i = 0; i < A.length; i++)
			if (A[i] == key) count++;
		return count;
	}
} 
