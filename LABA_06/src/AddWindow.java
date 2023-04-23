import javax.swing.*;
import java.awt.*;
import MainPackage.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class AddWindow extends JFrame {
    private ClassRepository repository;
    private JLabel typeLabel, nameLabel, costLabel, name_Label, countryLabel;
    private JTextField typeField, nameField, nameField_, countryField,costField;
    
    private JButton addButton;

    public AddWindow(ClassRepository classRepository) {
        repository = classRepository;
        setTitle("Добавление элемента");
        setSize(400, 300);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        typeLabel = new JLabel("Type:");
        typeLabel.setBounds(10, 20, 80, 25);
        panel.add(typeLabel);

        typeField = new JTextField(20);
        typeField.setBounds(100, 20, 200, 25);
        panel.add(typeField);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 50, 80, 25);
        panel.add(nameLabel);

        nameField = new JTextField(20);
        nameField.setBounds(100, 50, 200, 25);
        panel.add(nameField);

        costLabel = new JLabel("Cost:");
        costLabel.setBounds(10, 80, 80, 25);
        panel.add(costLabel);

       
        costField = new JTextField(20);
        costField.setBounds(100, 80, 200, 25);
        panel.add(costField);

        name_Label = new JLabel("Производитель:");
        name_Label.setBounds(10, 110, 80, 25);
        panel.add(name_Label);

        nameField_ = new JTextField(20);
        nameField_.setBounds(100, 110, 200, 25);
        panel.add(nameField_);

        countryLabel = new JLabel("Country:");
        countryLabel.setBounds(10, 140, 80, 25);
        panel.add(countryLabel);

        countryField = new JTextField(20);
        countryField.setBounds(100, 140, 200, 25);
        panel.add(countryField);

        addButton = new JButton("Добавить");
        addButton.setBounds(150, 200, 100, 25);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type = typeField.getText();
                String name = nameField.getText();
                Float cost = Float.parseFloat(costField.getText());
                String proizvoditel = nameField_.getText();
                String country = countryField.getText();
                Sneakers newSneakers = new Sneakers(type, name, (Float)cost, proizvoditel, country);
                repository.AddNewKrosovki(new Sneakers(type,name,(Float)cost,proizvoditel,country));
                Form1.textArea.setText("Добавлен элемент: " + type + ", " + name + ", " + cost + ", " + proizvoditel + ", " + country);
                setVisible(false);
                
            }
        });
        panel.add(addButton);

        add(panel);
        setVisible(true);
    }
}
