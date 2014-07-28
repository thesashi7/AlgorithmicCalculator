package AlgoCalc;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class AlgoCalc extends JFrame {

	// MenuBar:
	private JMenuBar menuBar;
	
	// Menus:
	private JMenu menuSearch;
	private JMenu menuSort;
	
	// MenuItems:
	private JMenuItem binaryMenuItem;
	private JMenuItem sequentialMenuItem;
	private JMenuItem quickMenuItem;
	
	// Panels
	private JPanel mainPanel; // panel for the rest of content
	private JPanel menuPanel; // panel for menu
	
	// Labels:
	JLabel l1;
	JLabel l2; 

	AlgoCalc() {
		// Instantiate panels:
		mainPanel = new JPanel(new BorderLayout());
		menuPanel = new JPanel(new BorderLayout());
		
		// Instantiate menu items:
		binaryMenuItem = new JMenuItem("Binary");
		sequentialMenuItem = new JMenuItem("Sequential");
		quickMenuItem = new JMenuItem("Quick");
		
		// Instantiate action listeners:
		ActionListener binaryAction = new BinarySearch();
		
		// Add listeners to menu items:
		binaryMenuItem.addActionListener(binaryAction);
		
		// Instantiate menus:
		menuSearch = new JMenu("Search");
		menuSearch.add(binaryMenuItem);
		menuSearch.add(sequentialMenuItem);
		menuSort = new JMenu("Sort");
		menuSort.add(quickMenuItem);
		
		// Instantiate menu bar:
		menuBar = new JMenuBar();
		menuBar.add(menuSearch);
		menuBar.add(menuSort);
		
		// Add panels & menu bar:
		menuPanel.add(menuBar, BorderLayout.NORTH);
		add(menuPanel, BorderLayout.NORTH);
		add(mainPanel, BorderLayout.SOUTH);
	}

	// Action for ... search
	public class BinarySearch implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.println("clicked (just testing)");
			
			// Test code to see if InsertionSort works
			int[] arr = {5,8,3,44,23,89,3,3,3};
			InsertionSort insertion = new InsertionSort(arr);
			arr = insertion.sort();
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		AlgoCalc frame = new AlgoCalc();
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
}
