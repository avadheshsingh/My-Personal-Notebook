import java.awt.CardLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/*
 * notebook.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class notebook extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form notebook */
	public notebook() {
		initComponents();
	}

	CardLayout card = new java.awt.CardLayout();

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jToolBar1 = new javax.swing.JToolBar();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton22 = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JToolBar.Separator();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jButton23 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jButton24 = new javax.swing.JButton();
		jButton25 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jTabbedPane3 = new javax.swing.JTabbedPane();
		jScrollPane6 = new javax.swing.JScrollPane();
		jTextArea6 = new javax.swing.JTextArea();
		jScrollPane7 = new javax.swing.JScrollPane();
		jTextArea7 = new javax.swing.JTextArea();
		jScrollPane8 = new javax.swing.JScrollPane();
		jTextArea8 = new javax.swing.JTextArea();
		jScrollPane9 = new javax.swing.JScrollPane();
		jTextArea9 = new javax.swing.JTextArea();
		jScrollPane10 = new javax.swing.JScrollPane();
		jTextArea10 = new javax.swing.JTextArea();
		jTabbedPane4 = new javax.swing.JTabbedPane();
		jScrollPane11 = new javax.swing.JScrollPane();
		jTextArea11 = new javax.swing.JTextArea();
		jScrollPane12 = new javax.swing.JScrollPane();
		jTextArea12 = new javax.swing.JTextArea();
		jScrollPane13 = new javax.swing.JScrollPane();
		jTextArea13 = new javax.swing.JTextArea();
		jScrollPane14 = new javax.swing.JScrollPane();
		jTextArea14 = new javax.swing.JTextArea();
		jScrollPane15 = new javax.swing.JScrollPane();
		jTextArea15 = new javax.swing.JTextArea();
		jTabbedPane5 = new javax.swing.JTabbedPane();
		jScrollPane16 = new javax.swing.JScrollPane();
		jTextArea16 = new javax.swing.JTextArea();
		jScrollPane17 = new javax.swing.JScrollPane();
		jTextArea17 = new javax.swing.JTextArea();
		jScrollPane18 = new javax.swing.JScrollPane();
		jTextArea18 = new javax.swing.JTextArea();
		jScrollPane19 = new javax.swing.JScrollPane();
		jTextArea19 = new javax.swing.JTextArea();
		jScrollPane20 = new javax.swing.JScrollPane();
		jTextArea20 = new javax.swing.JTextArea();
		jTabbedPane6 = new javax.swing.JTabbedPane();
		jScrollPane21 = new javax.swing.JScrollPane();
		jTextArea21 = new javax.swing.JTextArea();
		jScrollPane22 = new javax.swing.JScrollPane();
		jTextArea22 = new javax.swing.JTextArea();
		jScrollPane23 = new javax.swing.JScrollPane();
		jTextArea23 = new javax.swing.JTextArea();
		jScrollPane24 = new javax.swing.JScrollPane();
		jTextArea24 = new javax.swing.JTextArea();
		jScrollPane25 = new javax.swing.JScrollPane();
		jTextArea25 = new javax.swing.JTextArea();
		jTabbedPane7 = new javax.swing.JTabbedPane();
		jScrollPane26 = new javax.swing.JScrollPane();
		jTextArea26 = new javax.swing.JTextArea();
		jScrollPane27 = new javax.swing.JScrollPane();
		jTextArea27 = new javax.swing.JTextArea();
		jScrollPane28 = new javax.swing.JScrollPane();
		jTextArea28 = new javax.swing.JTextArea();
		jScrollPane29 = new javax.swing.JScrollPane();
		jTextArea29 = new javax.swing.JTextArea();
		jScrollPane30 = new javax.swing.JScrollPane();
		jTextArea30 = new javax.swing.JTextArea();
		jTabbedPane8 = new javax.swing.JTabbedPane();
		jScrollPane31 = new javax.swing.JScrollPane();
		jTextArea31 = new javax.swing.JTextArea();
		jScrollPane32 = new javax.swing.JScrollPane();
		jTextArea32 = new javax.swing.JTextArea();
		jScrollPane33 = new javax.swing.JScrollPane();
		jTextArea33 = new javax.swing.JTextArea();
		jScrollPane34 = new javax.swing.JScrollPane();
		jTextArea34 = new javax.swing.JTextArea();
		jScrollPane35 = new javax.swing.JScrollPane();
		jTextArea35 = new javax.swing.JTextArea();
		jTabbedPane9 = new javax.swing.JTabbedPane();
		jScrollPane36 = new javax.swing.JScrollPane();
		jTextArea36 = new javax.swing.JTextArea();
		jScrollPane37 = new javax.swing.JScrollPane();
		jTextArea37 = new javax.swing.JTextArea();
		jScrollPane38 = new javax.swing.JScrollPane();
		jTextArea38 = new javax.swing.JTextArea();
		jScrollPane39 = new javax.swing.JScrollPane();
		jTextArea39 = new javax.swing.JTextArea();
		jScrollPane40 = new javax.swing.JScrollPane();
		jTextArea40 = new javax.swing.JTextArea();
		jTabbedPane10 = new javax.swing.JTabbedPane();
		jScrollPane41 = new javax.swing.JScrollPane();
		jTextArea41 = new javax.swing.JTextArea();
		jScrollPane42 = new javax.swing.JScrollPane();
		jTextArea42 = new javax.swing.JTextArea();
		jScrollPane43 = new javax.swing.JScrollPane();
		jTextArea43 = new javax.swing.JTextArea();
		jScrollPane44 = new javax.swing.JScrollPane();
		jTextArea44 = new javax.swing.JTextArea();
		jScrollPane45 = new javax.swing.JScrollPane();
		jTextArea45 = new javax.swing.JTextArea();
		jTabbedPane11 = new javax.swing.JTabbedPane();
		jScrollPane46 = new javax.swing.JScrollPane();
		jTextArea46 = new javax.swing.JTextArea();
		jScrollPane47 = new javax.swing.JScrollPane();
		jTextArea47 = new javax.swing.JTextArea();
		jScrollPane48 = new javax.swing.JScrollPane();
		jTextArea48 = new javax.swing.JTextArea();
		jScrollPane49 = new javax.swing.JScrollPane();
		jTextArea49 = new javax.swing.JTextArea();
		jScrollPane50 = new javax.swing.JScrollPane();
		jTextArea50 = new javax.swing.JTextArea();
		jTabbedPane12 = new javax.swing.JTabbedPane();
		jScrollPane51 = new javax.swing.JScrollPane();
		jTextArea51 = new javax.swing.JTextArea();
		jScrollPane52 = new javax.swing.JScrollPane();
		jTextArea52 = new javax.swing.JTextArea();
		jScrollPane53 = new javax.swing.JScrollPane();
		jTextArea53 = new javax.swing.JTextArea();
		jScrollPane54 = new javax.swing.JScrollPane();
		jTextArea54 = new javax.swing.JTextArea();
		jScrollPane55 = new javax.swing.JScrollPane();
		jTextArea55 = new javax.swing.JTextArea();
		jTabbedPane13 = new javax.swing.JTabbedPane();
		jScrollPane56 = new javax.swing.JScrollPane();
		jTextArea56 = new javax.swing.JTextArea();
		jScrollPane57 = new javax.swing.JScrollPane();
		jTextArea57 = new javax.swing.JTextArea();
		jScrollPane58 = new javax.swing.JScrollPane();
		jTextArea58 = new javax.swing.JTextArea();
		jScrollPane59 = new javax.swing.JScrollPane();
		jTextArea59 = new javax.swing.JTextArea();
		jScrollPane60 = new javax.swing.JScrollPane();
		jTextArea60 = new javax.swing.JTextArea();
		jTabbedPane14 = new javax.swing.JTabbedPane();
		jScrollPane61 = new javax.swing.JScrollPane();
		jTextArea61 = new javax.swing.JTextArea();
		jScrollPane62 = new javax.swing.JScrollPane();
		jTextArea62 = new javax.swing.JTextArea();
		jScrollPane63 = new javax.swing.JScrollPane();
		jTextArea63 = new javax.swing.JTextArea();
		jScrollPane64 = new javax.swing.JScrollPane();
		jTextArea64 = new javax.swing.JTextArea();
		jScrollPane65 = new javax.swing.JScrollPane();
		jTextArea65 = new javax.swing.JTextArea();
		jTabbedPane15 = new javax.swing.JTabbedPane();
		jScrollPane66 = new javax.swing.JScrollPane();
		jTextArea66 = new javax.swing.JTextArea();
		jScrollPane67 = new javax.swing.JScrollPane();
		jTextArea67 = new javax.swing.JTextArea();
		jScrollPane68 = new javax.swing.JScrollPane();
		jTextArea68 = new javax.swing.JTextArea();
		jScrollPane69 = new javax.swing.JScrollPane();
		jTextArea69 = new javax.swing.JTextArea();
		jScrollPane70 = new javax.swing.JScrollPane();
		jTextArea70 = new javax.swing.JTextArea();
		jTabbedPane16 = new javax.swing.JTabbedPane();
		jScrollPane71 = new javax.swing.JScrollPane();
		jTextArea71 = new javax.swing.JTextArea();
		jScrollPane72 = new javax.swing.JScrollPane();
		jTextArea72 = new javax.swing.JTextArea();
		jScrollPane73 = new javax.swing.JScrollPane();
		jTextArea73 = new javax.swing.JTextArea();
		jScrollPane74 = new javax.swing.JScrollPane();
		jTextArea74 = new javax.swing.JTextArea();
		jScrollPane75 = new javax.swing.JScrollPane();
		jTextArea75 = new javax.swing.JTextArea();
		jTabbedPane17 = new javax.swing.JTabbedPane();
		jScrollPane76 = new javax.swing.JScrollPane();
		jTextArea76 = new javax.swing.JTextArea();
		jScrollPane77 = new javax.swing.JScrollPane();
		jTextArea77 = new javax.swing.JTextArea();
		jScrollPane78 = new javax.swing.JScrollPane();
		jTextArea78 = new javax.swing.JTextArea();
		jScrollPane79 = new javax.swing.JScrollPane();
		jTextArea79 = new javax.swing.JTextArea();
		jScrollPane80 = new javax.swing.JScrollPane();
		jTextArea80 = new javax.swing.JTextArea();
		jTabbedPane18 = new javax.swing.JTabbedPane();
		jScrollPane81 = new javax.swing.JScrollPane();
		jTextArea81 = new javax.swing.JTextArea();
		jScrollPane82 = new javax.swing.JScrollPane();
		jTextArea82 = new javax.swing.JTextArea();
		jScrollPane83 = new javax.swing.JScrollPane();
		jTextArea83 = new javax.swing.JTextArea();
		jScrollPane84 = new javax.swing.JScrollPane();
		jTextArea84 = new javax.swing.JTextArea();
		jScrollPane85 = new javax.swing.JScrollPane();
		jTextArea85 = new javax.swing.JTextArea();
		jTabbedPane19 = new javax.swing.JTabbedPane();
		jScrollPane86 = new javax.swing.JScrollPane();
		jTextArea86 = new javax.swing.JTextArea();
		jScrollPane87 = new javax.swing.JScrollPane();
		jTextArea87 = new javax.swing.JTextArea();
		jScrollPane88 = new javax.swing.JScrollPane();
		jTextArea88 = new javax.swing.JTextArea();
		jScrollPane89 = new javax.swing.JScrollPane();
		jTextArea89 = new javax.swing.JTextArea();
		jScrollPane90 = new javax.swing.JScrollPane();
		jTextArea90 = new javax.swing.JTextArea();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jScrollPane91 = new javax.swing.JScrollPane();
		jTextArea91 = new javax.swing.JTextArea();
		jScrollPane92 = new javax.swing.JScrollPane();
		jTextArea92 = new javax.swing.JTextArea();
		jScrollPane93 = new javax.swing.JScrollPane();
		jTextArea93 = new javax.swing.JTextArea();
		jScrollPane94 = new javax.swing.JScrollPane();
		jTextArea94 = new javax.swing.JTextArea();
		jScrollPane95 = new javax.swing.JScrollPane();
		jTextArea95 = new javax.swing.JTextArea();
		jTabbedPane20 = new javax.swing.JTabbedPane();
		jScrollPane96 = new javax.swing.JScrollPane();
		jTextArea96 = new javax.swing.JTextArea();
		jScrollPane97 = new javax.swing.JScrollPane();
		jTextArea97 = new javax.swing.JTextArea();
		jScrollPane98 = new javax.swing.JScrollPane();
		jTextArea98 = new javax.swing.JTextArea();
		jScrollPane99 = new javax.swing.JScrollPane();
		jTextArea99 = new javax.swing.JTextArea();
		jScrollPane100 = new javax.swing.JScrollPane();
		jTextArea100 = new javax.swing.JTextArea();
		jTabbedPane21 = new javax.swing.JTabbedPane();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jScrollPane101 = new javax.swing.JScrollPane();
		jTextArea101 = new javax.swing.JTextArea();
		jScrollPane102 = new javax.swing.JScrollPane();
		jTextArea102 = new javax.swing.JTextArea();
		jScrollPane103 = new javax.swing.JScrollPane();
		jTextArea103 = new javax.swing.JTextArea();
		jScrollPane104 = new javax.swing.JScrollPane();
		jTextArea104 = new javax.swing.JTextArea();
		jScrollPane105 = new javax.swing.JScrollPane();
		jTextArea105 = new javax.swing.JTextArea();
		jScrollPane106 = new javax.swing.JScrollPane();
		jTextArea106 = new javax.swing.JTextArea();
		jScrollPane107 = new javax.swing.JScrollPane();
		jTextArea107 = new javax.swing.JTextArea();
		jScrollPane108 = new javax.swing.JScrollPane();
		jTextArea108 = new javax.swing.JTextArea();
		jScrollPane109 = new javax.swing.JScrollPane();
		jTextArea109 = new javax.swing.JTextArea();
		jPanel6 = new javax.swing.JPanel();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextArea3 = new javax.swing.JTextArea();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTextArea4 = new javax.swing.JTextArea();
		jScrollPane5 = new javax.swing.JScrollPane();
		jTextArea5 = new javax.swing.JTextArea();
		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jButton18 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();
		jButton20 = new javax.swing.JButton();
		jButton21 = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenuItem9 = new javax.swing.JMenuItem();
		jMenuItem11 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem10 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Hi Avi..!!! Your Notebook..!!");
		setBackground(new java.awt.Color(204, 204, 0));

		jPanel2.setPreferredSize(new java.awt.Dimension(0, 25));

		jToolBar1.setPreferredSize(new java.awt.Dimension(100, 10));

		jLabel1.setFont(new java.awt.Font("Georgia", 1, 14));
		jLabel1.setText("Title :-");
		jToolBar1.add(jLabel1);

		jTextField1.setFont(new java.awt.Font("Georgia", 0, 12));
		jTextField1.setMinimumSize(new java.awt.Dimension(100, 22));
		jTextField1.setPreferredSize(new java.awt.Dimension(100, 22));
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jToolBar1.add(jTextField1);

		jButton22.setText("Title Name");
		jButton22.setFocusable(false);
		jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton22ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton22);
		jToolBar1.add(jSeparator1);

		jLabel2.setFont(new java.awt.Font("Georgia", 1, 14));
		jLabel2.setText("  SubTitle :-    ");
		jToolBar1.add(jLabel2);

		jTextField2.setFont(new java.awt.Font("Georgia", 0, 12));
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});
		jToolBar1.add(jTextField2);

		jButton23.setText("Tab Name");
		jButton23.setActionCommand("create");
		jButton23.setFocusable(false);
		jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton23.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton23ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton23);

		jLabel4.setFont(new java.awt.Font("Georgia", 1, 14));
		jLabel4.setText("    CurrentTitle :- ");
		jToolBar1.add(jLabel4);

		jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14));
		jLabel3.setText("  Hi Nothing is Open....!!  ");
		jToolBar1.add(jLabel3);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addComponent(jToolBar1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 1316,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addComponent(jToolBar1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 25,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		jPanel3.setPreferredSize(new java.awt.Dimension(100, 40));

		jButton24.setFont(new java.awt.Font("Georgia", 1, 14));
		jButton24.setText("SAVE");
		jButton24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton24ActionPerformed(evt);
			}
		});

		jButton25.setFont(new java.awt.Font("Times New Roman", 1, 12));
		jButton25.setText("HOME");
		jButton25.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton25ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addComponent(
												jButton24,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												94,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												1093, Short.MAX_VALUE)
										.addComponent(jButton25).addGap(21, 21,
												21)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel3Layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jButton24,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE).addComponent(jButton25)));

		jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(30, 60,
				30, 80, new javax.swing.ImageIcon(getClass().getResource(
						"/imgs/new2.png")))); // NOI18N
		jPanel4.setPreferredSize(new java.awt.Dimension(1200, 2000));
		jPanel4.setLayout(card);

		jTextArea6.setColumns(20);
		jTextArea6.setRows(5);
		jScrollPane6.setViewportView(jTextArea6);

		jTabbedPane3.addTab("Write your SubTitle here..", jScrollPane6);

		jTextArea7.setColumns(20);
		jTextArea7.setRows(5);
		jScrollPane7.setViewportView(jTextArea7);

		jTabbedPane3.addTab("Write your SubTitle here..", jScrollPane7);

		jTextArea8.setColumns(20);
		jTextArea8.setRows(5);
		jScrollPane8.setViewportView(jTextArea8);

		jTabbedPane3.addTab("Write your SubTitle here..", jScrollPane8);

		jTextArea9.setColumns(20);
		jTextArea9.setRows(5);
		jScrollPane9.setViewportView(jTextArea9);

		jTabbedPane3.addTab("Write your SubTitle here..", jScrollPane9);

		jTextArea10.setColumns(20);
		jTextArea10.setRows(5);
		jScrollPane10.setViewportView(jTextArea10);

		jTabbedPane3.addTab("Write your SubTitle here..", jScrollPane10);

		jPanel4.add(jTabbedPane3, "card4");
		jTabbedPane3.getAccessibleContext().setAccessibleName("3");

		jTextArea11.setColumns(20);
		jTextArea11.setRows(5);
		jScrollPane11.setViewportView(jTextArea11);

		jTabbedPane4.addTab("Write your SubTitle here..", jScrollPane11);

		jTextArea12.setColumns(20);
		jTextArea12.setRows(5);
		jScrollPane12.setViewportView(jTextArea12);

		jTabbedPane4.addTab("Write your SubTitle here..", jScrollPane12);

		jTextArea13.setColumns(20);
		jTextArea13.setRows(5);
		jScrollPane13.setViewportView(jTextArea13);

		jTabbedPane4.addTab("Write your SubTitle here..", jScrollPane13);

		jTextArea14.setColumns(20);
		jTextArea14.setRows(5);
		jScrollPane14.setViewportView(jTextArea14);

		jTabbedPane4.addTab("Write your SubTitle here..", jScrollPane14);

		jTextArea15.setColumns(20);
		jTextArea15.setRows(5);
		jScrollPane15.setViewportView(jTextArea15);

		jTabbedPane4.addTab("Write your SubTitle here..", jScrollPane15);

		jPanel4.add(jTabbedPane4, "card5");

		jTextArea16.setColumns(20);
		jTextArea16.setRows(5);
		jScrollPane16.setViewportView(jTextArea16);

		jTabbedPane5.addTab("Write your SubTitle here..", jScrollPane16);

		jTextArea17.setColumns(20);
		jTextArea17.setRows(5);
		jScrollPane17.setViewportView(jTextArea17);

		jTabbedPane5.addTab("Write your SubTitle here..\n", jScrollPane17);

		jTextArea18.setColumns(20);
		jTextArea18.setRows(5);
		jScrollPane18.setViewportView(jTextArea18);

		jTabbedPane5.addTab("Write your SubTitle here..", jScrollPane18);

		jTextArea19.setColumns(20);
		jTextArea19.setRows(5);
		jScrollPane19.setViewportView(jTextArea19);

		jTabbedPane5.addTab("Write your SubTitle here..", jScrollPane19);

		jTextArea20.setColumns(20);
		jTextArea20.setRows(5);
		jScrollPane20.setViewportView(jTextArea20);

		jTabbedPane5.addTab("Write your SubTitle here..", jScrollPane20);

		jPanel4.add(jTabbedPane5, "card6");

		jTextArea21.setColumns(20);
		jTextArea21.setRows(5);
		jScrollPane21.setViewportView(jTextArea21);

		jTabbedPane6.addTab("Write your SubTitle here..", jScrollPane21);

		jTextArea22.setColumns(20);
		jTextArea22.setRows(5);
		jScrollPane22.setViewportView(jTextArea22);

		jTabbedPane6.addTab("Write your SubTitle here..", jScrollPane22);

		jTextArea23.setColumns(20);
		jTextArea23.setRows(5);
		jScrollPane23.setViewportView(jTextArea23);

		jTabbedPane6.addTab("Write your SubTitle here..", jScrollPane23);

		jTextArea24.setColumns(20);
		jTextArea24.setRows(5);
		jScrollPane24.setViewportView(jTextArea24);

		jTabbedPane6.addTab("Write your SubTitle here..", jScrollPane24);

		jTextArea25.setColumns(20);
		jTextArea25.setRows(5);
		jScrollPane25.setViewportView(jTextArea25);

		jTabbedPane6.addTab("Write your SubTitle here..", jScrollPane25);

		jPanel4.add(jTabbedPane6, "card7");

		jTextArea26.setColumns(20);
		jTextArea26.setRows(5);
		jScrollPane26.setViewportView(jTextArea26);

		jTabbedPane7.addTab("Write your SubTitle here..", jScrollPane26);

		jTextArea27.setColumns(20);
		jTextArea27.setRows(5);
		jScrollPane27.setViewportView(jTextArea27);

		jTabbedPane7.addTab("Write your SubTitle here..", jScrollPane27);

		jTextArea28.setColumns(20);
		jTextArea28.setRows(5);
		jScrollPane28.setViewportView(jTextArea28);

		jTabbedPane7.addTab("Write your SubTitle here..", jScrollPane28);

		jTextArea29.setColumns(20);
		jTextArea29.setRows(5);
		jScrollPane29.setViewportView(jTextArea29);

		jTabbedPane7.addTab("Write your SubTitle here..", jScrollPane29);

		jTextArea30.setColumns(20);
		jTextArea30.setRows(5);
		jScrollPane30.setViewportView(jTextArea30);

		jTabbedPane7.addTab("Write your SubTitle here..", jScrollPane30);

		jPanel4.add(jTabbedPane7, "card8");

		jTextArea31.setColumns(20);
		jTextArea31.setRows(5);
		jScrollPane31.setViewportView(jTextArea31);

		jTabbedPane8.addTab("Write your SubTitle here..", jScrollPane31);

		jTextArea32.setColumns(20);
		jTextArea32.setRows(5);
		jScrollPane32.setViewportView(jTextArea32);

		jTabbedPane8.addTab("Write your SubTitle here..", jScrollPane32);

		jTextArea33.setColumns(20);
		jTextArea33.setRows(5);
		jScrollPane33.setViewportView(jTextArea33);

		jTabbedPane8.addTab("Write your SubTitle here..", jScrollPane33);

		jTextArea34.setColumns(20);
		jTextArea34.setRows(5);
		jScrollPane34.setViewportView(jTextArea34);

		jTabbedPane8.addTab("Write your SubTitle here..", jScrollPane34);

		jTextArea35.setColumns(20);
		jTextArea35.setRows(5);
		jScrollPane35.setViewportView(jTextArea35);

		jTabbedPane8.addTab("Write your SubTitle here..", jScrollPane35);

		jPanel4.add(jTabbedPane8, "card9");

		jTextArea36.setColumns(20);
		jTextArea36.setRows(5);
		jScrollPane36.setViewportView(jTextArea36);

		jTabbedPane9.addTab("Write your SubTitle here..", jScrollPane36);

		jTextArea37.setColumns(20);
		jTextArea37.setRows(5);
		jScrollPane37.setViewportView(jTextArea37);

		jTabbedPane9.addTab("Write your SubTitle here..", jScrollPane37);

		jTextArea38.setColumns(20);
		jTextArea38.setRows(5);
		jScrollPane38.setViewportView(jTextArea38);

		jTabbedPane9.addTab("Write your SubTitle here..", jScrollPane38);

		jTextArea39.setColumns(20);
		jTextArea39.setRows(5);
		jScrollPane39.setViewportView(jTextArea39);

		jTabbedPane9.addTab("Write your SubTitle here..", jScrollPane39);

		jTextArea40.setColumns(20);
		jTextArea40.setRows(5);
		jScrollPane40.setViewportView(jTextArea40);

		jTabbedPane9.addTab("Write your SubTitle here..", jScrollPane40);

		jPanel4.add(jTabbedPane9, "card10");

		jTextArea41.setColumns(20);
		jTextArea41.setRows(5);
		jScrollPane41.setViewportView(jTextArea41);

		jTabbedPane10.addTab("Write your SubTitle here..", jScrollPane41);

		jTextArea42.setColumns(20);
		jTextArea42.setRows(5);
		jScrollPane42.setViewportView(jTextArea42);

		jTabbedPane10.addTab("Write your SubTitle here..", jScrollPane42);

		jTextArea43.setColumns(20);
		jTextArea43.setRows(5);
		jScrollPane43.setViewportView(jTextArea43);

		jTabbedPane10.addTab("Write your SubTitle here..", jScrollPane43);

		jTextArea44.setColumns(20);
		jTextArea44.setRows(5);
		jScrollPane44.setViewportView(jTextArea44);

		jTabbedPane10.addTab("Write your SubTitle here..", jScrollPane44);

		jTextArea45.setColumns(20);
		jTextArea45.setRows(5);
		jScrollPane45.setViewportView(jTextArea45);

		jTabbedPane10.addTab("Write your SubTitle here..", jScrollPane45);

		jPanel4.add(jTabbedPane10, "card11");

		jTextArea46.setColumns(20);
		jTextArea46.setRows(5);
		jScrollPane46.setViewportView(jTextArea46);

		jTabbedPane11.addTab("Write your SubTitle here..", jScrollPane46);

		jTextArea47.setColumns(20);
		jTextArea47.setRows(5);
		jScrollPane47.setViewportView(jTextArea47);

		jTabbedPane11.addTab("Write your SubTitle here..", jScrollPane47);

		jTextArea48.setColumns(20);
		jTextArea48.setRows(5);
		jScrollPane48.setViewportView(jTextArea48);

		jTabbedPane11.addTab("Write your SubTitle here..", jScrollPane48);

		jTextArea49.setColumns(20);
		jTextArea49.setRows(5);
		jScrollPane49.setViewportView(jTextArea49);

		jTabbedPane11.addTab("Write your SubTitle here..", jScrollPane49);

		jTextArea50.setColumns(20);
		jTextArea50.setRows(5);
		jScrollPane50.setViewportView(jTextArea50);

		jTabbedPane11.addTab("Write your SubTitle here..", jScrollPane50);

		jPanel4.add(jTabbedPane11, "card12");

		jTextArea51.setColumns(20);
		jTextArea51.setRows(5);
		jScrollPane51.setViewportView(jTextArea51);

		jTabbedPane12.addTab("Write your SubTitle here..", jScrollPane51);

		jTextArea52.setColumns(20);
		jTextArea52.setRows(5);
		jScrollPane52.setViewportView(jTextArea52);

		jTabbedPane12.addTab("Write your SubTitle here..", jScrollPane52);

		jTextArea53.setColumns(20);
		jTextArea53.setRows(5);
		jScrollPane53.setViewportView(jTextArea53);

		jTabbedPane12.addTab("Write your SubTitle here..", jScrollPane53);

		jTextArea54.setColumns(20);
		jTextArea54.setRows(5);
		jScrollPane54.setViewportView(jTextArea54);

		jTabbedPane12.addTab("Write your SubTitle here..", jScrollPane54);

		jTextArea55.setColumns(20);
		jTextArea55.setRows(5);
		jScrollPane55.setViewportView(jTextArea55);

		jTabbedPane12.addTab("Write your SubTitle here..", jScrollPane55);

		jPanel4.add(jTabbedPane12, "card13");

		jTextArea56.setColumns(20);
		jTextArea56.setRows(5);
		jScrollPane56.setViewportView(jTextArea56);

		jTabbedPane13.addTab("Write your SubTitle here..", jScrollPane56);

		jTextArea57.setColumns(20);
		jTextArea57.setRows(5);
		jScrollPane57.setViewportView(jTextArea57);

		jTabbedPane13.addTab("Write your SubTitle here..", jScrollPane57);

		jTextArea58.setColumns(20);
		jTextArea58.setRows(5);
		jScrollPane58.setViewportView(jTextArea58);

		jTabbedPane13.addTab("Write your SubTitle here..", jScrollPane58);

		jTextArea59.setColumns(20);
		jTextArea59.setRows(5);
		jScrollPane59.setViewportView(jTextArea59);

		jTabbedPane13.addTab("Write your SubTitle here..", jScrollPane59);

		jTextArea60.setColumns(20);
		jTextArea60.setRows(5);
		jScrollPane60.setViewportView(jTextArea60);

		jTabbedPane13.addTab("Write your SubTitle here..", jScrollPane60);

		jPanel4.add(jTabbedPane13, "card14");

		jTextArea61.setColumns(20);
		jTextArea61.setRows(5);
		jScrollPane61.setViewportView(jTextArea61);

		jTabbedPane14.addTab("Write your SubTitle here..", jScrollPane61);

		jTextArea62.setColumns(20);
		jTextArea62.setRows(5);
		jScrollPane62.setViewportView(jTextArea62);

		jTabbedPane14.addTab("Write your SubTitle here..", jScrollPane62);

		jTextArea63.setColumns(20);
		jTextArea63.setRows(5);
		jScrollPane63.setViewportView(jTextArea63);

		jTabbedPane14.addTab("Write your SubTitle here..", jScrollPane63);

		jTextArea64.setColumns(20);
		jTextArea64.setRows(5);
		jScrollPane64.setViewportView(jTextArea64);

		jTabbedPane14.addTab("Write your SubTitle here..", jScrollPane64);

		jTextArea65.setColumns(20);
		jTextArea65.setRows(5);
		jScrollPane65.setViewportView(jTextArea65);

		jTabbedPane14.addTab("Write your SubTitle here..", jScrollPane65);

		jPanel4.add(jTabbedPane14, "card15");

		jTextArea66.setColumns(20);
		jTextArea66.setRows(5);
		jScrollPane66.setViewportView(jTextArea66);

		jTabbedPane15.addTab("Write your SubTitle here..", jScrollPane66);

		jTextArea67.setColumns(20);
		jTextArea67.setRows(5);
		jScrollPane67.setViewportView(jTextArea67);

		jTabbedPane15.addTab("Write your SubTitle here..", jScrollPane67);

		jTextArea68.setColumns(20);
		jTextArea68.setRows(5);
		jScrollPane68.setViewportView(jTextArea68);

		jTabbedPane15.addTab("Write your SubTitle here..", jScrollPane68);

		jTextArea69.setColumns(20);
		jTextArea69.setRows(5);
		jScrollPane69.setViewportView(jTextArea69);

		jTabbedPane15.addTab("Write your SubTitle here..", jScrollPane69);

		jTextArea70.setColumns(20);
		jTextArea70.setRows(5);
		jScrollPane70.setViewportView(jTextArea70);

		jTabbedPane15.addTab("Write your SubTitle here..", jScrollPane70);

		jPanel4.add(jTabbedPane15, "card16");

		jTextArea71.setColumns(20);
		jTextArea71.setRows(5);
		jScrollPane71.setViewportView(jTextArea71);

		jTabbedPane16.addTab("Write your SubTitle here..", jScrollPane71);

		jTextArea72.setColumns(20);
		jTextArea72.setRows(5);
		jScrollPane72.setViewportView(jTextArea72);

		jTabbedPane16.addTab("Write your SubTitle here..", jScrollPane72);

		jTextArea73.setColumns(20);
		jTextArea73.setRows(5);
		jScrollPane73.setViewportView(jTextArea73);

		jTabbedPane16.addTab("Write your SubTitle here..", jScrollPane73);

		jTextArea74.setColumns(20);
		jTextArea74.setRows(5);
		jScrollPane74.setViewportView(jTextArea74);

		jTabbedPane16.addTab("Write your SubTitle here..", jScrollPane74);

		jTextArea75.setColumns(20);
		jTextArea75.setRows(5);
		jScrollPane75.setViewportView(jTextArea75);

		jTabbedPane16.addTab("Write your SubTitle here..", jScrollPane75);

		jPanel4.add(jTabbedPane16, "card17");

		jTextArea76.setColumns(20);
		jTextArea76.setRows(5);
		jScrollPane76.setViewportView(jTextArea76);

		jTabbedPane17.addTab("Write your SubTitle here..", jScrollPane76);

		jTextArea77.setColumns(20);
		jTextArea77.setRows(5);
		jScrollPane77.setViewportView(jTextArea77);

		jTabbedPane17.addTab("Write your SubTitle here..", jScrollPane77);

		jTextArea78.setColumns(20);
		jTextArea78.setRows(5);
		jScrollPane78.setViewportView(jTextArea78);

		jTabbedPane17.addTab("Write your SubTitle here..", jScrollPane78);

		jTextArea79.setColumns(20);
		jTextArea79.setRows(5);
		jScrollPane79.setViewportView(jTextArea79);

		jTabbedPane17.addTab("Write your SubTitle here..", jScrollPane79);

		jTextArea80.setColumns(20);
		jTextArea80.setRows(5);
		jScrollPane80.setViewportView(jTextArea80);

		jTabbedPane17.addTab("Write your SubTitle here..", jScrollPane80);

		jPanel4.add(jTabbedPane17, "card18");

		jTextArea81.setColumns(20);
		jTextArea81.setRows(5);
		jScrollPane81.setViewportView(jTextArea81);

		jTabbedPane18.addTab("Write your SubTitle here..", jScrollPane81);

		jTextArea82.setColumns(20);
		jTextArea82.setRows(5);
		jScrollPane82.setViewportView(jTextArea82);

		jTabbedPane18.addTab("Write your SubTitle here..", jScrollPane82);

		jTextArea83.setColumns(20);
		jTextArea83.setRows(5);
		jScrollPane83.setViewportView(jTextArea83);

		jTabbedPane18.addTab("Write your SubTitle here..", jScrollPane83);

		jTextArea84.setColumns(20);
		jTextArea84.setRows(5);
		jScrollPane84.setViewportView(jTextArea84);

		jTabbedPane18.addTab("Write your SubTitle here..", jScrollPane84);

		jTextArea85.setColumns(20);
		jTextArea85.setRows(5);
		jScrollPane85.setViewportView(jTextArea85);

		jTabbedPane18.addTab("Write your SubTitle here..", jScrollPane85);

		jPanel4.add(jTabbedPane18, "card19");

		jTabbedPane19
				.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

		jTextArea86.setColumns(20);
		jTextArea86.setRows(5);
		jScrollPane86.setViewportView(jTextArea86);

		jTabbedPane19.addTab("Write your SubTitle here..", jScrollPane86);

		jTextArea87.setColumns(20);
		jTextArea87.setRows(5);
		jScrollPane87.setViewportView(jTextArea87);

		jTabbedPane19.addTab("Write your SubTitle here..", jScrollPane87);

		jTextArea88.setColumns(20);
		jTextArea88.setRows(5);
		jScrollPane88.setViewportView(jTextArea88);

		jTabbedPane19.addTab("Write your SubTitle here..", jScrollPane88);

		jTextArea89.setColumns(20);
		jTextArea89.setRows(5);
		jScrollPane89.setViewportView(jTextArea89);

		jTabbedPane19.addTab("Write your SubTitle here..", jScrollPane89);

		jTextArea90.setColumns(20);
		jTextArea90.setRows(5);
		jScrollPane90.setViewportView(jTextArea90);

		jTabbedPane19.addTab("Write your SubTitle here..", jScrollPane90);

		jPanel4.add(jTabbedPane19, "card20");

		jTextArea91.setColumns(20);
		jTextArea91.setRows(5);
		jScrollPane91.setViewportView(jTextArea91);

		jTabbedPane1.addTab("Write your SubTitle here..", jScrollPane91);

		jTextArea92.setColumns(20);
		jTextArea92.setRows(5);
		jScrollPane92.setViewportView(jTextArea92);

		jTabbedPane1.addTab("Write your SubTitle here..", jScrollPane92);

		jTextArea93.setColumns(20);
		jTextArea93.setRows(5);
		jScrollPane93.setViewportView(jTextArea93);

		jTabbedPane1.addTab("Write your SubTitle here..", jScrollPane93);

		jTextArea94.setColumns(20);
		jTextArea94.setRows(5);
		jScrollPane94.setViewportView(jTextArea94);

		jTabbedPane1.addTab("Write your SubTitle here..", jScrollPane94);

		jTextArea95.setColumns(20);
		jTextArea95.setRows(5);
		jScrollPane95.setViewportView(jTextArea95);

		jTabbedPane1.addTab("Write your SubTitle here..", jScrollPane95);

		jPanel4.add(jTabbedPane1, "card2");

		jTextArea96.setColumns(20);
		jTextArea96.setRows(5);
		jScrollPane96.setViewportView(jTextArea96);

		jTabbedPane20.addTab("Write your SubTitle here..", jScrollPane96);

		jTextArea97.setColumns(20);
		jTextArea97.setRows(5);
		jScrollPane97.setViewportView(jTextArea97);

		jTabbedPane20.addTab("Write your SubTitle here..", jScrollPane97);

		jTextArea98.setColumns(20);
		jTextArea98.setRows(5);
		jScrollPane98.setViewportView(jTextArea98);

		jTabbedPane20.addTab("Write your SubTitle here..", jScrollPane98);

		jTextArea99.setColumns(20);
		jTextArea99.setRows(5);
		jScrollPane99.setViewportView(jTextArea99);

		jTabbedPane20.addTab("Write your SubTitle here..", jScrollPane99);

		jTextArea100.setColumns(20);
		jTextArea100.setRows(5);
		jScrollPane100.setViewportView(jTextArea100);

		jTabbedPane20.addTab("Write your SubTitle here..", jScrollPane100);

		jPanel4.add(jTabbedPane20, "card21");

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jTabbedPane21.addTab("Write your SubTitle here..", jScrollPane1);

		jTextArea101.setColumns(20);
		jTextArea101.setRows(5);
		jScrollPane101.setViewportView(jTextArea101);

		jTabbedPane21.addTab("Write your SubTitle here..", jScrollPane101);

		jTextArea102.setColumns(20);
		jTextArea102.setRows(5);
		jScrollPane102.setViewportView(jTextArea102);

		jTabbedPane21.addTab("Write your SubTitle here..", jScrollPane102);

		jTextArea103.setColumns(20);
		jTextArea103.setRows(5);
		jScrollPane103.setViewportView(jTextArea103);

		jTabbedPane21.addTab("Write your SubTitle here..", jScrollPane103);

		jTextArea104.setColumns(20);
		jTextArea104.setRows(5);
		jScrollPane104.setViewportView(jTextArea104);

		jTabbedPane21.addTab("Write your SubTitle here..", jScrollPane104);

		jTextArea105.setColumns(20);
		jTextArea105.setRows(5);
		jScrollPane105.setViewportView(jTextArea105);

		jTabbedPane21.addTab("Write your SubTitle here..", jScrollPane105);

		jTextArea106.setColumns(20);
		jTextArea106.setRows(5);
		jScrollPane106.setViewportView(jTextArea106);

		jTabbedPane21.addTab("Write your SubTitle here..", jScrollPane106);

		jTextArea107.setColumns(20);
		jTextArea107.setRows(5);
		jScrollPane107.setViewportView(jTextArea107);

		jTabbedPane21.addTab("Write your SubTitle here..", jScrollPane107);

		jTextArea108.setColumns(20);
		jTextArea108.setRows(5);
		jScrollPane108.setViewportView(jTextArea108);

		jTabbedPane21.addTab("Write your SubTitle here..", jScrollPane108);

		jTextArea109.setColumns(20);
		jTextArea109.setRows(5);
		jScrollPane109.setViewportView(jTextArea109);

		jTabbedPane21.addTab("Write your SubTitle here..", jScrollPane109);

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 868,
				Short.MAX_VALUE));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 477,
				Short.MAX_VALUE));

		jTabbedPane21.addTab("tab11", jPanel6);

		jPanel4.add(jTabbedPane21, "card22");

		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jScrollPane2.setViewportView(jTextArea2);

		jTabbedPane2.addTab("Write your SubTitle here..", jScrollPane2);

		jTextArea3.setColumns(20);
		jTextArea3.setRows(5);
		jScrollPane3.setViewportView(jTextArea3);

		jTabbedPane2.addTab("Write your SubTitle here..", jScrollPane3);

		jTextArea4.setColumns(20);
		jTextArea4.setRows(5);
		jScrollPane4.setViewportView(jTextArea4);

		jTabbedPane2.addTab("Write your SubTitle here..", jScrollPane4);

		jTextArea5.setColumns(20);
		jTextArea5.setRows(5);
		jScrollPane5.setViewportView(jTextArea5);

		jTabbedPane2.addTab("Write your SubTitle here..", jScrollPane5);

		jPanel4.add(jTabbedPane2, "card3");

		jPanel1.setPreferredSize(new java.awt.Dimension(50, 100));
		jPanel1.setLayout(new java.awt.GridLayout(0, 1));

		jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton1.setText("1");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);

		jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton2.setText("2");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton2);

		jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton3.setText("3");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton3);

		jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton4.setText("4");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton4);

		jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton5.setText("5");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton5);

		jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton6.setText("6");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton6);

		jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton7.setText("7");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton7);

		jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton8.setText("8");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton8);

		jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton9.setText("9");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton9);

		jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton10.setText("10");
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton10);

		jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton11.setText("11");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton11);

		jButton12.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton12.setText("12");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton12);

		jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton13.setText("13");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton13);

		jButton14.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton14.setText("14");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton14ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton14);

		jButton15.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton15.setText("15");
		jButton15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton15ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton15);

		jButton16.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton16.setText("16");
		jButton16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton16ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton16);

		jButton17.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton17.setText("17");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton17ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton17);

		jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton18.setText("18");
		jButton18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton18ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton18);

		jButton19.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton19.setText("19");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton19);

		jButton20.setFont(new java.awt.Font("Segoe UI", 1, 12));
		jButton20.setText("20");
		jButton20.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton20ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton20);

		jButton21.setFont(new java.awt.Font("Segoe UI", 1, 24));
		jButton21.setText("*");
		jButton21.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton21ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton21);

		jPanel5.setLayout(new java.awt.GridLayout(0, 1, 1, 0));

		jLabel5.setText("Write your Title here...");
		jPanel5.add(jLabel5);

		jLabel6.setText("Write your Title here..");
		jPanel5.add(jLabel6);

		jLabel7.setText("Write your Title here..");
		jPanel5.add(jLabel7);

		jLabel8.setText("Write your Title here..");
		jPanel5.add(jLabel8);

		jLabel9.setText("Write your Title here..");
		jPanel5.add(jLabel9);

		jLabel10.setText("Write your Title here..");
		jPanel5.add(jLabel10);

		jLabel11.setText("Write your Title here..");
		jPanel5.add(jLabel11);

		jLabel12.setText("Write your Title here..");
		jPanel5.add(jLabel12);

		jLabel13.setText("Write your Title here..");
		jPanel5.add(jLabel13);

		jLabel14.setText("Write your Title here..");
		jPanel5.add(jLabel14);

		jLabel15.setText("Write your Title here..");
		jPanel5.add(jLabel15);

		jLabel16.setText("Write your Title here..");
		jPanel5.add(jLabel16);

		jLabel17.setText("Write your Title here..");
		jPanel5.add(jLabel17);

		jLabel18.setText("Write your Title here..");
		jPanel5.add(jLabel18);

		jLabel19.setText("Write your Title here..");
		jPanel5.add(jLabel19);

		jLabel20.setText("Write your Title here..");
		jPanel5.add(jLabel20);

		jLabel21.setText("Write your Title here..");
		jPanel5.add(jLabel21);

		jLabel22.setText("Write your Title here..");
		jPanel5.add(jLabel22);

		jLabel23.setText("Write your Title here..");
		jPanel5.add(jLabel23);

		jLabel24.setText("Write your Title here..");
		jPanel5.add(jLabel24);

		jLabel25.setText("Write your Title here..");
		jPanel5.add(jLabel25);

		jMenuBar1.setBackground(new java.awt.Color(102, 255, 51));
		jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 30));

		jMenu1.setText("File");
		jMenu1.setPreferredSize(new java.awt.Dimension(50, 19));

		jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_N,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem1.setText("NEW");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_O,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem2.setText("Open");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem2);

		jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_S,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem3.setText("Save");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem3);

		jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_F4,
				java.awt.event.InputEvent.ALT_MASK));
		jMenuItem4.setText("Exit");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem4);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Edit");
		jMenu2.setPreferredSize(new java.awt.Dimension(50, 19));

		jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_X,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem5.setText("Cut");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem5);

		jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_C,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem6.setText("Copy");
		jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem6ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem6);

		jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_V,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem7.setText("Paste");
		jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem7ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem7);

		jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_A,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem8.setText("Select  All");
		jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem8ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem8);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("View");
		jMenu3.setPreferredSize(new java.awt.Dimension(50, 19));

		jMenuItem9.setText("Status Bar");
		jMenu3.add(jMenuItem9);

		jMenuItem11.setText("Color Chooser");
		jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem11ActionPerformed(evt);
			}
		});
		jMenu3.add(jMenuItem11);

		jMenuBar1.add(jMenu3);

		jMenu4.setText("Help     ");
		jMenu4.setPreferredSize(new java.awt.Dimension(50, 19));

		jMenuItem10.setText("Help");
		jMenu4.add(jMenuItem10);

		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 1297,
								Short.MAX_VALUE)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jPanel3,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																1277,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jPanel5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				195,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jPanel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				1013,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(20, 20, 20)));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												38,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(7, 7, 7)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jPanel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																590,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				jPanel4,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				0,
																				0,
																				Short.MAX_VALUE)
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				layout
																						.createSequentialGroup()
																						.addGap(
																								10,
																								10,
																								10)
																						.addComponent(
																								jPanel5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								575,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												25, Short.MAX_VALUE)
										.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {

   Register r= new Register();
   r = new Register();
	r.setVisible(true);
	r.immovable();
	r.t.start();
	r.set();
    notebook.setVisible(false);
    
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	public void write(String file, JTextArea j) {
		try {
			this.getClass().getResource("doc");
			FileOutputStream fout = new FileOutputStream(
					"C://Users//Public//notebook//" + file);
			byte b[] = j.getText().getBytes();
			fout.write(b);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void write(String file, String tabtitle) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"C://Users//Public//notebook//" + file);

			byte b[];
			b = tabtitle.getBytes();
			fout.write(b);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public String read(String file) {
		String s = "", s2 = "";
		try {

			BufferedReader br = new BufferedReader(new FileReader(
					"C://Users//Public//notebook//" + file));
			while ((s2 = br.readLine()) != null) {
				s += s2 + "\n";
			}
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return (s);
	}

	public void write(String file, JLabel l) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"C://Users//Public//notebook//" + file);
			byte b[] = l.getText().getBytes();
			fout.write(b);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void read(String file, JTextArea j) {
		try {

			BufferedReader br = new BufferedReader(new FileReader(
					"C://Users//Public//notebook//" + file));
			String s = "", s2 = "";
			while ((s2 = br.readLine()) != null) {
				s += s2 + "\n";

			}
			j.setText(s);
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void read(String file, JLabel l) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"C://Users//Public//notebook//" + file));
			String s = "", s2 = "";
			while ((s2 = br.readLine()) != null) {
				s += s2 + "\n";

			}
			l.setText(s);
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {
		new javax.swing.JColorChooser();
		Color JC = JColorChooser.showDialog(this, "select color", null);
		if (k == 6) {
			p = jTabbedPane2.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea2.setForeground(JC);
				break;
			case 1:
				jTextArea3.setForeground(JC);
				break;
			case 2:
				jTextArea4.setForeground(JC);
				break;
			case 3:
				jTextArea5.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 7) {
			p = jTabbedPane3.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea6.setForeground(JC);
				break;
			case 1:
				jTextArea7.setForeground(JC);
				break;
			case 2:
				jTextArea8.setForeground(JC);
				break;
			case 3:
				jTextArea9.setForeground(JC);
				break;
			case 4:
				jTextArea10.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 8) {
			p = jTabbedPane4.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea11.setForeground(JC);
				break;
			case 1:
				jTextArea12.setForeground(JC);
				break;
			case 2:
				jTextArea13.setForeground(JC);
				break;
			case 3:
				jTextArea14.setForeground(JC);
				break;
			case 4:
				jTextArea15.setForeground(JC);
				break;
			default:
				break;
			}
		}

		if (k == 9) {
			p = jTabbedPane5.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea16.setForeground(JC);
				break;
			case 1:
				jTextArea17.setForeground(JC);
				break;
			case 2:
				jTextArea18.setForeground(JC);
				break;
			case 3:
				jTextArea19.setForeground(JC);
				break;
			case 4:
				jTextArea20.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 10) {
			p = jTabbedPane6.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea21.setForeground(JC);
				break;
			case 1:
				jTextArea22.setForeground(JC);
				break;
			case 2:
				jTextArea23.setForeground(JC);
				break;
			case 3:
				jTextArea24.setForeground(JC);
				break;
			case 4:
				jTextArea25.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 11) {
			p = jTabbedPane7.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea26.setForeground(JC);
				break;
			case 1:
				jTextArea27.setForeground(JC);
				break;
			case 2:
				jTextArea28.setForeground(JC);
				break;
			case 3:
				jTextArea29.setForeground(JC);
				break;
			case 4:
				jTextArea30.setForeground(JC);
				break;
			default:
				break;
			}
		}

		if (k == 12) {
			p = jTabbedPane8.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea31.setForeground(JC);
				break;
			case 1:
				jTextArea32.setForeground(JC);
				break;
			case 2:
				jTextArea33.setForeground(JC);
				break;
			case 3:
				jTextArea34.setForeground(JC);
				break;
			case 4:
				jTextArea35.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 13) {
			p = jTabbedPane9.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea36.setForeground(JC);
				break;
			case 1:
				jTextArea37.setForeground(JC);
				break;
			case 2:
				jTextArea38.setForeground(JC);
				break;
			case 3:
				jTextArea39.setForeground(JC);
				break;
			case 4:
				jTextArea40.setForeground(JC);
				break;
			default:
				break;
			}
		}

		if (k == 14) {
			p = jTabbedPane10.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea41.setForeground(JC);
				break;
			case 1:
				jTextArea42.setForeground(JC);
				break;
			case 2:
				jTextArea43.setForeground(JC);
				break;
			case 3:
				jTextArea44.setForeground(JC);
				break;
			case 4:
				jTextArea45.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 15) {
			p = jTabbedPane11.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea46.setForeground(JC);
				break;
			case 1:
				jTextArea47.setForeground(JC);
				break;
			case 2:
				jTextArea48.setForeground(JC);
				break;
			case 3:
				jTextArea49.setForeground(JC);
				break;
			case 4:
				jTextArea50.setForeground(JC);
				break;
			default:
				break;
			}
		}

		if (k == 16) {
			p = jTabbedPane12.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea51.setForeground(JC);
				break;
			case 1:
				jTextArea52.setForeground(JC);
				break;
			case 2:
				jTextArea53.setForeground(JC);
				break;
			case 3:
				jTextArea54.setForeground(JC);
				break;
			case 4:
				jTextArea55.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 17) {
			p = jTabbedPane13.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea56.setForeground(JC);
				break;
			case 1:
				jTextArea57.setForeground(JC);
				break;
			case 2:
				jTextArea58.setForeground(JC);
				break;
			case 3:
				jTextArea59.setForeground(JC);
				break;
			case 4:
				jTextArea60.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 18) {
			p = jTabbedPane14.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea61.setForeground(JC);
				break;
			case 1:
				jTextArea62.setForeground(JC);
				break;
			case 2:
				jTextArea63.setForeground(JC);
				break;
			case 3:
				jTextArea64.setForeground(JC);
				break;
			case 4:
				jTextArea65.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 19) {
			p = jTabbedPane15.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea66.setForeground(JC);
				break;
			case 1:
				jTextArea67.setForeground(JC);
				break;
			case 2:
				jTextArea68.setForeground(JC);
				break;
			case 3:
				jTextArea69.setForeground(JC);
				break;
			case 4:
				jTextArea70.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 20) {
			p = jTabbedPane16.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea71.setForeground(JC);
				break;
			case 1:
				jTextArea72.setForeground(JC);
				break;
			case 2:
				jTextArea73.setForeground(JC);
				break;
			case 3:
				jTextArea74.setForeground(JC);
				break;
			case 4:
				jTextArea75.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 21) {
			p = jTabbedPane17.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea76.setForeground(JC);
				break;
			case 1:
				jTextArea77.setForeground(JC);
				break;
			case 2:
				jTextArea78.setForeground(JC);
				break;
			case 3:
				jTextArea79.setForeground(JC);
				break;
			case 4:
				jTextArea80.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 22) {
			p = jTabbedPane18.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea81.setForeground(JC);
				break;
			case 1:
				jTextArea82.setForeground(JC);
				break;
			case 2:
				jTextArea83.setForeground(JC);
				break;
			case 3:
				jTextArea84.setForeground(JC);
				break;
			case 4:
				jTextArea85.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 23) {
			p = jTabbedPane19.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea86.setForeground(JC);
				break;
			case 1:
				jTextArea87.setForeground(JC);
				break;
			case 2:
				jTextArea88.setForeground(JC);
				break;
			case 3:
				jTextArea89.setForeground(JC);
				break;
			case 4:
				jTextArea90.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 5) {
			p = jTabbedPane1.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea91.setForeground(JC);
				break;
			case 1:
				jTextArea92.setForeground(JC);
				break;
			case 2:
				jTextArea93.setForeground(JC);
				break;
			case 3:
				jTextArea94.setForeground(JC);
				break;
			case 4:
				jTextArea95.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 24) {
			p = jTabbedPane20.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea96.setForeground(JC);
				break;
			case 1:
				jTextArea97.setForeground(JC);
				break;
			case 2:
				jTextArea98.setForeground(JC);
				break;
			case 3:
				jTextArea99.setForeground(JC);
				break;
			case 4:
				jTextArea100.setForeground(JC);
				break;
			default:
				break;
			}
		}
		if (k == 24) {
			p = jTabbedPane21.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea1.setForeground(JC);
				break;
			case 1:
				jTextArea101.setForeground(JC);
				break;
			case 2:
				jTextArea102.setForeground(JC);
				break;
			case 3:
				jTextArea103.setForeground(JC);
				break;
			case 4:
				jTextArea104.setForeground(JC);
				break;
			case 5:
				jTextArea105.setForeground(JC);
				break;
			case 6:
				jTextArea106.setForeground(JC);
				break;
			case 7:
				jTextArea107.setForeground(JC);
				break;
			case 8:
				jTextArea108.setForeground(JC);
				break;
			case 9:
				jTextArea109.setForeground(JC);
			default:
				break;
			}
		}

	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
		save();
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		System.exit(0);
	}

	public void readfile() {

		jPanel4.setLayout(card);

		read("text1.txt", jTextArea1);
		read("text2.txt", jTextArea2);
		read("text3.txt", jTextArea3);
		read("text4.txt", jTextArea4);
		read("text5.txt", jTextArea5);
		read("text6.txt", jTextArea6);
		read("text7.txt", jTextArea7);
		read("text8.txt", jTextArea8);
		read("text9.txt", jTextArea9);
		read("text10.txt", jTextArea10);
		read("text11.txt", jTextArea11);
		read("text12.txt", jTextArea12);
		read("text13.txt", jTextArea13);
		read("text14.txt", jTextArea14);
		read("text15.txt", jTextArea15);
		read("text16.txt", jTextArea16);
		read("text17.txt", jTextArea17);
		read("text18.txt", jTextArea18);
		read("text19.txt", jTextArea19);
		read("text20.txt", jTextArea20);
		read("text21.txt", jTextArea21);
		read("text22.txt", jTextArea22);
		read("text23.txt", jTextArea23);
		read("text24.txt", jTextArea24);
		read("text25.txt", jTextArea25);
		read("text26.txt", jTextArea26);
		read("text27.txt", jTextArea27);
		read("text28.txt", jTextArea28);
		read("text29.txt", jTextArea29);
		read("text30.txt", jTextArea30);
		read("text31.txt", jTextArea31);
		read("text32.txt", jTextArea32);
		read("text33.txt", jTextArea33);
		read("text34.txt", jTextArea34);
		read("text35.txt", jTextArea35);
		read("text36.txt", jTextArea36);
		read("text37.txt", jTextArea37);
		read("text38.txt", jTextArea38);
		read("text39.txt", jTextArea39);
		read("text40.txt", jTextArea40);
		read("text41.txt", jTextArea41);
		read("text42.txt", jTextArea42);
		read("text43.txt", jTextArea43);
		read("text44.txt", jTextArea44);
		read("text45.txt", jTextArea45);
		read("text46.txt", jTextArea46);
		read("text47.txt", jTextArea47);
		read("text48.txt", jTextArea48);
		read("text49.txt", jTextArea49);
		read("text50.txt", jTextArea50);
		read("text51.txt", jTextArea51);
		read("text52.txt", jTextArea52);
		read("text53.txt", jTextArea53);
		read("text54.txt", jTextArea54);
		read("text55.txt", jTextArea55);
		read("text56.txt", jTextArea56);
		read("text57.txt", jTextArea57);
		read("text58.txt", jTextArea58);
		read("text59.txt", jTextArea59);
		read("text60.txt", jTextArea60);
		read("text61.txt", jTextArea61);
		read("text62.txt", jTextArea62);
		read("text63.txt", jTextArea63);
		read("text64.txt", jTextArea64);
		read("text65.txt", jTextArea65);
		read("text66.txt", jTextArea66);
		read("text67.txt", jTextArea67);
		read("text68.txt", jTextArea68);
		read("text69.txt", jTextArea69);
		read("text70.txt", jTextArea70);
		read("text71.txt", jTextArea71);
		read("text72.txt", jTextArea72);
		read("text73.txt", jTextArea73);
		read("text74.txt", jTextArea74);
		read("text75.txt", jTextArea75);
		read("text76.txt", jTextArea76);
		read("text77.txt", jTextArea77);
		read("text78.txt", jTextArea78);
		read("text79.txt", jTextArea79);
		read("text81.txt", jTextArea81);
		read("text82.txt", jTextArea82);
		read("text83.txt", jTextArea83);
		read("text84.txt", jTextArea84);
		read("text85.txt", jTextArea85);
		read("text86.txt", jTextArea86);
		read("text87.txt", jTextArea87);
		read("text88.txt", jTextArea88);
		read("text89.txt", jTextArea89);
		read("text90.txt", jTextArea90);
		read("text80.txt", jTextArea80);
		read("text91.txt", jTextArea91);
		read("text92.txt", jTextArea92);
		read("text93.txt", jTextArea93);
		read("text94.txt", jTextArea94);
		read("text95.txt", jTextArea95);
		read("text96.txt", jTextArea96);
		read("text97.txt", jTextArea97);
		read("text98.txt", jTextArea98);
		read("text99.txt", jTextArea99);
		read("text100.txt", jTextArea100);
		read("text101.txt", jTextArea101);
		read("text102.txt", jTextArea102);
		read("text103.txt", jTextArea103);
		read("text104.txt", jTextArea104);
		read("text105.txt", jTextArea105);
		read("text106.txt", jTextArea106);
		read("text107.txt", jTextArea107);
		read("text108.txt", jTextArea108);
		read("text109.txt", jTextArea109);

		read("label5.txt", jLabel5);
		read("label6.txt", jLabel6);
		read("label7.txt", jLabel7);
		read("label8.txt", jLabel8);
		read("label9.txt", jLabel9);
		read("label10.txt", jLabel10);
		read("label11.txt", jLabel11);
		read("label12.txt", jLabel12);
		read("label13.txt", jLabel13);
		read("label14.txt", jLabel14);
		read("label15.txt", jLabel15);
		read("label16.txt", jLabel16);
		read("label17.txt", jLabel17);
		read("label18.txt", jLabel18);
		read("label19.txt", jLabel19);
		read("label20.txt", jLabel20);
		read("label21.txt", jLabel21);
		read("label22.txt", jLabel22);
		read("label23.txt", jLabel23);
		read("label24.txt", jLabel24);
		read("label25.txt", jLabel25);

		jTabbedPane1.setTitleAt(0, read("tabTitle1.txt"));
		jTabbedPane1.setTitleAt(1, read("tabTitle2.txt"));
		jTabbedPane1.setTitleAt(2, read("tabTitle3.txt"));
		jTabbedPane1.setTitleAt(3, read("tabTitle4.txt"));
		jTabbedPane1.setTitleAt(4, read("tabTitle5.txt"));
		jTabbedPane2.setTitleAt(0, read("tabTitle6.txt"));
		jTabbedPane2.setTitleAt(1, read("tabTitle7.txt"));
		jTabbedPane2.setTitleAt(2, read("tabTitle8.txt"));
		jTabbedPane2.setTitleAt(3, read("tabTitle9.txt"));
		jTabbedPane3.setTitleAt(0, read("tabTitle10.txt"));
		jTabbedPane3.setTitleAt(1, read("tabTitle11.txt"));
		jTabbedPane3.setTitleAt(2, read("tabTitle12.txt"));
		jTabbedPane3.setTitleAt(3, read("tabTitle13.txt"));
		jTabbedPane3.setTitleAt(4, read("tabTitle14.txt"));
		jTabbedPane4.setTitleAt(0, read("tabTitle15.txt"));
		jTabbedPane4.setTitleAt(1, read("tabTitle16.txt"));
		jTabbedPane4.setTitleAt(2, read("tabTitle17.txt"));
		jTabbedPane4.setTitleAt(3, read("tabTitle18.txt"));
		jTabbedPane4.setTitleAt(4, read("tabTitle19.txt"));
		jTabbedPane5.setTitleAt(0, read("tabTitle20.txt"));
		jTabbedPane5.setTitleAt(1, read("tabTitle21.txt"));
		jTabbedPane5.setTitleAt(2, read("tabTitle22.txt"));
		jTabbedPane5.setTitleAt(3, read("tabTitle23.txt"));
		jTabbedPane5.setTitleAt(4, read("tabTitle24.txt"));
		jTabbedPane6.setTitleAt(0, read("tabTitle25.txt"));
		jTabbedPane6.setTitleAt(1, read("tabTitle26.txt"));
		jTabbedPane6.setTitleAt(2, read("tabTitle27.txt"));
		jTabbedPane6.setTitleAt(3, read("tabTitle28.txt"));
		jTabbedPane6.setTitleAt(4, read("tabTitle29.txt"));
		jTabbedPane7.setTitleAt(0, read("tabTitle30.txt"));
		jTabbedPane7.setTitleAt(1, read("tabTitle31.txt"));
		jTabbedPane7.setTitleAt(2, read("tabTitle32.txt"));
		jTabbedPane7.setTitleAt(3, read("tabTitle33.txt"));
		jTabbedPane7.setTitleAt(4, read("tabTitle34.txt"));
		jTabbedPane8.setTitleAt(0, read("tabTitle35.txt"));
		jTabbedPane8.setTitleAt(1, read("tabTitle36.txt"));
		jTabbedPane8.setTitleAt(2, read("tabTitle37.txt"));
		jTabbedPane8.setTitleAt(3, read("tabTitle38.txt"));
		jTabbedPane8.setTitleAt(4, read("tabTitle39.txt"));
		jTabbedPane9.setTitleAt(0, read("tabTitle40.txt"));
		jTabbedPane9.setTitleAt(1, read("tabTitle41.txt"));
		jTabbedPane9.setTitleAt(2, read("tabTitle42.txt"));
		jTabbedPane9.setTitleAt(3, read("tabTitle43.txt"));
		jTabbedPane9.setTitleAt(4, read("tabTitle44.txt"));
		jTabbedPane10.setTitleAt(0, read("tabTitle45.txt"));
		jTabbedPane10.setTitleAt(1, read("tabTitle46.txt"));
		jTabbedPane10.setTitleAt(2, read("tabTitle47.txt"));
		jTabbedPane10.setTitleAt(3, read("tabTitle48.txt"));
		jTabbedPane10.setTitleAt(4, read("tabTitle49.txt"));
		jTabbedPane11.setTitleAt(0, read("tabTitle50.txt"));
		jTabbedPane11.setTitleAt(1, read("tabTitle61.txt"));
		jTabbedPane11.setTitleAt(2, read("tabTitle62.txt"));
		jTabbedPane11.setTitleAt(3, read("tabTitle63.txt"));
		jTabbedPane11.setTitleAt(4, read("tabTitle64.txt"));
		jTabbedPane12.setTitleAt(0, read("tabTitle65.txt"));
		jTabbedPane12.setTitleAt(1, read("tabTitle66.txt"));
		jTabbedPane12.setTitleAt(2, read("tabTitle67.txt"));
		jTabbedPane12.setTitleAt(3, read("tabTitle68.txt"));
		jTabbedPane12.setTitleAt(4, read("tabTitle69.txt"));
		jTabbedPane13.setTitleAt(0, read("tabTitle70.txt"));
		jTabbedPane13.setTitleAt(1, read("tabTitle71.txt"));
		jTabbedPane13.setTitleAt(2, read("tabTitle72.txt"));
		jTabbedPane13.setTitleAt(3, read("tabTitle73.txt"));
		jTabbedPane13.setTitleAt(4, read("tabTitle74.txt"));
		jTabbedPane14.setTitleAt(0, read("tabTitle75.txt"));
		jTabbedPane14.setTitleAt(1, read("tabTitle76.txt"));
		jTabbedPane14.setTitleAt(2, read("tabTitle77.txt"));
		jTabbedPane14.setTitleAt(3, read("tabTitle78.txt"));
		jTabbedPane14.setTitleAt(4, read("tabTitle79.txt"));
		jTabbedPane15.setTitleAt(0, read("tabTitle80.txt"));
		jTabbedPane15.setTitleAt(1, read("tabTitle91.txt"));
		jTabbedPane15.setTitleAt(2, read("tabTitle92.txt"));
		jTabbedPane15.setTitleAt(3, read("tabTitle93.txt"));
		jTabbedPane15.setTitleAt(4, read("tabTitle94.txt"));
		jTabbedPane16.setTitleAt(0, read("tabTitle95.txt"));
		jTabbedPane16.setTitleAt(1, read("tabTitle96.txt"));
		jTabbedPane16.setTitleAt(2, read("tabTitle97.txt"));
		jTabbedPane16.setTitleAt(3, read("tabTitle98.txt"));
		jTabbedPane16.setTitleAt(4, read("tabTitle99.txt"));
		jTabbedPane17.setTitleAt(0, read("tabTitle100.txt"));
		jTabbedPane17.setTitleAt(1, read("tabTitle101.txt"));
		jTabbedPane17.setTitleAt(2, read("tabTitle102.txt"));
		jTabbedPane17.setTitleAt(3, read("tabTitle103.txt"));
		jTabbedPane17.setTitleAt(4, read("tabTitle104.txt"));
		jTabbedPane18.setTitleAt(0, read("tabTitle105.txt"));
		jTabbedPane18.setTitleAt(1, read("tabTitle106.txt"));
		jTabbedPane18.setTitleAt(2, read("tabTitle107.txt"));
		jTabbedPane18.setTitleAt(3, read("tabTitle108.txt"));
		jTabbedPane18.setTitleAt(4, read("tabTitle109.txt"));
		jTabbedPane19.setTitleAt(0, read("tabTitle51.txt"));
		jTabbedPane19.setTitleAt(1, read("tabTitle52.txt"));
		jTabbedPane19.setTitleAt(2, read("tabTitle53.txt"));
		jTabbedPane19.setTitleAt(3, read("tabTitle54.txt"));
		jTabbedPane19.setTitleAt(4, read("tabTitle55.txt"));
		jTabbedPane20.setTitleAt(0, read("tabTitle56.txt"));
		jTabbedPane20.setTitleAt(1, read("tabTitle57.txt"));
		jTabbedPane20.setTitleAt(2, read("tabTitle58.txt"));
		jTabbedPane20.setTitleAt(3, read("tabTitle59.txt"));
		jTabbedPane20.setTitleAt(4, read("tabTitle60.txt"));
		jTabbedPane21.setTitleAt(0, read("tabTitle81.txt"));
		jTabbedPane21.setTitleAt(1, read("tabTitle82.txt"));
		jTabbedPane21.setTitleAt(2, read("tabTitle83.txt"));
		jTabbedPane21.setTitleAt(3, read("tabTitle84.txt"));
		jTabbedPane21.setTitleAt(4, read("tabTitle85.txt"));
		jTabbedPane21.setTitleAt(5, read("tabTitle86.txt"));
		jTabbedPane21.setTitleAt(6, read("tabTitle87.txt"));
		jTabbedPane21.setTitleAt(7, read("tabTitle88.txt"));
		jTabbedPane21.setTitleAt(8, read("tabTitle89.txt"));
		jTabbedPane21.setTitleAt(9, read("tabTitle90.txt"));

		k = 5;
		card.show(jPanel4, "card2");
		jTextField1.setText(jLabel5.getText());
		jLabel3.setText(jLabel5.getText());
	}

	public void save() {
		write("text1.txt", jTextArea1);
		write("text2.txt", jTextArea2);
		write("text3.txt", jTextArea3);
		write("text4.txt", jTextArea4);
		write("text5.txt", jTextArea5);
		write("text6.txt", jTextArea6);
		write("text7.txt", jTextArea7);
		write("text8.txt", jTextArea8);
		write("text9.txt", jTextArea9);
		write("text10.txt", jTextArea10);
		write("text11.txt", jTextArea11);
		write("text12.txt", jTextArea12);
		write("text13.txt", jTextArea13);
		write("text14.txt", jTextArea14);
		write("text15.txt", jTextArea15);
		write("text16.txt", jTextArea16);
		write("text17.txt", jTextArea17);
		write("text18.txt", jTextArea18);
		write("text19.txt", jTextArea19);
		write("text20.txt", jTextArea20);
		write("text21.txt", jTextArea21);
		write("text22.txt", jTextArea22);
		write("text23.txt", jTextArea23);
		write("text24.txt", jTextArea24);
		write("text25.txt", jTextArea25);
		write("text26.txt", jTextArea26);
		write("text27.txt", jTextArea27);
		write("text28.txt", jTextArea28);
		write("text29.txt", jTextArea29);
		write("text30.txt", jTextArea30);
		write("text31.txt", jTextArea31);
		write("text32.txt", jTextArea32);
		write("text33.txt", jTextArea33);
		write("text34.txt", jTextArea34);
		write("text35.txt", jTextArea35);
		write("text36.txt", jTextArea36);
		write("text37.txt", jTextArea37);
		write("text38.txt", jTextArea38);
		write("text39.txt", jTextArea39);
		write("text40.txt", jTextArea40);
		write("text41.txt", jTextArea41);
		write("text42.txt", jTextArea42);
		write("text43.txt", jTextArea43);
		write("text44.txt", jTextArea44);
		write("text45.txt", jTextArea45);
		write("text46.txt", jTextArea46);
		write("text47.txt", jTextArea47);
		write("text48.txt", jTextArea48);
		write("text49.txt", jTextArea49);
		write("text50.txt", jTextArea50);
		write("text51.txt", jTextArea51);
		write("text52.txt", jTextArea52);
		write("text53.txt", jTextArea53);
		write("text54.txt", jTextArea54);
		write("text55.txt", jTextArea55);
		write("text56.txt", jTextArea56);
		write("text57.txt", jTextArea57);
		write("text58.txt", jTextArea58);
		write("text59.txt", jTextArea59);
		write("text60.txt", jTextArea60);
		write("text61.txt", jTextArea61);
		write("text62.txt", jTextArea62);
		write("text63.txt", jTextArea63);
		write("text64.txt", jTextArea64);
		write("text65.txt", jTextArea65);
		write("text66.txt", jTextArea66);
		write("text67.txt", jTextArea67);
		write("text68.txt", jTextArea68);
		write("text69.txt", jTextArea69);
		write("text70.txt", jTextArea70);
		write("text71.txt", jTextArea71);
		write("text72.txt", jTextArea72);
		write("text73.txt", jTextArea73);
		write("text74.txt", jTextArea74);
		write("text75.txt", jTextArea75);
		write("text76.txt", jTextArea76);
		write("text77.txt", jTextArea77);
		write("text78.txt", jTextArea78);
		write("text79.txt", jTextArea79);
		write("text80.txt", jTextArea80);
		write("text81.txt", jTextArea81);
		write("text82.txt", jTextArea82);
		write("text83.txt", jTextArea83);
		write("text84.txt", jTextArea84);
		write("text85.txt", jTextArea85);
		write("text86.txt", jTextArea86);
		write("text87.txt", jTextArea87);
		write("text88.txt", jTextArea88);
		write("text89.txt", jTextArea89);
		write("text90.txt", jTextArea90);
		write("text91.txt", jTextArea91);
		write("text92.txt", jTextArea92);
		write("text93.txt", jTextArea93);
		write("text94.txt", jTextArea94);
		write("text95.txt", jTextArea95);
		write("text96.txt", jTextArea96);
		write("text97.txt", jTextArea97);
		write("text98.txt", jTextArea98);
		write("text99.txt", jTextArea99);
		write("text100.txt", jTextArea100);
		write("text101.txt", jTextArea101);
		write("text102.txt", jTextArea102);
		write("text103.txt", jTextArea103);
		write("text104.txt", jTextArea104);
		write("text105.txt", jTextArea105);
		write("text106.txt", jTextArea106);
		write("text107.txt", jTextArea107);
		write("text108.txt", jTextArea108);
		write("text109.txt", jTextArea109);

		write("label5.txt", jLabel5);
		write("label6.txt", jLabel6);
		write("label7.txt", jLabel7);
		write("label8.txt", jLabel8);
		write("label9.txt", jLabel9);
		write("label10.txt", jLabel10);
		write("label11.txt", jLabel11);
		write("label12.txt", jLabel12);
		write("label13.txt", jLabel13);
		write("label14.txt", jLabel14);
		write("label15.txt", jLabel15);
		write("label16.txt", jLabel16);
		write("label17.txt", jLabel17);
		write("label18.txt", jLabel18);
		write("label19.txt", jLabel19);
		write("label20.txt", jLabel20);
		write("label21.txt", jLabel21);
		write("label22.txt", jLabel22);
		write("label23.txt", jLabel23);
		write("label24.txt", jLabel24);
		write("label25.txt", jLabel25);

		write("tabTitle1.txt", jTabbedPane1.getTitleAt(0));
		write("tabTitle2.txt", jTabbedPane1.getTitleAt(1));
		write("tabTitle3.txt", jTabbedPane1.getTitleAt(2));
		write("tabTitle4.txt", jTabbedPane1.getTitleAt(3));
		write("tabTitle5.txt", jTabbedPane1.getTitleAt(4));
		write("tabTitle6.txt", jTabbedPane2.getTitleAt(0));
		write("tabTitle7.txt", jTabbedPane2.getTitleAt(1));
		write("tabTitle8.txt", jTabbedPane2.getTitleAt(2));
		write("tabTitle9.txt", jTabbedPane2.getTitleAt(3));
		write("tabTitle10.txt", jTabbedPane3.getTitleAt(0));
		write("tabTitle11.txt", jTabbedPane3.getTitleAt(1));
		write("tabTitle12.txt", jTabbedPane3.getTitleAt(2));
		write("tabTitle13.txt", jTabbedPane3.getTitleAt(3));
		write("tabTitle14.txt", jTabbedPane3.getTitleAt(4));
		write("tabTitle15.txt", jTabbedPane4.getTitleAt(0));
		write("tabTitle16.txt", jTabbedPane4.getTitleAt(1));
		write("tabTitle17.txt", jTabbedPane4.getTitleAt(2));
		write("tabTitle18.txt", jTabbedPane4.getTitleAt(3));
		write("tabTitle19.txt", jTabbedPane4.getTitleAt(4));
		write("tabTitle20.txt", jTabbedPane5.getTitleAt(0));
		write("tabTitle21.txt", jTabbedPane5.getTitleAt(1));
		write("tabTitle22.txt", jTabbedPane5.getTitleAt(2));
		write("tabTitle23.txt", jTabbedPane5.getTitleAt(3));
		write("tabTitle24.txt", jTabbedPane5.getTitleAt(4));
		write("tabTitle25.txt", jTabbedPane6.getTitleAt(0));
		write("tabTitle26.txt", jTabbedPane6.getTitleAt(1));
		write("tabTitle27.txt", jTabbedPane6.getTitleAt(2));
		write("tabTitle28.txt", jTabbedPane6.getTitleAt(3));
		write("tabTitle29.txt", jTabbedPane6.getTitleAt(4));
		write("tabTitle30.txt", jTabbedPane7.getTitleAt(0));
		write("tabTitle31.txt", jTabbedPane7.getTitleAt(1));
		write("tabTitle32.txt", jTabbedPane7.getTitleAt(2));
		write("tabTitle33.txt", jTabbedPane7.getTitleAt(3));
		write("tabTitle34.txt", jTabbedPane7.getTitleAt(4));
		write("tabTitle35.txt", jTabbedPane8.getTitleAt(0));
		write("tabTitle36.txt", jTabbedPane8.getTitleAt(1));
		write("tabTitle37.txt", jTabbedPane8.getTitleAt(2));
		write("tabTitle38.txt", jTabbedPane8.getTitleAt(3));
		write("tabTitle39.txt", jTabbedPane8.getTitleAt(4));
		write("tabTitle40.txt", jTabbedPane9.getTitleAt(0));
		write("tabTitle41.txt", jTabbedPane9.getTitleAt(1));
		write("tabTitle42.txt", jTabbedPane9.getTitleAt(2));
		write("tabTitle43.txt", jTabbedPane9.getTitleAt(3));
		write("tabTitle44.txt", jTabbedPane9.getTitleAt(4));
		write("tabTitle45.txt", jTabbedPane10.getTitleAt(0));
		write("tabTitle46.txt", jTabbedPane10.getTitleAt(1));
		write("tabTitle47.txt", jTabbedPane10.getTitleAt(2));
		write("tabTitle48.txt", jTabbedPane10.getTitleAt(3));
		write("tabTitle49.txt", jTabbedPane10.getTitleAt(4));
		write("tabTitle50.txt", jTabbedPane11.getTitleAt(0));
		write("tabTitle61.txt", jTabbedPane11.getTitleAt(1));
		write("tabTitle62.txt", jTabbedPane11.getTitleAt(2));
		write("tabTitle63.txt", jTabbedPane11.getTitleAt(3));
		write("tabTitle64.txt", jTabbedPane11.getTitleAt(4));
		write("tabTitle65.txt", jTabbedPane12.getTitleAt(0));
		write("tabTitle66.txt", jTabbedPane12.getTitleAt(1));
		write("tabTitle67.txt", jTabbedPane12.getTitleAt(2));
		write("tabTitle68.txt", jTabbedPane12.getTitleAt(3));
		write("tabTitle69.txt", jTabbedPane12.getTitleAt(4));
		write("tabTitle70.txt", jTabbedPane13.getTitleAt(0));
		write("tabTitle71.txt", jTabbedPane13.getTitleAt(1));
		write("tabTitle72.txt", jTabbedPane13.getTitleAt(2));
		write("tabTitle73.txt", jTabbedPane13.getTitleAt(3));
		write("tabTitle74.txt", jTabbedPane13.getTitleAt(4));
		write("tabTitle75.txt", jTabbedPane14.getTitleAt(0));
		write("tabTitle76.txt", jTabbedPane14.getTitleAt(1));
		write("tabTitle77.txt", jTabbedPane14.getTitleAt(2));
		write("tabTitle78.txt", jTabbedPane14.getTitleAt(3));
		write("tabTitle79.txt", jTabbedPane14.getTitleAt(4));
		write("tabTitle80.txt", jTabbedPane15.getTitleAt(0));
		write("tabTitle91.txt", jTabbedPane15.getTitleAt(1));
		write("tabTitle92.txt", jTabbedPane15.getTitleAt(2));
		write("tabTitle93.txt", jTabbedPane15.getTitleAt(3));
		write("tabTitle94.txt", jTabbedPane15.getTitleAt(4));
		write("tabTitle95.txt", jTabbedPane16.getTitleAt(0));
		write("tabTitle96.txt", jTabbedPane16.getTitleAt(1));
		write("tabTitle97.txt", jTabbedPane16.getTitleAt(2));
		write("tabTitle98.txt", jTabbedPane16.getTitleAt(3));
		write("tabTitle99.txt", jTabbedPane16.getTitleAt(4));
		write("tabTitle100.txt", jTabbedPane17.getTitleAt(0));
		write("tabTitle101.txt", jTabbedPane17.getTitleAt(1));
		write("tabTitle102.txt", jTabbedPane17.getTitleAt(2));
		write("tabTitle103.txt", jTabbedPane17.getTitleAt(3));
		write("tabTitle104.txt", jTabbedPane17.getTitleAt(4));
		write("tabTitle105.txt", jTabbedPane18.getTitleAt(0));
		write("tabTitle106.txt", jTabbedPane18.getTitleAt(1));
		write("tabTitle107.txt", jTabbedPane18.getTitleAt(2));
		write("tabTitle108.txt", jTabbedPane18.getTitleAt(3));
		write("tabTitle109.txt", jTabbedPane18.getTitleAt(4));
		write("tabTitle51.txt", jTabbedPane19.getTitleAt(0));
		write("tabTitle52.txt", jTabbedPane19.getTitleAt(1));
		write("tabTitle53.txt", jTabbedPane19.getTitleAt(2));
		write("tabTitle54.txt", jTabbedPane19.getTitleAt(3));
		write("tabTitle55.txt", jTabbedPane19.getTitleAt(4));
		write("tabTitle56.txt", jTabbedPane20.getTitleAt(0));
		write("tabTitle57.txt", jTabbedPane20.getTitleAt(1));
		write("tabTitle58.txt", jTabbedPane20.getTitleAt(2));
		write("tabTitle59.txt", jTabbedPane20.getTitleAt(3));
		write("tabTitle60.txt", jTabbedPane20.getTitleAt(4));
		write("tabTitle81.txt", jTabbedPane21.getTitleAt(0));
		write("tabTitle82.txt", jTabbedPane21.getTitleAt(1));
		write("tabTitle83.txt", jTabbedPane21.getTitleAt(2));
		write("tabTitle84.txt", jTabbedPane21.getTitleAt(3));
		write("tabTitle85.txt", jTabbedPane21.getTitleAt(4));
		write("tabTitle86.txt", jTabbedPane21.getTitleAt(5));
		write("tabTitle87.txt", jTabbedPane21.getTitleAt(6));
		write("tabTitle88.txt", jTabbedPane21.getTitleAt(7));
		write("tabTitle89.txt", jTabbedPane21.getTitleAt(8));
		write("tabTitle90.txt", jTabbedPane21.getTitleAt(9));

		jTabbedPane2.setName("hello");

	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		save();
	}

	private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
		if (k == 6) {
			p = jTabbedPane2.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea2.selectAll();
				break;
			case 1:
				jTextArea3.selectAll();
				break;
			case 2:
				jTextArea4.selectAll();
				break;
			case 3:
				jTextArea5.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 7) {
			p = jTabbedPane3.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea6.selectAll();
				break;
			case 1:
				jTextArea7.selectAll();
				break;
			case 2:
				jTextArea8.selectAll();
				break;
			case 3:
				jTextArea9.selectAll();
				break;
			case 4:
				jTextArea10.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 8) {
			p = jTabbedPane4.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea11.selectAll();
				break;
			case 1:
				jTextArea12.selectAll();
				break;
			case 2:
				jTextArea13.selectAll();
				break;
			case 3:
				jTextArea14.selectAll();
				break;
			case 4:
				jTextArea15.selectAll();
				break;
			default:
				break;
			}
		}

		if (k == 9) {
			p = jTabbedPane5.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea16.selectAll();
				break;
			case 1:
				jTextArea17.selectAll();
				break;
			case 2:
				jTextArea18.selectAll();
				break;
			case 3:
				jTextArea19.selectAll();
				break;
			case 4:
				jTextArea20.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 10) {
			p = jTabbedPane6.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea21.selectAll();
				break;
			case 1:
				jTextArea22.selectAll();
				break;
			case 2:
				jTextArea23.selectAll();
				break;
			case 3:
				jTextArea24.selectAll();
				break;
			case 4:
				jTextArea25.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 11) {
			p = jTabbedPane7.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea26.selectAll();
				break;
			case 1:
				jTextArea27.selectAll();
				break;
			case 2:
				jTextArea28.selectAll();
				break;
			case 3:
				jTextArea29.selectAll();
				break;
			case 4:
				jTextArea30.selectAll();
				break;
			default:
				break;
			}
		}

		if (k == 12) {
			p = jTabbedPane8.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea31.selectAll();
				break;
			case 1:
				jTextArea32.selectAll();
				break;
			case 2:
				jTextArea33.selectAll();
				break;
			case 3:
				jTextArea34.selectAll();
				break;
			case 4:
				jTextArea35.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 13) {
			p = jTabbedPane9.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea36.selectAll();
				break;
			case 1:
				jTextArea37.selectAll();
				break;
			case 2:
				jTextArea38.selectAll();
				break;
			case 3:
				jTextArea39.selectAll();
				break;
			case 4:
				jTextArea40.selectAll();
				break;
			default:
				break;
			}
		}

		if (k == 14) {
			p = jTabbedPane10.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea41.selectAll();
				break;
			case 1:
				jTextArea42.selectAll();
				break;
			case 2:
				jTextArea43.selectAll();
				break;
			case 3:
				jTextArea44.selectAll();
				break;
			case 4:
				jTextArea45.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 15) {
			p = jTabbedPane11.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea46.selectAll();
				break;
			case 1:
				jTextArea47.selectAll();
				break;
			case 2:
				jTextArea48.selectAll();
				break;
			case 3:
				jTextArea49.selectAll();
				break;
			case 4:
				jTextArea50.selectAll();
				break;
			default:
				break;
			}
		}

		if (k == 16) {
			p = jTabbedPane12.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea51.selectAll();
				break;
			case 1:
				jTextArea52.selectAll();
				break;
			case 2:
				jTextArea53.selectAll();
				break;
			case 3:
				jTextArea54.selectAll();
				break;
			case 4:
				jTextArea55.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 17) {
			p = jTabbedPane13.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea56.selectAll();
				break;
			case 1:
				jTextArea57.selectAll();
				break;
			case 2:
				jTextArea58.selectAll();
				break;
			case 3:
				jTextArea59.selectAll();
				break;
			case 4:
				jTextArea60.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 18) {
			p = jTabbedPane14.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea61.selectAll();
				break;
			case 1:
				jTextArea62.selectAll();
				break;
			case 2:
				jTextArea63.selectAll();
				break;
			case 3:
				jTextArea64.selectAll();
				break;
			case 4:
				jTextArea65.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 19) {
			p = jTabbedPane15.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea66.selectAll();
				break;
			case 1:
				jTextArea67.selectAll();
				break;
			case 2:
				jTextArea68.selectAll();
				break;
			case 3:
				jTextArea69.selectAll();
				break;
			case 4:
				jTextArea70.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 20) {
			p = jTabbedPane16.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea71.selectAll();
				break;
			case 1:
				jTextArea72.selectAll();
				break;
			case 2:
				jTextArea73.selectAll();
				break;
			case 3:
				jTextArea74.selectAll();
				break;
			case 4:
				jTextArea75.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 21) {
			p = jTabbedPane17.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea76.selectAll();
				break;
			case 1:
				jTextArea77.selectAll();
				break;
			case 2:
				jTextArea78.selectAll();
				break;
			case 3:
				jTextArea79.selectAll();
				break;
			case 4:
				jTextArea80.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 22) {
			p = jTabbedPane18.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea81.selectAll();
				break;
			case 1:
				jTextArea82.selectAll();
				break;
			case 2:
				jTextArea83.selectAll();
				break;
			case 3:
				jTextArea84.selectAll();
				break;
			case 4:
				jTextArea85.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 23) {
			p = jTabbedPane19.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea86.selectAll();
				break;
			case 1:
				jTextArea87.selectAll();
				break;
			case 2:
				jTextArea88.selectAll();
				break;
			case 3:
				jTextArea89.selectAll();
				break;
			case 4:
				jTextArea90.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 5) {
			p = jTabbedPane1.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea91.selectAll();
				break;
			case 1:
				jTextArea92.selectAll();
				break;
			case 2:
				jTextArea93.selectAll();
				break;
			case 3:
				jTextArea94.selectAll();
				break;
			case 4:
				jTextArea95.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 24) {
			p = jTabbedPane20.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea96.selectAll();
				break;
			case 1:
				jTextArea97.selectAll();
				break;
			case 2:
				jTextArea98.selectAll();
				break;
			case 3:
				jTextArea99.selectAll();
				break;
			case 4:
				jTextArea100.selectAll();
				break;
			default:
				break;
			}
		}
		if (k == 24) {
			p = jTabbedPane21.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea1.selectAll();
				break;
			case 1:
				jTextArea101.selectAll();
				break;
			case 2:
				jTextArea102.selectAll();
				break;
			case 3:
				jTextArea103.selectAll();
				break;
			case 4:
				jTextArea104.selectAll();
				break;
			case 5:
				jTextArea105.selectAll();
				break;
			case 6:
				jTextArea106.selectAll();
				break;
			case 7:
				jTextArea107.selectAll();
				break;
			case 8:
				jTextArea108.selectAll();
				break;
			case 9:
				jTextArea109.selectAll();
			default:
				break;
			}
		}

	}

	private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
		if (k == 6) {
			p = jTabbedPane2.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea2.copy();
				break;
			case 1:
				jTextArea3.copy();
				break;
			case 2:
				jTextArea4.copy();
				break;
			case 3:
				jTextArea5.copy();
				break;
			default:
				break;
			}
		}
		if (k == 7) {
			p = jTabbedPane3.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea6.copy();
				break;
			case 1:
				jTextArea7.copy();
				break;
			case 2:
				jTextArea8.copy();
				break;
			case 3:
				jTextArea9.copy();
				break;
			case 4:
				jTextArea10.copy();
				break;
			default:
				break;
			}
		}
		if (k == 8) {
			p = jTabbedPane4.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea11.copy();
				break;
			case 1:
				jTextArea12.copy();
				break;
			case 2:
				jTextArea13.copy();
				break;
			case 3:
				jTextArea14.copy();
				break;
			case 4:
				jTextArea15.copy();
				break;
			default:
				break;
			}
		}

		if (k == 9) {
			p = jTabbedPane5.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea16.copy();
				break;
			case 1:
				jTextArea17.copy();
				break;
			case 2:
				jTextArea18.copy();
				break;
			case 3:
				jTextArea19.copy();
				break;
			case 4:
				jTextArea20.copy();
				break;
			default:
				break;
			}
		}
		if (k == 10) {
			p = jTabbedPane6.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea21.copy();
				break;
			case 1:
				jTextArea22.copy();
				break;
			case 2:
				jTextArea23.copy();
				break;
			case 3:
				jTextArea24.copy();
				break;
			case 4:
				jTextArea25.copy();
				break;
			default:
				break;
			}
		}
		if (k == 11) {
			p = jTabbedPane7.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea26.copy();
				break;
			case 1:
				jTextArea27.copy();
				break;
			case 2:
				jTextArea28.copy();
				break;
			case 3:
				jTextArea29.copy();
				break;
			case 4:
				jTextArea30.copy();
				break;
			default:
				break;
			}
		}

		if (k == 12) {
			p = jTabbedPane8.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea31.copy();
				break;
			case 1:
				jTextArea32.copy();
				break;
			case 2:
				jTextArea33.copy();
				break;
			case 3:
				jTextArea34.copy();
				break;
			case 4:
				jTextArea35.copy();
				break;
			default:
				break;
			}
		}
		if (k == 13) {
			p = jTabbedPane9.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea36.copy();
				break;
			case 1:
				jTextArea37.copy();
				break;
			case 2:
				jTextArea38.copy();
				break;
			case 3:
				jTextArea39.copy();
				break;
			case 4:
				jTextArea40.copy();
				break;
			default:
				break;
			}
		}

		if (k == 14) {
			p = jTabbedPane10.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea41.copy();
				break;
			case 1:
				jTextArea42.copy();
				break;
			case 2:
				jTextArea43.copy();
				break;
			case 3:
				jTextArea44.copy();
				break;
			case 4:
				jTextArea45.copy();
				break;
			default:
				break;
			}
		}
		if (k == 15) {
			p = jTabbedPane11.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea46.copy();
				break;
			case 1:
				jTextArea47.copy();
				break;
			case 2:
				jTextArea48.copy();
				break;
			case 3:
				jTextArea49.copy();
				break;
			case 4:
				jTextArea50.copy();
				break;
			default:
				break;
			}
		}

		if (k == 16) {
			p = jTabbedPane12.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea51.copy();
				break;
			case 1:
				jTextArea52.copy();
				break;
			case 2:
				jTextArea53.copy();
				break;
			case 3:
				jTextArea54.copy();
				break;
			case 4:
				jTextArea55.copy();
				break;
			default:
				break;
			}
		}
		if (k == 17) {
			p = jTabbedPane13.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea56.copy();
				break;
			case 1:
				jTextArea57.copy();
				break;
			case 2:
				jTextArea58.copy();
				break;
			case 3:
				jTextArea59.copy();
				break;
			case 4:
				jTextArea60.copy();
				break;
			default:
				break;
			}
		}
		if (k == 18) {
			p = jTabbedPane14.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea61.copy();
				break;
			case 1:
				jTextArea62.copy();
				break;
			case 2:
				jTextArea63.copy();
				break;
			case 3:
				jTextArea64.copy();
				break;
			case 4:
				jTextArea65.copy();
				break;
			default:
				break;
			}
		}
		if (k == 19) {
			p = jTabbedPane15.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea66.copy();
				break;
			case 1:
				jTextArea67.copy();
				break;
			case 2:
				jTextArea68.copy();
				break;
			case 3:
				jTextArea69.copy();
				break;
			case 4:
				jTextArea70.copy();
				break;
			default:
				break;
			}
		}
		if (k == 20) {
			p = jTabbedPane16.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea71.copy();
				break;
			case 1:
				jTextArea72.copy();
				break;
			case 2:
				jTextArea73.copy();
				break;
			case 3:
				jTextArea74.copy();
				break;
			case 4:
				jTextArea75.copy();
				break;
			default:
				break;
			}
		}
		if (k == 21) {
			p = jTabbedPane17.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea76.copy();
				break;
			case 1:
				jTextArea77.copy();
				break;
			case 2:
				jTextArea78.copy();
				break;
			case 3:
				jTextArea79.copy();
				break;
			case 4:
				jTextArea80.copy();
				break;
			default:
				break;
			}
		}
		if (k == 22) {
			p = jTabbedPane18.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea81.copy();
				break;
			case 1:
				jTextArea82.copy();
				break;
			case 2:
				jTextArea83.copy();
				break;
			case 3:
				jTextArea84.copy();
				break;
			case 4:
				jTextArea85.copy();
				break;
			default:
				break;
			}
		}
		if (k == 23) {
			p = jTabbedPane19.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea86.copy();
				break;
			case 1:
				jTextArea87.copy();
				break;
			case 2:
				jTextArea88.copy();
				break;
			case 3:
				jTextArea89.copy();
				break;
			case 4:
				jTextArea90.copy();
				break;
			default:
				break;
			}
		}
		if (k == 5) {
			p = jTabbedPane1.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea91.copy();
				break;
			case 1:
				jTextArea92.copy();
				break;
			case 2:
				jTextArea93.copy();
				break;
			case 3:
				jTextArea94.copy();
				break;
			case 4:
				jTextArea95.copy();
				break;
			default:
				break;
			}
		}
		if (k == 24) {
			p = jTabbedPane20.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea96.copy();
				break;
			case 1:
				jTextArea97.copy();
				break;
			case 2:
				jTextArea98.copy();
				break;
			case 3:
				jTextArea99.copy();
				break;
			case 4:
				jTextArea100.copy();
				break;
			default:
				break;
			}
		}
		if (k == 24) {
			p = jTabbedPane21.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea1.copy();
				break;
			case 1:
				jTextArea101.copy();
				break;
			case 2:
				jTextArea102.copy();
				break;
			case 3:
				jTextArea103.copy();
				break;
			case 4:
				jTextArea104.copy();
				break;
			case 5:
				jTextArea105.copy();
				break;
			case 6:
				jTextArea106.copy();
				break;
			case 7:
				jTextArea107.copy();
				break;
			case 8:
				jTextArea108.copy();
				break;
			case 9:
				jTextArea109.copy();
			default:
				break;
			}
		}

	}

	int k, p;

	private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
		if (k == 5)
			jLabel5.setText(jTextField1.getText());
		if (k == 6)
			jLabel6.setText(jTextField1.getText());
		if (k == 7)
			jLabel7.setText(jTextField1.getText());
		if (k == 8)
			jLabel8.setText(jTextField1.getText());
		if (k == 9)
			jLabel9.setText(jTextField1.getText());
		if (k == 10)
			jLabel10.setText(jTextField1.getText());
		if (k == 11)
			jLabel11.setText(jTextField1.getText());
		if (k == 12)
			jLabel12.setText(jTextField1.getText());
		if (k == 13)
			jLabel13.setText(jTextField1.getText());
		if (k == 14)
			jLabel14.setText(jTextField1.getText());
		if (k == 15)
			jLabel15.setText(jTextField1.getText());
		if (k == 16)
			jLabel16.setText(jTextField1.getText());
		if (k == 17)
			jLabel17.setText(jTextField1.getText());
		if (k == 18)
			jLabel18.setText(jTextField1.getText());
		if (k == 19)
			jLabel19.setText(jTextField1.getText());
		if (k == 20)
			jLabel20.setText(jTextField1.getText());
		if (k == 21)
			jLabel21.setText(jTextField1.getText());
		if (k == 22)
			jLabel22.setText(jTextField1.getText());
		if (k == 23)
			jLabel23.setText(jTextField1.getText());
		if (k == 24)
			jLabel24.setText(jTextField1.getText());
		if (k == 25)
			jLabel25.setText(jTextField1.getText());
	}

	private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
		if (k == 6)
			jTabbedPane2.setTitleAt(jTabbedPane2.getSelectedIndex(),
					jTextField2.getText());
		if (k == 5)
			jTabbedPane1.setTitleAt(jTabbedPane1.getSelectedIndex(),
					jTextField2.getText());
		if (k == 7)
			jTabbedPane3.setTitleAt(jTabbedPane3.getSelectedIndex(),
					jTextField2.getText());
		if (k == 8)
			jTabbedPane4.setTitleAt(jTabbedPane4.getSelectedIndex(),
					jTextField2.getText());
		if (k == 9)
			jTabbedPane5.setTitleAt(jTabbedPane5.getSelectedIndex(),
					jTextField2.getText());
		if (k == 10)
			jTabbedPane6.setTitleAt(jTabbedPane6.getSelectedIndex(),
					jTextField2.getText());
		if (k == 11)
			jTabbedPane7.setTitleAt(jTabbedPane7.getSelectedIndex(),
					jTextField2.getText());
		if (k == 12)
			jTabbedPane8.setTitleAt(jTabbedPane8.getSelectedIndex(),
					jTextField2.getText());
		if (k == 13)
			jTabbedPane9.setTitleAt(jTabbedPane9.getSelectedIndex(),
					jTextField2.getText());
		if (k == 14)
			jTabbedPane10.setTitleAt(jTabbedPane10.getSelectedIndex(),
					jTextField2.getText());
		if (k == 15)
			jTabbedPane11.setTitleAt(jTabbedPane11.getSelectedIndex(),
					jTextField2.getText());
		if (k == 16)
			jTabbedPane12.setTitleAt(jTabbedPane12.getSelectedIndex(),
					jTextField2.getText());
		if (k == 17)
			jTabbedPane13.setTitleAt(jTabbedPane13.getSelectedIndex(),
					jTextField2.getText());
		if (k == 18)
			jTabbedPane14.setTitleAt(jTabbedPane14.getSelectedIndex(),
					jTextField2.getText());
		if (k == 19)
			jTabbedPane15.setTitleAt(jTabbedPane15.getSelectedIndex(),
					jTextField2.getText());
		if (k == 20)
			jTabbedPane16.setTitleAt(jTabbedPane16.getSelectedIndex(),
					jTextField2.getText());
		if (k == 21)
			jTabbedPane17.setTitleAt(jTabbedPane17.getSelectedIndex(),
					jTextField2.getText());
		if (k == 22)
			jTabbedPane18.setTitleAt(jTabbedPane18.getSelectedIndex(),
					jTextField2.getText());
		if (k == 23)
			jTabbedPane19.setTitleAt(jTabbedPane19.getSelectedIndex(),
					jTextField2.getText());
		if (k == 24)
			jTabbedPane20.setTitleAt(jTabbedPane20.getSelectedIndex(),
					jTextField2.getText());
		if (k == 25)
			jTabbedPane21.setTitleAt(jTabbedPane21.getSelectedIndex(),
					jTextField2.getText());

	}

	private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {

		if (k == 6) {
			p = jTabbedPane2.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea2.paste();
				break;
			case 1:
				jTextArea3.paste();
				break;
			case 2:
				jTextArea4.paste();
				break;
			case 3:
				jTextArea5.paste();
				break;
			default:
				break;
			}
		}
		if (k == 7) {
			p = jTabbedPane3.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea6.paste();
				break;
			case 1:
				jTextArea7.paste();
				break;
			case 2:
				jTextArea8.paste();
				break;
			case 3:
				jTextArea9.paste();
				break;
			case 4:
				jTextArea10.paste();
				break;
			default:
				break;
			}
		}
		if (k == 8) {
			p = jTabbedPane4.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea11.paste();
				break;
			case 1:
				jTextArea12.paste();
				break;
			case 2:
				jTextArea13.paste();
				break;
			case 3:
				jTextArea14.paste();
				break;
			case 4:
				jTextArea15.paste();
				break;
			default:
				break;
			}
		}

		if (k == 9) {
			p = jTabbedPane5.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea16.paste();
				break;
			case 1:
				jTextArea17.paste();
				break;
			case 2:
				jTextArea18.paste();
				break;
			case 3:
				jTextArea19.paste();
				break;
			case 4:
				jTextArea20.paste();
				break;
			default:
				break;
			}
		}
		if (k == 10) {
			p = jTabbedPane6.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea21.paste();
				break;
			case 1:
				jTextArea22.paste();
				break;
			case 2:
				jTextArea23.paste();
				break;
			case 3:
				jTextArea24.paste();
				break;
			case 4:
				jTextArea25.paste();
				break;
			default:
				break;
			}
		}
		if (k == 11) {
			p = jTabbedPane7.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea26.paste();
				break;
			case 1:
				jTextArea27.paste();
				break;
			case 2:
				jTextArea28.paste();
				break;
			case 3:
				jTextArea29.paste();
				break;
			case 4:
				jTextArea30.paste();
				break;
			default:
				break;
			}
		}

		if (k == 12) {
			p = jTabbedPane8.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea31.paste();
				break;
			case 1:
				jTextArea32.paste();
				break;
			case 2:
				jTextArea33.paste();
				break;
			case 3:
				jTextArea34.paste();
				break;
			case 4:
				jTextArea35.paste();
				break;
			default:
				break;
			}
		}
		if (k == 13) {
			p = jTabbedPane9.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea36.paste();
				break;
			case 1:
				jTextArea37.paste();
				break;
			case 2:
				jTextArea38.paste();
				break;
			case 3:
				jTextArea39.paste();
				break;
			case 4:
				jTextArea40.paste();
				break;
			default:
				break;
			}
		}

		if (k == 14) {
			p = jTabbedPane10.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea41.paste();
				break;
			case 1:
				jTextArea42.paste();
				break;
			case 2:
				jTextArea43.paste();
				break;
			case 3:
				jTextArea44.paste();
				break;
			case 4:
				jTextArea45.paste();
				break;
			default:
				break;
			}
		}
		if (k == 15) {
			p = jTabbedPane11.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea46.paste();
				break;
			case 1:
				jTextArea47.paste();
				break;
			case 2:
				jTextArea48.paste();
				break;
			case 3:
				jTextArea49.paste();
				break;
			case 4:
				jTextArea50.paste();
				break;
			default:
				break;
			}
		}

		if (k == 16) {
			p = jTabbedPane12.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea51.paste();
				break;
			case 1:
				jTextArea52.paste();
				break;
			case 2:
				jTextArea53.paste();
				break;
			case 3:
				jTextArea54.paste();
				break;
			case 4:
				jTextArea55.paste();
				break;
			default:
				break;
			}
		}
		if (k == 17) {
			p = jTabbedPane13.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea56.paste();
				break;
			case 1:
				jTextArea57.paste();
				break;
			case 2:
				jTextArea58.paste();
				break;
			case 3:
				jTextArea59.paste();
				break;
			case 4:
				jTextArea60.paste();
				break;
			default:
				break;
			}
		}
		if (k == 18) {
			p = jTabbedPane14.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea61.paste();
				break;
			case 1:
				jTextArea62.paste();
				break;
			case 2:
				jTextArea63.paste();
				break;
			case 3:
				jTextArea64.paste();
				break;
			case 4:
				jTextArea65.paste();
				break;
			default:
				break;
			}
		}
		if (k == 19) {
			p = jTabbedPane15.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea66.paste();
				break;
			case 1:
				jTextArea67.paste();
				break;
			case 2:
				jTextArea68.paste();
				break;
			case 3:
				jTextArea69.paste();
				break;
			case 4:
				jTextArea70.paste();
				break;
			default:
				break;
			}
		}
		if (k == 20) {
			p = jTabbedPane16.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea71.paste();
				break;
			case 1:
				jTextArea72.paste();
				break;
			case 2:
				jTextArea73.paste();
				break;
			case 3:
				jTextArea74.paste();
				break;
			case 4:
				jTextArea75.paste();
				break;
			default:
				break;
			}
		}
		if (k == 21) {
			p = jTabbedPane17.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea76.paste();
				break;
			case 1:
				jTextArea77.paste();
				break;
			case 2:
				jTextArea78.paste();
				break;
			case 3:
				jTextArea79.paste();
				break;
			case 4:
				jTextArea80.paste();
				break;
			default:
				break;
			}
		}
		if (k == 22) {
			p = jTabbedPane18.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea81.paste();
				break;
			case 1:
				jTextArea82.paste();
				break;
			case 2:
				jTextArea83.paste();
				break;
			case 3:
				jTextArea84.paste();
				break;
			case 4:
				jTextArea85.paste();
				break;
			default:
				break;
			}
		}
		if (k == 23) {
			p = jTabbedPane19.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea86.paste();
				break;
			case 1:
				jTextArea87.paste();
				break;
			case 2:
				jTextArea88.paste();
				break;
			case 3:
				jTextArea89.paste();
				break;
			case 4:
				jTextArea90.paste();
				break;
			default:
				break;
			}
		}
		if (k == 5) {
			p = jTabbedPane1.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea91.paste();
				break;
			case 1:
				jTextArea92.paste();
				break;
			case 2:
				jTextArea93.paste();
				break;
			case 3:
				jTextArea94.paste();
				break;
			case 4:
				jTextArea95.paste();
				break;
			default:
				break;
			}
		}
		if (k == 24) {
			p = jTabbedPane20.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea96.paste();
				break;
			case 1:
				jTextArea97.paste();
				break;
			case 2:
				jTextArea98.paste();
				break;
			case 3:
				jTextArea99.paste();
				break;
			case 4:
				jTextArea100.paste();
				break;
			default:
				break;
			}
		}
		if (k == 24) {
			p = jTabbedPane21.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea1.paste();
				break;
			case 1:
				jTextArea101.paste();
				break;
			case 2:
				jTextArea102.paste();
				break;
			case 3:
				jTextArea103.paste();
				break;
			case 4:
				jTextArea104.paste();
				break;
			case 5:
				jTextArea105.paste();
				break;
			case 6:
				jTextArea106.paste();
				break;
			case 7:
				jTextArea107.paste();
				break;
			case 8:
				jTextArea108.paste();
				break;
			case 9:
				jTextArea109.paste();
			default:
				break;
			}
		}

	}

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		if (k == 6) {
			p = jTabbedPane2.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea2.cut();
				break;
			case 1:
				jTextArea3.cut();
				break;
			case 2:
				jTextArea4.cut();
				break;
			case 3:
				jTextArea5.cut();
				break;
			default:
				break;
			}
		}
		if (k == 7) {
			p = jTabbedPane3.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea6.cut();
				break;
			case 1:
				jTextArea7.cut();
				break;
			case 2:
				jTextArea8.cut();
				break;
			case 3:
				jTextArea9.cut();
				break;
			case 4:
				jTextArea10.cut();
				break;
			default:
				break;
			}
		}
		if (k == 8) {
			p = jTabbedPane4.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea11.cut();
				break;
			case 1:
				jTextArea12.cut();
				break;
			case 2:
				jTextArea13.cut();
				break;
			case 3:
				jTextArea14.cut();
				break;
			case 4:
				jTextArea15.cut();
				break;
			default:
				break;
			}
		}

		if (k == 9) {
			p = jTabbedPane5.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea16.cut();
				break;
			case 1:
				jTextArea17.cut();
				break;
			case 2:
				jTextArea18.cut();
				break;
			case 3:
				jTextArea19.cut();
				break;
			case 4:
				jTextArea20.cut();
				break;
			default:
				break;
			}
		}
		if (k == 10) {
			p = jTabbedPane6.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea21.cut();
				break;
			case 1:
				jTextArea22.cut();
				break;
			case 2:
				jTextArea23.cut();
				break;
			case 3:
				jTextArea24.cut();
				break;
			case 4:
				jTextArea25.cut();
				break;
			default:
				break;
			}
		}
		if (k == 11) {
			p = jTabbedPane7.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea26.cut();
				break;
			case 1:
				jTextArea27.cut();
				break;
			case 2:
				jTextArea28.cut();
				break;
			case 3:
				jTextArea29.cut();
				break;
			case 4:
				jTextArea30.cut();
				break;
			default:
				break;
			}
		}

		if (k == 12) {
			p = jTabbedPane8.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea31.cut();
				break;
			case 1:
				jTextArea32.cut();
				break;
			case 2:
				jTextArea33.cut();
				break;
			case 3:
				jTextArea34.cut();
				break;
			case 4:
				jTextArea35.cut();
				break;
			default:
				break;
			}
		}
		if (k == 13) {
			p = jTabbedPane9.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea36.cut();
				break;
			case 1:
				jTextArea37.cut();
				break;
			case 2:
				jTextArea38.cut();
				break;
			case 3:
				jTextArea39.cut();
				break;
			case 4:
				jTextArea40.cut();
				break;
			default:
				break;
			}
		}

		if (k == 14) {
			p = jTabbedPane10.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea41.cut();
				break;
			case 1:
				jTextArea42.cut();
				break;
			case 2:
				jTextArea43.cut();
				break;
			case 3:
				jTextArea44.cut();
				break;
			case 4:
				jTextArea45.cut();
				break;
			default:
				break;
			}
		}
		if (k == 15) {
			p = jTabbedPane11.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea46.cut();
				break;
			case 1:
				jTextArea47.cut();
				break;
			case 2:
				jTextArea48.cut();
				break;
			case 3:
				jTextArea49.cut();
				break;
			case 4:
				jTextArea50.cut();
				break;
			default:
				break;
			}
		}

		if (k == 16) {
			p = jTabbedPane12.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea51.cut();
				break;
			case 1:
				jTextArea52.cut();
				break;
			case 2:
				jTextArea53.cut();
				break;
			case 3:
				jTextArea54.cut();
				break;
			case 4:
				jTextArea55.cut();
				break;
			default:
				break;
			}
		}
		if (k == 17) {
			p = jTabbedPane13.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea56.cut();
				break;
			case 1:
				jTextArea57.cut();
				break;
			case 2:
				jTextArea58.cut();
				break;
			case 3:
				jTextArea59.cut();
				break;
			case 4:
				jTextArea60.cut();
				break;
			default:
				break;
			}
		}
		if (k == 18) {
			p = jTabbedPane14.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea61.cut();
				break;
			case 1:
				jTextArea62.cut();
				break;
			case 2:
				jTextArea63.cut();
				break;
			case 3:
				jTextArea64.cut();
				break;
			case 4:
				jTextArea65.cut();
				break;
			default:
				break;
			}
		}
		if (k == 19) {
			p = jTabbedPane15.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea66.cut();
				break;
			case 1:
				jTextArea67.cut();
				break;
			case 2:
				jTextArea68.cut();
				break;
			case 3:
				jTextArea69.cut();
				break;
			case 4:
				jTextArea70.cut();
				break;
			default:
				break;
			}
		}
		if (k == 20) {
			p = jTabbedPane16.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea71.cut();
				break;
			case 1:
				jTextArea72.cut();
				break;
			case 2:
				jTextArea73.cut();
				break;
			case 3:
				jTextArea74.cut();
				break;
			case 4:
				jTextArea75.cut();
				break;
			default:
				break;
			}
		}
		if (k == 21) {
			p = jTabbedPane17.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea76.cut();
				break;
			case 1:
				jTextArea77.cut();
				break;
			case 2:
				jTextArea78.cut();
				break;
			case 3:
				jTextArea79.cut();
				break;
			case 4:
				jTextArea80.cut();
				break;
			default:
				break;
			}
		}
		if (k == 22) {
			p = jTabbedPane18.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea81.cut();
				break;
			case 1:
				jTextArea82.cut();
				break;
			case 2:
				jTextArea83.cut();
				break;
			case 3:
				jTextArea84.cut();
				break;
			case 4:
				jTextArea85.cut();
				break;
			default:
				break;
			}
		}
		if (k == 23) {
			p = jTabbedPane19.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea86.cut();
				break;
			case 1:
				jTextArea87.cut();
				break;
			case 2:
				jTextArea88.cut();
				break;
			case 3:
				jTextArea89.cut();
				break;
			case 4:
				jTextArea90.cut();
				break;
			default:
				break;
			}
		}
		if (k == 5) {
			p = jTabbedPane1.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea91.cut();
				break;
			case 1:
				jTextArea92.cut();
				break;
			case 2:
				jTextArea93.cut();
				break;
			case 3:
				jTextArea94.cut();
				break;
			case 4:
				jTextArea95.cut();
				break;
			default:
				break;
			}
		}
		if (k == 24) {
			p = jTabbedPane20.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea96.cut();
				break;
			case 1:
				jTextArea97.cut();
				break;
			case 2:
				jTextArea98.cut();
				break;
			case 3:
				jTextArea99.cut();
				break;
			case 4:
				jTextArea100.cut();
				break;
			default:
				break;
			}
		}
		if (k == 24) {
			p = jTabbedPane21.getSelectedIndex();
			switch (p) {
			case 0:
				jTextArea1.cut();
				break;
			case 1:
				jTextArea101.cut();
				break;
			case 2:
				jTextArea102.cut();
				break;
			case 3:
				jTextArea103.cut();
				break;
			case 4:
				jTextArea104.cut();
				break;
			case 5:
				jTextArea105.cut();
				break;
			case 6:
				jTextArea106.cut();
				break;
			case 7:
				jTextArea107.cut();
				break;
			case 8:
				jTextArea108.cut();
				break;
			case 9:
				jTextArea109.cut();
			default:
				break;
			}
		}

	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		JFileChooser fc = new JFileChooser();
		int i = fc.showOpenDialog(this);

		if (i == JFileChooser.APPROVE_OPTION) {
			File f = fc.getSelectedFile();
			String filepath = f.getPath();
			try {
				BufferedReader br = new BufferedReader(new FileReader(filepath));
				String s1 = "", s2 = "";

				while ((s1 = br.readLine()) != null) {
					s2 += s1 + "\n";
				}

				if (k == 6) {
					p = jTabbedPane2.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea2.setText(s2);
						break;
					case 1:
						jTextArea3.setText(s2);
						break;
					case 2:
						jTextArea4.setText(s2);
						break;
					case 3:
						jTextArea5.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 7) {
					p = jTabbedPane3.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea6.setText(s2);
						break;
					case 1:
						jTextArea7.setText(s2);
						break;
					case 2:
						jTextArea8.setText(s2);
						break;
					case 3:
						jTextArea9.setText(s2);
						break;
					case 4:
						jTextArea10.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 8) {
					p = jTabbedPane4.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea11.setText(s2);
						break;
					case 1:
						jTextArea12.setText(s2);
						break;
					case 2:
						jTextArea13.setText(s2);
						break;
					case 3:
						jTextArea14.setText(s2);
						break;
					case 4:
						jTextArea15.setText(s2);
						break;
					default:
						break;
					}
				}

				if (k == 9) {
					p = jTabbedPane5.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea16.setText(s2);
						break;
					case 1:
						jTextArea17.setText(s2);
						break;
					case 2:
						jTextArea18.setText(s2);
						break;
					case 3:
						jTextArea19.setText(s2);
						break;
					case 4:
						jTextArea20.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 10) {
					p = jTabbedPane6.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea21.setText(s2);
						break;
					case 1:
						jTextArea22.setText(s2);
						break;
					case 2:
						jTextArea23.setText(s2);
						break;
					case 3:
						jTextArea24.setText(s2);
						break;
					case 4:
						jTextArea25.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 11) {
					p = jTabbedPane7.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea26.setText(s2);
						break;
					case 1:
						jTextArea27.setText(s2);
						break;
					case 2:
						jTextArea28.setText(s2);
						break;
					case 3:
						jTextArea29.setText(s2);
						break;
					case 4:
						jTextArea30.setText(s2);
						break;
					default:
						break;
					}
				}

				if (k == 12) {
					p = jTabbedPane8.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea31.setText(s2);
						break;
					case 1:
						jTextArea32.setText(s2);
						break;
					case 2:
						jTextArea33.setText(s2);
						break;
					case 3:
						jTextArea34.setText(s2);
						break;
					case 4:
						jTextArea35.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 13) {
					p = jTabbedPane9.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea36.setText(s2);
						break;
					case 1:
						jTextArea37.setText(s2);
						break;
					case 2:
						jTextArea38.setText(s2);
						break;
					case 3:
						jTextArea39.setText(s2);
						break;
					case 4:
						jTextArea40.setText(s2);
						break;
					default:
						break;
					}
				}

				if (k == 14) {
					p = jTabbedPane10.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea41.setText(s2);
						break;
					case 1:
						jTextArea42.setText(s2);
						break;
					case 2:
						jTextArea43.setText(s2);
						break;
					case 3:
						jTextArea44.setText(s2);
						break;
					case 4:
						jTextArea45.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 15) {
					p = jTabbedPane11.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea46.setText(s2);
						break;
					case 1:
						jTextArea47.setText(s2);
						break;
					case 2:
						jTextArea48.setText(s2);
						break;
					case 3:
						jTextArea49.setText(s2);
						break;
					case 4:
						jTextArea50.setText(s2);
						break;
					default:
						break;
					}
				}

				if (k == 16) {
					p = jTabbedPane12.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea51.setText(s2);
						break;
					case 1:
						jTextArea52.setText(s2);
						break;
					case 2:
						jTextArea53.setText(s2);
						break;
					case 3:
						jTextArea54.setText(s2);
						break;
					case 4:
						jTextArea55.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 17) {
					p = jTabbedPane13.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea56.setText(s2);
						break;
					case 1:
						jTextArea57.setText(s2);
						break;
					case 2:
						jTextArea58.setText(s2);
						break;
					case 3:
						jTextArea59.setText(s2);
						break;
					case 4:
						jTextArea60.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 18) {
					p = jTabbedPane14.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea61.setText(s2);
						break;
					case 1:
						jTextArea62.setText(s2);
						break;
					case 2:
						jTextArea63.setText(s2);
						break;
					case 3:
						jTextArea64.setText(s2);
						break;
					case 4:
						jTextArea65.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 19) {
					p = jTabbedPane15.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea66.setText(s2);
						break;
					case 1:
						jTextArea67.setText(s2);
						break;
					case 2:
						jTextArea68.setText(s2);
						break;
					case 3:
						jTextArea69.setText(s2);
						break;
					case 4:
						jTextArea70.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 20) {
					p = jTabbedPane16.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea71.setText(s2);
						break;
					case 1:
						jTextArea72.setText(s2);
						break;
					case 2:
						jTextArea73.setText(s2);
						break;
					case 3:
						jTextArea74.setText(s2);
						break;
					case 4:
						jTextArea75.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 21) {
					p = jTabbedPane17.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea76.setText(s2);
						break;
					case 1:
						jTextArea77.setText(s2);
						break;
					case 2:
						jTextArea78.setText(s2);
						break;
					case 3:
						jTextArea79.setText(s2);
						break;
					case 4:
						jTextArea80.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 22) {
					p = jTabbedPane18.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea81.setText(s2);
						break;
					case 1:
						jTextArea82.setText(s2);
						break;
					case 2:
						jTextArea83.setText(s2);
						break;
					case 3:
						jTextArea84.setText(s2);
						break;
					case 4:
						jTextArea85.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 23) {
					p = jTabbedPane19.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea86.setText(s2);
						break;
					case 1:
						jTextArea87.setText(s2);
						break;
					case 2:
						jTextArea88.setText(s2);
						break;
					case 3:
						jTextArea89.setText(s2);
						break;
					case 4:
						jTextArea90.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 5) {
					p = jTabbedPane1.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea91.setText(s2);
						break;
					case 1:
						jTextArea92.setText(s2);
						break;
					case 2:
						jTextArea93.setText(s2);
						break;
					case 3:
						jTextArea94.setText(s2);
						break;
					case 4:
						jTextArea95.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 24) {
					p = jTabbedPane20.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea96.setText(s2);
						break;
					case 1:
						jTextArea97.setText(s2);
						break;
					case 2:
						jTextArea98.setText(s2);
						break;
					case 3:
						jTextArea99.setText(s2);
						break;
					case 4:
						jTextArea100.setText(s2);
						break;
					default:
						break;
					}
				}
				if (k == 24) {
					p = jTabbedPane21.getSelectedIndex();
					switch (p) {
					case 0:
						jTextArea1.setText(s2);
						break;
					case 1:
						jTextArea101.setText(s2);
						break;
					case 2:
						jTextArea102.setText(s2);
						break;
					case 3:
						jTextArea103.setText(s2);
						break;
					case 4:
						jTextArea104.setText(s2);
						break;
					case 5:
						jTextArea105.setText(s2);
						break;
					case 6:
						jTextArea106.setText(s2);
						break;
					case 7:
						jTextArea107.setText(s2);
						break;
					case 8:
						jTextArea108.setText(s2);
						break;
					case 9:
						jTextArea109.setText(s2);
					default:
						break;
					}
				}
				br.close();
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

	}

	private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 25;
		card.show(jPanel4, "card22");
		jTextField1.setText(jLabel25.getText());
		jLabel3.setText(jLabel25.getText());
	}

	private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 24;
		card.show(jPanel4, "card21");
		jTextField1.setText(jLabel24.getText());
		jLabel3.setText(jLabel24.getText());
	}

	private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 22;
		card.show(jPanel4, "card19");
		jTextField1.setText(jLabel22.getText());
		jLabel3.setText(jLabel22.getText());
	}

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 23;
		card.show(jPanel4, "card20");
		jTextField1.setText(jLabel23.getText());
		jLabel3.setText(jLabel23.getText());
	}

	private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 21;
		card.show(jPanel4, "card18");
		jTextField1.setText(jLabel21.getText());
		jLabel3.setText(jLabel21.getText());
	}

	private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 20;
		card.show(jPanel4, "card17");
		jTextField1.setText(jLabel20.getText());
		jLabel3.setText(jLabel20.getText());
	}

	private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 19;
		card.show(jPanel4, "card16");
		jTextField1.setText(jLabel19.getText());
		jLabel3.setText(jLabel19.getText());
	}

	private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 18;
		card.show(jPanel4, "card15");
		jTextField1.setText(jLabel18.getText());
		jLabel3.setText(jLabel18.getText());
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 16;
		card.show(jPanel4, "card13");
		jTextField1.setText(jLabel16.getText());
		jLabel3.setText(jLabel16.getText());
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 17;
		card.show(jPanel4, "card14");
		jTextField1.setText(jLabel17.getText());
		jLabel3.setText(jLabel17.getText());
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 15;
		card.show(jPanel4, "card12");
		jTextField1.setText(jLabel15.getText());
		jLabel3.setText(jLabel15.getText());
	}

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 14;
		card.show(jPanel4, "card11");
		jTextField1.setText(jLabel14.getText());
		jLabel3.setText(jLabel14.getText());
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 13;
		card.show(jPanel4, "card10");
		jTextField1.setText(jLabel13.getText());
		jLabel3.setText(jLabel13.getText());
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 12;
		card.show(jPanel4, "card9");
		jTextField1.setText(jLabel12.getText());
		jLabel3.setText(jLabel12.getText());
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 11;
		card.show(jPanel4, "card8");
		jTextField1.setText(jLabel11.getText());
		jLabel3.setText(jLabel11.getText());
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 10;
		card.show(jPanel4, "card7");
		jTextField1.setText(jLabel10.getText());
		jLabel3.setText(jLabel10.getText());
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 8;
		card.show(jPanel4, "card5");
		jTextField1.setText(jLabel8.getText());
		jLabel3.setText(jLabel8.getText());
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 9;
		card.show(jPanel4, "card6");
		jTextField1.setText(jLabel9.getText());
		jLabel3.setText(jLabel9.getText());
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 7;
		card.show(jPanel4, "card4");
		jTextField1.setText(jLabel7.getText());
		jLabel3.setText(jLabel7.getText());
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 6;
		card.show(jPanel4, "card3");
		jTextField1.setText(jLabel6.getText());
		jLabel3.setText(jLabel6.getText());

	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		k = 5;
		card.show(jPanel4, "card2");
		jTextField1.setText(jLabel5.getText());
		jLabel3.setText(jLabel5.getText());
	}

	public void shutdown() {

		Runtime r = Runtime.getRuntime();

		r.addShutdownHook(new Thread() {
			public void run() {

				save();
			}
		});
	}

	public void check() {

		File theDir = new File("C://Users//Public//notebook");

		// if the directory does not exist, create it
		if (!theDir.exists()) {
			try {
				theDir.mkdir();
				save();
			} catch (SecurityException se) {
				//handle it
			}

		}
	}
	static notebook notebook;
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {

				 notebook = new notebook();
				notebook.check();
				notebook.readfile();
				notebook.shutdown();
				notebook.setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton20;
	private javax.swing.JButton jButton21;
	private javax.swing.JButton jButton22;
	private javax.swing.JButton jButton23;
	private javax.swing.JButton jButton24;
	private javax.swing.JButton jButton25;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem10;
	private javax.swing.JMenuItem jMenuItem11;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JMenuItem jMenuItem9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane10;
	private javax.swing.JScrollPane jScrollPane100;
	private javax.swing.JScrollPane jScrollPane101;
	private javax.swing.JScrollPane jScrollPane102;
	private javax.swing.JScrollPane jScrollPane103;
	private javax.swing.JScrollPane jScrollPane104;
	private javax.swing.JScrollPane jScrollPane105;
	private javax.swing.JScrollPane jScrollPane106;
	private javax.swing.JScrollPane jScrollPane107;
	private javax.swing.JScrollPane jScrollPane108;
	private javax.swing.JScrollPane jScrollPane109;
	private javax.swing.JScrollPane jScrollPane11;
	private javax.swing.JScrollPane jScrollPane12;
	private javax.swing.JScrollPane jScrollPane13;
	private javax.swing.JScrollPane jScrollPane14;
	private javax.swing.JScrollPane jScrollPane15;
	private javax.swing.JScrollPane jScrollPane16;
	private javax.swing.JScrollPane jScrollPane17;
	private javax.swing.JScrollPane jScrollPane18;
	private javax.swing.JScrollPane jScrollPane19;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane20;
	private javax.swing.JScrollPane jScrollPane21;
	private javax.swing.JScrollPane jScrollPane22;
	private javax.swing.JScrollPane jScrollPane23;
	private javax.swing.JScrollPane jScrollPane24;
	private javax.swing.JScrollPane jScrollPane25;
	private javax.swing.JScrollPane jScrollPane26;
	private javax.swing.JScrollPane jScrollPane27;
	private javax.swing.JScrollPane jScrollPane28;
	private javax.swing.JScrollPane jScrollPane29;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane30;
	private javax.swing.JScrollPane jScrollPane31;
	private javax.swing.JScrollPane jScrollPane32;
	private javax.swing.JScrollPane jScrollPane33;
	private javax.swing.JScrollPane jScrollPane34;
	private javax.swing.JScrollPane jScrollPane35;
	private javax.swing.JScrollPane jScrollPane36;
	private javax.swing.JScrollPane jScrollPane37;
	private javax.swing.JScrollPane jScrollPane38;
	private javax.swing.JScrollPane jScrollPane39;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane40;
	private javax.swing.JScrollPane jScrollPane41;
	private javax.swing.JScrollPane jScrollPane42;
	private javax.swing.JScrollPane jScrollPane43;
	private javax.swing.JScrollPane jScrollPane44;
	private javax.swing.JScrollPane jScrollPane45;
	private javax.swing.JScrollPane jScrollPane46;
	private javax.swing.JScrollPane jScrollPane47;
	private javax.swing.JScrollPane jScrollPane48;
	private javax.swing.JScrollPane jScrollPane49;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane50;
	private javax.swing.JScrollPane jScrollPane51;
	private javax.swing.JScrollPane jScrollPane52;
	private javax.swing.JScrollPane jScrollPane53;
	private javax.swing.JScrollPane jScrollPane54;
	private javax.swing.JScrollPane jScrollPane55;
	private javax.swing.JScrollPane jScrollPane56;
	private javax.swing.JScrollPane jScrollPane57;
	private javax.swing.JScrollPane jScrollPane58;
	private javax.swing.JScrollPane jScrollPane59;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JScrollPane jScrollPane60;
	private javax.swing.JScrollPane jScrollPane61;
	private javax.swing.JScrollPane jScrollPane62;
	private javax.swing.JScrollPane jScrollPane63;
	private javax.swing.JScrollPane jScrollPane64;
	private javax.swing.JScrollPane jScrollPane65;
	private javax.swing.JScrollPane jScrollPane66;
	private javax.swing.JScrollPane jScrollPane67;
	private javax.swing.JScrollPane jScrollPane68;
	private javax.swing.JScrollPane jScrollPane69;
	private javax.swing.JScrollPane jScrollPane7;
	private javax.swing.JScrollPane jScrollPane70;
	private javax.swing.JScrollPane jScrollPane71;
	private javax.swing.JScrollPane jScrollPane72;
	private javax.swing.JScrollPane jScrollPane73;
	private javax.swing.JScrollPane jScrollPane74;
	private javax.swing.JScrollPane jScrollPane75;
	private javax.swing.JScrollPane jScrollPane76;
	private javax.swing.JScrollPane jScrollPane77;
	private javax.swing.JScrollPane jScrollPane78;
	private javax.swing.JScrollPane jScrollPane79;
	private javax.swing.JScrollPane jScrollPane8;
	private javax.swing.JScrollPane jScrollPane80;
	private javax.swing.JScrollPane jScrollPane81;
	private javax.swing.JScrollPane jScrollPane82;
	private javax.swing.JScrollPane jScrollPane83;
	private javax.swing.JScrollPane jScrollPane84;
	private javax.swing.JScrollPane jScrollPane85;
	private javax.swing.JScrollPane jScrollPane86;
	private javax.swing.JScrollPane jScrollPane87;
	private javax.swing.JScrollPane jScrollPane88;
	private javax.swing.JScrollPane jScrollPane89;
	private javax.swing.JScrollPane jScrollPane9;
	private javax.swing.JScrollPane jScrollPane90;
	private javax.swing.JScrollPane jScrollPane91;
	private javax.swing.JScrollPane jScrollPane92;
	private javax.swing.JScrollPane jScrollPane93;
	private javax.swing.JScrollPane jScrollPane94;
	private javax.swing.JScrollPane jScrollPane95;
	private javax.swing.JScrollPane jScrollPane96;
	private javax.swing.JScrollPane jScrollPane97;
	private javax.swing.JScrollPane jScrollPane98;
	private javax.swing.JScrollPane jScrollPane99;
	private javax.swing.JToolBar.Separator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTabbedPane jTabbedPane10;
	private javax.swing.JTabbedPane jTabbedPane11;
	private javax.swing.JTabbedPane jTabbedPane12;
	private javax.swing.JTabbedPane jTabbedPane13;
	private javax.swing.JTabbedPane jTabbedPane14;
	private javax.swing.JTabbedPane jTabbedPane15;
	private javax.swing.JTabbedPane jTabbedPane16;
	private javax.swing.JTabbedPane jTabbedPane17;
	private javax.swing.JTabbedPane jTabbedPane18;
	private javax.swing.JTabbedPane jTabbedPane19;
	private javax.swing.JTabbedPane jTabbedPane2;
	private javax.swing.JTabbedPane jTabbedPane20;
	private javax.swing.JTabbedPane jTabbedPane21;
	private javax.swing.JTabbedPane jTabbedPane3;
	private javax.swing.JTabbedPane jTabbedPane4;
	private javax.swing.JTabbedPane jTabbedPane5;
	private javax.swing.JTabbedPane jTabbedPane6;
	private javax.swing.JTabbedPane jTabbedPane7;
	private javax.swing.JTabbedPane jTabbedPane8;
	private javax.swing.JTabbedPane jTabbedPane9;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea10;
	private javax.swing.JTextArea jTextArea100;
	private javax.swing.JTextArea jTextArea101;
	private javax.swing.JTextArea jTextArea102;
	private javax.swing.JTextArea jTextArea103;
	private javax.swing.JTextArea jTextArea104;
	private javax.swing.JTextArea jTextArea105;
	private javax.swing.JTextArea jTextArea106;
	private javax.swing.JTextArea jTextArea107;
	private javax.swing.JTextArea jTextArea108;
	private javax.swing.JTextArea jTextArea109;
	private javax.swing.JTextArea jTextArea11;
	private javax.swing.JTextArea jTextArea12;
	private javax.swing.JTextArea jTextArea13;
	private javax.swing.JTextArea jTextArea14;
	private javax.swing.JTextArea jTextArea15;
	private javax.swing.JTextArea jTextArea16;
	private javax.swing.JTextArea jTextArea17;
	private javax.swing.JTextArea jTextArea18;
	private javax.swing.JTextArea jTextArea19;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextArea jTextArea20;
	private javax.swing.JTextArea jTextArea21;
	private javax.swing.JTextArea jTextArea22;
	private javax.swing.JTextArea jTextArea23;
	private javax.swing.JTextArea jTextArea24;
	private javax.swing.JTextArea jTextArea25;
	private javax.swing.JTextArea jTextArea26;
	private javax.swing.JTextArea jTextArea27;
	private javax.swing.JTextArea jTextArea28;
	private javax.swing.JTextArea jTextArea29;
	private javax.swing.JTextArea jTextArea3;
	private javax.swing.JTextArea jTextArea30;
	private javax.swing.JTextArea jTextArea31;
	private javax.swing.JTextArea jTextArea32;
	private javax.swing.JTextArea jTextArea33;
	private javax.swing.JTextArea jTextArea34;
	private javax.swing.JTextArea jTextArea35;
	private javax.swing.JTextArea jTextArea36;
	private javax.swing.JTextArea jTextArea37;
	private javax.swing.JTextArea jTextArea38;
	private javax.swing.JTextArea jTextArea39;
	private javax.swing.JTextArea jTextArea4;
	private javax.swing.JTextArea jTextArea40;
	private javax.swing.JTextArea jTextArea41;
	private javax.swing.JTextArea jTextArea42;
	private javax.swing.JTextArea jTextArea43;
	private javax.swing.JTextArea jTextArea44;
	private javax.swing.JTextArea jTextArea45;
	private javax.swing.JTextArea jTextArea46;
	private javax.swing.JTextArea jTextArea47;
	private javax.swing.JTextArea jTextArea48;
	private javax.swing.JTextArea jTextArea49;
	private javax.swing.JTextArea jTextArea5;
	private javax.swing.JTextArea jTextArea50;
	private javax.swing.JTextArea jTextArea51;
	private javax.swing.JTextArea jTextArea52;
	private javax.swing.JTextArea jTextArea53;
	private javax.swing.JTextArea jTextArea54;
	private javax.swing.JTextArea jTextArea55;
	private javax.swing.JTextArea jTextArea56;
	private javax.swing.JTextArea jTextArea57;
	private javax.swing.JTextArea jTextArea58;
	private javax.swing.JTextArea jTextArea59;
	private javax.swing.JTextArea jTextArea6;
	private javax.swing.JTextArea jTextArea60;
	private javax.swing.JTextArea jTextArea61;
	private javax.swing.JTextArea jTextArea62;
	private javax.swing.JTextArea jTextArea63;
	private javax.swing.JTextArea jTextArea64;
	private javax.swing.JTextArea jTextArea65;
	private javax.swing.JTextArea jTextArea66;
	private javax.swing.JTextArea jTextArea67;
	private javax.swing.JTextArea jTextArea68;
	private javax.swing.JTextArea jTextArea69;
	private javax.swing.JTextArea jTextArea7;
	private javax.swing.JTextArea jTextArea70;
	private javax.swing.JTextArea jTextArea71;
	private javax.swing.JTextArea jTextArea72;
	private javax.swing.JTextArea jTextArea73;
	private javax.swing.JTextArea jTextArea74;
	private javax.swing.JTextArea jTextArea75;
	private javax.swing.JTextArea jTextArea76;
	private javax.swing.JTextArea jTextArea77;
	private javax.swing.JTextArea jTextArea78;
	private javax.swing.JTextArea jTextArea79;
	private javax.swing.JTextArea jTextArea8;
	private javax.swing.JTextArea jTextArea80;
	private javax.swing.JTextArea jTextArea81;
	private javax.swing.JTextArea jTextArea82;
	private javax.swing.JTextArea jTextArea83;
	private javax.swing.JTextArea jTextArea84;
	private javax.swing.JTextArea jTextArea85;
	private javax.swing.JTextArea jTextArea86;
	private javax.swing.JTextArea jTextArea87;
	private javax.swing.JTextArea jTextArea88;
	private javax.swing.JTextArea jTextArea89;
	private javax.swing.JTextArea jTextArea9;
	private javax.swing.JTextArea jTextArea90;
	private javax.swing.JTextArea jTextArea91;
	private javax.swing.JTextArea jTextArea92;
	private javax.swing.JTextArea jTextArea93;
	private javax.swing.JTextArea jTextArea94;
	private javax.swing.JTextArea jTextArea95;
	private javax.swing.JTextArea jTextArea96;
	private javax.swing.JTextArea jTextArea97;
	private javax.swing.JTextArea jTextArea98;
	private javax.swing.JTextArea jTextArea99;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JToolBar jToolBar1;
	// End of variables declaration//GEN-END:variables

}