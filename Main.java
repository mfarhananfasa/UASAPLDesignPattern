public class Main {
    public static void main(String[] args) {

        Mangaka mangaka = new Mangaka();
        //buat objek
        Observer tim1 = new Team(mangaka);
        Observer tim2 = new Team(mangaka);
        Observer tim3 = new Team(mangaka);

        mangaka.addObserver(tim1);
        mangaka.addObserver(tim2);
        mangaka.addObserver(tim3);
        mangaka.setInfo("Gambar Sketsa telah selesai");
        
        System.out.println("tim 1");
        Contact line = new Line(new ContactPlatform());
        line.assemble();
        System.out.println();
        System.out.println("tim 2");
        Contact telegram = new Telegram(new ContactPlatform());
        telegram.assemble();
        System.out.println();
        System.out.println("tim 3");
        Contact whatsapptelegram = new Whatsapp(new Telegram(new ContactPlatform()));
        whatsapptelegram.assemble();
        
    }
}
