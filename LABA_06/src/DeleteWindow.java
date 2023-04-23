import javax.swing.*;
import java.awt.*;
import MainPackage.*;
import java.awt.event.*;

public class DeleteWindow extends JFrame {
    private ClassRepository repository;
    private JLabel confirmLabel, indexLabel;
    private JTextField indexField;
    private JButton deleteButton, cancelButton;

    public DeleteWindow(ClassRepository classRepository,int index) {
        repository = classRepository;

        setTitle("Удаление элемента");
        setSize(300, 150);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        confirmLabel = new JLabel("Введите индекс элемента для удаления:");
        confirmLabel.setBounds(20, 20, 250, 25);
        panel.add(confirmLabel);

        indexLabel = new JLabel("Индекс:");
        indexLabel.setBounds(40, 50, 50, 25);
        panel.add(indexLabel);

        indexField = new JTextField();
        indexField.setBounds(100, 50, 50, 25);
        panel.add(indexField);

        deleteButton = new JButton("Удалить");
        deleteButton.setBounds(40, 90, 100, 25);
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = Integer.parseInt(indexField.getText());
                Sneakers sneakersToDelete = repository.getSneakersCollection().get(index);
                repository.RemoveKrosovki(sneakersToDelete);
                Form1.textArea.setText("Удален элемент: " + sneakersToDelete.getType() + ", " + sneakersToDelete.getName() + ", " + sneakersToDelete.getCost() + ", " + sneakersToDelete.get_name() + ", " + sneakersToDelete.get_country() + "\n");
                setVisible(false);
            }
        });
        panel.add(deleteButton);

        cancelButton = new JButton("Отмена");
        cancelButton.setBounds(160, 90, 100, 25);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(cancelButton);

        add(panel);
        setVisible(true);
    }
}
