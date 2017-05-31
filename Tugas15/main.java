public class main {
 public static void main (String [] args){
	 System.out.println();
System.out.println("==== INFORMASI MOTOR ======");
    System.out.println();
	System.out.println("sperpart");

sperpart s = new sperpart();
 s.tampilkan();
       s.stok();
	   s.garansi();
	   s.kategori();
	   
	
	System.out.println("\nJENIS");

jenis h = new jenis();
 h.tampilkan();
       h.stok();
	   h.garansi();
	   h.kategori();

	
System.out.println("\nHONDA");
honda t = new honda();
t.tampilkan();

     bayar obj;
	 
	diskon pp = new diskon(5,3);
    superdiskon bs = new superdiskon(5);
    penawaran st = new penawaran(4, 3);
    
    
    // obj mengacu pada objek diskon
    obj = pp;
	System.out.println();
	System.out.println("==== INFORMASI DISKON ======");
	System.out.println();
    // akan memanggil method yang terdapat pada diskon
    System.out.println("Diskon Yang Di Dapatkan (%) : " + obj.terbit));
    System.out.println();
    
    // obj mengacu pada objek superdiskon
    obj = bs;
    // akan memanggil method yang terdapat pada superdiskon
    System.out.println("Diskon Yang Di Dapatkan (%) : " + obj.terbit());
    System.out.println();
    
    // obj mengacu pada objek penawaran
    obj = st;
    // akan memanggil method yang terdapat pada penawaran
    System.out.println("Diskon Tambahan(%) : " + obj.terbit());
    System.out.println();
    
 }
}