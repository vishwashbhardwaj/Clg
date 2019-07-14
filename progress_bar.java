import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.applet.*;
import java.net.*;
import net.proteanit.sql.DbUtils;
import javax.swing.table.*;
import java.util.Calendar;
import java.util.Date;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;
import org.jdatepicker.graphics.*;
import java.text.*;
import javax.swing.JFormattedTextField.AbstractFormatter;

//CODE FOR ADD PC INFORMATION


	       class pcinfo
		{
		    JFrame jf;
		    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;
		    JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7;
		    JComboBox jcb1,jcb2,jcb3,jcb4,jcb5;
		    JButton jb1,jb2,jb3,jb4,jb5;
		    Dimension ds;
		    ImageIcon ic;
		    JPanel jp1,jp2;
		    AudioClip clip;
		    URL ur;
 		    pcinfo()
		   {
                                          jf=new JFrame("PCINFO");
             		       ic=new ImageIcon(this.getClass().getResource("/b.png"));
		       jl1=new JLabel(ic);  
		       jf.setLayout(null);
		       jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE);
		       ds=Toolkit.getDefaultToolkit().getScreenSize();			
		       jf.setSize(ds.width,ds.height);
	   	       jl1.setSize(ds.width,ds.height);
		       Font f = new Font(" Ravie" , Font.BOLD, 50);  		       
		       jp1=new JPanel();
		       jp1.setBounds(0,0,1360,100);
		       jp1.setBackground(new Color(0,0,0,48));
		       jp1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.cyan,1),""));
		       jl2  = new JLabel("PC INFORMATION");  
		       jl2.setForeground(Color.WHITE);      
		       jl2.setFont(f);

			   ur=pcinfo.class.getResource("wr.wav");
 	    	   clip=Applet.newAudioClip(ur);
		       
 		       jp2=new JPanel();
		       jp2.setLayout(null);
	   	       jp2.setBackground(new Color(0,0,0,80));
		       jp2.setBounds(100,200,1150,500);
                                          jp2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.cyan,1),""));
                                          
		       Font f1= new Font("Times New Roman",Font.BOLD,30);
		       jl3=new JLabel("Workstation no");
		       jl3.setBounds(50,50,195,50);
		       jl3.setFont(f1);		       
		       
		       jl4=new JLabel("Operating System");
		       jl4.setBounds(50,105,195,50);
		        Font font=new Font("Times New Roman",Font.BOLD,25);
		       jl4.setFont(font);		       

		       jl5=new JLabel("RAM");
		       jl5.setBounds(50,160,195,50);
		       jl5.setFont(f1);		       
		       
		       jl6=new JLabel("HDD");		       
		       jl6.setBounds(50,215,195,50);
		       jl6.setFont(f1);		       

		       jl7=new JLabel("VGA Card");
		       jl7.setBounds(600,50,195,50);
		       jl7.setFont(f1);
			       
		       jl8=new JLabel("Monitor");	
		       jl8.setBounds(600,110,195,50);
		       jl8.setFont(f1);	
       
		       jl9=new JLabel("Mouse");
		       jl9.setBounds(600,160,195,50);
		       jl9.setFont(f1);
		       
		       jl10=new JLabel("Keyboard");
		       jl10.setBounds(600,215,195,50);
		       jl10.setFont(f1);	

		       Font fo=new Font("Times New Roman",Font.BOLD,15);
		       jt1=new JTextField();
	           jt1.setBounds(255,50,195,50);
	           jt1.setFont(fo);

		       jcb1=new JComboBox();
		       jcb1.setBounds(255,105,195,50);
		       jcb1.setFont(fo);
		       jcb1.addItem("......Select......");
		       jcb1.addItem("Microsoft Window");
		       jcb1.addItem("Linux");
		       jcb1.addItem("Mac Os");
		       jcb1.addItem("IOS");
	       	       
		       jt2=new JTextField();
	       	       jt2.setBounds(255,160,195,50);
	       	       jt2.setFont(fo);

		       jt3=new JTextField();
     		       jt3.setBounds(255,215,195,50);
     		       jt3.setFont(fo);
	       
		       jcb2=new JComboBox();
	           jcb2.setBounds(805,50,195,50);
	           jcb2.setFont(fo);
	           jcb2.addItem("......Select......");
	           jcb2.addItem("500 MB");
	           jcb2.addItem("1 GB");
	           jcb2.addItem("2 GB");
	           jcb2.addItem("4 GB");

		       jcb3=new JComboBox();
		       jcb3.setBounds(805,105,195,50);
		       jcb3.setFont(fo);
		       jcb3.addItem("......Select.......");
		       jcb3.addItem("flat Panel");
               jcb3.addItem("Touch Sreen");	       

		       jcb4=new JComboBox();
		       jcb4.setBounds(805,160,195,50);
		       jcb4.setFont(fo);
		       jcb4.addItem("......Select......");
		       jcb4.addItem("Wired");
		       jcb4.addItem("Wireless");
	       
		       jcb5=new JComboBox();	       
		       jcb5.setBounds(805,215,195,50);
		       jcb5.setFont(fo);
		       jcb5.addItem("......Select.......");
               jcb5.addItem("Wired"); 
               jcb5.addItem("Wireless");

               Font f2=new Font("Times new Roman",Font.BOLD,20);
		       jb1=new JButton("Save Record");
		       jb1.setFont(f2);
		       jb1.setBounds(220,300,170,35);

			   jb2=new JButton("Update Record");
		       jb2.setFont(f2);
		       jb2.setBounds(470,300,170,35);

			   jb3=new JButton("Delete Record");
		       jb3.setFont(f2);
		       jb3.setBounds(720,300,170,35);

			   jb4=new JButton("Back");
		       jb4.setFont(f2);
		       jb4.setBounds(300,400,170,35);

			   jb5=new JButton("Clear Fields");
		       jb5.setFont(f2);
		       jb5.setBounds(600,400,170,35);

		       jf.setResizable(false);
		       jf.add(jl1);	
			jl1.add(jp1);
			jp1.add(jl2);
			jl1.add(jp2);
			jp2.add(jl3);
			jp2.add(jl4);
			jp2.add(jl5);
			jp2.add(jl6);
			jp2.add(jl7);
			jp2.add(jl8);
			jp2.add(jl9);
			jp2.add(jl10);

			jp2.add(jt1);
			jp2.add(jcb1);
			jp2.add(jt2);
			jp2.add(jt3);
			jp2.add(jcb2);
			jp2.add(jcb3);
			jp2.add(jcb4);
			jp2.add(jcb5);

			jp2.add(jb1); 
			jp2.add(jb2); 			
			jp2.add(jb3); 			
			jp2.add(jb4); 
			jp2.add(jb5); 			
			jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE);

		       jf.addWindowListener(new WindowAdapter()
						{
							public void windowClosing(WindowEvent we)
							{
							 clip.play();
							  JOptionPane.showMessageDialog(jf,"Sorry,you can't close from here please go to EXIT BUTTON","ERROR",JOptionPane.ERROR_MESSAGE);
							}
              			});

//CODE FOR SELECT STRING FROM DATABASE 

		       jt1.addKeyListener(new KeyAdapter()
		       {
		       	public void keyPressed(KeyEvent ke)
		       	{
		       	//	jcb2.setSelectedItem("......Select......");
		       	//	jcb1.setSelectedItem("......Select......");
		       		jcb3.setSelectedItem("......Select......");
		       		jt2.setText("");
		         //	jcb4.setSelectedItem("......Select......");
		         	jt3.setText("");
		       		jcb5.setSelectedItem("......Select......");
		       	}

		       	public void keyReleased(KeyEvent ke)
		       	 {
		       	 	try
		       	 	{
		       	 		Class.forName("com.mysql.jdbc.Driver");
		       	 		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash");
		       	 		PreparedStatement pst=cn.prepareStatement(" select * from pcinformation where workstation_no = ? ");                            
		       	 		pst.setString(1,jt1.getText());
		       	 		ResultSet rs=pst.executeQuery();

		       	 		String x="", y="" ,z="" ,w="" ,a="" ,b="" ,c="" ,d="";
		       	 		while(rs.next())
		       	 	{

		       	 		w=rs.getString(1);							
		       	 		x=rs.getString(2);						
		       	 		y=rs.getString(3);
		       	 		z=rs.getString(4);
		       	 		a=rs.getString(5);
		       	 		b=rs.getString(6);
		       	 		c=rs.getString(7);
		       	 		d=rs.getString(8);
		       	 		jcb1.setSelectedItem(x);
		       	 		jt2.setText(y);
		       	 		jt3.setText(z);
		       	 		jcb2.setSelectedItem(a);
		       	 		jcb3.setSelectedItem(b);
		       	 		jcb4.setSelectedItem(c);
		       	 		jcb5.setSelectedItem(d);
		       	 	}
		       	 }	
		       	 	catch(Exception e)
		       	 	{
		       	 		System.out.println(e);
		       	 	}
		       	 }
		       });


// CODE FOR INSERT PC DATA BY USING MOUSE LISTENER..................................................................................

		   jb1.addActionListener(new ActionListener()
           {
                     public void actionPerformed(ActionEvent ae)
                   
                     {
                          try
                          {
                          	  System.out.println("insert data1");
                             if(jt1.getText().equals("") || jt2.getText().equals("") || jt3.getText().equals("") ) 
                               JOptionPane.showMessageDialog(jf,"Please insert the pcinformation Data","ERROR",JOptionPane.ERROR_MESSAGE);
                             else
                           {
                             Class.forName("com.mysql.jdbc.Driver");
                             Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash") ;
                             PreparedStatement pst=cn.prepareStatement("insert into pcinformation values(?,?,?,?,?,?,?,?)");
                             pst.setString(1,jt1.getText());
                             pst.setString(2,jcb1.getSelectedItem().toString());                             
                             pst.setString(3,jt2.getText());
                             pst.setString(4,jt3.getText());
                             pst.setString(5,jcb2.getSelectedItem().toString());
                             pst.setString(6,jcb3.getSelectedItem().toString());
                             pst.setString(7,jcb4.getSelectedItem().toString());
                             pst.setString(8,jcb5.getSelectedItem().toString());
                             pst.executeUpdate(); 
                            JOptionPane.showMessageDialog(jf,"Inserted Successfully");      
                          }
                         }
                       catch(Exception e)
                          {
                            System.out.println(e);
                          }
                     
                           jf.dispose();
                           new pcinfo();   
                     }
           }); 

