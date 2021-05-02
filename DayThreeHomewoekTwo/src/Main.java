
public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("muhammed");
		user.setLastName("topcu");
		user.setEmail("m@topcu.com");
		user.setPassaword("123456t");
		
		
		Student student = new Student();
		student.setId(1);
		student.setStudentNumber(20);
		student.setFirstName("murat");
		student.setLastName("görgülü");
		student.setEmail("m@gorgulu.com");
		student.setPassaword("12345m");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setInstructorNumber(1);
		instructor.setFirstName("kamil");
		instructor.setLastName("uçuçu");
		instructor.setEmail("k@ucucu.com");
		instructor.setPassaword("12345k");
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		userManager.add(user);
		studentManager.add(student);
		instructorManager.add(instructor);
	}

}
