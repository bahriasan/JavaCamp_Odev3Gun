package odev3Gun;

public class UserManager {
	
	public void add(int id,String firstName, String lastName, String password, String email,String[] courses,
			String[] certification, double rating, double progressing) {
		System.out.println("Kullan�c� Eklendi: "+ "Id: "+id+" �sim: "+firstName+" Soyisim: "+lastName+" Email: "+email);
	}
	
	public void showInfos() {
		System.out.println("Bilgiler g�sterildi");
	}

}
