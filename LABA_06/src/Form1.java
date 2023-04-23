import javax.swing.*;
import java.awt.*;
import MainPackage.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Form1 extends JFrame {

	public static JFrame mainWindow;
	public static JButton addButton;
	public static JButton updateButton;
	public static JButton deleteButton;
	public static JButton getCollection;
	public static JTextArea textArea;
	public static ClassRepository repository;
	public static Sneakers sneakers;
	public static int index;

	public static void main(String[] args) {
		repository = new ClassRepository();
		
		sneakers = new Sneakers("1","1",1.0f,"1","1");
		mainWindow = new JFrame();
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
		mainWindow.setSize(800,640);
		mainWindow.getContentPane().setLayout(null); // что бы элементы не расстягивались
		
		addButton = new JButton("Добавить");
		addButton.setSize(150,50);
		addButton.setLocation(20,20);
		ActionListener addListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddWindow addWindow = new AddWindow(repository);
			}
		};
		addButton.addActionListener(addListener);
		

		updateButton = new JButton("Обновить");
		updateButton.setSize(150,50);
		updateButton.setLocation(20,90);
		ActionListener updateListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UpdateWindow updateWindow = new UpdateWindow(repository);
			}
		};
		updateButton.addActionListener(updateListener);
		
		
		deleteButton = new JButton("Удалить");
		deleteButton.setSize(150,50);
		deleteButton.setLocation(20,160);
		ActionListener deleteListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DeleteWindow updateWindow = new DeleteWindow(repository,index);
			}
		};
		deleteButton.addActionListener(deleteListener);
		
		
		getCollection = new JButton("Получить");
		getCollection.setSize(150,50);
		getCollection.setLocation(20,230);
		ActionListener getListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateSneakersList();	
			}
		};
		getCollection.addActionListener(getListener);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setSize(550, 500);
		textArea.setLocation(190, 20);
		textArea.setEditable(false);
		textArea.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		mainWindow.add(textArea);
		mainWindow.add(addButton);
		mainWindow.add(updateButton);
		mainWindow.add(deleteButton);
		mainWindow.add(getCollection);
		
	}

	public static void updateSneakersList() {
	
		ArrayList<Sneakers> sneakersList = repository.getSneakersCollection();
		
		StringBuilder sb = new StringBuilder();
		for (Sneakers sneakers : sneakersList) {
		    sb.append(String.format("%s, %s, %s, %s, %s\n",
		        sneakers.getType(),	 sneakers.getName(), sneakers.getCost(), sneakers.get_name(), sneakers.get_country()));
		}
		Form1.textArea.setText(sb.toString());


    }
	
	public Form1() {
		}

	
}


