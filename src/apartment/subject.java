package apartment;

import java.util.ArrayList;
import java.util.List;

//koneksi class observer yang akan mengkonsumsi data dari subject

public class subject {

    private List<observer> observers = new ArrayList<observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (observer observer : observers) {
            observer.update();
        }
    }
}
