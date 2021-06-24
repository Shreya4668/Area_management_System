/* Area Management System*/
/* 1602-19-737-042 T Shreya */
/* 1602-19-737-183 P Keerthana */
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.border.Border;
import javax.swing.*;

public class  dbms_project extends JFrame{

    JMenuBar mb;
    JMenu mnArea, mnRestaurants,mnHospitals,mnStores,mnInst;
	JMenuItem miInsertA,miInsertH,miInsertR,miInsertS,miInsertI;	
	JMenuItem miViewA,miViewH,miViewR,miViewS,miViewI ;
	JMenuItem miUpdateA,miUpdateH,miUpdateR,miUpdateS,miUpdateI;
	JMenuItem miDeleteA,miDeleteH,miDeleteR,miDeleteS,miDeleteI;
        JTextArea ta,taDeleteS,taDeleteI; 
       JTextArea taOp;
       JTextField tf,tfAName,tfPin,tfHName,tfSpec;
    JButton bInsertA,bInsertH,bInsertR,bDeleteA,bDeleteH,bDeleteR,bUpdateA,bUpdateS,bUpdateI,bDeleteS,bDeleteI;
    JButton bUpdateAOk,bUpdateH,bUpdateR,bUpdateHOk,bUpdateROk,bInsertS,bInsertI,bUpdateSOk,bUpdateIOk;
    JLabel lbAName,lbPin,lbHName,lbSpec,lbDPin,lbUPin,lbUName,lbUAS,lbUAI,lbUComS,lbUCatI; 
    JLabel lbRName,lbCuisine,lbType,lbClas,lbRat,lbOT,lbCT,lbUDPin,lbADet,lbHDet,lbRDet,lbSDet,lbIDet;
    JLabel lbSName,lbCom,lbIName,lbCat,lbUSS,lbUII,lbUDSS,lbUDAS,lbCatS,lbUDII,lbUDAI;
    JLabel lbDH,lbDA,lbDAR,lbDR,lbUAH,lbUHH,lbUAR,lbURR,lbUDAH,lbUDHH,lbUCatS,lbUComI,lbDS,lbDI;
    JLabel lbUDAR,lbUDRR,lbUSpecH,lbUTyR,lbURatR,lbUClsR,lbUO_tR,lbUC_tR,lbUCuiR;
	JTextField tfRName,tfCuisine,tfType,tfClas,tfRat,tfOt,tfCt,tfUAS,tfUAI,tfUSS,tfUII;
	JTextField tfUName,tfUDPin,tfUAH,tfUAR,tfUHH,tfURR,tfUSpecH,tfUTyR,tfUComS,tfCat,tfUCatI;
	JTextField tfUCuiR,tfUClsR,tfURatR,tfUO_tR,tfUC_tR,tfSName,tfIName,tfCom,tfUCat;
	JTextArea taR,taDeleteA,taDeleteH,taDeleteR;
	@SuppressWarnings("rawtypes")
	JComboBox c,cUpdateA,cDeleteAH,cDeleteHH,cDeleteAR,cDeleteRR,cDeleteAS,cDeleteSS,cDeleteAI,cDeleteII;
	JComboBox  cUpdateAH,cUpdateHH,cUpdateAR,cUpdateRR,cUpdateAS,cUpdateSS,cUpdateAI,cUpdateII;
	JPanel pDeleteA;
	
	
	dbms_project()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("dbms_project");
		JLabel welcome = new JLabel("WELCOME TO");
		JLabel areamana = new JLabel("AREA MANAGEMENET SYSTEM!");
		add(welcome);
		add(areamana);
		welcome.setBounds(500,150,400,300);
		welcome.setFont(new Font("Verdana",Font.PLAIN,28));
        welcome.setForeground(Color.BLUE);
		areamana.setBounds(400,200,600,400);
		areamana.setForeground(Color.BLUE);
		Border border = BorderFactory.createLineBorder(Color.ORANGE);
		areamana.setBorder(border);
		welcome.setHorizontalAlignment(JLabel.CENTER);
		welcome.setVerticalAlignment(JLabel.CENTER);
		areamana.setHorizontalAlignment(JLabel.CENTER);
		areamana.setVerticalAlignment(JLabel.CENTER);
		//.setBounds(300,100,600,400);
		areamana.setFont(new Font("Verdana",Font.PLAIN,28));
	    JLabel l = new JLabel("Enter the Text");
		bInsertA = new JButton("SUBMIT");
		bInsertH = new JButton("SUBMIT");
		bInsertR = new JButton("SUBMIT");
		bInsertS = new JButton("SUBMIT");
		bInsertI = new JButton("SUBMIT");
		mb = new JMenuBar();
		mnArea = new JMenu("Areas");
	    mnRestaurants = new JMenu("Restaurants");
		mnHospitals = new JMenu("Hospitals");
		mnStores  = new JMenu("Stores");
		mnInst = new JMenu("Instituitions");
		miInsertA = new JMenuItem("Insert");
		miDeleteA = new JMenuItem("Delete");
	    miUpdateA = new JMenuItem("Update");
	    miViewA = new JMenuItem("View");
	    miInsertH = new JMenuItem("Insert");
		miDeleteH = new JMenuItem("Delete");
	    miUpdateH = new JMenuItem("Update");
	    miViewH = new JMenuItem("View");
	    miInsertR = new JMenuItem("Insert");
		miDeleteR = new JMenuItem("Delete");
	    miUpdateR = new JMenuItem("Update");
	    miViewR = new JMenuItem("View");
	    miInsertS = new JMenuItem("Insert");
		miDeleteS = new JMenuItem("Delete");
	    miUpdateS = new JMenuItem("Update");
	    miViewS = new JMenuItem("View");
	    miInsertI = new JMenuItem("Insert");
		miDeleteI = new JMenuItem("Delete");
	    miUpdateI = new JMenuItem("Update");
	    miViewI = new JMenuItem("View");
	    lbAName = new JLabel("Area Name:");
	    lbPin = new JLabel("Pincode:");
		ta = new JTextArea();
		taOp = new JTextArea();
		tf = new JTextField(20);
		tfAName = new JTextField(20);
		tfPin = new JTextField(20);
		
		
		mb.add(mnArea);
		mnArea.add(miInsertA);
		mnArea.add(miDeleteA);
		mnArea.add(miUpdateA);
		mnArea.add(miViewA);
		mb.add(mnHospitals);
		mnHospitals.add(miInsertH);
		mnHospitals.add(miDeleteH);
		mnHospitals.add(miUpdateH);
		mnHospitals.add(miViewH);
		mb.add(mnRestaurants);
		mnRestaurants.add(miInsertR);
		mnRestaurants.add(miDeleteR);
		mnRestaurants.add(miUpdateR);
		mnRestaurants.add(miViewR);
		mb.add(mnStores);
		mnStores.add(miInsertS);
		mnStores.add(miDeleteS);
		mnStores.add(miUpdateS);
		mnStores.add(miViewS);
		mb.add(mnInst);
		mnInst.add(miInsertI);
		mnInst.add(miDeleteI);
		mnInst.add(miUpdateI);
		mnInst.add(miViewI);
		
		
		setJMenuBar(mb);
        setLayout(null);
        setVisible(true);
        setSize(600,600);
        
