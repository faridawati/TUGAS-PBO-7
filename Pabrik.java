/* Nama : Ratu Millenia Febriyanti Sam
   Nim  : 13020180120
   waktu : 20 April 2020
*/
interface Pabrik{
static final String PROVINSI = "Jawa Barat";
public void setNama(String namaBaru);
public void setAlamat(String alamatBaru);
 public String getNama();
 public String getAlamat();
}
class PabrikSepatu implements Pabrik{
 String nama, alamat;
public PabrikSepatu(String namaBaru, String alamatBaru){
nama = namaBaru;
alamat = alamatBaru;
   }
public void setNama(String namaBaru){
 nama = namaBaru;
 }
public void setAlamat(String alamatBaru){
alamat = alamatBaru;
 }
 public String getNama(){
 return nama;
 }
  public String getAlamat(){
 return alamat;
 }
  public String getProvinsi(){
 return PROVINSI;
 }
 public String toString(){
return
"Nama       : "+nama+"\n"+
"Alamat            : "+alamat+"\n"+
"Provinsi   : "+PROVINSI+"\n"; 
 }
}
