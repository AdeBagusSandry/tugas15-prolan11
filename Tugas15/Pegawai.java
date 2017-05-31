public class Pegawai <T>{
	private T gaji;
	
		private Pegawai ( gaji){
			this.gaji = gaji;
		}
public void SetGaji(T gaji ){
	this.gaji  = gaji;
}
	public T getGaji(){
	return gaji;
	}
	
public mainclass{
	public static void main (String [] args){
		Pegawai <Integer> p =new Pegawai 
		<Integer(1500000);
		int x = p.getGaji();
		System.out.println("Gaji Pegawai : " + x);
	}
}