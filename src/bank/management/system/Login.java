package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {

	JLabel l1, l2, l3;
	JTextField tf1;
	JPasswordField pf2;
	JButton signinBtn, clearBtn, signupBtn;

	public Login() {

		setTitle("Automaic Teller Machine".toUpperCase());

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);
		add(label);

		l1 = new JLabel("WELCOME TO ATM");
		l1.setFont(new Font("Osward", Font.BOLD, 38));
		l1.setBounds(200, 40, 450, 40);
		add(l1);

		l2 = new JLabel("Card No:");
		l2.setFont(new Font("Raleway", Font.BOLD, 28));
		l2.setBounds(125, 150, 375, 30);
		add(l2);

		tf1 = new JTextField(15);
		tf1.setBounds(300, 150, 230, 30);
		tf1.setFont(new Font("Arial", Font.BOLD, 14));
		add(tf1);

		l3 = new JLabel("PIN:");
		l3.setFont(new Font("Raleway", Font.BOLD, 28));
		l3.setBounds(125, 220, 375, 30);
		add(l3);

		pf2 = new JPasswordField(15);
		pf2.setFont(new Font("Arial", Font.BOLD, 14));
		pf2.setBounds(300, 220, 230, 30);
		add(pf2);

		signinBtn = new JButton("SIGN IN");
		signinBtn.setBackground(Color.BLACK);
		signinBtn.setForeground(Color.WHITE);

		clearBtn = new JButton("CLEAR");
		clearBtn.setBackground(Color.BLACK);
		clearBtn.setForeground(Color.WHITE);

		signupBtn = new JButton("SIGN UP");
		signupBtn.setBackground(Color.BLACK);
		signupBtn.setForeground(Color.WHITE);

		setLayout(null);

		signinBtn.setFont(new Font("Arial", Font.BOLD, 14));
		signinBtn.setBounds(300, 300, 100, 30);
		add(signinBtn);

		clearBtn.setFont(new Font("Arial", Font.BOLD, 14));
		clearBtn.setBounds(430, 300, 100, 30);
		add(clearBtn);

		signupBtn.setFont(new Font("Arial", Font.BOLD, 14));
		signupBtn.setBounds(300, 350, 230, 30);
		add(signupBtn);

		signinBtn.addActionListener(this);
		clearBtn.addActionListener(this);
		signupBtn.addActionListener(this);

		getContentPane().setBackground(Color.WHITE);

		setSize(800, 480);
		setLocation(550, 200);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Login().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == clearBtn) {
			tf1.setText("");
			pf2.setText("");
		} else if (ae.getSource() == signupBtn) {
			setVisible(false);
			new Signup().setVisible(true);
		} else {
			System.exit(0);
		}
	}

}
