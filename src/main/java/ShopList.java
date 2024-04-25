import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShopList extends JFrame {
    private JPanel mainPane;
    DefaultListModel<String> list = new DefaultListModel<>();
    private JList<String> shopList;
    private JTextField textField;
    private JButton addButton;
    private JButton remButton;

    public ShopList()
    {
        super("Nákupní list");
        Components();
        addButton.addActionListener(e -> {
            shopList.setModel(list);
            list.addElement(textField.getText());
        });


        remButton.addActionListener(e -> {
            try
            {
                list.remove(shopList.getSelectedIndex());
            }
            catch (Exception j)
            {
                JOptionPane.showMessageDialog(null,"Nešlo nic");
            }

        });
    }
    private void Components()
    {
        setContentPane(mainPane);
        mainPane.setMinimumSize(new Dimension(500,500));
        setSize(new Dimension(500,500));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
