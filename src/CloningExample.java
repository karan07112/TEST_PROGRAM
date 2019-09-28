
public class CloningExample {
 

	public CloningExample() {
		// TODO Auto-generated constructor stub
	}

	
	public static void main(String[] args){
		
		Teacher  teacher=new Teacher("sanjeev","thakur","ghandalwin");
		Student  student=new Student("karan", "lastname", "ladraur");
		teacher.setStudent(student);
		
		try {
			
	   Teacher		teacher2=	(Teacher) teacher.clone();
    System.out.println(	teacher.toString());
    
    System.out.println(	teacher2.toString());
    teacher2.getStudent().setName("vijay");
    System.out.println(	teacher.toString());
    
    System.out.println(	teacher2.toString());
    
		
		   } catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