//CODE FOR INSERT PC DATA BY USING KEY LISTENER.................................................................................................

					jb1.addKeyListener(new KeyAdapter()
           			{
                     public void keyPressed(KeyEvent ke)
                        {
                        	int key=ke.getKeyCode();	
			                if(key ==KeyEvent.VK_ENTER)
                   
                   		  {
                          try
                          {
                          	  System.out.println("insert data1");
                             if(jt1.getText().equals("") || jt2.getText().equals("") || jt3.getText().equals("") ) 
                               JOptionPane.showMessageDialog(jf,"Please insert the pcinformation Data","ERROR",JOptionPane.ERROR_MESSAGE);
                             else
                           {
                             Class.forName("com.mysql.jdbc.Driver");
                             Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash") ;
                             PreparedStatement pst=cn.prepareStatement("insert into pcinformation values(?,?,?,?,?,?,?,?)");
                             pst.setString(1,jt1.getText());
                             pst.setString(2,jcb1.getSelectedItem().toString());                             
                             pst.setString(3,jt2.getText());
                             pst.setString(4,jt3.getText());
                             pst.setString(5,jcb2.getSelectedItem().toString());
                             pst.setString(6,jcb3.getSelectedItem().toString());
                             pst.setString(7,jcb4.getSelectedItem().toString());
                             pst.setString(8,jcb5.getSelectedItem().toString());
                             pst.executeUpdate(); 
                            JOptionPane.showMessageDialog(jf,"Inserted Successfully");      
                          }
                         }
                       catch(Exception e)
                          {
                            System.out.println(e);
                          }
                     
                           jf.dispose();
                           new pcinfo();   
                     }
                 }
           }); 



//CODE FOR UPDATE RECORD BY USIGN MOUSE LISTENER AND KEYLITENER  .......................................................................

					jb2.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{
								try
								{
								if(jt1.getText().equals("") || jt2.getText().equals("") || jt3.getText().equals("") ) 
                                   JOptionPane.showMessageDialog(jf,"Please insert Workstation ID For Updation","ERROR",JOptionPane.ERROR_MESSAGE);
                                  else
								  {
									Class.forName("com.mysql.jdbc.Driver");
									Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash");
									PreparedStatement pst= con.prepareStatement("update pcinformation set operating_system= ?,ram=? ,hdd=? ,vga_card=?, monitor=?,mouse=?,keyboard=? where workstation_no = ?");
	 	                            pst.setString(1,jcb1.getSelectedItem().toString());                             
        		                    pst.setString(2,jt2.getText());
                		            pst.setString(3,jt3.getText());
               			            pst.setString(4,jcb2.getSelectedItem().toString());
                    		        pst.setString(5,jcb3.getSelectedItem().toString());
                            		pst.setString(6,jcb4.getSelectedItem().toString());
                             		pst.setString(7,jcb5.getSelectedItem().toString());
                             		pst.setString(8,jt1.getText());
                             		pst.executeUpdate(); 
                            		JOptionPane.showMessageDialog(jf,"Updated Successfully"); 
								}
							}		
								catch(Exception e)
								{
									System.out.println(e);
								}
								jf.dispose();
								new pcinfo();
							}
						});

				jb2.addKeyListener(new KeyAdapter()
				{
					public void keyPressed(KeyEvent ke)
					{
						int key=ke.getKeyCode();
						if(key==KeyEvent.VK_ENTER)
							try
						{
							if(jt1.getText().equals("") ||jt2.getText().equals("") || jt3.getText().equals(""))
								JOptionPane.showMessageDialog(jf,"Please insert Workstation ID for Updation","ERROR",JOptionPane.ERROR_MESSAGE);
							else
							{
									Class.forName("com.mysql.jdbc.Driver");
									Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash");
									PreparedStatement pst= con.prepareStatement("update pcinformation set operating_system= ?,ram=? ,hdd=? ,vga_card=?, monitor=?,mouse=?,keyboard=? where workstation_no = ?");
	 	                            pst.setString(1,jcb1.getSelectedItem().toString());                             
        		                    pst.setString(2,jt2.getText());
                		            pst.setString(3,jt3.getText());
               			            pst.setString(4,jcb2.getSelectedItem().toString());
                    		        pst.setString(5,jcb3.getSelectedItem().toString());
                            		pst.setString(6,jcb4.getSelectedItem().toString());
                             		pst.setString(7,jcb5.getSelectedItem().toString());
                             		pst.setString(8,jt1.getText());
                             		pst.executeUpdate(); 
                            		JOptionPane.showMessageDialog(jf,"Updated Successfully"); 
							}
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
						jf.dispose();
						new pcinfo();
					}
				});

// code for delete data in pcinformation table by useing mouse and key Activity.........................................................

          jb3.addActionListener(new ActionListener()
           {
                     public void actionPerformed(ActionEvent ae)
                     {
                         try
                          {
	   						      if(jt1.getText().equals("") ) 
                                   JOptionPane.showMessageDialog(jf,"Please insert Workstation ID for Deletetion","ERROR",JOptionPane.ERROR_MESSAGE);
                             else
                           {
                             Class.forName("com.mysql.jdbc.Driver");
                             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash") ;
                             PreparedStatement pst= con.prepareStatement("delete from pcinformation where workstation_no=?");
                             pst.setString(1,jt1.getText());
                             pst.executeUpdate(); 
                             JOptionPane.showMessageDialog(jf,"Deleted Successfully");
                          }
			}
                          catch(Exception e)
                           {
                            System.out.println(e);
                           }  
                             clip.play() ;
                             jf.dispose();
                               new pcinfo();
                     }
           }); 

       jb3.addKeyListener(new KeyAdapter()
         {
             public void keyPressed(KeyEvent ae)
            {
                        int key = ae.getKeyCode();
                                    if(key ==KeyEvent.VK_ENTER)
               {
                          try
                         {     if(jt1.getText().equals("") ) 
                                   JOptionPane.showMessageDialog(jf,"Please insert Workstation ID for Deletetion","ERROR",JOptionPane.ERROR_MESSAGE);
                             else
                           {
                           Class.forName("com.mysql.jdbc.Driver");
                             Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash") ;
                             PreparedStatement pst=cn.prepareStatement("delete from pcinformation where workstation_no=?");
                             pst.setString(1,jt1.getText());
                             pst.executeUpdate(); 
                             JOptionPane.showMessageDialog(jf,"Deleted Successfully");
                          }
				}
                          catch(Exception e)
                           {
                            System.out.println(e);
                           } 
			}					
							clip.play();
                             jf.dispose();
                               new pc();  
                     }
           }); 

//CODE FOR EXIT BUTTON BY USING MOUSE AND KEY LISTENERR........................................................................

		      jb4.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						
							   jf.dispose();
							   new pc();
							   clip.play();
							}
              			});

              jb4.addKeyListener(new KeyAdapter()
       		     {
         		       public void keyPressed(KeyEvent ae)
	                  {
		                 int key = ae.getKeyCode();
		                 if(key ==KeyEvent.VK_ENTER)
			     {
			              jf.dispose();
			              new pc();
			              clip.play();
			  		  }  	
			     } 
		       });	

 //CODE FOR CLEAR THE FIELDS BY USIGN MOUSE AND KEYLISTENER .....................................................................
 

   jb5.addActionListener(new ActionListener ()
         {
             public void actionPerformed(ActionEvent ae)
               {
                  jt1.setText(""); 
                  jcb1.setSelectedItem(".....Select.....");
                  jt2.setText("");
                  jt3.setText("");
                  jcb2.setSelectedItem(".....Select.....");                  
                  jcb3.setSelectedItem(".....Select.....");                  
                  jcb4.setSelectedItem(".....Select.....");                  
                  jcb5.setSelectedItem(".....Select.....");               
              }
         });
     jb5.addKeyListener(new KeyAdapter()
         {
             public void keyPressed(KeyEvent ae)
			{
                   int key = ae.getKeyCode();
                                    if(key ==KeyEvent.VK_ENTER)
               {
                  jt1.setText(""); 
                  jcb1.setSelectedItem(".....Select.....");                  
                  jt2.setText("");
                  jt3.setText("");
                  jcb2.setSelectedItem(".....Select.....");                  
                  jcb3.setSelectedItem(".....Select.....");                  
                  jcb4.setSelectedItem(".....Select.....");                  
                  jcb5.setSelectedItem(".....Select.....");               
               }
           }
            });

		     jf.setVisible(true);
		   }
		}



