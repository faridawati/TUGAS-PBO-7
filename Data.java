/* Nama : Ratu Millenia Febriyanti Sam
   Nim  : 13020180120
   waktu : 20 April 2020
*/
//pewarisan interface

public class Data implements MataKuliah{

	@Override
	public void namaMhs() {
		System.out.println("Nama Mahasiswa adalah Rahma");
		
	}

	@Override
	public int stb() {
		return 80;
	}
	
	@Override
	public String mk() {
		return "OOP";
	}
	
}
