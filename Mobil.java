/* Nama : Ratu Millenia Febriyanti Sam
   Nim  : 13020180120
   waktu : 20 April 2020
*/
abstract public class Mobil implements PropertiInM{
	abstract public void injakPedalGas();
	public void injakRem(){
		System.out.println("Mobil berhenti!");
	}
}

class Kijang extends Mobil{
	public void injakPedalGas(){
			System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam...");
	}

	@Override
	public int berukuran(int ukuran) {
		// TODO Auto-generated method
		return ukuran;
	}
	
	@Override
	public int berkekuatan(int kekuatan) {
		// TODO Auto-generated method
		return kekuatan;
	}
}

class BMW extends Mobil {

	public void injakPedalGas(){
		System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam...");
	}
	
	@Override
	public int berukuran(int ukuran) {
		// TODO Auto-generated method
		return ukuran;
	}
	
	@Override
	public int berkekuatan(int kekuatan) {

		// TODO Auto-generated method
		return kekuatan;
	}
}