//CODE FOR ASSIGN PC TO STUDENT

	       class assign_pc
		{
		    JFrame jf;
		    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;
		    JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10;
		    JButton jb1,jb2,jb3,jb4,jb5;
		    JComboBox jcb;
		    Dimension ds;
		    ImageIcon ic;
		    JPanel jp1,jp2;
		    AudioClip clip;
		    URL ur;
		    int ch=0;
 		    assign_pc()
		   {
                                          jf=new JFrame("Assign Pc To Student");
             		       ic=new ImageIcon(this.getClass().getResource("/g.jpg"));
		       jl1=new JLabel(ic);  
		       jf.setLayout(null);
		       ds=Toolkit.getDefaultToolkit().getScreenSize();			
		       jf.setSize(ds.width,ds.height);
	   	       jl1.setSize(ds.width,ds.height);
		       Font f = new Font(" Ravie" , Font.BOLD, 50);  		       
		       jp1=new JPanel();
		       jp1.setBounds(0,0,1360,100);
		       jp1.setBackground(new Color(0,0,0,48));
		       jp1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.cyan,1),""));
		       jl2  = new JLabel("ASSIGN PC TO STUDENT ");  
		       jl2.setForeground(Color.WHITE);      
		       jl2.setFont(f);

		       ur=pcinfo.class.getResource("wr.wav");
 	    	   clip=Applet.newAudioClip(ur);

		        Font f1= new Font("Times New Roman",Font.BOLD,30);
		       jl3=new JLabel("Student ID");
		       jl3.setBounds(50,50,195,50);
		       jl3.setFont(f1);		       
		       
		       jl4=new JLabel("Student Name");
		       jl4.setBounds(50,105,195,50);
		       jl4.setFont(f1);		       

		       jl5=new JLabel("Batch");
		       jl5.setBounds(50,160,195,50);
		       jl5.setFont(f1);		       
		       
		       jl6=new JLabel("Course");		       
		       jl6.setBounds(50,215,195,50);
		       jl6.setFont(f1);		       

		       jl11=new JLabel("Section");
		       jl11.setBounds(50,270,195,50);
		       jl11.setFont(f1);

		       jl7=new JLabel("LAB NO");
		       jl7.setBounds(580,50,195,50);
		       jl7.setFont(f1);
			       
		       jl8=new JLabel("Lab Subject");	
		       jl8.setBounds(580,105,195,50);
		       jl8.setFont(f1);	
       
		       jl9=new JLabel("Workstation NO");
		       jl9.setBounds(580,160,210,50);
		       jl9.setFont(f1);
		       
		       jl10=new JLabel("Time");
		       jl10.setBounds(580,215,195,50);
		       jl10.setFont(f1);	


		       jl12=new JLabel("Date");
		       jl12.setBounds(580,270,195,50);
		       jl12.setFont(f1);

		        Font f3= new Font("Times New Roman",Font.BOLD,20);
		       jt1=new JTextField();
	           jt1.setBounds(255,50,195,50);
	           jt1.setFont(f3);

		       jt2=new JTextField();
		       jt2.setBounds(255,105,195,50);
		       jt2.setFont(f3);
	       	       
		       jt3=new JTextField();
	       	   jt3.setBounds(255,160,195,50);
	       	   jt3.setFont(f3);

		       jt4=new JTextField();
     		   jt4.setBounds(255,215,195,50);
     		   jt4.setFont(f3);

     		   jt8=new JTextField();	       
		       jt8.setBounds(255,270,195,50);
	           jt8.setFont(f3);

		       jt5=new JTextField();
	           jt5.setBounds(815,50,195,50);
	           jt5.setFont(f3);

		       jt6=new JTextField();
		       jt6.setBounds(815,105,195,50);  
		       jt6.setFont(f3);   

		       jt7=new JTextField();
		       jt7.setBounds(815,160,195,50);
		       jt7.setFont(f3);
	     
		       jt9=new JTextField(".....HH:MI -- HH:MI .....");	       
		       jt9.setBounds(815,215,195,50);
		       jt9.setFont(f3);

		       Properties p = new Properties();
		       p.put("text.today","Today");
		       p.put("text.month","Month");
		       p.put("text.year","Year");
		       UtilDateModel model =  new UtilDateModel();
		       model.setDate(2018,07,23);
		       JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
               JDatePickerImpl datePicker = new JDatePickerImpl(datePanel,new DateLabelFormatter());
 			   datePicker.setBounds(815,280,195,25);

		     //  jt10=new JTextField();	       
		       //jt10.setBounds(815,270,195,50);	

               Font f2=new Font("Times new Roman",Font.BOLD,20);
		       jb1=new JButton("Issue PC");
		       jb1.setFont(f2);
		       jb1.setBounds(220,350,170,35);

			   jb2=new JButton("Return Pc");
		       jb2.setFont(f2);
		       jb2.setBounds(470,350,170,35);

			   jb3=new JButton("Update Record");
		       jb3.setFont(f2);
		       jb3.setBounds(720,350,170,35);

			   jb4=new JButton("Back");
		       jb4.setFont(f2);
		       jb4.setBounds(300,430,170,35);

			   jb5=new JButton("Clear Fields");
		       jb5.setFont(f2);
		       jb5.setBounds(600,430,170,35);


		       jp2=new JPanel();
		       jp2.setLayout(null);
	   	       jp2.setBackground(new Color(0,0,0,80));
		       jp2.setBounds(100,200,1150,500);
               jp2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.cyan,1),""));
			jf.add(jl1);	
			jl1.add(jp1);
			jp1.add(jl2);
			jl1.add(jp2);
			jp2.add(jl3);
			jp2.add(jl4);			
			jp2.add(jl5);			
			jp2.add(jl6);	
			jp2.add(jl7);	
			jp2.add(jl8);							
			jp2.add(jl9);
			jp2.add(jl10);
			jp2.add(jl11);
			jp2.add(jl12);
			jp2.add(jt1);
			jp2.add(jt2);
			jp2.add(jt3);
			jp2.add(jt4);
			jp2.add(jt5);
			jp2.add(jt6);
			jp2.add(jt7);
			jp2.add(jt8);
			jp2.add(jt9);
			jp2.add(datePicker);
			jp2.add(jb1);
			jp2.add(jb2);
			jp2.add(jb3);
			jp2.add(jb4);
			jp2.add(jb5);	


//CODE FOR FETCH DETAIL FROM DATABASE...............................................................................

			jt1.addKeyListener(new KeyAdapter()
         {
                     public void keyPressed(KeyEvent ae)
                     {
                             jt2.setText("");
                             jt3.setText("");
                             jt4.setText("");
                             jt5.setText("");
                             jt6.setText("");
                             jt7.setText("");
                             jt8.setText("");
       //                     datePicker.getText("");
                      }
                            public void keyReleased(KeyEvent ae)
              {
                           try
                       
                           {                                                  
                             Class.forName("com.mysql.jdbc.Driver");
                             Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash") ;
                             PreparedStatement pst=cn.prepareStatement("select * from assign_pc where student_id = ? ");                            
                             pst.setString(1,jt1.getText()); 
                             ResultSet rs=pst.executeQuery();
                             String x="",y="";
                             String z="",w="";
                             String a="",b="";
                             String c="",d="";
                             String e="",f="";
                              while(rs.next())  
                              {
                               
                                 z=rs.getString(1);
                                 x=rs.getString(2);
                                 y=rs.getString(3);
                                 w=rs.getString(4);
                                 a=rs.getString(5);
                                 b=rs.getString(6);
                                 c=rs.getString(7);
                                 d=rs.getString(8);
                                 e=rs.getString(9);
                                // f=rs.getString(10,"datePicker");
                                if(z.equals(jt1.getText()))
                                 {
                                                        
                                  jt2.setText(x);
                                  jt3.setText(y);
                                  jt4.setText(w);
                                  jt5.setText(a);
                                  jt6.setText(b);
                                  jt7.setText(c);
                                  jt8.setText(d);
                                  jt9.setText(e);
                               //   datePicker.setText(f);
                                 }
                               } 
                          }
                        catch(Exception e)
                        {
                            System.out.println(e);
                         }   
                           
                     }
           });



//CODE FOR INSET DATA INTO THE TABLE BY USING MOUSE LISTENER..........................................................

			jb1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent me)
					{
						try
						{
							if(jt1.getText().equals("") || jt2.getText().equals("") || jt3.getText().equals("") || jt4.getText().equals("") || jt5.getText().equals("") || jt6.getText().equals("") || jt7.getText().equals("") || jt8.getText().equals(""))
							JOptionPane.showMessageDialog(jf,"Please Insert The values","ERROR",JOptionPane.ERROR_MESSAGE);
							else
							{
							 Class.forName("com.mysql.jdbc.Driver");
                             Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash") ;
                             PreparedStatement pst=cn.prepareStatement("insert into assign_pc values(?,?,?,?,?,?,?,?,?,?)");
                             pst.setString(1,jt1.getText());	
                             pst.setString(2,jt2.getText());
                             pst.setString(3,jt3.getText());
                             pst.setString(4,jt4.getText());
                             pst.setString(5,jt5.getText());
                             pst.setString(6,jt6.getText());
                             pst.setString(7,jt7.getText());
                             pst.setString(8,jt8.getText());
                             pst.setString(9,jt9.getText());
                             Date d=(Date)datePicker.getModel().getValue();
                             SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                             String reportDate= df.format(d);
                             System.out.println(reportDate);
                             pst.setString(10,reportDate);
                             pst.executeUpdate();
                             JOptionPane.showMessageDialog(jf,"Issued Successfully");
                            } 

						}
						catch(Exception e)
						{
							System.out.println(e);
						}
						jf.dispose();
						new assign_pc();
					}
				});


				jb1.addKeyListener(new KeyAdapter()
				{
					public void keyPressed(KeyEvent ke)
					{
						
                           int key = ke.getKeyCode();
                          if(key ==KeyEvent.VK_ENTER)
						{

						try
						{
							if(jt1.getText().equals("") || jt2.getText().equals("") || jt3.getText().equals("") || jt4.getText().equals("") || jt5.getText().equals("") || jt6.getText().equals("") || jt7.getText().equals("") || jt8.getText().equals(""))
							JOptionPane.showMessageDialog(jf,"Please Insert The values","ERROR",JOptionPane.ERROR_MESSAGE);
							else
							{
							 Class.forName("com.mysql.jdbc.Driver");
                             Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash") ;
                             PreparedStatement pst=cn.prepareStatement("insert into assign_pc values(?,?,?,?,?,?,?,?,?,?)");
                             pst.setString(1,jt1.getText());	
                             pst.setString(2,jt2.getText());
                             pst.setString(3,jt3.getText());
                             pst.setString(4,jt4.getText());
                             pst.setString(5,jt5.getText());
                             pst.setString(6,jt6.getText());
                             pst.setString(7,jt7.getText());
                             pst.setString(8,jt8.getText());
                             pst.setString(9,jt9.getText());
                             Date d=(Date)datePicker.getModel().getValue();
                             SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                             String reportDate= df.format(d);
                             System.out.println(reportDate);
                             pst.setString(10,reportDate);
                             pst.executeUpdate();
                             JOptionPane.showMessageDialog(jf,"Issued Successfully");

							}	

						}
						catch(Exception e)
						{
							System.out.println(e);
						}
						jf.dispose();
						new assign_pc();
						}
					}
				});	

