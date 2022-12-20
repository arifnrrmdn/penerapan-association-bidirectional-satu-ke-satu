public class App {
    public static void main(String[] args){
        Sekolah sekolah = new Sekolah("MAN 2 Lebak");
        KepalaSekolah kepalaSekolah = new KepalaSekolah("Achmad Syaifullah");

        //asosiaction bidirectional
        sekolah.setKepalaSekolah(kepalaSekolah);
        kepalaSekolah.setSekolah(sekolah);

        //memunculkan dari objek sekolah
        System.out.println(sekolah.getNamaSekolah());
        System.out.println(sekolah.getKepalaSekolah().getNamaKepalaSekolah());

        //memunculkan dari objek kepala sekolah
        System.out.println(kepalaSekolah.getSekolah().getNamaSekolah());
        System.out.println(kepalaSekolah.getNamaKepalaSekolah());
    }
    
}