        l.setBounds(230,30,100,30);
        ta.setBounds(200,100,900,300);
        tf.setBounds(150,400,150,40);
        tfAName.setBounds(500,150,200,30);
        bInsertA.setBounds(400,300,90,40);
        taOp.setBounds(300,400,400,200);
        lbAName.setBounds(300,150,100,30);
        lbPin.setBounds(300, 200, 100,30);
        tfPin.setBounds(500, 200, 200,30);
        
miUpdateI.addActionListener(new ActionListener(){

        	@SuppressWarnings({ "rawtypes", "unchecked" })
        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        		getContentPane().removeAll();
        		repaint();
                cUpdateAI = new JComboBox();
                cUpdateII = new JComboBox();
                cUpdateAI.setBounds(300,100,200,30);
                cUpdateII.setBounds(300,300,200,30);
                bUpdateI = new JButton("OK");
                lbUII = new JLabel("Select Instituition: ");
                lbUAI = new JLabel("Select Area: ");
                lbUDII = new JLabel("Instituition Name :");
                lbUDAI = new JLabel("Area Name :");
                lbUCatI = new JLabel("Category : ");
                lbUAI.setBounds(100,100,150,30);
                lbUII.setBounds(100,300,150,30);
                lbUDII.setBounds(750,100,150,30);
                lbUDAI.setBounds(750,150,150,30);
                lbUCatI.setBounds(750,200,150,30);
                tfUII = new JTextField(30);
                tfUII.setBounds(900,100,150,30);
                tfUAI = new JTextField(30);
                tfUAI.setBounds(900,150,150,30);
                tfUCatI = new JTextField(30);
                tfUCatI.setBounds(900,200,150,30);
                bUpdateIOk = new JButton("MODIFY");
                add(lbUCatI);
                add(tfUCatI);
                add(lbUII);
                add(tfUII);
                add(tfUAI);
                add(lbUDAI);
                add(lbUDII);
                add(bUpdateIOk);
                bUpdateIOk.setBounds(820,250,100,30);
                lbUAI.setBounds(100,100,150,30);
                add(lbUAI);
                bUpdateI.setBounds(200,500,150,30);
                add(bUpdateI);
                String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
           		String username = "it19737042";
           		String password = "vasavi";
        			
        			try {
        				Class.forName("oracle.jdbc.driver.OracleDriver");
        				Connection connection = DriverManager.getConnection(dbURL,username,password);
        				Statement statement = connection.createStatement();
        				ResultSet rs= statement.executeQuery("select aname,iname from instituitions");	
        				while(rs.next())
        					{
        					     cUpdateAI.addItem(rs.getString(1));
        					     cUpdateII.addItem(rs.getString(2));
        					         
        					}
        				add(cUpdateAI);
        				add(cUpdateII);
        				
        				connection.close();
        			 }
        			catch(Exception e)
        			{
        				JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
        			}
        			
        			bUpdateI.addActionListener(new ActionListener()
        			{
        				String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        		   		String username = "it19737042";
        		   		String password = "vasavi";
        				@Override
        				public void actionPerformed(ActionEvent arg0) {
        					try {
        						Class.forName("oracle.jdbc.driver.OracleDriver");
        						Connection connection = DriverManager.getConnection(dbURL,username,password);
        						String sql = "select * from instituitions where aname=? and iname=?";	
        						PreparedStatement Dstatement = connection.prepareStatement(sql);
        				           Dstatement.setString(1,(String)cUpdateAI.getSelectedItem());
        				           Dstatement.setString(2,(String)cUpdateII.getSelectedItem());
        				           
        				           ResultSet rs = Dstatement.executeQuery();
        				           while(rs.next())
        						    {
        				        	   tfUAI.setText(rs.getString(2));
         				        	   tfUCatI.setText(rs.getString(3));
          				        	   tfUII.setText(rs.getString(1));
        						    }
        				            
        						
        						connection.close();
        					 }
        					catch(Exception e)
        					{
        						JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
        					   //System.out.println(e);
        					}
        					
        					
        				}
        				
        			});
        			
        			bUpdateIOk.addActionListener(new ActionListener()
        			{

        				@Override
        				public void actionPerformed(ActionEvent arg0) {
        					String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        			   		String username = "it19737042";
        			   		String password = "vasavi";
        					
        						try {
        							   Class.forName("oracle.jdbc.driver.OracleDriver");
        							   Connection connection = DriverManager.getConnection(dbURL,username,password);        							  
        							   String temp_type = tfUCatI.getText();
        							   String temp_Aname = tfUAI.getText();
        							   String temp_Cond_AName = (String)cUpdateAI.getSelectedItem();
        							   String temp_Cond_IName = (String)cUpdateII.getSelectedItem();
        							   String sql = "update instituitions set aname=?,iname=?, category=? where aname=? and iname=?";	
        						       PreparedStatement Dstatement = connection.prepareStatement(sql);
        					           Dstatement.setString(4,temp_Cond_AName);
        					           Dstatement.setString(5,temp_Cond_IName);
        					           Dstatement.setString(1,temp_Aname);
        					           Dstatement.setString(2,tfUII.getText());
        					           Dstatement.setString(3,temp_type);
        					           Dstatement.executeQuery();
        					           
        					           JOptionPane.showMessageDialog(null,"1 row has been Updated successfully!");
        							connection.close();
        						 }
        						catch(Exception e)
        						{
        						   JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
        						   System.out.println(e);
        						}
        						
        					
        				}
        				
        			});
        	}
        	
});      

                     
       
miInsertI.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent arg0) {
    			// TODO Auto-generated method stub
    		//System.exit(0);
    			getContentPane().removeAll();
    			repaint();
    			lbIName = new JLabel("Instituition Name:");
    		    lbCat  = new JLabel("Category:");
    		    tfIName = new JTextField(30);
    		    tfCat = new JTextField(30);
    			add(lbIName);
    			add(lbAName);
    			add(lbCat);
    			add(tfAName);
    			add(tfIName);
    			add(tfCat);
    			add(bInsertI);
    			add(taOp);
    			lbIName.setBounds(300,100,100,30);
    			lbCat.setBounds(300,200,100,30);
    		    tfIName.setBounds(500, 100, 200,30);
    			tfCat.setBounds(500, 200, 200,30);
    			bInsertI.setBounds(400,300,90,40);
    			
    			bInsertI.addActionListener(new ActionListener()
    			{

    				@Override
    				public void actionPerformed(ActionEvent arg0) {
    					// TODO Auto-generated method stub
    			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
    			String username = "it19737042";
    			String password = "vasavi";
    			
    			
    				try {
    					
    					Connection connection = DriverManager.getConnection(dbURL,username,password);
    					System.out.println("Connected to oracle");
    					String sql = "INSERT INTO instituitions(Iname,aname,category) VALUES(?,?,?)";
    					 PreparedStatement statement = connection.prepareStatement(sql);
    							try {
    								statement.setString(3,tfCat.getText());
    								statement.setString(2,tfAName.getText());
    								statement.setString(1,tfIName.getText());
    							} catch (SQLException e1) {
    								// TODO Auto-generated catch block
    								e1.printStackTrace();
    							}
    							
    							
    							int rows = statement.executeUpdate();
    							
    							if(rows > 0)
    							taOp.setText("A row has been inserted succesfully");
    							JOptionPane.showMessageDialog(null,"1 row has been inserted successfully!");
    							connection.close();
    							
    					
    					
    				} catch (SQLException e) {
    					JOptionPane.showMessageDialog(null,"OOPS ERROR!","ERROR", JOptionPane.ERROR_MESSAGE, null);
    				}
    		}
    			});
    			
    		}	
    	});     

miViewI.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "it19737042";
		String password = "vasavi";
		
		getContentPane().removeAll();
		repaint();
		lbIDet = new JLabel("INSTITUITION DETAILS");
		lbIDet.setBounds(450,30,300,50);
		lbIDet.setFont(new Font("Verdana",Font.PLAIN,24));
        lbIDet.setForeground(Color.white);
        lbIDet.setBackground(Color.lightGray);
        lbIDet.setOpaque(true);
		lbIDet.setHorizontalAlignment(JLabel.CENTER);
		lbIDet.setVerticalAlignment(JLabel.CENTER);
		add(lbIDet);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(dbURL,username,password);
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from instituitions");
			add(ta);
			ta.setText("INSTITUITION NAME  "+"\t"+"AREA NAME"+"\t"+"CATEGORY"+"\n\n");
			while(rs.next())
				ta.append(rs.getString(1)+"\t\t"+rs.getString(2)+"\t"+rs.getString(3)+"\n");
			connection.close();
	     }
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
});


