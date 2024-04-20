import javax.swing.*;
import java.awt.*;
import java.nio.file.Path;
import java.nio.file.Files;

public class HangmanMain extends JFrame {
    private int mistakesCount;
    private JPanel mainPane;

    private final Path pathPlayers = Path.of(System.getProperty("user.home"),"\\IdeaProjects\\Agp_files_test\\src\\main\\resources\\bestPlayers.txt");

    public void setMainPane(JPanel mainPane) {
        this.mainPane = mainPane;
    }

    public void setMistakesCount(int mistakesCount) {
        this.mistakesCount = mistakesCount;
    }

    public int getMistakesCount() {
        return mistakesCount;
    }

    public Path getPathPlayers() {
        return pathPlayers;
    }

    public void Components()
    {
        setContentPane(mainPane);
        mainPane.setMinimumSize(new Dimension(500,500));
        setSize(new Dimension(500,500));
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
