public class Main {
    public static void main(String[] args) {
        Menu m = new Menu();
        LambaAcKapa komut_lamba = new LambaAcKapa(new Lamba());
        Televizyon tv = new Televizyon();
        OncekiKanal komut_onceki = new OncekiKanal(tv);
        SonrakiKanal komut_sonra = new SonrakiKanal(tv);

        m.komutEkle(komut_lamba);
        m.komutEkle(komut_onceki);
        m.komutEkle(komut_sonra);

        m.menu();
    }
}