//CODE FOR RETURN PC BY USING MOUSE LISTENER AND KET LISTENER............................................................

			jb2.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent ae)
				{
					try
					{
						if(jt1.getText().equals(""))
							JOptionPane.showMessageDialog(jf,"Please Instert Student ID For Deletetion","ERROR",JOptionPane.ERROR_MESSAGE);
						else
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash");
							PreparedStatement pst=con.prepareStatement("delete from assign_pc where student_id =?");
							pst.setString(1,jt1.getText());
                            pst.executeUpdate(); 
                            JOptionPane.showMessageDialog(jf,"Return Successfully");
						}
					}	
						catch(Exception e)
						{
							System.out.println(e);
						}
						jf.dispose();
						new assign_pc();
				}
			});


			jb2.addKeyListener(new KeyAdapter ()
			{
				public void keyPressed(KeyEvent ke)
				 {
				 	int key=ke.getKeyCode();
				 	if(key==KeyEvent.VK_ENTER)
					try
					{
						if(jt1.getText().equals(""))
							JOptionPane.showMessageDialog(jf,"Please Instert Particuler Field For Deletetion","ERROR",JOptionPane.ERROR_MESSAGE);
						else
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash");
							PreparedStatement pst=con.prepareStatement("delete from assign_pc where student_id =?");
							pst.setString(1,jt1.getText());
                            pst.executeUpdate(); 
                            JOptionPane.showMessageDialog(jf,"Return Successfully");
						}
					}
					
						catch(Exception e)
						{
							System.out.println(e);
						}
						jf.dispose();
						new assign_pc();
				}
			});

          
//	CODE FOR TEXT BOX FOR SET THE YYYY-MM-DD ON THE TEXT BOX...........................................................

      jt9.addKeyListener(new KeyAdapter()
           {
              public void keyPressed(KeyEvent ke)
              {
                  if(ch==0)
                  jt9.setText("");
                  ch++;
                  jt9.setBackground(Color.gray);
         	  }
           });
           jt9.addMouseListener(new MouseAdapter()
            {
               public void mousePressed(MouseEvent me)
                 {
                   if(ch==0)
                   jt9.setText("");
                   ch++;
                   jt9.setBackground(Color.gray);
                 }
            });
    

	        jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE);
		       jf.addWindowListener(new WindowAdapter()
						{
							public void windowClosing(WindowEvent we)
							{
							 clip.play();
							  JOptionPane.showMessageDialog(jf,"Sorry,you can't close from here please go to EXIT BUTTON","ERROR",JOptionPane.ERROR_MESSAGE);
							}
              			});


//CODE FOR UPDATE COLOUMN IN THE ASSIGN_PC..............................................................


               jb3.addActionListener(new ActionListener()
               {
                 public void actionPerformed(ActionEvent ae)
                  {
                  	try
                  	{
                  		if(jt1.getText().equals("") || jt2.getText().equals("") || jt3.getText().equals("") || jt3.getText().equals("") || jt4.getText().equals("") || jt5.getText().equals("") || jt6.getText().equals("") || jt7.getText().equals("") || jt8.getText().equals("") || jt9.getText().equals(""))
                  		JOptionPane.showMessageDialog(jf,"Please insert student_id for Updation","ERROR",JOptionPane.ERROR_MESSAGE);
                  	   else
                  	   {
                  	   	Class.forName("com.mysql.jdbc.Driver");
                  	   	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash");
                  	   	PreparedStatement pst =con.prepareStatement("update assign_pc set student_name= ? ,batch=? ,course=?, section=? ,lab_no=?, lab_subject=? ,workstation_no=?,time=? where student_id=?");
                  	   pst.setString(1,jt2.getText());
                       pst.setString(2,jt3.getText());
                       pst.setString(3,jt4.getText());
                       pst.setString(4,jt5.getText());
                       pst.setString(5,jt6.getText());
                       pst.setString(6,jt7.getText());
                       pst.setString(7,jt8.getText());
                       pst.setString(8,jt9.getText());
                       pst.setString(9,jt1.getText());
                       pst.executeUpdate();
                       JOptionPane.showMessageDialog(jf,"Updated Successfully");

                  	   }
                  	}
                  	catch(Exception e)
                  	{
                  		System.out.println(e);
                  	}
                  	jf.dispose();
                  	new assign_pc();
                  }
               });  

               jb3.addKeyListener(new KeyAdapter()
               {
               	public void keyPressed(KeyEvent ke)
               	{
               		int key=ke.getKeyCode();
               		if(key ==KeyEvent.VK_ENTER)
               		{
               			try
                  	{
                  		if(jt1.getText().equals("") || jt2.getText().equals("") || jt3.getText().equals("") || jt3.getText().equals("") || jt4.getText().equals("") || jt5.getText().equals("") || jt6.getText().equals("") || jt7.getText().equals("") || jt8.getText().equals("") || jt9.getText().equals(""))
                  		JOptionPane.showMessageDialog(jf,"Please insert student_id for Updation","ERROR",JOptionPane.ERROR_MESSAGE);
                  	   else
                  	   {
                  	   	Class.forName("com.mysql.jdbc.Driver");
                  	   	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash");
                  	   	PreparedStatement pst =con.prepareStatement("update assign_pc set student_name= ? ,batch=? ,course=?, section=? ,lab_no=?, lab_subject=? ,workstation_no=?,time=? where student_id=?");
                  	   pst.setString(1,jt2.getText());
                       pst.setString(2,jt3.getText());
                       pst.setString(3,jt4.getText());
                       pst.setString(4,jt5.getText());
                       pst.setString(5,jt6.getText());
                       pst.setString(6,jt7.getText());
                       pst.setString(7,jt8.getText());
                       pst.setString(8,jt9.getText());
                       pst.setString(9,jt1.getText());
                       pst.executeUpdate();
                       JOptionPane.showMessageDialog(jf,"Updated Successfully");

                  	   }
                  	}
                  	catch(Exception e)
                  	{
                  		System.out.println(e);
                  	}
                  	jf.dispose();
                  	new assign_pc();
               		}
               	}
               });
 

//CODE FOR BACK BUTTON ................................................................................
		      jb4.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						
							   jf.dispose();
							   new pc();
							   clip.play();
							}
              			});

              jb4.addKeyListener(new KeyAdapter()
       		     {
         		       public void keyPressed(KeyEvent ae)
	                  {
		                 int key = ae.getKeyCode();
		                 if(key ==KeyEvent.VK_ENTER)
			     		{
			              jf.dispose();
			              new pc();
			              clip.play();
			  		   }  	
			     	 } 
		       });	

//CODE FOR CLEAR DATA OF THE FIELD BY USING MOUSE AND BUTTON CLICK.......................................................................


              jb5.addActionListener(new ActionListener()
              {
 					public void actionPerformed(ActionEvent ae)
 					{
 						jt1.setText("");
 						jt2.setText("");
 						jt3.setText(""); 
 						jt4.setText(""); 	
 						jt5.setText(""); 
 						jt6.setText(""); 
 						jt7.setText(""); 
 						jt8.setText(""); 
 						jt9.setText(""); 
 						//datePicker.setDate(null);	
 						//datePicker.getEditor().setText("");
 					}
              });

              jb5.addKeyListener(new KeyAdapter()
              {
              	public void keyPressed(KeyEvent ke)
              	{
              		int key=ke.getKeyCode();
              		if(key==KeyEvent.VK_ENTER)
              		{
              			jt1.setText("");
 						jt2.setText("");
 						jt3.setText(""); 
 						jt4.setText(""); 	
 						jt5.setText(""); 
 						jt6.setText(""); 
 						jt7.setText(""); 
 						jt8.setText(""); 
 						jt9.setText(""); 	

              		}
              	}
              });



             jf.setResizable(false);
			jf.setVisible(true);
}
  }

class DateLabelFormatter extends AbstractFormatter {

    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }
        return "";
		  }
		 } 

// CODE FOR VIEW DETAIL ACCORDING TO PC 

	       class view_datail
		
{
     JFrame jf; 
     JButton jb1,jb2;
     JTable jtb;
     JLabel jl1;
     JScrollPane jsp;
     JPanel jp;
     ImageIcon ic;
     JComboBox jcb;
     Dimension ds;
     AudioClip clip;
     URL ur;
     view_datail()
     {
         jf=new JFrame ();
         jcb=new JComboBox();
         ic=new ImageIcon(this.getClass().getResource("/e.jpg"));
         jl1=new JLabel(ic);
         jp=new JPanel();
         ds=Toolkit.getDefaultToolkit().getScreenSize();
         jf.setSize(ds.width,ds.height);
         jp.setSize(ds.width,ds.height);
         String [ ][ ] data={};
         String cols[]={};  
         jf.setLayout(null);
         //jf.setSize(900,750); 
         jf.setTitle("PROJECT REPORT");
         jf.setResizable(false);
         jp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,1),""));
         jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
         jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE);
         jf.setLocationRelativeTo(null); 
         jtb=new JTable(data,cols);
         jsp=new JScrollPane(jtb); 
         jsp.setBounds(20,20,1300,650); 
        // jp.setBounds(0,0,900,750);
         jp.setBackground(new Color(0,0,0,10));        
         JTableHeader jth=jtb.getTableHeader();
         Font f=new Font("Arial",Font.BOLD,14);
         jth.setForeground(Color.white);
         jth.setBackground(Color.black);
         jtb.setBackground(Color.cyan);
         jth.setFont(f);
         jf.add(jsp);   
         jb1=new JButton("Back");
         jb2=new JButton("Clear");
         jb1.setFont(f);
         jb2.setFont(f);
         jb1.setBounds(150,670,120,50);
         jb2.setBounds(715,670,120,50);
         jb1.setBackground(Color.magenta);
         jb2.setBackground(Color.magenta);
         ur=pcinfo.class.getResource("wr.wav");
 	     clip=Applet.newAudioClip(ur);
 
         jf.add(jb1);
         jf.add(jb2);
         jf.add(jp); 
         jp.add(jl1);      
    
     try
               {
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash");
                 PreparedStatement pst=con.prepareStatement("select * from pcinformation");
                 ResultSet rs=pst.executeQuery();
                  jtb.setModel(DbUtils.resultSetToTableModel(rs));                
               }
               catch(Exception e)
              {
                System.out.println(e);
              } 
         //jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
 	    	   jf.setVisible(true);
 

 //CODE FOR WINDOW ADAPTER ..............................................................................................

 	    	   jf.addWindowListener(new WindowAdapter()
 	    	   {
 	    	   	public void windowClosing(WindowEvent we)
 	    	   	{
 	    	   	 clip.play();
				 JOptionPane.showMessageDialog(jf,"Sorry,you can't close from here please go to Quit BUTTON","ERROR",JOptionPane.ERROR_MESSAGE);
 	    	   	}
 	    	   });


