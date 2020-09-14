import javafx.beans.Observable;

public class Cow  extends Observable {
    private String state;
    public void setState(String state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }
}
