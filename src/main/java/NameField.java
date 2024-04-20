import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameField extends HangmanMain{
    private JTextField nameInput;
    private JLabel winLabel;
    private JLabel nameLabel;
    private JButton submitButton;
    String name;
    private JPanel mainPane;

    public NameField() {
        setMainPane(mainPane);
        Components();
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = nameInput.getText();
                try {
                    Files.writeString(getPathPlayers(),name + ", Počet chyb: " + getMistakesCount() + System.lineSeparator(), StandardOpenOption.APPEND);
                    new BestPlayers();
                    dispose();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
