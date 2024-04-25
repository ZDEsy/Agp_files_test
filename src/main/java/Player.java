import javax.swing.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Player extends JFrame {
    private String name;
    private int mistakesCount;
    private final Path pathPlayers = Path.of(System.getProperty("user.home"),"\\IdeaProjects\\Agp_files_test\\src\\main\\resources\\bestPlayers.txt");
    private final List<Player> players = new ArrayList<>();
    public Player(){}
    public Player(String name, int mistakesCount)
    {
        this.name = name;
        this.mistakesCount = mistakesCount;
    }
    public void setMistakesCount(int mistakesCount) {
        this.mistakesCount = mistakesCount;
    }

    public int getMistakesCount() {
        return mistakesCount;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public Path getPathPlayers() {
        return pathPlayers;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void AddPlayer(String name, int mistakesCount)
    {
        players.add(new Player(name, mistakesCount));
    }
}
