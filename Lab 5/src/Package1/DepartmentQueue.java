package Package1;

public class DepartmentQueue {

	
	
	private String Deptname ;
	private Course tail,head ;
	public DepartmentQueue(String name) {
		
		Deptname = name;
		tail = null;
		head = null;
	}
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String deptname) {
		Deptname = deptname;
	} 
	
	
	public boolean isEmpty() {
		
		
		return (head == null);
	}
	
	public void enqueue(int id , String name) {// no more cases cause your entering the actual node not pointer or element of node
		
		
		
		Course temp = new Course(id, name);
		enqueue(temp);
		/*
		 * if(isEmpty()) {
		 * 
		 * tail = head = temp;
		 * 
		 * } tail.setNext(temp); tail = temp;
		 */
		
		
	}
	
	public void enqueue(Course temp) {// no more cases cause your entering the actual node not pointer or element of node
		
if(isEmpty()) {
			
			tail = head = temp;
			
		}
		tail.setNext(temp);
		tail = temp;
	
	}
	
	public Course dequeue() throws RuntimeException{
		
		if(isEmpty()) {
			
			return null;
			
		}
		else {
			
			Course temp = head;
			head = head.getNext();
			if(head == null) {
				
				tail = null;
			}
			temp.setNext(null);
			return temp;
			
		}
		
	}

	
	
	
	
}