miDeleteI.addActionListener(new ActionListener(){

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		getContentPane().removeAll();
		repaint();
		cDeleteAI= new JComboBox();
		cDeleteII = new JComboBox();
		lbDI = new JLabel("Choose Instituition:");
		lbDA = new JLabel("Choose Area: ");
		lbDI.setBounds(100,100,100,30);
		lbDA.setBounds(100,300,100,30);
		taDeleteI = new JTextArea();
		add(taDeleteI);
		taDeleteI.setBounds(500,100,500,500);
		add(lbDI);
		add(lbDA);
		bDeleteI = new JButton("DELETE");
		bDeleteI.setBounds(200,500,150,30);
		add(bDeleteI);
	    String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
   		String username = "it19737042";
   		String password = "vasavi";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection(dbURL,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select aname,iname from instituitions");	
				while(rs.next())
					{
					     cDeleteAI.addItem(rs.getString(1));
					     cDeleteII.addItem(rs.getString(2));
					}
				cDeleteAI.setBounds(300,100,150,30);
				cDeleteII.setBounds(300,300,150,30);
				add(cDeleteAI);
				add(cDeleteII);
				connection.close();
			 }
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Unable to Delete!","ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
     			
     			bDeleteI.addActionListener(new ActionListener(){

     				@Override
     				public void actionPerformed(ActionEvent arg0) {
     					// TODO Auto-generated method stub
     					 String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
     					String username = "it19737042";
     					String password = "vasavi";
     					try
     					{
     						Class.forName("oracle.jdbc.driver.OracleDriver");
     						Connection connection = DriverManager.getConnection(dbURL,username,password);
     					     String sql = "delete from instituitions where iname=? and aname=?";
			              	PreparedStatement Dstatement = connection.prepareStatement(sql);
				            Dstatement.setString(1,(String)cDeleteII.getSelectedItem());
				            Dstatement.setString(2,(String)cDeleteAI.getSelectedItem());
				            Dstatement.executeQuery();
			            	
			            	Statement statement = connection.createStatement();
							ResultSet rs= statement.executeQuery("select * from instituitions");
							
							taDeleteI.setText("INSTITUITION NAME"+"\t"+"AREA NAME  "+"\t\t"+"CATEGORY"+"\n\n");
							while(rs.next())
								taDeleteI.append(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\n");
							JOptionPane.showMessageDialog(null,"1 row has been Deleted successfully!");
							connection.close();
     					}
     					catch(Exception e)
     					{
     						JOptionPane.showMessageDialog(null,"Unable to Delete!","ERROR", JOptionPane.ERROR_MESSAGE, null);
     						System.out.println(e);
     					}  
		               
		}
		
		});
	}
 });  


miDeleteS.addActionListener(new ActionListener(){

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		getContentPane().removeAll();
		repaint();
		cDeleteAS= new JComboBox();
		cDeleteSS = new JComboBox();
		lbDS = new JLabel("Choose Store:");
		lbDA = new JLabel("Choose Area: ");
		lbDS.setBounds(100,100,100,30);
		lbDA.setBounds(100,300,100,30);
		taDeleteS = new JTextArea();
		add(taDeleteS);
		taDeleteS.setBounds(500,100,500,500);
		add(lbDS);
		add(lbDA);
		bDeleteS = new JButton("DELETE");
		bDeleteS.setBounds(200,500,150,30);
		add(bDeleteS);
	    String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
   		String username = "it19737042";
   		String password = "vasavi";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection(dbURL,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select aname,sname from stores");	
				while(rs.next())
					{
					     cDeleteAS.addItem(rs.getString(1));
					     cDeleteSS.addItem(rs.getString(2));
					}
				cDeleteAS.setBounds(300,100,150,30);
				cDeleteSS.setBounds(300,300,150,30);
				add(cDeleteAS);
				add(cDeleteSS);
				connection.close();
			 }
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Unable to Delete!","ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
     			
     			bDeleteS.addActionListener(new ActionListener(){

     				@Override
     				public void actionPerformed(ActionEvent arg0) {
     					// TODO Auto-generated method stub
     					 String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
     					String username = "it19737042";
     					String password = "vasavi";
     					try
     					{
     						Class.forName("oracle.jdbc.driver.OracleDriver");
     						Connection connection = DriverManager.getConnection(dbURL,username,password);
     					     String sql = "delete from stores where sname=? and aname=?";
			              	PreparedStatement Dstatement = connection.prepareStatement(sql);
				            Dstatement.setString(1,(String)cDeleteSS.getSelectedItem());
				            Dstatement.setString(2,(String)cDeleteAS.getSelectedItem());
				            Dstatement.executeQuery();
			            	Statement statement = connection.createStatement();
							ResultSet rs= statement.executeQuery("select * from stores");
							
							taDeleteS.setText("STORE NAME"+"\t\t"+"AREA NAME  "+"\t\t"+"COMMODITIES"+"\n\n");
							while(rs.next())
								taDeleteS.append(rs.getString(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\n");
							JOptionPane.showMessageDialog(null,"1 row has been Deleted successfully!");
							connection.close();
     					}
     					catch(Exception e)
     					{
     						JOptionPane.showMessageDialog(null,"Unable to Delete!","ERROR", JOptionPane.ERROR_MESSAGE, null);
     						System.out.println(e);
     					}  
		               
		}
		
		});
	}
 });  



miViewS.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "it19737042";
		String password = "vasavi";
		
		getContentPane().removeAll();
		repaint();
		lbSDet = new JLabel("STORE DETAILS");
		lbSDet.setBounds(500,30,200,50);
		lbSDet.setFont(new Font("Verdana",Font.PLAIN,24));
        lbSDet.setForeground(Color.white);
        lbSDet.setBackground(Color.lightGray);
        lbSDet.setOpaque(true);
		lbSDet.setHorizontalAlignment(JLabel.CENTER);
		lbSDet.setVerticalAlignment(JLabel.CENTER);
		add(lbSDet);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(dbURL,username,password);
			Statement statement = connection.createStatement();
			ResultSet rs= statement.executeQuery("select * from stores");
			add(ta);
			ta.setText("STORE NAME  "+"\t"+"AREA NAME"+"\t"+"COMMODITIES"+"\n\n");
			while(rs.next())
				ta.append(rs.getString(1)+"\t"+rs.getString(2)+"\t "+rs.getString(3)+"\n");
			connection.close();
	     }
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
});
                
