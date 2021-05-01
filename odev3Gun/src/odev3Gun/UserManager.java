package odev3Gun;

public class UserManager {
	
	public void add(int id,String firstName, String lastName, String password, String email,String[] courses,
			String[] certification, double rating, double progressing) {
		System.out.println("Kullanýcý Eklendi: "+ "Id: "+id+" Ýsim: "+firstName+" Soyisim: "+lastName+" Email: "+email);
	}
	
	public void showInfos() {
		System.out.println("Bilgiler gösterildi");
	}

}
