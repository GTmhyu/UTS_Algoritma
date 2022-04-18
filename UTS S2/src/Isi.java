import java.util.ArrayList;

public class Isi {
    public String profile;
    public String Username;
    public String postingan;
    public String Caption;
    public int like;
    public String pesan;
    public ArrayList komentar = new ArrayList<>();

    public Isi(){

    }

    public Isi(String pp, String uname, String postng , String capt , int suka, ArrayList komen, String dm){
        this.profile = pp;
        this.Username = uname;
        this.postingan = postng;
        this.Caption=capt;
        this.like = suka;
        this.komentar = komen;
        this.pesan = dm;
    }
    public void printpost(){
        System.out.println(
                "Gambar Profile :"+ this.profile+"\n"+
                        "Username : " + this.Username+"\n"+
                        "Postingan : " + this.postingan+"\n"+
                        "Kirim Direct Massage : " + this.pesan+"\n"+
                        "Caption : " + this.Caption+"\n"+
                        "Like : " + this.like + "\n");
    }

    public void postKonten() {

    }

    public void LikePostingan(int i) {
    }

    public void IsiKomentar(String komentar) {
        System.out.println("Komentar : " + this.komentar+"\n");
    }

    public void ShowComment() {
    }

    public void postingan() {
    }
}