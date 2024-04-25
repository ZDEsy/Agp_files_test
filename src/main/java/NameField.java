import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class NameField extends HangmanMain{
    private JTextField nameInput;
    private JLabel winLabel;
    private JLabel nameLabel;
    private JButton submitButton;
    private JPanel mainPane;
    Player player;

    public NameField(int mistakesCount) {
        setMainPane(mainPane);
        Components();
        submitButton.addActionListener(e -> {
            setName(nameInput.getText());
            try {
                player = new Player(nameInput.getText(),mistakesCount);
                Files.writeString(getPathPlayers(),player.getName().replaceAll("\\s+","") + " " + player.getMistakesCount() + System.lineSeparator(),StandardOpenOption.APPEND);
                new BestPlayers();
                dispose();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
