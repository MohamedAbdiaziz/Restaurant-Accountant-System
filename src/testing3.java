/*
 * @author:Mohamed Abdiaziz
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseWheelListener;
import java.io.FileWriter;
import java.awt.event.MouseWheelEvent;
import java.awt.FlowLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.Toolkit;

public class testing3 {
	/*images variables */
	String images = "\\image\\logo1.png";

	private JFrame frame;
	private final JPanel panel = new JPanel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testing3 window = new testing3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testing3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(testing3.class.getResource("/image/logo1.png")));
		frame.setBounds(100, 100, 850, 601);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 834, 123);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		frame.setLocationRelativeTo(frame);
		frame.setTitle("wowFood Restaurant");

		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(testing3.class.getResource("/image/logo.png")));
		lblNewLabel_5.setBounds(502, 39, 75, 84);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(testing3.class.getResource("/image/Chicken meat.png")));
		lblNewLabel.setBounds(173, 6, 200, 141);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_4 = new JLabel("wowFood");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Raleway", Font.BOLD, 40));
		lblNewLabel_4.setBounds(502, 17, 243, 45);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_4_1 = new JLabel("RESTAURANT");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Raleway", Font.BOLD, 13));
		lblNewLabel_4_1.setBounds(658, 57, 170, 29);
		panel.add(lblNewLabel_4_1);

		JLabel beef_buger_1 = new JLabel("");
		beef_buger_1.setIcon(new ImageIcon(testing3.class.getResource("/image/chips_buger.jpg")));
		beef_buger_1.setBounds(-224, 0, 487, 123);
		panel.add(beef_buger_1);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(16, 156, 798, 206);
		frame.getContentPane().add(tabbedPane);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Buger and chips ", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel fish_buger = new JLabel("");

		fish_buger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = "Fish buger";
				DefaultTableModel model = new DefaultTableModel();
				String desc = "Fish and buger";

				double price = 1;
				String s_dollar = "$" + price;
				try {
					int qt = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Quantity"));
					if(qt>0) {
						double total = price * qt;
						String S_total = "$" + total;
						SimpleDateFormat timeformate;
						String time;
						timeformate = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
	
						time = timeformate.format(Calendar.getInstance().getTime());
						model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] {desc, name, s_dollar, qt, S_total, time });
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Sorry\nQuantity must be greater than 0 :(");
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Only can accept wholenumbers not decimal or else :(");

				}
			}
		});
		fish_buger.setIcon(new ImageIcon(testing3.class.getResource("/image/Fish_burger.jpg")));
		fish_buger.setBounds(37, 6, 124, 120);
		panel_1.add(fish_buger);

		JLabel beef_buger = new JLabel("");
		beef_buger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				String name = "Beef buger";
				String desc = "Beef and buger";
				double price = 1.5;
				String s_dollar = "$" + price;
				try {
					int qt = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Quantity"));
					if(qt>0) {
						double total = price * qt;
						String S_total = "$" + total;
						SimpleDateFormat timeformate;
						String time;
						timeformate = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
	
						time = timeformate.format(Calendar.getInstance().getTime());
						model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] {desc, name, s_dollar, qt, S_total, time });
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Sorry\nQuantity must be greater than 0 :(");
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Only can accept wholenumbers not decimal or else :(");

				}
			}
		});
		beef_buger.setIcon(new ImageIcon(testing3.class.getResource("/image/Beef_burger.jpg")));
		beef_buger.setBounds(172, 6, 124, 120);
		panel_1.add(beef_buger);

		JLabel Chicken_buger = new JLabel("");
		Chicken_buger.setIcon(new ImageIcon(testing3.class.getResource("/image/pexels-chicken-mackay-2.jpg")));
		Chicken_buger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				String name = "Chicken burger";
				String desc = "buger within chicken";
				double price = 1.3;
				String s_dollar = "$" + price;
				try {
					int qt = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Quantity"));
					if(qt>0) {
						double total = price * qt;
						String S_total = "$" + total;
						SimpleDateFormat timeformate;
						String time;
						timeformate = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
	
						time = timeformate.format(Calendar.getInstance().getTime());
						model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] {desc, name, s_dollar, qt, S_total, time });
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Only can accept wholenumbers not decimal or else :(");

				}
			}
		});
		Chicken_buger.setBounds(309, 6, 244, 120);
		panel_1.add(Chicken_buger);

		JLabel chips_buger = new JLabel("");
		chips_buger.setIcon(new ImageIcon(testing3.class.getResource("/image/chips_buger1.jpg")));
		chips_buger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				String name = "Chips burger";
				String desc = "Buger within meat,tomato, and with chips";
				double price = 2;
				String s_dollar = "$" + price;
				try {
					int qt = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Quantity"));
					if(qt>0) {
						double total = price * qt;
						String S_total = "$" + total;
						SimpleDateFormat timeformate;
						String time;
						timeformate = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
	
						time = timeformate.format(Calendar.getInstance().getTime());
						model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] {desc, name, s_dollar, qt, S_total, time });
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Sorry\nQuantity must be greater than 0 :(");
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Only can accept wholenumbers not decimal or else :(");

				}
			}
		});
		chips_buger.setBounds(565, 6, 219, 120);
		panel_1.add(chips_buger);

		JLabel lblNewLabel_7 = new JLabel("$1");
		lblNewLabel_7.setBounds(72, 138, 55, 16);
		panel_1.add(lblNewLabel_7);

		JLabel lblNewLabel_7_1 = new JLabel("$1.5");
		lblNewLabel_7_1.setBounds(207, 138, 55, 16);
		panel_1.add(lblNewLabel_7_1);

		JLabel lblNewLabel_7_1_1 = new JLabel("$1.3");
		lblNewLabel_7_1_1.setBounds(407, 138, 55, 16);
		panel_1.add(lblNewLabel_7_1_1);

		JLabel lblNewLabel_7_1_1_1 = new JLabel("$2");
		lblNewLabel_7_1_1_1.setBounds(609, 138, 55, 16);
		panel_1.add(lblNewLabel_7_1_1_1);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Meat", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel Chicken_meat = new JLabel("");
		Chicken_meat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				String name = "Chicken meat";
				String desc = "Chicken with green vegetable";
				double price = 3;
				String s_dollar = "$" + price;
				try {
					int qt = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Quantity"));
					if(qt>0) {
						double total = price * qt;
						String S_total = "$" + total;
						SimpleDateFormat timeformate;
						String time;
						timeformate = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
	
						time = timeformate.format(Calendar.getInstance().getTime());
						model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] {desc, name, s_dollar, qt, S_total, time });
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Sorry\nQuantity must be greater than 0 :(");
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Only can accept wholenumbers not decimal or else :(");

				}
			}
		});
		Chicken_meat.setIcon(new ImageIcon(testing3.class.getResource("/image/Chicken meat.png")));
		Chicken_meat.setBounds(21, 6, 200, 141);
		panel_2.add(Chicken_meat);

		JLabel Goat_meat = new JLabel("");
		Goat_meat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				String name = "Goat meat";
				double price = 3;
				String s_dollar = "$" + price;
				try {
					int qt = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Quantity"));
					if(qt>0) {
						double total = price * qt;
						String S_total = "$" + total;
						SimpleDateFormat timeformate;
						String time;
						String desc = "Goat meat with rice";
						timeformate = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");

						time = timeformate.format(Calendar.getInstance().getTime());
						model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] {desc, name, s_dollar, qt, S_total, time });
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Sorry\nQuantity must be greater than 0 :(");
					}
					
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Only can accept wholenumbers not decimal or else :(");

				}
				
			}
		});
		Goat_meat.setIcon(new ImageIcon(testing3.class.getResource("/image/Goat_meat_with_rice_2.jpg")));
		Goat_meat.setBounds(263, 13, 124, 127);
		panel_2.add(Goat_meat);

		JLabel Beef_meat = new JLabel("");
		Beef_meat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				String name = "Beef meat";
				String desc = "Beef meat only";
				double price = 3;
				String s_dollar = "$" + price;
				try {
					int qt = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Quantity"));
					if(qt>0) {
						double total = price * qt;
						String S_total = "$" + total;
						SimpleDateFormat timeformate;
						String time;
						timeformate = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
	
						time = timeformate.format(Calendar.getInstance().getTime());
						model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] {desc, name, s_dollar, qt, S_total, time });
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Sorry\nQuantity must be greater than 0 :(");
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Only can accept wholenumbers not decimal or else :(");

				}
			}
		});
		Beef_meat.setIcon(new ImageIcon(testing3.class.getResource("/image/barbecue-beef-1.png")));
		Beef_meat.setBounds(476, 6, 200, 141);
		panel_2.add(Beef_meat);

		JLabel lblNewLabel_7_2 = new JLabel("$3");
		lblNewLabel_7_2.setBounds(94, 143, 55, 16);
		panel_2.add(lblNewLabel_7_2);

		JLabel lblNewLabel_7_2_1 = new JLabel("$3");
		lblNewLabel_7_2_1.setBounds(289, 143, 55, 16);
		panel_2.add(lblNewLabel_7_2_1);

		JLabel lblNewLabel_7_2_1_1 = new JLabel("$3");
		lblNewLabel_7_2_1_1.setBounds(521, 143, 55, 16);
		panel_2.add(lblNewLabel_7_2_1_1);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Pizza", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel Pepperoni = new JLabel("");
		Pepperoni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				String name = "Pepperoni Pizza";
				String desc = "Made of seasoned beef and goat meat sausage";
				double price = 2.5;
				String s_dollar = "$" + price;
				try {
					int qt = Integer.parseInt(JOptionPane.showInputDialog("Please Enter The Quantity"));
					if(qt>0) {
						double total = price * qt;
						String S_total = "$" + total;
						SimpleDateFormat timeformate;
						String time;
						timeformate = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
	
						time = timeformate.format(Calendar.getInstance().getTime());
						model = (DefaultTableModel) table.getModel();
						model.addRow(new Object[] {desc, name, s_dollar, qt, S_total, time });
					}
					else {
						JOptionPane.showInternalMessageDialog(null, "Sorry\nQuantity must be greater than 0 :(");
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, "Only can accept wholenumbers not decimal or else :(");

				}
				
			}
		});
		Pepperoni.setIcon(new ImageIcon(testing3.class.getResource("/image/Pepperoni-seasoned-beef-and-pork-sausage.jpg")));
		Pepperoni.setBounds(24, 6, 200, 141);
		panel_3.add(Pepperoni);
		
		JLabel Pizza2 = new JLabel("");
		Pizza2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showInternalMessageDialog(null, "Sorry, This Product isn't avaliable NOW!!");
			}
		});
		Pizza2.setIcon(new ImageIcon(testing3.class.getResource("/image/pizza2.png")));
		Pizza2.setBounds(287, 6, 200, 141);
		panel_3.add(Pizza2);
		
		JLabel pizza3 = new JLabel("");
		pizza3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showInternalMessageDialog(null, "Sorry, This Product isn't avaliable NOW!!");
			}
		});
		pizza3.setIcon(new ImageIcon(testing3.class.getResource("/image/pizza3.png")));
		pizza3.setBounds(554, 6, 200, 141);
		panel_3.add(pizza3);
		
		JLabel lblNewLabel_1 = new JLabel("2.5");
		lblNewLabel_1.setBounds(97, 154, 55, 16);
		panel_3.add(lblNewLabel_1);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(16, 374, 798, 167);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		panel_4.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setAutoscrolls(true);
		table.addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {

				Rectangle r = new Rectangle(e.getX(), e.getY(), 1, 1);
				((JTable) e.getSource()).scrollRectToVisible(r);

			}
		});
		table.getAutoscrolls();
		table.setFont(new Font("SansSerif", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Description", "Item name", "Price", "Quantity", "Total", "Date"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(276);
		table.getColumnModel().getColumn(1).setPreferredWidth(91);
		table.getColumnModel().getColumn(2).setPreferredWidth(54);
		table.getColumnModel().getColumn(3).setPreferredWidth(61);
		table.getColumnModel().getColumn(4).setPreferredWidth(86);
		table.getColumnModel().getColumn(5).setPreferredWidth(227);
		// table.setPreferredScrollableViewportSize(new Dimension(450, 63));
		// table.setFillsViewportHeight(true);
		// JScrollPane js = new JScrollPane(table);
		// js.setVisible(true);
		// table.add(js);

		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6
				.setIcon(new ImageIcon(testing3.class.getResource("/image/stir-fried-macaroni-with-tomato-sauce-pork.jpg")));
		lblNewLabel_6.setBounds(0, 122, 834, 440);
		frame.getContentPane().add(lblNewLabel_6);
		frame.setResizable(false);
		
		
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