miUpdateS.addActionListener(new ActionListener(){

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void actionPerformed(ActionEvent arg0) {
		getContentPane().removeAll();
		repaint();
        cUpdateAS = new JComboBox();
        cUpdateSS = new JComboBox();
        cUpdateAS.setBounds(300,100,200,30);
        cUpdateSS.setBounds(300,300,200,30);
        bUpdateS = new JButton("OK");
        lbUSS = new JLabel("Select Stores: ");
        lbUAS = new JLabel("Select Area: ");
        lbUDSS = new JLabel("Store Name :");
        lbUDAS = new JLabel("Area Name :");
        lbUComS = new JLabel("Commodities : ");
        lbUAS.setBounds(100,100,150,30);
        lbUSS.setBounds(100,300,150,30);
        lbUDSS.setBounds(750,100,150,30);
        lbUDAS.setBounds(750,150,150,30);
        lbUComS.setBounds(750,200,150,30);
        tfUSS = new JTextField(30);
        tfUSS.setBounds(900,100,150,30);
        tfUAS = new JTextField(30);
        tfUAS.setBounds(900,150,150,30);
        tfUComS = new JTextField(30);
        tfUComS.setBounds(900,200,150,30);
        bUpdateSOk = new JButton("MODIFY");
        add(lbUComS);
        add(tfUComS);
        add(lbUSS);
        add(tfUSS);
        add(tfUAS);
        add(lbUDAS);
        add(lbUDSS);
        add(bUpdateSOk);
        bUpdateSOk.setBounds(820,250,100,30);
        lbUAS.setBounds(100,100,150,30);
        add(lbUAS);
        bUpdateS.setBounds(200,500,150,30);
        add(bUpdateS);
        String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
   		String username = "it19737042";
   		String password = "vasavi";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection(dbURL,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select aname,sname from stores");	
				while(rs.next())
					{
					     cUpdateAS.addItem(rs.getString(1));
					     cUpdateSS.addItem(rs.getString(2));
					         
					}
				add(cUpdateAS);
				add(cUpdateSS);
				
				connection.close();
			 }
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
			
			bUpdateS.addActionListener(new ActionListener()
			{
				String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		   		String username = "it19737042";
		   		String password = "vasavi";
				@Override
				public void actionPerformed(ActionEvent arg0) {
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection connection = DriverManager.getConnection(dbURL,username,password);
						String sql = "select * from stores where aname=? and sname=?";	
						PreparedStatement Dstatement = connection.prepareStatement(sql);
				           Dstatement.setString(1,(String)cUpdateAS.getSelectedItem());
				           Dstatement.setString(2,(String)cUpdateSS.getSelectedItem());
				           
				           ResultSet rs = Dstatement.executeQuery();
				           while(rs.next())
						    {
				        	   tfUAS.setText(rs.getString(2));
 				        	   tfUComS.setText(rs.getString(3));
  				        	   tfUSS.setText(rs.getString(1));
						    }
				            
						
						connection.close();
					 }
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
					   //System.out.println(e);
					}
					
					
				}
				
			});
			
			bUpdateSOk.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent arg0) {
					String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			   		String username = "it19737042";
			   		String password = "vasavi";
					
						try {
						     	Class.forName("oracle.jdbc.driver.OracleDriver");
							   Connection connection = DriverManager.getConnection(dbURL,username,password);        							  
							   String temp_type = tfUComS.getText();
							   String temp_Aname = tfUAS.getText();
							   String temp_Cond_AName = (String)cUpdateAS.getSelectedItem();
							   String temp_Cond_SName = (String)cUpdateSS.getSelectedItem();
							   String sql = "update stores set aname=?,sname=?, commodities=? where aname=? and sname=?";	
						       PreparedStatement Dstatement = connection.prepareStatement(sql);
					           Dstatement.setString(4,temp_Cond_AName);
					           Dstatement.setString(5,temp_Cond_SName);
					           Dstatement.setString(1,temp_Aname);
					           Dstatement.setString(2,tfUSS.getText());
					           Dstatement.setString(3,temp_type);
					           Dstatement.executeQuery();
					           
					           JOptionPane.showMessageDialog(null,"1 row has been Updated successfully!");
							connection.close();
						 }
						catch(Exception e)
						{
						   JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
						   System.out.println(e);
						}
						
					
				}
				
			});
	}
	
});      

     
        
miInsertS.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent arg0) {
    			// TODO Auto-generated method stub
    		//System.exit(0);
    			getContentPane().removeAll();
    			repaint();
    			lbSName = new JLabel("Store Name:");
    		    lbCom  = new JLabel("Commodities:");
    		    tfSName = new JTextField(30);
    		    tfCom = new JTextField(30);
    			add(lbSName);
    			add(lbAName);
    			add(lbCom);
    			add(tfAName);
    			add(tfSName);
    			add(tfCom);
    			add(bInsertS);
    			add(taOp);
    			lbSName.setBounds(300,100,100,30);
    			lbCom.setBounds(300,200,100,30);
    		    tfSName.setBounds(500, 100, 200,30);
    			tfCom.setBounds(500, 200, 200,30);
    			bInsertS.setBounds(400,300,90,40);
    			
    			bInsertS.addActionListener(new ActionListener()
    			{

    				@Override
    				public void actionPerformed(ActionEvent arg0) {
    					// TODO Auto-generated method stub
    			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
    			String username = "it19737042";
    			String password = "vasavi";
    			
    			
    				try {
    					
    					Connection connection = DriverManager.getConnection(dbURL,username,password);
    					System.out.println("Connected to oracle");
    					String sql = "INSERT INTO stores(sname,aname,commodities) VALUES(?,?,?)";
    					 PreparedStatement statement = connection.prepareStatement(sql);
    							try {
    								statement.setString(3,tfCom.getText());
    								statement.setString(2,tfAName.getText());
    								statement.setString(1,tfSName.getText());
    							} catch (SQLException e1) {
    								// TODO Auto-generated catch block
    								e1.printStackTrace();
    							}
    							
    							
    							int rows = statement.executeUpdate();
    							
    							if(rows > 0)
    							taOp.setText("A row has been inserted succesfully");
    							JOptionPane.showMessageDialog(null,"1 row has been inserted successfully!");
    							connection.close();
    							
    					
    					
    				} catch (SQLException e) {
    					JOptionPane.showMessageDialog(null,"OOPS ERROR!","ERROR", JOptionPane.ERROR_MESSAGE, null);
    				}
    		}
    			});
    			
    		}	
    	});     
        
        
