import javax.swing.*;
import java.awt.*;

public class HangmanMain extends Player {
    private JPanel mainPane;


    public void setMainPane(JPanel mainPane) {
        this.mainPane = mainPane;
    }

    public void Components()
    {
        setContentPane(mainPane);
        mainPane.setMinimumSize(new Dimension(500,500));
        setTitle("HangMan");
        setSize(new Dimension(500,500));
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
