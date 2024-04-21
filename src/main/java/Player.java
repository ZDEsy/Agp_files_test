import javax.swing.*;
import java.nio.file.Path;

public class Player extends JFrame {
    private String name;
    private int mistakesCount;
    private final Path pathPlayers = Path.of(System.getProperty("user.home"),"\\IdeaProjects\\Agp_files_test\\src\\main\\resources\\bestPlayers.txt");
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
}