miUpdateR.addActionListener(new ActionListener(){

        	@SuppressWarnings({ "rawtypes", "unchecked" })
        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        		getContentPane().removeAll();
        		repaint();
                cUpdateAR = new JComboBox();
                cUpdateRR= new JComboBox();
                cUpdateAR.setBounds(300,100,200,30);
                cUpdateRR.setBounds(300,300,200,30);
                bUpdateR = new JButton("OK");
                lbURR = new JLabel("Select Restaurant: ");
                lbUAR = new JLabel("Select Area: ");
                lbUDRR = new JLabel("Restaurant Name :");
                lbUDAR = new JLabel("Area Name :");
                lbUTyR = new JLabel("Type : ");
                lbUCuiR = new JLabel("Cuisine: ");
                lbUClsR  = new JLabel("Classification: ");
                lbURatR = new JLabel("Rating: ");
                lbUO_tR = new JLabel("Open Time: ");
                lbUC_tR = new JLabel("Close Time: ");
                lbUCuiR.setBounds(750,250,150,30);
                lbUClsR.setBounds(750,300,150,30);
                lbURatR.setBounds(750,350,150,30);
                lbUO_tR.setBounds(750,400,150,30);
                lbUC_tR.setBounds(750,450,150,30);
                lbUAR.setBounds(100,100,150,30);
                lbURR.setBounds(100,300,150,30);
                lbUDRR.setBounds(750,100,150,30);
                lbUDAR.setBounds(750,150,150,30);
                lbUTyR.setBounds(750,200,150,30);
                tfURR = new JTextField(30);
                tfURR.setBounds(900,100,150,30);
                tfUAR = new JTextField(30);
                tfUAR.setBounds(900,150,150,30);
                tfUTyR = new JTextField(30);
                tfUCuiR = new JTextField(30);
                tfUClsR = new JTextField(30);
                tfURatR = new JTextField(30);
                tfUO_tR = new JTextField(30);
                tfUC_tR = new JTextField(30);
                tfUCuiR.setBounds(900,250,150,30);
                tfUClsR.setBounds(900,300,150,30);
                tfURatR.setBounds(900,350,150,30);
                tfUO_tR.setBounds(900,400,150,30);
                tfUC_tR.setBounds(900,450,150,30);
                tfUTyR.setBounds(900,200,150,30);
                bUpdateROk = new JButton("MODIFY");
                add(lbUCuiR);
                add(lbURatR);
                add(lbUO_tR);
                add(lbUC_tR);
                add(lbUClsR);
                add(tfUCuiR);
                add(tfURatR);
                add(tfUO_tR);
                add(tfUC_tR);
                add(tfUClsR);
                add(lbUTyR);
                add(tfUTyR);
                add(lbURR);
                add(tfURR);
                add(tfUAR);
                add(lbUDAR);
                add(lbUDRR);
                add(bUpdateROk);
                bUpdateROk.setBounds(820,500,100,30);
                lbUAR.setBounds(100,100,150,30);
                add(lbUAR);
                bUpdateR.setBounds(200,500,150,30);
                add(bUpdateR);
                String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
           		String username = "it19737042";
           		String password = "vasavi";
        			
        			try {
        				Class.forName("oracle.jdbc.driver.OracleDriver");
        				Connection connection = DriverManager.getConnection(dbURL,username,password);
        				Statement statement = connection.createStatement();
        				ResultSet rs= statement.executeQuery("select aname,rname from restaurants");	
        				while(rs.next())
        					{
        					     cUpdateAR.addItem(rs.getString(1));
        					     cUpdateRR.addItem(rs.getString(2));
        					         
        					}
        				add(cUpdateAR);
        				add(cUpdateRR);
        				
        				connection.close();
        			 }
        			catch(Exception e)
        			{
        				JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
        			}
        			
        			bUpdateR.addActionListener(new ActionListener()
        			{
        				String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        		   		String username = "it19737042";
        		   		String password = "vasavi";
        				@Override
        				public void actionPerformed(ActionEvent arg0) {
        					try {
        						Class.forName("oracle.jdbc.driver.OracleDriver");
        						Connection connection = DriverManager.getConnection(dbURL,username,password);
        						String sql = "select * from restaurants where aname=? and rname=?";	
        						PreparedStatement Dstatement = connection.prepareStatement(sql);
        				           Dstatement.setString(1,(String)cUpdateAR.getSelectedItem());
        				           Dstatement.setString(2,(String)cUpdateRR.getSelectedItem());
        				           
        				           ResultSet rs = Dstatement.executeQuery();
        				           while(rs.next())
        						    {
        				        	   tfURR.setText(rs.getString(1));
        				        	   tfUCuiR.setText(rs.getString(2));
        				        	   tfUTyR.setText(rs.getString(3));
        				        	   tfUClsR.setText(rs.getString(4));
        				        	   tfUAR.setText(rs.getString(5));
        				        	   tfURatR.setText(rs.getString(6));
        				        	   tfUO_tR.setText(rs.getString(7));
        				        	   tfUC_tR.setText(rs.getString(8));
         				        	            				        	  
        						    }
        				            
        						
        						connection.close();
        					 }
        					catch(Exception e)
        					{
        						JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
        					   //System.out.println(e);
        					}
        					
        					
        				}
        				
        			});
        			
        			bUpdateROk.addActionListener(new ActionListener()
        			{

        				@Override
        				public void actionPerformed(ActionEvent arg0) {
        					String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        			   		String username = "it19737042";
        			   		String password = "vasavi";
        					
        						try {
        							Class.forName("oracle.jdbc.driver.OracleDriver");
        							   Connection connection = DriverManager.getConnection(dbURL,username,password);        							  
									   String temp_type = tfUTyR.getText();
        							   String temp_Aname = tfUAR.getText();
        							   String temp_Cls = tfUClsR.getText();
        							   String temp_Cui = tfUCuiR.getText();
        							   //Integer temp_Rat = Integer.parseInt(tfURatR.getText());
        							   String temp_Rat = tfURatR.getText();
        							   String temp_OT = tfUO_tR.getText();
        							   String temp_CT = tfUC_tR.getText();
        							   String temp_Cond_AName = (String)cUpdateAR.getSelectedItem();
        							   String temp_Cond_RName = (String)cUpdateRR.getSelectedItem();
        							   String sql = "update restaurants set aname=?,rname=?, type=?,classification=?,cuisine=?,rating=?,open_time=?,close_time=? where aname=? and rname=?";	
        						       PreparedStatement Dstatement = connection.prepareStatement(sql);
        					           Dstatement.setString(9,temp_Cond_AName);
        					           Dstatement.setString(10,temp_Cond_RName);
        					           Dstatement.setString(1,temp_Aname);
        					           Dstatement.setString(2,tfURR.getText());
        					           Dstatement.setString(3,temp_type);
        					           Dstatement.setString(4,temp_Cls);
        					           Dstatement.setString(5,temp_Cui);
        					           Dstatement.setString(6,temp_Rat);
        					           Dstatement.setString(7,temp_OT);
        					           Dstatement.setString(8,temp_CT);
        					           Dstatement.executeQuery();
        					           
        					           JOptionPane.showMessageDialog(null,"1 row has been Updated successfully!");
        							connection.close();
        						 }
        						catch(Exception e)
        						{
        						   //JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
        						   System.out.println(e);
        						}
        						
        					
        				}
        				
        			});
        	}
        	
        });              
        
 miUpdateH.addActionListener(new ActionListener(){

        	@SuppressWarnings({ "rawtypes", "unchecked" })
        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        		getContentPane().removeAll();
        		repaint();
                cUpdateAH = new JComboBox();
                cUpdateHH = new JComboBox();
                cUpdateAH.setBounds(300,100,200,30);
                cUpdateHH.setBounds(300,300,200,30);
                bUpdateH = new JButton("OK");
                lbUHH = new JLabel("Select Hospital: ");
                lbUAH = new JLabel("Select Area: ");
                lbUDHH = new JLabel("Hospital Name :");
                lbUDAH = new JLabel("Area Name :");
                lbUSpecH = new JLabel("Specialization : ");
                lbUAH.setBounds(100,100,150,30);
                lbUHH.setBounds(100,300,150,30);
                lbUDHH.setBounds(750,100,150,30);
                lbUDAH.setBounds(750,150,150,30);
                lbUSpecH.setBounds(750,200,150,30);
                tfUHH = new JTextField(30);
                tfUHH.setBounds(900,100,150,30);
                tfUAH = new JTextField(30);
                tfUAH.setBounds(900,150,150,30);
                tfUSpecH = new JTextField(30);
                tfUSpecH.setBounds(900,200,150,30);
                bUpdateHOk = new JButton("MODIFY");
                add(lbUSpecH);
                add(tfUSpecH);
                add(lbUHH);
                add(tfUHH);
                add(tfUAH);
                add(lbUDAH);
                add(lbUDHH);
                add(bUpdateHOk);
                bUpdateHOk.setBounds(820,250,100,30);
                lbUAH.setBounds(100,100,150,30);
                add(lbUAH);
                bUpdateH.setBounds(200,500,150,30);
                add(bUpdateH);
                String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
           		String username = "it19737042";
           		String password = "vasavi";
        			
        			try {
        				Class.forName("oracle.jdbc.driver.OracleDriver");
        				Connection connection = DriverManager.getConnection(dbURL,username,password);
        				Statement statement = connection.createStatement();
        				ResultSet rs= statement.executeQuery("select aname,hname from hospitals");	
        				while(rs.next())
        					{
        					     cUpdateAH.addItem(rs.getString(1));
        					     cUpdateHH.addItem(rs.getString(2));
        					         
        					}
        				add(cUpdateAH);
        				add(cUpdateHH);
        				
        				connection.close();
        			 }
        			catch(Exception e)
        			{
        				JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
        			}
        			
        			bUpdateH.addActionListener(new ActionListener()
        			{
        				String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        		   		String username = "it19737042";
        		   		String password = "vasavi";
        				@Override
        				public void actionPerformed(ActionEvent arg0) {
        					try {
        						Class.forName("oracle.jdbc.driver.OracleDriver");
        						Connection connection = DriverManager.getConnection(dbURL,username,password);
        						String sql = "select * from hospitals where aname=? and hname=?";	
        						PreparedStatement Dstatement = connection.prepareStatement(sql);
        				           Dstatement.setString(1,(String)cUpdateAH.getSelectedItem());
        				           Dstatement.setString(2,(String)cUpdateHH.getSelectedItem());
        				           
        				           ResultSet rs = Dstatement.executeQuery();
        				           while(rs.next())
        						    {
        				        	   tfUAH.setText(rs.getString(2));
         				        	   tfUSpecH.setText(rs.getString(1));
          				        	   tfUHH.setText(rs.getString(3));
        						    }
        				            
        						
        						connection.close();
        					 }
        					catch(Exception e)
        					{
        						JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
        					   //System.out.println(e);
        					}
        					
        					
        				}
        				
        			});
        			
        			bUpdateHOk.addActionListener(new ActionListener()
        			{

        				@Override
        				public void actionPerformed(ActionEvent arg0) {
        					String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        			   		String username = "it19737042";
        			   		String password = "vasavi";
        					
        						try {
        							Class.forName("oracle.jdbc.driver.OracleDriver");
        							   Connection connection = DriverManager.getConnection(dbURL,username,password);        							  
									   String temp_type = tfUSpecH.getText();
        							   String temp_Aname = tfUAH.getText();
        							   String temp_Cond_AName = (String)cUpdateAH.getSelectedItem();
        							   String temp_Cond_HName = (String)cUpdateHH.getSelectedItem();
        							   String sql = "update hospitals set aname=?,hname=?, type=? where aname=? and hname=?";	
        						       PreparedStatement Dstatement = connection.prepareStatement(sql);
        					           Dstatement.setString(4,temp_Cond_AName);
        					           Dstatement.setString(5,temp_Cond_HName);
        					           Dstatement.setString(1,temp_Aname);
        					           Dstatement.setString(2,tfUHH.getText());
        					           Dstatement.setString(3,temp_type);
        					           Dstatement.executeQuery();
        					           
        					           JOptionPane.showMessageDialog(null,"1 row has been Updated successfully!");
        							connection.close();
        						 }
        						catch(Exception e)
        						{
        						   //JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
        						   System.out.println(e);
        						}
        						
        					
        				}
        				
        			});
        	}
        	
        });      
 
 
