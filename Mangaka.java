public class Mangaka extends Observable {
    public void notif() {
        for (Observer mangaka : observers) {
            mangaka.update();
        }
    }
}