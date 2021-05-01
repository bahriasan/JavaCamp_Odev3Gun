package odev3Gun;

public class StudentManager extends UserManager{
	
	public void watchCourse() {
		System.out.println("Ders izleme baþladý");
	}
	
	//Override
	public void add(int id,String firstName, String lastName, String password, String email,String[] courses,
			String[] certification, double rating, double progressing) {
		Student student = new Student();
		student.setId(id);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setPassword(password);
		student.setEmail(email);
		student.setCourses(courses);
		student.setProgressing(progressing);
		
		System.out.println("Öðrenci Eklendi: "+ "Id: "+student.getId()+" Ýsim: "+student.getFirstName()
			+" Soyisim: "+student.getLastName()+" Password: "+student.getPassword()+" Email: "+student.getEmail());
	}
	
	public void showInfos() {
		System.out.println("Öðrenci Bilgiler gösterildi");
	}


}