miUpdateA.addActionListener(new ActionListener(){

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void actionPerformed(ActionEvent arg0) {
		getContentPane().removeAll();
		repaint();
        cUpdateA = new JComboBox();
        cUpdateA.setBounds(300,100,200,30);
        bUpdateA = new JButton("OK");
        lbUPin = new JLabel("Choose the Pincode: ");
        lbUDPin = new JLabel("Pincode :");
        lbUName = new JLabel("Area Name :");
        lbUName.setBounds(750,100,150,30);
        lbUDPin.setBounds(750,150,150,30);
        tfUName = new JTextField(30);
        tfUName.setBounds(900,100,150,30);
        tfUDPin = new JTextField(30);
        tfUDPin.setBounds(900,150,150,30);
        bUpdateAOk = new JButton("MODIFY");
        add(tfUName);
        add(tfUDPin);
        add(lbUName);
        add(lbUDPin);
        add(bUpdateAOk);
        bUpdateAOk.setBounds(820,200,100,30);
        lbUPin.setBounds(100,100,150,30);
        add(lbUPin);
        bUpdateA.setBounds(200,150,150,30);
        add(bUpdateA);
        String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
   		String username = "it19737042";
   		String password = "vasavi";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection(dbURL,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select pincode from areas");	
				while(rs.next())
					{
					     cUpdateA.addItem(rs.getInt(1));
					}
				add(cUpdateA);
				connection.close();
			 }
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
			
			bUpdateA.addActionListener(new ActionListener()
			{
				String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		   		String username = "it19737042";
		   		String password = "vasavi";
				@Override
				public void actionPerformed(ActionEvent arg0) {
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Connection connection = DriverManager.getConnection(dbURL,username,password);
						String sql = "select * from areas where pincode=?";	
						PreparedStatement Dstatement = connection.prepareStatement(sql);
				           Dstatement.setInt(1,(int)cUpdateA.getSelectedItem());
				           ResultSet rs = Dstatement.executeQuery();
				           while(rs.next())
						    {
				        	   tfUName.setText(rs.getString(1));
				        	   tfUDPin.setText(Integer.toString(rs.getInt(2)));
						    }
				            
						
						connection.close();
					 }
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
					   //System.out.println(e);
					}
					
					
				}
				
			});
			
			bUpdateAOk.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent arg0) {
					String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			   		String username = "it19737042";
			   		String password = "vasavi";
					
						try {
						       Class.forName("oracle.jdbc.driver.OracleDriver");
							   Connection connection = DriverManager.getConnection(dbURL,username,password);
							   String sql = "update areas set pincode=?,aname=? where pincode=?";	
						       PreparedStatement Dstatement = connection.prepareStatement(sql);
					           Dstatement.setInt(3,(int)cUpdateA.getSelectedItem());
					           Dstatement.setInt(1,Integer.parseInt(tfUDPin.getText()));
					           Dstatement.setString(2,tfUName.getText());
					           Dstatement.executeQuery();
					           
					           JOptionPane.showMessageDialog(null,"1 row has been Updated successfully!");
							connection.close();
						 }
						catch(Exception e)
						{
						   JOptionPane.showMessageDialog(null,"Unable to Update!","ERROR", JOptionPane.ERROR_MESSAGE, null);
						   //System.out.println(e);
						}
						
					
				}
				
			});
	}
	
});      
miDeleteR.addActionListener(new ActionListener(){

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		getContentPane().removeAll();
		repaint();
		cDeleteAR= new JComboBox();
		cDeleteRR = new JComboBox();
		lbDR = new JLabel("Choose Hospital:");
		lbDAR = new JLabel("Choose Area: ");
		lbDR.setBounds(100,100,100,30);
		lbDAR.setBounds(100,300,100,30);
		taDeleteR = new JTextArea();
		add(taDeleteR);
		taDeleteR.setBounds(500,100,500,500);
		add(lbDR);
		add(lbDAR);
		bDeleteR = new JButton("DELETE");
		bDeleteR.setBounds(200,500,150,30);
		add(bDeleteR);
	    String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
   		String username = "it19737042";
   		String password = "vasavi";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection(dbURL,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select aname,rname from restaurants");	
				while(rs.next())
					{
					     cDeleteAR.addItem(rs.getString(1));
					     cDeleteRR.addItem(rs.getString(2));
					}
				cDeleteAR.setBounds(300,100,150,30);
				cDeleteRR.setBounds(300,300,150,30);
				add(cDeleteAR);
				add(cDeleteRR);
				connection.close();
			 }
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Unable to Delete!","ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
     			
     			bDeleteR.addActionListener(new ActionListener(){

     				@Override
     				public void actionPerformed(ActionEvent arg0) {
     					// TODO Auto-generated method stub
     					 String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
     					String username = "it19737042";
     					String password = "vasavi";
     					try
     					{
     						Class.forName("oracle.jdbc.driver.OracleDriver");
     						Connection connection = DriverManager.getConnection(dbURL,username,password);
     					     String sql = "delete from restaurants where rname=? and aname=?";
			              	PreparedStatement Dstatement = connection.prepareStatement(sql);
				            Dstatement.setString(1,(String)cDeleteRR.getSelectedItem());
				            Dstatement.setString(2,(String)cDeleteAR.getSelectedItem());
				            ResultSet rsq= Dstatement.executeQuery();
//				            while(rsq.next())
//				            System.out.println(rsq.getInt(1));
			            	
			            	Statement statement = connection.createStatement();
							ResultSet rs= statement.executeQuery("select * from restaurants");
							
							taDeleteR.setText("Restauarnt Name"+"\t"+"AREA NAME  "+"\t\t"+"TYPE"+"\n\n");
							while(rs.next())
								taDeleteR.append(rs.getString(1)+"\t\t"+rs.getString(5)+"\t\t"+rs.getString(3)+"\n");
							JOptionPane.showMessageDialog(null,"1 row has been Deleted successfully!");
							connection.close();
     					}
     					catch(Exception e)
     					{
     						JOptionPane.showMessageDialog(null,"Unable to Delete!","ERROR", JOptionPane.ERROR_MESSAGE, null);
     						//System.out.println(e);
     					}  
		               
		}
		
		});
	}
 });  
