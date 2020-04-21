/* Nama : Ratu Millenia Febriyanti Sam
   Nim  : 13020180120
   waktu : 20 April 2020
*/
public class Manusia extends MakhlukHidup {
    private String duaKaki;
    public Manusia(String duaKaki){
        this.duaKaki = duaKaki;
    }
    public void berdiri (){
        System.out.println("Manusia berdiri menggunakan :  "+duaKaki);
    }
}
