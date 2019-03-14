package devoir;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Fahrenheit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblFahrenheit;

	/**
	 * Create the frame.
	 */
	public Fahrenheit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 130);
		setTitle("Celsius to Fahrenheit");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius");
		panel.add(lblCelsius);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isEmpty() && textField.getText().matches("[0-9]*")) {
					lblFahrenheit.setText(new Calfahrenheit().Convert(Integer.parseInt(textField .getText())) +" Fahrenheit");
					
				} else {
					lblFahrenheit.setText("You haven't input the Celsius");
				}
			}
		});
		panel_1.add(btnNewButton);
		
		lblFahrenheit = new JLabel("Fahrenheit");
		panel_1.add(lblFahrenheit);
		lblFahrenheit.setHorizontalAlignment(SwingConstants.LEFT);
		lblFahrenheit.setDisplayedMnemonic(KeyEvent.VK_AGAIN);

		
	}

}
