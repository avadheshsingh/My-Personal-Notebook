import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.MouseMotionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/*
 * Register.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class Register extends javax.swing.JFrame {

	/** Creates new form Register */
	public Register() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jButton8 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jInternalFrame1 = new javax.swing.JInternalFrame();
		jPanel5 = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new java.awt.CardLayout());

		jPanel1.setBackground(new java.awt.Color(51, 51, 0));
		jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(45, 60,
				45, 60, new javax.swing.ImageIcon(getClass().getResource(
						"/imgs/flower.gif")))); // NOI18N
		jPanel1.setLayout(new java.awt.GridLayout(1, 2, 20, 20));

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));
		jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1,
				1));

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imgs/fbconnect.png"))); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imgs/twitter.png"))); // NOI18N
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imgs/linked.png"))); // NOI18N
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/imgs/google.png"))); // NOI18N
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jLabel2.setFont(new java.awt.Font("Monotype Corsiva", 1, 28));
		jLabel2.setForeground(new java.awt.Color(255, 51, 51));
		jLabel2.setText("JUST SHARE UR IDEAS TO ME...!!");

		jLabel4.setBackground(new java.awt.Color(204, 0, 51));
		jLabel4.setFont(new java.awt.Font("Georgia", 1, 24));
		jLabel4.setText("Let's Lock Your Deeds..!!");

		jButton8.setText("Change Account details");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout.createSequentialGroup().addGap(
										156, 156, 156).addComponent(jLabel4)
										.addContainerGap(124, Short.MAX_VALUE))
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jButton4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												52,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																516,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				49,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												387,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addContainerGap())
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton6,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												46,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jButton7,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												37,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												170,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton8)
																										.addGap(
																												41,
																												41,
																												41)))))));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addGap(19, 19, 19)
										.addComponent(
												jLabel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												46,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												399,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												44, Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel2Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				41,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				44,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				44,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jButton7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																32,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		jPanel1.add(jPanel2);

		jPanel3.setLayout(new java.awt.BorderLayout());

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));

		jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton2.setText("Register");
		jButton2.setEnabled(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton3.setText("Submit");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel4Layout
										.createSequentialGroup()
										.addGap(35, 35, 35)
										.addComponent(jButton3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												327, Short.MAX_VALUE)
										.addComponent(jButton2).addGap(75, 75,
												75)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel4Layout.createSequentialGroup().addContainerGap(41,
						Short.MAX_VALUE).addGroup(
						jPanel4Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton2).addComponent(jButton3))
						.addContainerGap()));

		jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

		jInternalFrame1.setBackground(new java.awt.Color(255, 255, 255));
		jInternalFrame1.setBorder(javax.swing.BorderFactory.createEmptyBorder(
				1, 1, 1, 1));
		jInternalFrame1.setVisible(true);
		jInternalFrame1.getContentPane().setLayout(new java.awt.FlowLayout());

		jPanel5.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 572,
				Short.MAX_VALUE));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 491,
				Short.MAX_VALUE));

		jInternalFrame1.getContentPane().add(jPanel5);

		jPanel3.add(jInternalFrame1, java.awt.BorderLayout.PAGE_START);

		jPanel1.add(jPanel3);

		getContentPane().add(jPanel1, "card2");

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Desktop.getDesktop().browse(
					new URL("http://www.facebook.com.com").toURI());
		} catch (Exception e) {
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Desktop.getDesktop().browse(
					new URL("http://www.linkedin.com").toURI());
		} catch (Exception e) {
		}
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Desktop.getDesktop().browse(
					new URL("http://www.google.com").toURI());
		} catch (Exception e) {
		}

	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		String s = "", s2 = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"C://Users//Public//notebook//" + "password.txt"));

			while ((s2 = br.readLine()) != null) {
				s = s2;
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		String option = JOptionPane
				.showInputDialog(null, "Enter your Password");
		if (s.equals(option)) {
			jButton2.setEnabled(true);
			jPanel5.setVisible(false);
			jInternalFrame1.revalidate();
			jInternalFrame1.repaint();
			jInternalFrame1.remove(login);
			jInternalFrame1.add(onetimereg);

		} else {
			JOptionPane.showMessageDialog(null,
					"oops...!! Please Enter Correct Password");
		}
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Desktop.getDesktop().browse(
					new URL("http://www.twitter.com").toURI());
		} catch (Exception e) {
		}
	}

	static Register r;

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

		boolean b = login.checkpassword();
		if (b) {
			notebook notebook = new notebook();
			notebook.readfile();
			notebook.setVisible(true);
			r.setVisible(false);
		}

	}

	OneTimeRegistration onetimereg = new OneTimeRegistration();;
	Login login = new Login();

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		int k=onetimereg.fillDetails();
		if(k==1){
			
		jPanel5.setVisible(false);
		jInternalFrame1.revalidate();
		jInternalFrame1.repaint();
		jInternalFrame1.remove(onetimereg);
		jInternalFrame1.add(login);
		login.setname();
	}
		//on.setLayout(new FlowLayout());

	}

	public void login() {

		jPanel5.setVisible(false);
		jInternalFrame1.revalidate();
		jInternalFrame1.repaint();
		jInternalFrame1.remove(onetimereg);
		jInternalFrame1.add(login);

	}

	final Thread t = new Thread() {
		@Override
		public void run() {
			int kkk=1;
			while (kkk<100) {
				ImageIcon i1 = new ImageIcon(getClass().getResource(
						"/imgs/new2.png"));
				jLabel1.setIcon(i1);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}

				ImageIcon i2 = new ImageIcon(getClass().getResource(
						"/imgs/headphone.png"));
				jLabel1.setIcon(i2);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i3 = new ImageIcon(getClass().getResource(
						"/imgs/new.png"));
				jLabel1.setIcon(i3);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i4 = new ImageIcon(getClass().getResource(
						"/imgs/diary.png"));
				jLabel1.setIcon(i4);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}

				ImageIcon i5 = new ImageIcon(getClass().getResource(
						"/imgs/Pictures.png"));
				jLabel1.setIcon(i5);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i6 = new ImageIcon(getClass().getResource(
						"/imgs/Bench.png"));
				jLabel1.setIcon(i6);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i7 = new ImageIcon(getClass().getResource(
						"/imgs/c2.png"));
				jLabel1.setIcon(i7);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i8 = new ImageIcon(getClass().getResource(
						"/imgs/Sobhag.jpg"));
				jLabel1.setIcon(i8);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i9 = new ImageIcon(getClass().getResource(
						"/imgs/Map.png"));
				jLabel1.setIcon(i9);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i10 = new ImageIcon(getClass().getResource(
						"/imgs/vector_diary.jpg"));
				jLabel1.setIcon(i10);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i11 = new ImageIcon(getClass().getResource(
				"/imgs/icon_Wheel.png"));
		        jLabel1.setIcon(i11);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i12 = new ImageIcon(getClass().getResource(
				"/imgs/icon_sandclock.png"));
				jLabel1.setIcon(i12);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i13 = new ImageIcon(getClass().getResource(
				"/imgs/icon_Scroll.png"));
				jLabel1.setIcon(i13);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i14 = new ImageIcon(getClass().getResource(
				"/imgs/icon_Telephone.png"));
				jLabel1.setIcon(i14);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
				ImageIcon i15 = new ImageIcon(getClass().getResource(
				"/imgs/icon_Skull.png"));
				jLabel1.setIcon(i15);
				try {
					Thread.sleep(1500);
				} catch (Exception e) {
				}
         kkk++;
			}

		}
	};

	public void immovable() {

		BasicInternalFrameUI ui = (BasicInternalFrameUI) jInternalFrame1
				.getUI();

		Component north = ui.getNorthPane();
		MouseMotionListener[] actions = north
				.getListeners(MouseMotionListener.class);

		for (int i = 0; i < actions.length; i++)
			north.removeMouseMotionListener(actions[i]);
	}

	public void set() {
		jPanel5.setVisible(false);
		jInternalFrame1.revalidate();
		jInternalFrame1.repaint();
		jInternalFrame1.remove(onetimereg);
		jInternalFrame1.add(login);
		login.show();
		
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				r = new Register();
				r.setVisible(true);
				r.immovable();
				r.set();
				r.t.start();
				
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JInternalFrame jInternalFrame1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	// End of variables declaration//GEN-END:variables

}