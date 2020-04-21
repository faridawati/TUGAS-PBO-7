/* Nama : Ratu Millenia Febriyanti Sam
   Nim  : 13020180120
   waktu : 20 April 2020
*/
public class MainMakhlukHidup {
    public void cekMakhlukHidup (MakhlukHidup mHidup){
        mHidup.berdiri();
        mHidup.oksigen();
    }
    
    public static void main(String[] args) {
        MainMakhlukHidup tMakhlukHidup = new MainMakhlukHidup();        
        
        tMakhlukHidup.cekMakhlukHidup(new Manusia("Dua Kaki"));       
        
        System.out.println("-----------------------------------------");                              
        tMakhlukHidup.cekMakhlukHidup(new Hewan ("Empat Kaki","Dua Kaki"));
        
        System.out.println("-----------------------------------------");        
        tMakhlukHidup.cekMakhlukHidup(new Tumbuhan ("Akar"));
        
    }
}
