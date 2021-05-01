package odev3Gun;

public class Instructor extends User {
	
	private String[] certification;
	private double rating;
	
//	public Instructor(int id, String firstName, String lastName, String password, String email,
//			String[] courses, String[] certification, double rating){
//		this.id=id;
//		this.firstName=firstName;
//		this.lastName=lastName;
//		this.password=password;
//		this.email=email;
//		this.courses=courses;
//		this.certification= certification;
//		this.rating=rating;
//		
//	}
	

	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getPassword() {
		return this.password;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setCourses(String[] courses) {
		this.courses=courses;
	}
	
	public String[] getCourses() {
		return courses;
	}
	
	public void setCertification(String[] certification) {
		certification=this.certification;
	}
	
	public String[] getCertification() {
		return certification;
	}
	
	public void setRating(double rating) {
		this.rating=rating;
	}
	
	public double getRating() {
		return this.rating;
	}
	
	
	

}