// CODE FOR GO BACK ON TO THE MODULE FORM BY USING MOUSE LISETENER AND KEY LISETENER....................................

		jb1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				clip.play();
				jf.dispose();
				new pc();
			}
		});

		jb1.addKeyListener(new KeyAdapter()
       		     {
         		       public void keyPressed(KeyEvent ae)
	               {
		             int key = ae.getKeyCode();
		             if(key ==KeyEvent.VK_ENTER)
					{
						clip.play();
						jf.dispose();
						new pc();		
				 	}   
				 }
				});       

//CODE FOR CLEAR THE CONTENT OF THE FORM ............................................................................

		jb2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			  {
			  	clip.play();
			  	jf.dispose();
			  	new view_datail();
			  }
		});
		jb2.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent ke)
			{
				 int key=ke.getKeyCode();
				 if(key==KeyEvent.VK_ENTER)
				 {
				 	clip.play();
				 	jf.dispose();
				 	new view_datail();
				 }
			}
		});

 			}
 
		}

//	CODE FOR SEARCH AND VIEW STUDENT WITH ATTENDANCE OR USING INFO .............................................................

	       class view_student
		{
		    JFrame jf;
		    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;
		    JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10;
		    JButton jb1,jb2,jb3,jb4,jb5;
		    JComboBox jcb;
		    Dimension ds;
		    ImageIcon ic;
		    JPanel jp1,jp2,jp3;
		    AudioClip clip;
		    URL ur;
		    JTable jtb;
		    JScrollPane jsp;
		    view_student()
		   {
                           jf=new JFrame("VIEW STUDENT WITH ATTENDANCE OR USING INFO");
             		       ic=new ImageIcon(this.getClass().getResource("/e.jpg"));
		       jl1=new JLabel(ic);  
		       jf.setLayout(null);
		       ds=Toolkit.getDefaultToolkit().getScreenSize();			
		       jf.setSize(ds.width,ds.height);
	   	       jl1.setSize(ds.width,ds.height);
	   	       jf.setResizable(false);
		       Font f = new Font(" Ravie" , Font.BOLD, 40);  		       
		       jp1=new JPanel();
		       jp1.setBounds(0,0,1360,80);
		       jp1.setBackground(new Color(0,0,0,48));
		       jp1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.cyan,1),""));
		       jl2  = new JLabel("VIEW STUDENT WITH ATTENDANCE OR USING INFO");  
		       jl2.setForeground(Color.WHITE);      
		       jl2.setFont(f);

		       jp2=new JPanel();
		       jp2.setLayout(null);
		       jp2.setBounds(0,83,1360,654);
		       jp2.setBackground(new Color(0,0,0,10));
		       jp2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,1),""));

		       String [] [] data={};
		       String cols[]={};
		       jtb=new JTable(data,cols);
		       jsp=new JScrollPane(jtb);
		       jsp.setBounds(5,20,1350,530);
		       jsp.setBackground(new Color(0,0,0,10));
		       JTableHeader jth=jtb.getTableHeader();
		       Font f1=new Font("Arial",Font.BOLD,14);
		       jth.setForeground(Color.white);
		       jth.setBackground(Color.black);
		       jtb.setBackground(Color.cyan);
		       jth.setFont(f1);

		       jb1=new JButton();
		       jb1.setText("Back");
		       jb1.setBounds(100,580,150,30);
		       jb1.setBackground(Color.white);

			   jb2=new JButton();
			   jb2.setBounds(500,580,150,30);
			   jb2.setText("View Student");

			   jb3=new JButton();
			   jb3.setBounds(900,580,200,30);
			   jb3.setText("goto Search Student...");

		       ur=view_student.class.getResource("wr.wav");
 	    	   clip=Applet.newAudioClip(ur);
 	    	   jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE);
 	    	   jf.add(jl1);
 	    	   jl1.add(jp1);
 	    	   jp1.add(jl2);
 	    	   jl1.add(jp2);
 	    	   jp2.add(jsp);
 	    	   jp2.add(jb1);
 	    	   jp2.add(jb2);
 	    	   jp2.add(jb3);
 	    	   jf.setVisible(true);
//CODE FOR DISABLE WINDOW ADAPTER.....................................................................................

 	    	   jf.addWindowListener(new WindowAdapter()
 	    	   {
 	    	   	public void windowClosing(WindowEvent we)
 	    	   	{
 	    	   		JOptionPane.showMessageDialog(jf,"You can't quit from here, Please goto the back Button","Error",JOptionPane.ERROR_MESSAGE);
 	    	   	}
 	    	   });

 	//CODE  FOR BACK BUTTON BY USING KEEYLISTENER AND MOUSE LISTENER....................................................

 	    	   jb1.addActionListener(new ActionListener()
 	    	   {
 	    	   	public void actionPerformed(ActionEvent ae)
 	    	   	{
 	    	   		clip.play();
 	    	   		jf.dispose();
 	    	   		new pc();
 	    	   	}
 	    	   });
 	    	   jb1.addKeyListener(new KeyAdapter()
 	    	   {
 	    	   	public void keyPressed(KeyEvent ke)
 	    	   	{
 	    	   		int key=ke.getKeyCode();
 	    	   		if(key==KeyEvent.VK_ENTER)
 	    	   		{
 	    	   			clip.play();
 	    	   			jf.dispose();
 	    	   			new pc();
 	    	   		}
 	    	    }
 	    	   });


//CODE FOR PERFORM ACRION ON THE BUTTON GOTO SEARCH STUDENT FORM...........................................................

 	    	   jb3.addActionListener(new ActionListener()
 	    	   {
 	    	   	public void actionPerformed(ActionEvent ae)
 	    	   	{
 	    	   		 clip.play();
 	    	   		 jf.dispose();
 	    	   		 new search_student();
 	    	   	}
 	    	   });
 	    	   jb3.addKeyListener(new KeyAdapter()
 	    	   {
 	    	   	public void keyPressed(KeyEvent ke)
 	    	   	{
 	    	   		int key=ke.getKeyCode();
 	    	   		if(key==KeyEvent.VK_ENTER)
 	    	   		{
 	    	   			clip.play();
 	    	   			jf.dispose();
 	    	   			new search_student();
 	    	   		}
 	    	   	}
 	    	   });

 	    	   jb2.addActionListener(new ActionListener()
 	    	   {
 	    	   	public void actionPerformed(ActionEvent ae)
 	    	   	{
 	    	   		try
 	    	   		{
 	    	   			Class.forName("com.mysql.jdbc.Driver");
 	    	   			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash");
 	    	   			PreparedStatement pst=con.prepareStatement("select * from pcinformation");
                	    ResultSet rs=pst.executeQuery();
                  		jtb.setModel(DbUtils.resultSetToTableModel(rs));
 	    	   		}
 	    	   		catch(Exception e)
 	    	   		 {
 	    	   		 	 System.out.println(e);
 	    	   		 }
 	    	   	}
 	    	   });

 	    	}
}
		

//	CODE FOR SEARCH STUDENT WITH ATTENDANCE OR USING INFO .............................................................

	       class search_student
		{
		    JFrame jf;
		    JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12;
		    JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10;
		    JButton jb1,jb2,jb3,jb4,jb5;
		    JComboBox jcb;
		    Dimension ds;
		    ImageIcon ic;
		    JPanel jp1,jp2,jp3;
		    AudioClip clip;
		    URL ur;
		    JTable jtb;
		    JScrollPane jsp;
		    search_student()
		   {
                           jf=new JFrame("SEARCH  STUDENT WITH ATTENDANCE OR USING INFO");
             		       ic=new ImageIcon(this.getClass().getResource("/e.jpg"));
		       jl1=new JLabel(ic);  
		       jf.setLayout(null);
		       ds=Toolkit.getDefaultToolkit().getScreenSize();			
		       jf.setSize(ds.width,ds.height);
	   	       jl1.setSize(ds.width,ds.height);
	   	       jf.setResizable(false);
		       Font f = new Font(" Ravie" , Font.BOLD, 40);  		       
		       jp1=new JPanel();
		       jp1.setBounds(0,0,1360,80);
		       jp1.setBackground(new Color(0,0,0,48));
		       jp1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.cyan,1),""));
		       jl2  = new JLabel("SEARCH STUDENT WITH ATTENDANCE OR USING INFO");  
		       jl2.setForeground(Color.WHITE);      
		       jl2.setFont(f);

		       jp2=new JPanel();
		       jp2.setLayout(null);
		       jp2.setBounds(0,83,1360,654);
		       jp2.setBackground(new Color(0,0,0,10));
		       jp2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,1),""));

		       String [] [] data={};
		       String cols[]={};
		       jtb=new JTable(data,cols);
		       jsp=new JScrollPane(jtb);
		       jsp.setBounds(5,20,1350,530);
		       jsp.setBackground(new Color(0,0,0,10));
		       JTableHeader jth=jtb.getTableHeader();
		       Font f1=new Font("Arial",Font.BOLD,14);
		       jth.setForeground(Color.white);
		       jth.setBackground(Color.black);
		       jtb.setBackground(Color.cyan);
		       jth.setFont(f);

		       jb1=new JButton();
		       jb1.setText("Back");
		       jb1.setBounds(100,580,150,30);
		       jb1.setBackground(Color.white);

			   jb2=new JButton();
			   jb2.setBounds(500,580,150,30);
			   jb2.setText("View Student");
			   jb2.setEnabled(false);

			   jb3=new JButton();
			   jb3.setBounds(900,580,150,30);
			   jb3.setText("Search Student");

		       ur=search_student.class.getResource("wr.wav");
 	    	   clip=Applet.newAudioClip(ur);
 	    	   jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE);
 	    	   jf.add(jl1);
 	    	   jl1.add(jp1);
 	    	   jp1.add(jl2);
 	    	   jl1.add(jp2);
 	    	   jp2.add(jsp);
 	    	   jp2.add(jb1);
 	    	   jp2.add(jb2);
 	    	   jp2.add(jb3);
 	    	   jf.setVisible(true);
