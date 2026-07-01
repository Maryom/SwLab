package labSW;

import java.util.Scanner;

public class Lab5Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Department Name:");
		String name = in.nextLine();
		DepartmentQueue deptname = new DepartmentQueue(name);
		
		int i;
		
		do {
			
			System.out.println();
		System.out.println("1 - Enqueue a Course");
		System.out.println("2 - Dequeue a Course ");
		System.out.println("3 - search for a Course ");
		System.out.println("4 - print course queue");
		System.out.println("5 - Exit");
		
		
		System.out.println();
		System.out.print("Enter your Selection: ");
		i = in.nextInt();
	
		
		
		
		
		
		
		
		
		
		
		switch(i) {
		
		case 1:
			int v;
			do {
			System.out.print("Enter Course Id or -1 to Return to the Selection list:");
			 v = in.nextInt();
			 
			in.nextLine();
			
			if(v != -1) {
			 System.out.print("Enter Course name: ");
			 String name1 = in.nextLine();
			deptname.enqueue(v, name1);
			}
			}while(v != -1);
			System.out.println();
		break;
		
		case 2:
			
		System.out.print("Course Removed "+deptname.dequeue().toString()+" From the Algorithm");
		
		
		
			
			
		
		System.out.println();
		break;
		
		case 3:
			
			System.out.print("Enter Course ID to search for : ");
			int id = in.nextInt();
	
			 DepartmentQueue e = new DepartmentQueue(null);
			 Course temp = null;
			 int c1 = 0;
			 int f = 0;
			while(!deptname.isEmpty()) {
				
				temp = deptname.dequeue();
				e.enqueue(temp);
				
				
				
				c1++;
				if(temp.getID() == id) {
					System.out.println("the Id: "+temp.getID()+" Corresponds to "+temp.getName());
					break;
				}
			}
			
			if(temp == null) {
				
				System.out.println("Department is Empty");
				break;
			}
			
			if(temp.getID() != id) {
				System.out.println("the Id: "+ id +"Doesnt Correspond to any course in the Department");
				
			}
			
			while(!e.isEmpty()) {
				
				deptname.enqueue(e.dequeue());
				f++;
				if(c1 == f) {
					break;
				}
				
				
			}
			break;
			
			
		case 4:
			
			
			if(deptname.isEmpty()) {
				
				System.out.println("There are no courses added");
				
			}else {
			System.out.println("the courses are:");
			System.out.println();
			DepartmentQueue a = new DepartmentQueue(null);
			int c = 1;
			int z = 1;
			Course p = null;
			while(!deptname.isEmpty()) {
				
			 p = deptname.dequeue();
				a.enqueue(p);
				
				System.out.println(c + " - "+p.toString());
				c++;
				
			}
			while(!a.isEmpty()) {
				
				
				deptname.enqueue(a.dequeue());
				z++;
				if(z == c) {
					
					break;
				}
			}
				
			}
					
			break;
			
		case 5:
			
			System.out.println("Exiting Program......");
			break;
			
		
			
			
			
			
		
			
			default:
				System.out.println("Error !!! Wrong Selection");
			
		}
		}while(i != 5);
		
		
		
		
		
		
		
	}

}
