package pertemuan7;

import java.util.Scanner;

public class Login {
	
	Scanner scan = new Scanner(System.in);
	String password;

	public Login() {
		System.out.print("Input password: ");
		password = scan.nextLine();
		
		try {
			check(password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		new Login();

	}
	
	public void check (String password) throws Exception { // fungsi buat bikin exception
		if(password.equals("12345")) {
			System.out.println("Logged in");
		}
		else {
			throw new Exception("Password invalid"); // buat kasih pesan errornya
		}
	}

}