//CODE FOR DISABLE WINDOW ADAPTER.....................................................................................

 	    	   jf.addWindowListener(new WindowAdapter()
 	    	   {
 	    	   	public void windowClosing(WindowEvent we)
 	    	   	{
 	    	   		JOptionPane.showMessageDialog(jf,"You can't quit from here, Please goto the back Button","Error",JOptionPane.ERROR_MESSAGE);
 	    	   	}
 	    	   }); 	    	   

 //CODE  FOR BACK BUTTON BY USING KEEYLISTENER AND MOUSE LISTENER....................................................

 	    	   jb1.addActionListener(new ActionListener()
 	    	   {
 	    	   	public void actionPerformed(ActionEvent ae)
 	    	   	{
 	    	   		clip.play();
 	    	   		jf.dispose();
 	    	   		new view_student();
 	    	   	}
 	    	   });
 	    	   jb1.addKeyListener(new KeyAdapter()
 	    	   {
 	    	   	public void keyPressed(KeyEvent ke)
 	    	   	{
 	    	   		int key=ke.getKeyCode();
 	    	   		if(key==KeyEvent.VK_ENTER)
 	    	   		{
 	    	   			clip.play();
 	    	   			jf.dispose();
 	    	   			new view_student();
 	    	   		}
 	    	    }
 	    	   });


 	    	}
}
		
		//CODE FOR MODULE PANEL

	class pc
                 {
                     JFrame jf;
                     Dimension ds;
	    JPanel jp,jp1;
	    JLabel jl,jl1;
 	    ImageIcon ic;
	    JButton jb1,jb2,jb3,jb4,jb5;
	    URL ur;
	    AudioClip clip;

                     pc()
                     {

		//CODE FOR HEADER
		
    		         Font f = new Font(" Ravie" , Font.BOLD, 50);
    		         jp = new JPanel();
		         jp.setBackground(new Color(0,0,0,80));
		         jp.setBounds(0,0,1360,100);	
                                            jp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.cyan,1),""));
		         jl1  =new JLabel("WORKING MODULE");  
		         jl1.setForeground(Color.WHITE);      
		         jl1.setFont(f);
              
                 ur=pc.class.getResource("wr.wav");
 	    	     clip=Applet.newAudioClip(ur);
                                  
		        jp1=new JPanel();
		        jp1.setLayout(null);
	   	        jp1.setBackground(new Color(0,0,0,80));
		        jp1.setBounds(400,200,600,500);
                                           jp1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.cyan,1),""));
		
		        jb1=new JButton("Add Pc Information");
		        jb1.setBounds(200,50,170,50);
                jb1.addActionListener(new ActionListener()
		        {
		          public void actionPerformed(ActionEvent ae)
		            {
		            	  clip.play();
		            	  jf.dispose();
		                  new pcinfo();
		            }   
		       });
		      jb1.addKeyListener(new KeyAdapter()
       		     {
         		       public void keyPressed(KeyEvent ae)
	                           {
		             int key = ae.getKeyCode();
		             if(key ==KeyEvent.VK_ENTER)
			{
				 clip.play();
				 jf.dispose();
			     new pcinfo();
			  }  	
			} 
		       });	

		        jb2=new JButton("AssignPc To Students");
		        jb2.setBounds(200,150,170,50);
  		       jb2.addActionListener(new ActionListener()
		       {
		          public void actionPerformed(ActionEvent ae)
		            {
		            	  clip.play();
		            	  jf.dispose();
		                  new assign_pc();
		            }   
		       });
		      jb2.addKeyListener(new KeyAdapter()
       		     {
         		       public void keyPressed(KeyEvent ae)
	                           {
		             int key = ae.getKeyCode();
		             if(key ==KeyEvent.VK_ENTER)
			{
				  clip.play();
				  jf.dispose();
			     new assign_pc();
			  }  	
			} 
		       });
		        jb3=new JButton("View Details According To Pc");
		        jb3.setBounds(200,250,170,50);
    		        jb3.addActionListener(new ActionListener()
		       {
		          public void actionPerformed(ActionEvent ae)
		            {
		            	  clip.play();
		            	 jf.dispose();
		                  new view_datail();
		            }   
		       });
		      jb3.addKeyListener(new KeyAdapter()
       		     {
         		       public void keyPressed(KeyEvent ae)
	                           {
		             int key = ae.getKeyCode();
		             if(key ==KeyEvent.VK_ENTER)
			{
				 clip.play();
				 jf.dispose();
			     new view_datail();
			  }  	
			} 
		       });

		        jb4=new JButton("Search & View Students");
		        jb4.setBounds(200,350,170,50); 
		        jb4.addActionListener(new ActionListener()
		       {
		          public void actionPerformed(ActionEvent ae)
		            {
		            	  clip.play();
		            	  jf.dispose();
		                  new view_student();
		            }   
		       });
		      jb4.addKeyListener(new KeyAdapter()
       		     {
         		       public void keyPressed(KeyEvent ae)
	                           {
		             int key = ae.getKeyCode();
		             if(key ==KeyEvent.VK_ENTER)
			{
				 clip.play();
				 jf.dispose();
			     new view_student();
			  }  	
			} 
		       });	        


		        jb5=new JButton("Quit");
		        jb5.setBounds(200,420,170,50); 
		        jb5.addActionListener(new ActionListener()
		       {
		          public void actionPerformed(ActionEvent ae)
		            {
		            	  clip.play();
		            	  jf.dispose();
		                  new Home();
		            }   
		       });
		      jb5.addKeyListener(new KeyAdapter()
       		     {
         		       public void keyPressed(KeyEvent ae)
	                           {
		             int key = ae.getKeyCode();
		             if(key ==KeyEvent.VK_ENTER)
			{
				 clip.play();
				 jf.dispose();
			     new Home();
			  }  	
			} 
		       });	        



                         jf = new JFrame("Add PC Information");
                         ic= new ImageIcon(this.getClass().getResource("/a.png"));
                         jl =new JLabel(ic);
	       ds =Toolkit.getDefaultToolkit().getScreenSize();
                         jf.setSize(ds.width,ds.height);
                         jl.setSize(ds.width,ds.height);
	        jf.setLayout(null);
	        jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE);
	        jf.addWindowListener(new WindowAdapter()
	        {
                public void windowClosing(WindowEvent we)
                {
							  clip.play();
							  JOptionPane.showMessageDialog(jf,"Sorry,you can't close from here please go to Quit BUTTON","ERROR",JOptionPane.ERROR_MESSAGE);
                }
	        });
  	        jf.setResizable(false);
	        jf.add(jl);
	        jf.add(jp);
                         jp.add(jl1);
	        jf.add(jp1);
  	        jp1.add(jb1);
	        jp1.add(jb2);
	        jp1.add(jb3);
            jp1.add(jb4);
            jp1.add(jb5);	       
	        jf.setVisible(true);

	
                     }
                 }

