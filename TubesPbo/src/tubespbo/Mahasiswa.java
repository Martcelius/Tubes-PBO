/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Martcel
 */
public class Mahasiswa extends Orang {
    private TugasAkhir tugasAkhir;
    private String idMahasiswa;
    private String status;

    public Mahasiswa(String nama,String noHandphone,String jenisKelamin,String idMahasiswa){
      super(nama,noHandphone,jenisKelamin);
      this.idMahasiswa=idMahasiswa;
    }
    public String getIdMahasiswa() {
        return idMahasiswa;
    }
    public void setIdMahasiswa(String idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }
    public void createTA(String judulTA){
         tugasAkhir =new TugasAkhir(judulTA);
    }
    //public TugasAkhir getCreateTA(){
    //    return tugasAkhir;
    //} 
    public void setStatusMhs(String status){
        this.status = status;
    }
    public String getStatusMhs(){
        return status;
    }
    @Override
    public String getJabatan(){
        return "Mahasiswa";
    }
    public void revisiTA(String judul){
         tugasAkhir.setJudulTA(judul);   
    }
    public String getRevisiTA(){
        return tugasAkhir.getJudulTA();
    }

    public TugasAkhir getTugasAkhir() {
        return tugasAkhir;
    }
    
  
    
}
