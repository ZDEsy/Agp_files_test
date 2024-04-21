import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BestPlayers extends HangmanMain{
    private JPanel mainPane;
    DefaultListModel<String> list = new DefaultListModel<>();
    private JList<String> playerList;
    private JLabel bestPlayersLabel;
    public BestPlayers() throws IOException {
        setMainPane(mainPane);
        Components();
        playerList.setModel(list);
        List<String> lines = Files.readAllLines(getPathPlayers());
        for(String line : lines)
        {
            list.addElement(line);
        }
    }
}