//CODE FOR ABOUT PAGE


                 class About implements Runnable
{
     JFrame jf;
     JTextField jt,jt1,jt2,jt3;
     JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10;
	 JLabel jl1,jl2,jl3,jl4,jl5,jl6;
	 JMenuBar jbar;
     JMenu jm1,jm2,jm3;
     JMenuItem ji1,ji2,ji3,ji4,ji5,ji6,ji7,ji8,ji9,ji10,ji11,ji12,ji13,ji14,ji15,ji16,ji17;
	 JPanel jp;
	 ImageIcon ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8,ic9,ic10;
	 JToolBar jtb;
	  String a="********************************Attendance System***************************************"; 
      String b="*******VERSION 1.8.0***********",c="********************DEVELOPED  BY*****************";
       String d="***************Vishwash Bhardwaj*********Vishal Gupta*********",e="******For More Information visit :ims-ghaziabad.ac.in/********"; 
	 AudioClip clip,clip1,clip2;
      URL ur,ur1,ur2;
	   Thread t;
       int i; 
      char x1,x2,x3,x4,x5,x6;
     About()
      {
            jf=new JFrame("About Information");
			
			 ic1=new ImageIcon(this.getClass().getResource("/clg20.png"));//home
		     ic2=new ImageIcon(this.getClass().getResource("/login.png"));//login
			 ic3=new ImageIcon(this.getClass().getResource("/logout1.png"));//logout
			 ic4=new ImageIcon(this.getClass().getResource("/cm25.jpg"));//background image
			 ic5=new ImageIcon(this.getClass().getResource("/exit.png"));//exit image
 			 ic6=new ImageIcon(this.getClass().getResource("/clg28.png"));//info image 
			// ic7=new ImageIcon(this.getClass().getResource("/module.png"));//module
            jf.setSize(1400,750); 
		    jp=new JPanel();
					jp.setBackground(new java.awt.Color(0,0,0,115));
					jp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255)));
                    jp.setLayout(null);
					jp.setBounds(340,65,700,630);
       	jf.setLayout(new BorderLayout());
			jf.setLocationRelativeTo(null);
            jf.setResizable(false);
            jf.setCursor(Cursor.HAND_CURSOR);
            jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE);
            jtb=new JToolBar(JToolBar.HORIZONTAL);
			ur=About.class.getResource("wr.wav");
		    ur1=About.class.getResource("d.wav");
		    ur2=About.class.getResource("clk.wav");
            clip=Applet.newAudioClip(ur);
			clip1=Applet.newAudioClip(ur1);
			clip2=Applet.newAudioClip(ur2);
			t=new Thread(this);
			jl1=new JLabel(ic4);
            jb1=new JButton(ic1); 
            jb2=new JButton(ic2);
			jb3=new JButton(ic3);
			jb4=new JButton(ic5);
			//jb5=new JButton(ic7);
			jb6=new JButton(ic6);
			jb1.setBackground(Color.red);
			jb2.setBackground(Color.blue);
			jb3.setBackground(Color.blue);
			jb4.setBackground(Color.blue);
			//jb5.setBackground(Color.blue);
			jb6.setBackground(Color.blue);

			jb2.setEnabled(false);
			jb3.setEnabled(false);
			jb4.setEnabled(false);
			//jb5.setEnabled(false);
			jl1.setBounds(0,60,1400,760);
		   Font f=new Font("Arial Black",Font.BOLD,24);
		   jl2=new JLabel(a); 
           jl3=new JLabel(b);
           jl4=new JLabel(c);
           jl5=new JLabel(d);
           jl6=new JLabel(e); 
           jl2.setBounds(0,90,1400,30); 
		   jl3.setBounds(450,200,1400,30); 
		   jl4.setBounds(300,300,1400,30); 
		   jl5.setBounds(180,400,1400,30);
		   jl6.setBounds(250,500,1400,30);
		   jl2.setFont(f);	
           jl3.setFont(f);
           jl4.setFont(f); 
		   jl5.setFont(f); 
		   jl6.setFont(f); 
		   jl2.setForeground(Color.blue);
		   jl3.setForeground(Color.yellow);
		   jl4.setForeground(Color.red);
            jl5.setForeground(new java.awt.Color(225,0,128));
			jl6.setForeground(new java.awt.Color(23,37,104));
		   jf.add(jl2);
		   jf.add(jl3);
		   jf.add(jl4);
		   jf.add(jl5);
		   jf.add(jl6);
		   t.start();
			jtb.setBackground(Color.blue);
            jtb.add(jb1);
            jtb.add(jb2);
			jtb.add(jb3);
			jtb.add(jb4);
			//jtb.add(jb5);
			jtb.add(jb6);
			jf.add(jl1);
			 jbar=new JMenuBar();
          jm1=new JMenu("File");
          jm2=new JMenu("");
          jm3=new JMenu("");
          jbar.add(jm1);
          jbar.add(jm2);
          jbar.add(jm3);
          ji1=new JMenuItem("Home");
          ji2=new JMenuItem("LogOut");
		  ji3=new JMenuItem("Exit");
		  jm1.add(ji1);
          jm1.add(ji2);
		  jm1.add(ji3);
		 jbar.setBackground(Color.blue);
		 jbar.setForeground(Color.black);
          jf.setJMenuBar(jbar);
		    jf.add(jtb,BorderLayout.NORTH);
			jb1.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
							   new Home();
							   jf.dispose();
							}
              			});
						ji1.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
							   new Home();
							   jf.dispose();
							   clip2.play();
							}
              			});
						ji2.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
							    new log();
							   jf.dispose();
							   clip2.play();
							}
              			});
						ji3.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      System.exit(0);
							   clip2.play();
							}
              			});
						jf.addWindowListener(new WindowAdapter()
						{
							public void windowClosing(WindowEvent we)
							{
							 clip.play();
							 JOptionPane.showMessageDialog(jf,"Sorry,you can't close from here please go to home option","ERROR",JOptionPane.ERROR_MESSAGE);
							}
              			});
      jf.setVisible(true);
	  } 
		  public void run()
    {
       try
         {
             for(;;)
             {
                  x1=a.charAt(0);
				  x2=b.charAt(0);
				  x3=c.charAt(0);
				  x4=d.charAt(0);
				  x5=e.charAt(0);
                a=a.substring(1,a.length());
				  b=b.substring(1,b.length());
				  c=c.substring(1,c.length());
				  d=d.substring(1,d.length());
				  e=e.substring(1,e.length());
                   a=a+x1;
                   b=b+x2;
				   c=c+x3;
                   d=d+x4;
				   e=e+x5;
                  jl2.setText(a);
				  jl3.setText(b);
				  jl4.setText(c);
				  jl5.setText(d);
				  jl6.setText(e);
                Thread.sleep(100);                   
             }
         }catch(Exception e){}      
    }
	
}



//CODE FOR HOME PAGE



class Home implements Runnable
{
     JFrame jf;
     JTextField jt,jt1,jt2,jt3;
     JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
	 JLabel jl1,jl2,jl3,jl4,jl5,jl6;
	 JMenuBar jbar;
     JMenu jm1,jm2;
     JMenuItem ji1,ji2,ji3,ji4,ji5,ji6,ji7,ji8,ji9,ji10,ji11,ji12,ji13,ji14,ji15,ji16,ji17;
	 JPanel jp;
	 ImageIcon ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8,ic9,ic10;
	 JToolBar jtb;
	 AudioClip clip;
	 URL ur;
	  Thread t;
        String a=".........WELCOME TO IMS GHAZIABAD........WELCOME TO IMS GHAZIABAD.......";  
       int i; 
      char x;
      Home()
      {
             jf=new JFrame("ATTENDANCE SYSTEM");
			  ic1=new ImageIcon(this.getClass().getResource("/clg20.png"));//home
		     ic2=new ImageIcon(this.getClass().getResource("/login.png"));//login
			 ic3=new ImageIcon(this.getClass().getResource("/logout1.png"));//logout
			 ic4=new ImageIcon(this.getClass().getResource("/G.JPG"));//background image
			 ic5=new ImageIcon(this.getClass().getResource("/exit.png"));//exit image
 			 ic6=new ImageIcon(this.getClass().getResource("/clg28.png"));//info image
			 //ic7=new ImageIcon(this.getClass().getResource("/module.png"));//module
		     
			 
            jf.setSize(1400,760);
			t=new Thread(this);
			jp=new JPanel();
					jp.setBackground(new java.awt.Color(0,0,0,120));
					jp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255)));
                    jp.setLayout(null);
					jp.setBounds(0,65,1400,760);
					//jf.add(jp);
					Font f=new Font("Arial Black",Font.BOLD,24);
		   jl6=new JLabel(a);   
           jl6.setBounds(0,90,1400,30); 
		   jl6.setFont(f);			
			jl6.setForeground(Color.white);
           jf.add(jl6);
           t.start();
			jf.setLayout(new BorderLayout());
			jf.setLocationRelativeTo(null);
            jf.setResizable(false);
            jf.setCursor(Cursor.HAND_CURSOR);
            jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
            jtb=new JToolBar(JToolBar.HORIZONTAL);
			jl1=new JLabel(ic4);
            jb1=new JButton(ic1); 
            jb2=new JButton(ic2);
			jb3=new JButton(ic3);
			jb4=new JButton(ic5);
			//jb5=new JButton(ic7);
			jb6=new JButton(ic6);			
			jl1.setBounds(0,65,1400,760);
			ur=Home.class.getResource("clk.wav");
            clip=Applet.newAudioClip(ur);
			
			jb1.setBackground(Color.red);
			jb2.setBackground(Color.blue);
			jb3.setBackground(Color.blue);
		    jb4.setBackground(Color.blue);
			//jb5.setBackground(Color.blue);
			jb6.setBackground(Color.blue);
			jtb.setBackground(Color.blue);
            jtb.add(jb1);
            jtb.add(jb2);
			jtb.add(jb3);
			jtb.add(jb4);
			//jtb.add(jb5);
			jtb.add(jb6);
			jf.add(jl1);
		  jbar=new JMenuBar();
          jm1=new JMenu("File");
          jm2=new JMenu("Help");
          
          jbar.add(jm1);
          jbar.add(jm2);
          jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
          ji1=new JMenuItem("Admin Login");
		  ji2=new JMenuItem("Logout");
		  ji3=new JMenuItem("Exit");
          jm1.add(ji1);
          jm1.add(ji2);
		  jm1.add(ji3);
         
          ji4=new JMenuItem("About");
          ji5=new JMenuItem("LogOut");
          jm2.add(ji4);
          jm2.add(ji5);
		 jbar.setBackground(new java.awt.Color(0,0,0,120));
		 jbar.setForeground(Color.black);
          jf.setJMenuBar(jbar);
		    jf.add(jtb,BorderLayout.NORTH);
			ji1.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      
							   new log();
							   jf.dispose();
							   clip.play();
							}
              			});
						ji2.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      
							    new log();
							   jf.dispose();
							   	clip.play();
							}
              			});
						ji3.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      
							   
			
							   System.exit(0);
							   clip.play();
							}
              			});
						ji4.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      
							   new About();
							   jf.dispose();
							   clip.play();
							}
              			});
						ji5.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      
							   new log();
							   jf.dispose();
							   clip.play();
							}
              			});
						
						jb2.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      
							    new log();
							   jf.dispose();
							   clip.play();
							}
              			});
						jb3.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      
							   new log();
							   jf.dispose();
							   clip.play();
							}
              			});
              			jb4.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      
							System.exit(0);
							clip.play();
							}
              			});
              			/*jb5.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      
							new pc() ;
							}
              			});  */
              			
              			jb6.addActionListener(new ActionListener()
						{
							public void actionPerformed(ActionEvent ae)
							{ 
						      new About();
						      jf.dispose();
						      clip.play();
							}
              			});
						
 jtb.setBackground(new java.awt.Color(0,0,255));
          jf.setVisible(true);
	  }

		  public void run()
    {
  
         try
         {
             for(;;)
             {
                  x=a.charAt(0);
                  a=a.substring(1,a.length());
                  a=a+x; 
                  jl6.setText(a);
                Thread.sleep(100);                   
             }
             
         }catch(Exception e){}      
    }
}


