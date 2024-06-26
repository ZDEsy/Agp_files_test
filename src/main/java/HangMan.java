import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class HangMan extends HangmanMain{
    private JPanel mainPane;
    private JTextField inputGuess;
    private JButton tip;
    private JButton bestPlayers;
    private JButton restart;
    private JLabel word;
    private JLabel mistakes;
    private String guessWord;
    private StringBuilder unders = new StringBuilder();
    private int i = 0;
    public HangMan() throws IOException {
        setMainPane(mainPane);
        Components();
        guessWord = GenerateWord();
        word.setText(GenerateUnder());
        System.out.println(guessWord);
        tip.addActionListener(e -> {
            if(guessWord.equals(inputGuess.getText()))
            {
                word.setText(guessWord);
                new NameField(getMistakesCount());
            }
            else
            {
                for(int i = 0; i < guessWord.length(); i++)
                {
                    if(guessWord.charAt(i) == inputGuess.getText().charAt(0))
                    {
                        unders.setCharAt(i,inputGuess.getText().charAt(0));
                        word.setText(unders.toString());
                    }
                }

                if(!guessWord.contains(inputGuess.getText().substring(0,1)))
                {
                    i++;
                    setMistakesCount(i);
                    mistakes.setText("Počet chyb: " + getMistakesCount());
                }

            }

        });
        restart.addActionListener(e -> Restart());
        bestPlayers.addActionListener(e -> {
            try {
                new BestPlayers();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public String GenerateWord() throws IOException {
        Path pathWords = Path.of(System.getProperty("user.home"),"\\IdeaProjects\\Agp_files_test\\src\\main\\resources\\words.txt");
        List<String> list = Files.readAllLines(pathWords);
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }

    public String GenerateUnder()
    {
        unders.append("-".repeat(guessWord.length()));
        return unders.toString();
    }

    public void Restart()
    {
        try {
            guessWord = GenerateWord();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        unders = new StringBuilder();
        word.setText(GenerateUnder());
        inputGuess.setText(null);
        setMistakesCount(0);
        mistakes.setText("Počet chyb: " + getMistakesCount());
        System.out.println(guessWord);
    }


}
