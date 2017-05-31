public class jenis extends dealer {
	        
			@Override
  public void stok(){
        super.stok();
        System.out.println("4");
   
  }
  	@Override
    public void garansi(){
        super.garansi();
        System.out.println("1 tahun");
   
  }
  	@Override
    public void kategori(){
        super.kategori();
        System.out.println("Satria F 150");
   
  }
public void tampilkan(){
        
   

     dealer = new dealer();

     m.inputData("Satria ", "Putih Biru", "Motor bebek",21000000);
     m.tampilkandata();

 
    
}    
}