//LOGIN CODE//

	           class log 
   {
      JFrame jf;
      JLabel jl1,jl2,jl3,jl4,jl5,jl6;
      JButton jb1,jb2;
	  JTextField jt1;
	  JPasswordField jpf;
      JPanel jp;
	  ImageIcon ic,ic1,ic2,ic3,ic4,ic5,ic6;
	   AudioClip clip,clip1;
       URL ur,ur1;
        int ch=0;
          log()
		  
             { 
                     jf=new JFrame();
					 ic=new ImageIcon(this.getClass().getResource("/clg7.jpg"));
					 ic1=new ImageIcon(this.getClass().getResource("/clg11.jpg"));
					 ic2=new ImageIcon(this.getClass().getResource("/clg12.png"));
					 ic3=new ImageIcon(this.getClass().getResource("/clg13.png"));
					 ic4=new ImageIcon(this.getClass().getResource("/clg16.png"));
					 ic5=new ImageIcon(this.getClass().getResource("/clg13.png"));
					 ic6=new ImageIcon(this.getClass().getResource("/refresh.png"));
                     jf.setTitle("LoginPage");
                     jf.setSize(700,600);
                     jf.setLayout(null);
					 jf.setLocationRelativeTo(null);
                     jf.setResizable(false);
                     jf.setCursor(Cursor.HAND_CURSOR);
					jp=new JPanel();
					jp.setLayout(null);
					jp.setBackground(new java.awt.Color(0, 0,0, 120));
					jp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,1),""));
					jp.setLayout(null);
					jp.setBounds(90,280,550,280);
					jf.add(jp);
					Font f=new Font("Arial",Font.BOLD,18);
					jl1=new JLabel(ic);
					jl2=new JLabel(ic1);
					jl5=new JLabel(ic2);
					jl3=new JLabel("enter the username");
					jl4=new JLabel("enter the password");
					jt1=new JTextField();
					ur=pc.class.getResource("wel.wav");
					ur1=log.class.getResource("wr.wav");
                     clip=Applet.newAudioClip(ur);
					 clip1=Applet.newAudioClip(ur1);
					jpf=new JPasswordField("");
					jb1=new JButton(ic4);
				    jb2=new JButton(ic6);
					jl3.setForeground(Color.white);
					jl4.setForeground(Color.white);
					jl6=new JLabel(ic3);
					 jl1.setBounds(0,0,700,206);
					 jl2.setBounds(0,50,700,700);
					 jl5.setBounds(30,20,30,40);
				     jl6.setBounds(30,60,30,40);
					 jl3.setBounds(80,20,200,40);
					 jl4.setBounds(80,60,200,40);
					 jt1.setBounds(300,30,220,20);
					 jpf.setBounds(300,70,220,20);
					 jb1.setBounds(200,150,90,35);
			         jb2.setBounds(200,200,90,50);
					 jl3.setFont(f);
					 jl4.setFont(f);
					 jf.add(jl1);
					 jf.add(jl2);
					 jp.add(jl3);
					 jp.add(jl4);
					 jp.add(jl5);
				     jp.add(jl6);
					 jp.add(jt1);
					 jp.add(jpf);
					 jp.add(jb1);
				     jp.add(jb2);

	jb1.addActionListener(new ActionListener()
    {
         public void actionPerformed(ActionEvent ae)
         {
               try
               {
                    Class.forName("com.mysql.jdbc.Driver");            
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash"); 
                    Statement st=con.createStatement();
      	              ResultSet rs=st.executeQuery("select * from login"); 
                    String x,y;
                    x=jt1.getText(); 
                    y=jpf.getText();
                   boolean f=false;
                   while(rs.next())
                    {
                          if(x.equals(rs.getString(1)))
                          {
                                if(y.equals(rs.getString(2)))
                               {
                                         f=true;
                                         break;
                                } 
                         else
                                      f=false;
                          } 
                          else
                              f=false;
                       } 
                   if(f==true)
				   {
				   	JOptionPane.showMessageDialog(jf,"YOU   ARE  AUTHORISED");
			          jf.dispose();
					  clip.play(); 
					  new pc();
					 
				   }				  
                 else
				  {
					  clip1.play();
					   JOptionPane.showMessageDialog(jf,"ACCOUNT DOES NOT EXIST PLEASE TRY AGAIN","ERROR",JOptionPane.ERROR_MESSAGE);
					   jf.dispose();
					   new log();
				  }
               }catch(Exception e){System.out.println(e);}    
         }
    });



    jb1.addKeyListener(new KeyAdapter()
           		{
              		public void keyPressed(KeyEvent ke)
           		{
                             		int key = ke.getKeyCode();
                                    	if(key ==KeyEvent.VK_ENTER)
            			{
                  		try
                    		{
                      		 Class.forName("com.mysql.jdbc.Driver");
                      		 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3307/attendance","root","vishwash");
                      		 Statement st= con.createStatement();
                     		  ResultSet rs=st.executeQuery("select *from login");
                        		String x,y;
                       		 x=jt1.getText();
                       		 y=jpf.getText();
                       		 boolean f=false;
                       		  while(rs.next())
                            		 {
                                  		if(x.equals(rs.getString(1)))
                                  		{
                                   	  if(y.equals(rs.getString(2)))
                                      	{
                                      	     f=true;
                                      	     break;
                                      	}

	                                           else
                 		                          f=false;
	                                  }

	                                          else
                 		                         f=false; 
                            		 }

	                                   if(f==true)
                 		                {
                                   	  JOptionPane.showMessageDialog(jl2," YOU ARE AUTHROISED");
                                   	 jf.dispose();
					  				  clip.play(); 
					  					new pc();
                                 		}
                                   	else
                                		 {
                                		 	 clip1.play();
					  						 JOptionPane.showMessageDialog(jf,"ACCOUNT DOES NOT EXIST PLEASE TRY AGAIN","ERROR",JOptionPane.ERROR_MESSAGE);
					   							jf.dispose();
					  							 new log();
                                 		}                                                                                         
                     		}
                     		  catch(Exception e)
                    		{
                    		    System.out.println(e);
                   		 }
			}                 
                 		             }     
		          });  


					      jt1.addKeyListener(new KeyAdapter()
		           {
             		        public void keyPressed(KeyEvent ke)
            		    {
            		      if(ch==0)
            		      jt1.setText("");
		      jpf.setText("");
            		      ch++;
            		      jt1.setBackground(Color.gray);
		      jpf.setBackground(Color.gray);
           		  }     
          		 });

  		jt1.addMouseListener(new MouseAdapter()
 	             {
               	  	public void mousePressed(MouseEvent me)
                 		{
                   	if(ch==0)
                 		 jt1.setText("");
                   	ch++;
                  	 jt1.setBackground(Color.gray);
                 		}
         		   });
         

     jb2.addActionListener(new ActionListener()
            			{
		               public void actionPerformed(ActionEvent ae)
                			{
		                     jt1.setText("");
		                     jpf.setText("");
               			 }  
		          }) ;  

				
      jb2.addKeyListener(new KeyAdapter()
               			{
                 			  public void keyPressed(KeyEvent ke)
                			{
                 		            	int key = ke.getKeyCode();
                                   	 if(key ==KeyEvent.VK_ENTER) 
                  		{
                  		   jt1.setText("");
                  		   jpf.setText("");
                  		}  
             			}   
           			});
     jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
                    jf.setVisible(true);
					
						
					  }
}

//CODE FOR PROGRESSBAR


class progress_bar
  {
     JFrame jf;
     JPanel jp,jp1;
     JLabel jl,jl1;
     ImageIcon ic;
     JProgressBar jpb;
     Dimension ds;
     int i;
     URL ur1,ur2;
     AudioClip clip1,clip2;
     progress_bar()
     {

  	//CODE FOR IMAGEICON

	jf=new JFrame("ProgressBar");
                 ic =new ImageIcon(this.getClass().getResource("/w.jpg"));
        	jl=new JLabel(ic);

	
 	//CODE FOR FONT
     
	Font f = new Font(" Serif " , Font.BOLD, 50);

	//CODE FOR HEADER

	jp=new JPanel();
	jp1=new JPanel();
	jp.setBounds(0,0,1360,100);
	jp1.setBounds(320,530,700,60);
	jl1  =new JLabel("LAB ATTENDANCE");  
                 jl1.setForeground(Color.WHITE);      
                 jl1.setFont(f);
 	jp.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.green,2),""));
    jp1.setBackground(new java.awt.Color(0,0,0,115));
    jp1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loading Please Wait..", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255)));
    jp1.setLayout(null);
 	jp.setBackground(new Color(0,0,0,80));

	 //CODE FOR PROGRESSBAR

       	jpb=new JProgressBar(0,500);
	jpb.setStringPainted(true);
                 jpb.setBackground(Color.black);
                 jpb.setForeground(Color.gray);
                 jpb.setBounds(400,550,550,30); 

                   jf.setDefaultCloseOperation(jf.DO_NOTHING_ON_CLOSE );
        	 ds=Toolkit.getDefaultToolkit().getScreenSize();
        	 jf.setSize(ds.width,ds.height);
                  jl.setSize(ds.width,ds.height);
        	 jf.setLayout(null);
	 jf.setResizable(false);
                  jf.add(jp);
                  jf.add(jp1);
                  jp.add(jl1);
                  ur1=progress_bar.class.getResource("Snk.wav");
				  ur2=progress_bar.class.getResource("wr.wav");

                    clip1=Applet.newAudioClip(ur1);
					clip2=Applet.newAudioClip(ur2);
					clip1.play(); 
  	 jf.add(jl);
  	 jl.add(jpb);
	jf.setVisible(true);

//CODE FOR QUIT THE WINDOW FROM BUTTON
        	
 	while(i<=500)
                  {
                      jpb.setValue(i);
                     try
                     {
                             Thread.sleep(5);
                     }catch(Exception e){}
                      i++;    
                  }
                   if(i>500)
                  {
                    jf.dispose();
 	   new Home();          
             	  }
     }      


public static void main(String args[])
    	{
   	    new progress_bar();
  	}
}