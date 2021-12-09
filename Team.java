public class Team implements Observer {
    private Mangaka mangaka;

    public Team(Mangaka mangaka) {
        this.mangaka = mangaka;
    }

    @Override
    public void update() {
        System.out.println("Info Update : "+mangaka.getInfo() + "\nGambar telah dikirimkan\n");
    }
}