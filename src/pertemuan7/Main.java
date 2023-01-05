package pertemuan7;

import java.util.Scanner;
import java.util.Vector;

public class Main {   
	
	Scanner scan = new Scanner(System.in);
	Vector <Product> listProduct = new Vector<>();

	public Main() {
		// code
		int menu=0;
		
		do {
			
			System.out.println("Toko Produk");
			System.out.println("===========");
			System.out.println("1. Tambah Produk");
			System.out.println("2. Lihat Produk");
			System.out.println("3. Edit Produk");
			System.out.println("4. Hapus Produk");
			System.out.println("5. Exit");
			
			// Exception handling
			// try & catch
			try {
				System.out.print("Input menu: ");
				menu = scan.nextInt(); // kalau kita kasih tipe yang beda, bakal ada Input Mismatch Exception
				scan.nextLine();
			}
			catch(Exception e) {
				// code apa yang pengen dijalanin kalo emang error
				scan.nextLine(); // scan buat ambil enter setelah input
//				e.printStackTrace(); // buat print detail error
				System.out.println("Menu harus dalam bentuk angka");
			}
			finally {
				// code yang tetap berjalan mau error atau tidak
				System.out.println("Operasi selesai");
			}
			
			
//			switch(menu) {
//			case 1:
//				add();
//				break;
//			case 2:
//				view();
//				break;
//			case 3:
//				edit();
//				break;
//			}
			
		} while (menu!=5);
		
	}
	

	public static void main(String[] args) {
		new Main();

	}
	
	public void add() {
		String nama; int harga; String kategori;
		System.out.print("Input nama: ");
		nama = scan.nextLine();
		System.out.print("Input harga: ");
		harga = scan.nextInt(); scan.nextLine();
		System.out.print("Input kategori: ");
		kategori = scan.nextLine();
		
		Product produkBaru = new Product(nama, harga, kategori); // udah bikin produknya
		
		listProduct.add(produkBaru); // ditambahin ke vector
		System.out.println("Produk telah ditambahkan!");
	}
	
	public void view() {
		System.out.println("List produk: ");
		for(int i=0; i<listProduct.size(); i++) {
			System.out.println(i+1);
			System.out.println(listProduct.get(i).getNama());
			System.out.println(listProduct.get(i).getHarga());
			System.out.println(listProduct.get(i).getKategori());
			System.out.println();
		}
	}
	
	public void edit() {
		System.out.print("Input urutan produk yang ingin diedit: ");
		int index = scan.nextInt(); scan.nextLine();
		
		String nama; int harga; String kategori;
		System.out.print("Input nama baru: ");
		nama = scan.nextLine();
		System.out.print("Input harga baru: ");
		harga = scan.nextInt(); scan.nextLine();
		System.out.print("Input kategori baru: ");
		kategori = scan.nextLine();
		
		Product produkBaru = new Product(nama, harga, kategori); // udah bikin produknya
		
		listProduct.set(index-1, produkBaru); // ditambahin ke vector
		System.out.println("Produk telah diganti!");
	}

}
