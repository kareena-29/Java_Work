package Assignments.Assign2;

import com.raven.datechooser.DateChooser;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

class BookData extends JFrame {
    String bname, aname, pname, dt;
    int p, q, t, id;
    JTextField j1, j2, j3, j4, j5, j6, j7, j8;
    //    JTextArea j3;
    JButton jb1, jb2, jb3, jb4, jb5;
    JLabel l1, l2, l3, lab, l4, l5, l6, l7, l8;
    JFrame fr;
    Container cont;
    Font f;
    int[] s;
    int top;
    int flag;

    ArrayList<DataStorage> finaldatalist1 = new ArrayList<>();

    BookData() {
        super("BOOK DATA");
        s = new int[5];
        top = -1;

        cont = getContentPane();
        cont.setLayout(null);
        cont.setBackground(new Color(51,53,51));

        l1 = new JLabel("ENTER BOOK NAME: ");
        l2 = new JLabel("ENTER AUTHOR NAME/NAMES: ");
        l3 = new JLabel("ENTER ID: ");
        l4 = new JLabel("ENTER PUBLISHER'S NAME: ");
        l5 = new JLabel("ENTER DATE OF PUBLICATION: ");
        l6 = new JLabel("ENTER PRICE: ");
        l7 = new JLabel("ENTER TOTAL QTY: ");
        l8 = new JLabel("TOTAL COST: ");

        lab = new JLabel("BOOK COLLECTION");
        j1 = new JTextField();
        j2 = new JTextField();
        j3 = new JTextField();
        j4 = new JTextField();
        j5 = new JTextField();
        j6 = new JTextField();
        j7 = new JTextField();
        j8 = new JTextField();

        f = new Font("Century Gothic", Font.BOLD, 38);
        lab.setBounds(660, 20, 400, 100);
        lab.setFont(f);
        lab.setForeground(new Color(180, 184, 171));

        f = new Font("Century Gothic", Font.PLAIN, 16);
        l1.setBounds(50, 120, 300, 50);
        l2.setBounds(50, 190, 300, 50);
        l3.setBounds(50, 260, 300, 50);
        l4.setBounds(50, 330, 300, 50);
        l5.setBounds(50, 400, 300, 50);
        l6.setBounds(50, 470, 300, 50);
        l7.setBounds(50, 540, 300, 50);
        l8.setBounds(50, 610, 300, 50);

        j1.setBounds(305, 133, 450, 30);
        j2.setBounds(305, 203, 450, 30);
        j3.setBounds(305, 273, 450, 30);
        j4.setBounds(305, 343, 450, 30);
        j5.setBounds(305, 413, 450, 30);
        j6.setBounds(305, 483, 450, 30);
        j7.setBounds(305, 553, 450, 30);
        j8.setBounds(305, 623, 450, 30);

        //TextFiled Design
        Border border = BorderFactory.createEmptyBorder();
        j1.setBackground(new Color(180, 184, 171));
        j1.setBorder(border);
        j1.setForeground(new Color(51,53,51));
        j2.setBackground(new Color(180, 184, 171));
        j2.setBorder(border);
        j2.setForeground(new Color(51,53,51));
        j3.setBackground(new Color(180, 184, 171));
        j3.setBorder(border);
        j3.setForeground(new Color(51,53,51));
        j4.setBackground(new Color(180, 184, 171));
        j4.setBorder(border);
        j4.setForeground(new Color(51,53,51));
        j5.setBackground(new Color(180, 184, 171));
        j5.setBorder(border);
        j5.setForeground(new Color(51,53,51));

        j6.setBackground(new Color(180, 184, 171));
        j6.setBorder(border);
        j6.setForeground(new Color(51,53,51));
        j7.setBackground(new Color(180, 184, 171));
        j7.setBorder(border);
        j7.setForeground(new Color(51,53,51));
        j8.setBackground(new Color(180, 184, 171));
        j8.setBorder(border);
        j8.setForeground(new Color(51,53,51));

        l1.setForeground(new Color(244, 249, 233));
        l2.setForeground(new Color(244, 249, 233));
        l3.setForeground(new Color(244, 249, 233));
        l4.setForeground(new Color(244, 249, 233));
        l5.setForeground(new Color(244, 249, 233));
        l6.setForeground(new Color(244, 249, 233));
        l7.setForeground(new Color(244, 249, 233));
        l8.setForeground(new Color(244, 249, 233));
        //Button Design
        f = new Font("Century Gothic", Font.TYPE1_FONT, 14);
        jb1 = new JButton("SUBMIT");
        jb1.setBounds(305, 693, 96, 30);
        jb1.setBackground(new Color(180, 184, 171));
        jb1.setForeground(new Color(51,53,51));
        jb1.setBorderPainted(false);
        jb1.setFont(f);
        cont.add(jb1);
        fr = new JFrame();

        jb2 = new JButton("UPDATE");
        jb2.setBounds(423, 693, 96, 30);
        jb2.setBackground(new Color(180, 184, 171));
        jb2.setForeground(new Color(51,53,51));
        jb2.setBorderPainted(false);
        jb2.setFont(f);
        cont.add(jb2);

        jb3 = new JButton("DELETE");
        jb3.setBounds(542, 693, 96, 30);
        jb3.setBackground(new Color(180, 184, 171));
        jb3.setForeground(new Color(51,53,51));
        jb3.setBorderPainted(false);
        jb3.setFont(f);
        cont.add(jb3);

        jb4 = new JButton("LOAD");
        jb4.setBounds(660, 693, 96, 30);
        jb4.setBackground(new Color(180, 184, 171));
        jb4.setForeground(new Color(51,53,51));
        jb4.setBorderPainted(false);
        jb4.setFont(f);
        cont.add(jb4);

//        Icon icon = new ImageIcon("calendar-(1).png");
        jb5 = new JButton();
        try {
            Image img = ImageIO.read(getClass().getResource("calendar-(1).png"));
            jb5.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }

        jb5.setBounds(725, 413, 30, 30);
        jb5.setBackground(new Color(180, 184, 171));
        jb5.setBorderPainted(false);
        cont.add(jb5);

        DateChooser dateChooser = new DateChooser();
        dateChooser.setDateFormat("yyyy-MM-dd");
        dateChooser.setTextRefernce(j5);
        dateChooser.setForeground(new Color(51,53,51));
        jb5.addActionListener(event -> {
            dateChooser.showPopup();
        });

        String[] header = new String[]{"Book Id", "Book Name", "Author Name", "Publisher's Name", " Date of Publication", "Price", "Quantity", "Total Cost"};
        JScrollPane jspBookTable;
        DefaultTableModel defaultTableModel = new DefaultTableModel(header, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };

        JTable bookTable = new JTable(defaultTableModel);
        bookTable.setVisible(true);
        jspBookTable = new JScrollPane(bookTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jspBookTable.setBounds(800, 135, 660, 588);
        f = new Font("Century Gothic", Font.PLAIN, 13);
        bookTable.setFont(f);
        bookTable.getTableHeader().setBackground(new Color(180, 184, 171));
        bookTable.getTableHeader().setForeground(new Color(51,53,51));
        bookTable.getTableHeader().setBorder(new EmptyBorder(0, 0, 0, 0));
        bookTable.getTableHeader().setFont(f);
        this.add(jspBookTable);
        validate();

        f = new Font("Century Gothic", Font.TYPE1_FONT, 17);
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
        l8.setFont(f);

        f = new Font("Century Gothic", Font.TYPE1_FONT, 17);
        j1.setFont(f);
        j2.setFont(f);
        j3.setFont(f);
        j4.setFont(f);
        j5.setFont(f);
        j6.setFont(f);
        j7.setFont(f);
        j8.setFont(f);

        cont.add(lab);
        cont.add(l1);
        cont.add(l2);
        cont.add(l3);
        cont.add(l4);
        cont.add(l5);
        cont.add(l6);
        cont.add(l7);
        cont.add(l8);

        cont.add(j1);
        cont.add(j2);
        cont.add(j3);
        cont.add(j4);
        cont.add(j5);
        cont.add(j6);
        cont.add(j7);
        cont.add(j8);



//
        //Price calculation Event
        j6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String s1 = j6.getText();
                String s2 = j7.getText();
                int qty = Integer.parseInt(s2);
                int price = Integer.parseInt(s1);
                int total = qty * price;
                String result = String.valueOf(total);
                j8.setText(result);
            }

        });
        j7.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
                String s1 = j6.getText();
                String s2 = j7.getText();
                int qty = Integer.parseInt(s2);
                int price = Integer.parseInt(s1);
                int total = qty * price;
                String result = String.valueOf(total);
                j8.setText(result);
            }
        });
        j8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String s1 = j6.getText();
                String s2 = j7.getText();
                int qty = Integer.parseInt(s2);
                int price = Integer.parseInt(s1);
                int total = qty * price;
                String result = String.valueOf(total);
                j8.setText(result);
            }
        });
        bookTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int s = bookTable.getSelectedRow();
                j1.setText(bookTable.getModel().getValueAt(s,1).toString());
                j2.setText(bookTable.getModel().getValueAt(s,2).toString());
                j3.setText(bookTable.getModel().getValueAt(s,0).toString());
                j4.setText(bookTable.getModel().getValueAt(s,3).toString());
                j5.setText(bookTable.getModel().getValueAt(s,4).toString());
                j6.setText(bookTable.getModel().getValueAt(s,5).toString());
                j7.setText(bookTable.getModel().getValueAt(s,6).toString());
                j8.setText(bookTable.getModel().getValueAt(s,7).toString());
            }
        });
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (j1.getText().length() == 0 || j2.getText().length() == 0 || j3.getText().length() == 0 ||
                        j4.getText().length() == 0 || j5.getText().length() == 0 || j6.getText().length() == 0 || j7.getText().length() == 0 ||
                        j8.getText().length() == 0) {
                    JOptionPane.showMessageDialog(fr, "Text field is mandatory\n", "Alert", JOptionPane.WARNING_MESSAGE);
                } else {
                    bname = j1.getText();
                    aname = j2.getText();
                    String stt = j3.getText();
                    id = Integer.parseInt(stt);
                    pname = j4.getText();
                    dt = j5.getText();
                    String st1 = j7.getText();
                    q = Integer.parseInt(st1);
                    String st2 = j6.getText();
                    p = Integer.parseInt(st2);
                    String query = "insert into book (bid, bname, aname, pname, pdate, price, qty) " +
                            "values ('"+id+"','"+bname+"','"+aname+"','"+pname+"','"+dt+"','"+p+"','"+q+"');";
                    Connection con = Conjdbc.getConnection();
                    try{
                        Statement st = con.createStatement();
                        int updatedr = st.executeUpdate(query);
                        System.out.println(updatedr);
                    }catch (Exception ee) {
                        ee.printStackTrace();
                    }
                    j1.setText("");
                    j2.setText("");
                    j3.setText("");
                    j4.setText("");
                    j5.setText("");
                    j6.setText("");
                    j7.setText("");
                    j8.setText("");
                }
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (j1.getText().length() == 0 || j2.getText().length() == 0 || j3.getText().length() == 0 ||
                        j4.getText().length() == 0 || j5.getText().length() == 0 || j6.getText().length() == 0 || j7.getText().length() == 0 ||
                        j8.getText().length() == 0) {
                    JOptionPane.showMessageDialog(fr, "Text field is mandatory\n", "Alert", JOptionPane.WARNING_MESSAGE);
                } else {
                    bname = j1.getText();
                    aname = j2.getText();
                    String stt = j3.getText();
                    id = Integer.parseInt(stt);
                    pname = j4.getText();
                    dt = j5.getText();
                    String st1 = j7.getText();
                    q = Integer.parseInt(st1);
                    String st2 = j6.getText();
                    p = Integer.parseInt(st2);

                    String query = "update book set bname = '"+bname+"', aname = '"+aname+"', pname = '"+pname+"', pdate = '"+dt+"', price = '"+p+"', qty = '"+q+"' where bid = '"+id+"';";
                    Connection con = Conjdbc.getConnection();
                    try{
                        Statement st = con.createStatement();
                        int updatedr = st.executeUpdate(query);
                        System.out.println(updatedr);
                    }catch (Exception ee) {
                        ee.printStackTrace();
                    }
                    j1.setText("");
                    j2.setText("");
                    j3.setText("");
                    j4.setText("");
                    j5.setText("");
                    j6.setText("");
                    j7.setText("");
                    j8.setText("");
                }
            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = bookTable.getSelectedRow();
                String query = "delete from book where bid= '"+row+"';";
                Connection con = Conjdbc.getConnection();

                try {
                    Statement st = con.createStatement();
                    int delrow = st.executeUpdate(query);

                    System.out.println(delrow);

                }catch(Exception ee){
                    ee.printStackTrace();
                }
                defaultTableModel.removeRow(row);
                j1.setText("");
                j2.setText("");
                j3.setText("");
                j4.setText("");
                j5.setText("");
                j6.setText("");
                j7.setText("");
                j8.setText("");

            }
        });
        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while (defaultTableModel.getRowCount() > 0) {
                    defaultTableModel.removeRow(0);
                }
                String query = "select * from book";
                Connection con = Conjdbc.getConnection();

                try{
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);

                    while(rs.next()){
                        int id = rs.getInt("bid");
                        String bname = rs.getString("bname");
                        String aname = rs.getString("aname");
                        String pname = rs.getString("pname");
                        String date = rs.getString("pdate");
                        int price = rs.getInt("price");
                        int qty = rs.getInt("qty");
                        int tot = rs.getInt("amt");


                        Object[] obj = {id,bname,aname,pname,date,qty,price,tot};
                        defaultTableModel.addRow(obj);
                    }
//                    st.close();
//                    con.close();
                }catch (Exception ee) {
                    ee.printStackTrace();
                }
            }
        });

    }
}

//});
class MyObjectOutputStream extends ObjectOutputStream {

    MyObjectOutputStream() throws IOException {
        super();
    }

    MyObjectOutputStream(OutputStream o) throws IOException {
        super(o);
    }

    public void writeStreamHeader() {
    }
}


public class Book {
    public static void main(String[] args) {
        BookData ss = new BookData();
        ss.setVisible(true);
        ss.setSize(1920, 1080);
        ss.setLocation(-8, -4);

        ss.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Connection con = Conjdbc.getConnection();
                try{
                    Statement st = con.createStatement();

                    con.close();
                    st.close();
                    System.out.println("Closed");
                    System.exit(0);
                }catch(Exception ee){
                    ee.printStackTrace();
                }
            }
        });
    }
}

