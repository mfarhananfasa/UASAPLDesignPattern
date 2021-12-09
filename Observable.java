import java.util.ArrayList;

abstract class Observable {
    ArrayList<Observer> observers = new ArrayList<>();
    String info;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
        this.notif();
    }

    public abstract void notif();
}