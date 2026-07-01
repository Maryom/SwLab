package labSW;

public class Course {

	private Course Next;
	private int ID;
	private String name;
	public Course(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	public Course getNext() {
		return Next;
	}
	public void setNext(Course next) {
		Next = next;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return ID + " " + name ;
	}
	
	
	
	
	
	
	
}
