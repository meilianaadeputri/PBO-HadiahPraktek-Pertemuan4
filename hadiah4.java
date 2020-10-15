import java.util.Scanner;
public class hadiah4 {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama anda: ");
		String nama = input.nextLine();
		System.out.print("Masukkan alamat anda: ");
		String alamat = input.nextLine();
		
		System.out.println("Piliha tiket pesawat");
		System.out.println("1. Tipe A - Rp5.000.000");
		System.out.println("2. Tipe B - Rp2.000.000");
		System.out.println("3. Tipe C - Rp1.000.000");
		System.out.print("Pilihan anda(angka): ");
		int pilih = input.nextInt();
		
		int harga = 0;
		switch(pilih) {
			case 1: harga=5000000; break;
			case 2: harga=2000000; break;
			case 3: harga=1000000; break;
			default: System.out.println("Pilihan tidak tersedia");
		}
		
		System.out.print("Masukkan jumlah bayar: Rp");
		int bayar = input.nextInt();
		int kembalian = bayar-harga;
		System.out.println("===================================");
		System.out.println("Nama     : " + nama);
		System.out.println("Alamat   : " + alamat);
		System.out.println("Kembalian: Rp" + kembalian);
	}
}