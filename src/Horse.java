public class Horse extends Observable {

    private String state;

    public void setState(String state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }
}
