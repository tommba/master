import java.util.ArrayList;
import java.util.List;

public class Farm1 {
    private List<Player> players = new ArrayList<>();
    public void addObserver(Player player) {
        this.players.add(player);
    }
    public void removeObserver(Player player) {
        this.players.remove(player);
    }
}