miDeleteH.addActionListener(new ActionListener(){

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		getContentPane().removeAll();
		repaint();
		cDeleteAH= new JComboBox();
		cDeleteHH = new JComboBox();
		lbDH = new JLabel("Choose Hospital:");
		lbDA = new JLabel("Choose Area: ");
		lbDH.setBounds(100,100,100,30);
		lbDA.setBounds(100,300,100,30);
		taDeleteH = new JTextArea();
		add(taDeleteH);
		taDeleteH.setBounds(500,100,500,500);
		add(lbDH);
		add(lbDA);
		bDeleteH = new JButton("DELETE");
		bDeleteH.setBounds(200,500,150,30);
		add(bDeleteH);
	    String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
   		String username = "it19737042";
   		String password = "vasavi";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection(dbURL,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select aname,hname from hospitals");	
				while(rs.next())
					{
					     cDeleteAH.addItem(rs.getString(1));
					     cDeleteHH.addItem(rs.getString(2));
					}
				cDeleteAH.setBounds(300,100,150,30);
				cDeleteHH.setBounds(300,300,150,30);
				add(cDeleteAH);
				add(cDeleteHH);
				connection.close();
			 }
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Unable to Delete!","ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
     			
     			bDeleteH.addActionListener(new ActionListener(){

     				@Override
     				public void actionPerformed(ActionEvent arg0) {
     					// TODO Auto-generated method stub
     					 String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
     					String username = "it19737042";
     					String password = "vasavi";
     					try
     					{
     						Class.forName("oracle.jdbc.driver.OracleDriver");
     						Connection connection = DriverManager.getConnection(dbURL,username,password);
     					     String sql = "delete from hospitals where hname=? and aname=?";
			              	PreparedStatement Dstatement = connection.prepareStatement(sql);
				            Dstatement.setString(1,(String)cDeleteHH.getSelectedItem());
				            Dstatement.setString(2,(String)cDeleteAH.getSelectedItem());
				            Dstatement.executeQuery();
			            	
			            	Statement statement = connection.createStatement();
							ResultSet rs= statement.executeQuery("select * from hospitals");
							
							taDeleteH.setText("Hospital Name"+"\t\t\t"+"AREA NAME  "+"\t\t"+"TYPE"+"\n\n");
							while(rs.next())
								taDeleteH.append(rs.getString(3)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(1)+"\n");
							JOptionPane.showMessageDialog(null,"1 row has been Deleted successfully!");
							connection.close();
     					}
     					catch(Exception e)
     					{
     						JOptionPane.showMessageDialog(null,"Unable to Delete!","ERROR", JOptionPane.ERROR_MESSAGE, null);
     						//System.out.println(e);
     					}  
		               
		}
		
		});
	}
 });  


 miDeleteA.addActionListener(new ActionListener(){

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		
		getContentPane().removeAll();
		getContentPane().repaint();
		
		c= new JComboBox();
		lbDPin = new JLabel(" Choose Pincode:");
		lbDPin.setBounds(100,100,100,30);
		taDeleteA = new JTextArea();
		add(taDeleteA);
		taDeleteA.setBounds(500,100,500,500);
		add(lbDPin);
		bDeleteA = new JButton("DELETE");
		bDeleteA.setBounds(200,150,150,30);
		add(bDeleteA);
	    String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
   		String username = "it19737042";
   		String password = "vasavi";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection(dbURL,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select pincode from areas");	
				while(rs.next())
					{
					     c.addItem(rs.getInt(1));
					}
				c.setBounds(300,100,170,30);
				add(c);
				connection.close();
			 }
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"Unable to Delete!","ERROR", JOptionPane.ERROR_MESSAGE, null);
			}
     			
     			bDeleteA.addActionListener(new ActionListener(){

     				@Override
     				public void actionPerformed(ActionEvent arg0) {
     					// TODO Auto-generated method stub
     					 String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
     					String username = "it19737042";
     					String password = "vasavi";
     					try
     					{
     						Class.forName("oracle.jdbc.driver.OracleDriver");
     						Connection connection = DriverManager.getConnection(dbURL,username,password);
     					     String sql = "delete from areas where pincode=?";
			              	PreparedStatement Dstatement = connection.prepareStatement(sql);
				           Dstatement.setInt(1,(int)c.getSelectedItem());
				            Dstatement.executeQuery();
			            	
			            	Statement statement = connection.createStatement();
							ResultSet rs= statement.executeQuery("select * from areas");
							
							taDeleteA.setText("AREA NAME  "+"\t\t"+"PINCODE"+"\n\n");
							while(rs.next())
								taDeleteA.append(rs.getString(1)+"\t\t"+rs.getInt(2)+"\n");
							connection.close();
							JOptionPane.showMessageDialog(null,"1 row has been Deleted successfully!");
     					}
     					catch(Exception e)
     					{
     						JOptionPane.showMessageDialog(null,"Unable to Delete!","ERROR", JOptionPane.ERROR_MESSAGE, null);
     						
     					}  
		               
		}
		
		});
	}
 });    
 miInsertR.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent arg0) {
    			getContentPane().removeAll();
    			repaint();
    			
    		    lbRName = new JLabel("Restaurant Name:");
    		    lbCuisine = new JLabel("Cuisine:");
    		    lbType  = new JLabel("Type:");
    		    lbClas  = new JLabel("Classification:");
    		    lbRat   = new JLabel("Rating:");
    		    lbOT    = new JLabel("Open Time:");
    		    lbCT    = new JLabel("Close Time:");
    		    tfRName  = new JTextField(30);
    		    tfCuisine = new JTextField(30);
    		    tfType    = new JTextField(30);
    		    tfClas   =new JTextField(30);
    		    tfRat    = new JTextField(30);
    		    tfOt     = new JTextField(30);
    		    tfCt     = new JTextField(30);
    		    taR     = new JTextArea();
    		    add(taR);
    			add(lbRName);
    			add(lbAName);
    			add(lbCuisine);
    			add(lbType);
    			add(lbClas);
    			add(lbRat);
    			add(lbOT);
    			add(lbCT);
    			add(tfRName);
    			add(tfAName);
    			add(tfCuisine);
    			add(tfType);
    			add(tfClas);
    			add(tfRat);
    			add(tfOt);
    			add(tfCt);
    			add(bInsertR);
    			add(taR);
    			lbRName.setBounds(300,50,150,30);
    			lbCuisine.setBounds(300,100,100,30);
    			lbType.setBounds(300,200,100,30);
    			lbClas.setBounds(300,250,100,30);
    			lbRat.setBounds(300,300,100,30);
    			lbOT.setBounds(300,350,100,30);
    			lbCT.setBounds(300,400,100,30);
    		    tfRName.setBounds(500, 50, 200,30);
    		    tfCuisine.setBounds(500, 100, 200,30);
    		    tfType.setBounds(500,200, 200,30);
    		    tfClas.setBounds(500, 250, 200,30);
    		    tfRat.setBounds(500,300, 200,30);
    		    tfOt.setBounds(500,350, 200,30);
    		    tfCt.setBounds(500,400, 200,30);
    		    taR.setBounds(350,500,300,150);
    			
    			
    			bInsertR.setBounds(400,450,90,40);
    			bInsertR.addActionListener(new ActionListener()
    			{

    				@Override
    				public void actionPerformed(ActionEvent arg0) {
    					// TODO Auto-generated method stub
    			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
    			String username = "it19737042";
    			String password = "vasavi";
    			
    				try {
    				
    					Connection connection = DriverManager.getConnection(dbURL,username,password);
    					System.out.println("Connected to oracle");
    					String sql = "INSERT INTO restaurants(rname,cuisine,type,classification,aname,rating,open_time,close_time) VALUES(?,?,?,?,?,?,?,?)";
    					 PreparedStatement statement = connection.prepareStatement(sql);
    							try {
    								statement.setString(1,tfRName.getText());
    								statement.setString(2,tfCuisine.getText());
    								statement.setString(3,tfType.getText());
    								statement.setString(4,tfClas.getText());
    								statement.setString(5,tfAName.getText());
    								statement.setString(6,tfRat.getText());
    								statement.setString(7,tfOt.getText());
    								statement.setString(8,tfCt.getText());
    							} catch (SQLException e1) {
    								// TODO Auto-generated catch block
    								e1.printStackTrace();
    							}
    							
    							
    							int rows = statement.executeUpdate();
    							
    							if(rows > 0)
    							taR.setText("A row has been inserted succesfully");
    							JOptionPane.showMessageDialog(null,"1 row has been inserted successfully!");
    							connection.close();
    							
    					
    					
    				} catch (SQLException e) {
    					JOptionPane.showMessageDialog(null,"OOPS ERROR!","ERROR", JOptionPane.ERROR_MESSAGE, null);
    					e.printStackTrace();
    				}
    		}
    			});
    			
    		}	
    	});     
        
 miInsertH.addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent arg0) {
    			// TODO Auto-generated method stub
    		//System.exit(0);
    			getContentPane().removeAll();
    			repaint();
    			lbHName = new JLabel("Hospital Name:");
    		    lbSpec  = new JLabel("Specialization:");
    		    tfHName = new JTextField(30);
    		    tfSpec = new JTextField(30);
    			add(lbHName);
    			add(lbAName);
    			add(lbSpec);
    			add(tfAName);
    			add(tfHName);
    			add(tfSpec);
    			add(bInsertH);
    			add(taOp);
    			lbHName.setBounds(300,100,100,30);
    			lbSpec.setBounds(300,200,100,30);
    		    tfHName.setBounds(500, 100, 200,30);
    			tfSpec.setBounds(500, 200, 200,30);
    			bInsertH.setBounds(400,300,90,40);
    			bInsertH.addActionListener(new ActionListener()
    			{

    				@Override
    				public void actionPerformed(ActionEvent arg0) {
    					// TODO Auto-generated method stub
    			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
    			String username = "it19737042";
    			String password = "vasavi";
    			
    			
    				try {
    					try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    					Connection connection = DriverManager.getConnection(dbURL,username,password);
    					System.out.println("Connected to oracle");
    					String sql = "INSERT INTO hospitals(type,aname,hname) VALUES(?,?,?)";
    					 PreparedStatement statement = connection.prepareStatement(sql);
    							try {
    								statement.setString(1,tfSpec.getText());
    								statement.setString(2,tfAName.getText());
    								statement.setString(3,tfHName.getText());
    							} catch (SQLException e1) {
    								// TODO Auto-generated catch block
    								e1.printStackTrace();
    							}
    							
    							
    							int rows = statement.executeUpdate();
    							
    							if(rows > 0)
    							taOp.setText("A row has been inserted succesfully");
    							JOptionPane.showMessageDialog(null,"1 row has been inserted successfully!");
    							connection.close();
    							
    					
    					
    				} catch (SQLException e) {
    					JOptionPane.showMessageDialog(null,"OOPS ERROR!","ERROR", JOptionPane.ERROR_MESSAGE, null);
    				}
    		}
    			});
    			
    		}	
    	});     
        
        
	miViewA.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "it19737042";
			String password = "vasavi";
			getContentPane().removeAll();
			repaint();
			lbADet = new JLabel("AREA DETAILS");
			lbADet.setBounds(500,30,200,50);
			lbADet.setFont(new Font("Verdana",Font.PLAIN,24));
	        lbADet.setForeground(Color.white);
	        lbADet.setBackground(Color.lightGray);
	        lbADet.setOpaque(true);
			lbADet.setHorizontalAlignment(JLabel.CENTER);
			lbADet.setVerticalAlignment(JLabel.CENTER);
			add(lbADet);
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection(dbURL,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select * from areas");
				add(ta);
				ta.setText("AREA NAME  "+"\t\t"+"PINCODE"+"\n\n");
				while(rs.next())
					ta.append(rs.getString(1)+"\t\t"+rs.getInt(2)+"\n");
				connection.close();
		     }
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		}
	});
	miViewH.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "it19737042";
			String password = "vasavi";
			
			getContentPane().removeAll();
			repaint();
			lbHDet = new JLabel("HOSPITALS DETAILS");
			lbHDet.setBounds(500,30,250,50);
			lbHDet.setFont(new Font("Verdana",Font.PLAIN,24));
	        lbHDet.setForeground(Color.white);
	        lbHDet.setBackground(Color.lightGray);
	        lbHDet.setOpaque(true);
			lbHDet.setHorizontalAlignment(JLabel.CENTER);
			lbHDet.setVerticalAlignment(JLabel.CENTER);
			add(lbHDet);
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection(dbURL,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select * from hospitals");
				add(ta);
				ta.setText("HOSPITAL NAME  "+"\t"+"AREA NAME"+"\t"+"SPCECIALIZATION"+"\n\n");
				while(rs.next())
					ta.append(rs.getString(3)+"\t"+rs.getString(2)+"\t "+rs.getString(1)+"\n");
				connection.close();
		     }
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		}
	});
	miViewR.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "it19737042";
			String password = "vasavi";
			
			getContentPane().removeAll();
			repaint();
			lbRDet = new JLabel("RESTAURANT DETAILS");
			lbRDet.setBounds(500,30,275,50);
			lbRDet.setFont(new Font("Verdana",Font.PLAIN,24));
	        lbRDet.setForeground(Color.white);
	        lbRDet.setBackground(Color.lightGray);
	        lbRDet.setOpaque(true);
			lbRDet.setHorizontalAlignment(JLabel.CENTER);
			lbRDet.setVerticalAlignment(JLabel.CENTER);
			add(lbRDet);
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection connection = DriverManager.getConnection(dbURL,username,password);
				Statement statement = connection.createStatement();
				ResultSet rs= statement.executeQuery("select * from restaurants");
				add(ta);
				ta.setText("RESTAURANT NAME"+"\t"+"CUISINE"+"\t\t"+"TYPE"+"\t\t"+"RATING"+"\t\t"+"\n\n");
				while(rs.next())
					ta.append(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(4)+"\t\t"+rs.getString(6)+"\n");
					//ta.append(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getFloat(5)+"\n");
				connection.close();
		     }
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		}
	
	});
	miInsertA.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		//System.exit(0);
			getContentPane().removeAll();
			repaint();
			add(lbAName);
			add(lbPin);
			add(tfAName);
			add(tfPin);
			add(bInsertA);
			add(taOp);
			bInsertA.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
			String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "it19737042";
			String password = "vasavi";
			
			
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection connection = DriverManager.getConnection(dbURL,username,password);
					System.out.println("Connected to oracle");
					String sql = "INSERT INTO AREAS(aname,pincode) VALUES(?,?)";
					 PreparedStatement statement = connection.prepareStatement(sql);
					
					
							try {
								statement.setInt(2,Integer.parseInt(tfPin.getText()));
							} catch (NumberFormatException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							statement.setString(1,tfAName.getText());
							int rows = statement.executeUpdate();
							
							if(rows > 0)
							taOp.setText("A row has been inserted succesfully");
							JOptionPane.showMessageDialog(null,"1 row has been inserted successfully!");
							connection.close();
							
					
					
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null,"Invalid Pincode!","ERROR", JOptionPane.ERROR_MESSAGE, null);
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			});
			
		}	
	});

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new dbms_project();
	}

}

