
public class Student {

	public static void main(String[] args) {
		Student s1 = new Student();

		System.out.println("Enter student id: ");
		System.out.println("Enter student name: ");
		System.out.println("Enter student marks for the exam: ");
		
		if(s1.Marks() < 0 || s1.Marks() > 100)
			throw new Exception();
	}

}
