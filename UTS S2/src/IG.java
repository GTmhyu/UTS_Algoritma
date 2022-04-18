import java.util.ArrayList;
import java.util.Scanner;

public class IG {

    public static void menu () {
        System.out.println("Menu Utama ");
        System.out.println("1. Like Postingan ");
        System.out.println("2. Tambahkan Komentar");
        System.out.println("4. Postingan disimpan");
        System.out.println("5. Kirim Pesan");
        System.out.println("6. Exit");
        System.out.println("Pilih perintah : ");
    }
    public static  void main(String[] args) {

        Isi[] post = new Isi[3];
        post[0] = new Isi();
        post[0].profile = "Ojang";
        post[0].Username = "@arduino.cc";
        post[0].postingan = "foto 1";
        post[0].Caption="Sayembara Membuat mading :)";
        post[0].pesan = "Join";
        post[0].like =696966969;
        post[0].printpost();

        ArrayList Isikomen = new ArrayList<>();
        post[0].komentar= Isikomen;
        post[0].IsiKomentar("Hidup indoneisa");



        post[1] = new Isi();
        post[1].profile = "(_))";
        post[1].Username = "@Afkar";
        post[1].postingan = "Picture";
        post[1].pesan = "Rebahan dek";
        post[1].Caption="Indonesia Maju";
        post[1].like =99999999;
        post[1].printpost();

        ArrayList Isikomen2 = new ArrayList<>();
        post[1].komentar= Isikomen2;
        post[1].IsiKomentar("Hello world");

        System.out.println("INSTAGRAM");
        System.out.println("----------------------------------");
        System.out.println("\nPostingan 1");
        post[0].postKonten();

        System.out.println("\nPostingan 2");
        post[1].postKonten();



        Scanner inputdata = new Scanner(System.in);
        char pilihPost = 0;
        do {
            System.out.print("Pilih Postingan (1, 2): ");
            pilihPost = inputdata.next().charAt(0);
            switch (pilihPost) {
                case '1' ->{
                    post[0].postingan();
                    char pilihperintah = 0;
                    do{
                        menu();

                        pilihperintah = inputdata.next().charAt(0);
                        switch (pilihperintah){
                            case '1' -> {
                                post[0].LikePostingan(1);
                                post[0].postingan();
                            }

                            case '2'->{
                                System.out.println("Tambahkan Komentar : ");
                                Scanner inputkomen = new Scanner(System.in);
                                String komentar = inputkomen.nextLine();
                                post[0].IsiKomentar(komentar);
                                post[0].postingan();
                            }

                            case '3' ->{
                                System.out.println("Postingan disimpan");
                            }
                            case '4'->{
                                System.out.println("Direct Message: ");
                                Scanner pesandm = new Scanner(System.in);
                                String pesanig = pesandm.nextLine();

                                System.out.println(pesanig+" terkirim ");
                            }
                            case '5'->{
                                System.exit(3);
                            }
                            default ->{

                            }
                        }
                    }while (pilihperintah !='0');
                }
                case '2' ->{
                    post[1].postingan();

                    char pilihperintah = 0;
                    do{
                        menu();

                        pilihperintah = inputdata.next().charAt(0);
                        switch (pilihperintah){
                            case '1' -> {
                                post[0].LikePostingan(1);
                                post[0].postingan();
                            }

                            case '2'->{
                                System.out.println("Tambahkan Komentar : ");
                                Scanner inputkomen = new Scanner(System.in);
                                String komentar = inputkomen.nextLine();
                                post[0].IsiKomentar(komentar);
                                post[0].postingan();
                            }

                            case '3' ->{
                                System.out.println("Postingan disimpan");
                            }
                            case '4'->{
                                System.out.println("Direct Message: ");
                                Scanner pesandm = new Scanner(System.in);
                                String pesanig = pesandm.nextLine();

                                System.out.println(pesanig+" terkirim ");
                            }
                            case '5'->{
                                System.exit(3);
                            }
                            default ->{

                            }
                        }
                    }while (pilihperintah !='0');
                }
            }
        }while (pilihPost != '0');






    }



}