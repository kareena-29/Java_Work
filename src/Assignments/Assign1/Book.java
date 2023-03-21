package Assignments.Assign1;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.xml.crypto.Data;

class BookData extends JFrame {
    JTextArea jj;
    String bname, aname, pname, dt;
    int p, q, t, id;
    JTextField j1, j2, j3, j4, j5, j6, j7, j8;
    //    JTextArea j3;
    JButton jb1, jb2, jb3, jb4;
    JLabel l1, l2, l3, lab, l4, l5, l6, l7, l8;
    JFrame fr;
    Container cont;
    Font f, f1;
    int s[], top, num;
    ArrayList<DataStorage> finaldatalist = new ArrayList<>();

    BookData() {
        super("BOOK DATA");
        s = new int[5];
        top = -1;

        cont = getContentPane();
        cont.setLayout(null);

//        cont.setBackground(Color.DARK_GRAY);
//        cont.setBackground(new Color(53,53,53));
        cont.setBackground(new Color(21, 50, 67));


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

//        jj = new JTextArea();
//        jj.setBounds(800, 190, 500, 500);
//        f = new Font("Century Gothic", Font.TYPE1_FONT, 10);
//        jj.setFont(f);
//        cont.add(jj);

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
        j1.setForeground(new Color(21, 50, 67));
        j2.setBackground(new Color(180, 184, 171));
        j2.setBorder(border);
        j2.setForeground(new Color(21, 50, 67));
        j3.setBackground(new Color(180, 184, 171));
        j3.setBorder(border);
        j3.setForeground(new Color(21, 50, 67));
        j4.setBackground(new Color(180, 184, 171));
        j4.setBorder(border);
        j4.setForeground(new Color(21, 50, 67));
        j5.setBackground(new Color(180, 184, 171));
        j5.setBorder(border);
        j5.setForeground(new Color(21, 50, 67));
        j6.setBackground(new Color(180, 184, 171));
        j6.setBorder(border);
        j6.setForeground(new Color(21, 50, 67));
        j7.setBackground(new Color(180, 184, 171));
        j7.setBorder(border);
        j7.setForeground(new Color(21, 50, 67));
        j8.setBackground(new Color(180, 184, 171));
        j8.setBorder(border);
        j8.setForeground(new Color(21, 50, 67));


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
        jb1.setForeground(new Color(21, 50, 67));
        jb1.setBorderPainted(false);
        jb1.setFont(f);
        cont.add(jb1);
        fr = new JFrame();
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (j1.getText().length() == 0 || j2.getText().length() == 0 || j3.getText().length() == 0 ||
                        j4.getText().length() == 0 || j5.getText().length() == 0 || j6.getText().length() == 0 ||
                        j7.getText().length() == 0 || j8.getText().length() == 0) {
                    JOptionPane.showMessageDialog(fr, "Text field is mandatory\n", "Alert", JOptionPane.WARNING_MESSAGE);
                }
//                else {
//                    j1.setText("");
//                    j2.setText("");
//                    j3.setText("");
//                    j4.setText("");
//                    j5.setText("");
//                    j6.setText("");
//                    j7.setText("");
//                    j8.setText("");
//
//                }
            }
        });

        jb2 = new JButton("UPDATE");
        jb2.setBounds(423, 693, 96, 30);
        jb2.setBackground(new Color(180, 184, 171));
        jb2.setForeground(new Color(21, 50, 67));
        jb2.setBorderPainted(false);
        jb2.setFont(f);
        cont.add(jb2);

        jb3 = new JButton("DELETE");
        jb3.setBounds(542, 693, 96, 30);
        jb3.setBackground(new Color(180, 184, 171));
        jb3.setForeground(new Color(21, 50, 67));
        jb3.setBorderPainted(false);
        jb3.setFont(f);
        cont.add(jb3);

        jb4 = new JButton("LOAD");
        jb4.setBounds(660, 693, 96, 30);
        jb4.setBackground(new Color(180, 184, 171));
        jb4.setForeground(new Color(21, 50, 67));
        jb4.setBorderPainted(false);
        jb4.setFont(f);
        cont.add(jb4);

        DefaultTableModel dtm = new DefaultTableModel();
        JTable table = new JTable(dtm);
        String header[] = new String[] {"Book-id", "Book Name", "Author Name", "Publisher's Name",
                "Date of Publication", "Price", "Quantity", "Total Price"};
        dtm.setColumnIdentifiers(header);
        table.setModel(dtm);
        table.setBounds(800, 190, 500, 500);
        JScrollPane sp=new JScrollPane(table);
        cont.add(sp);
//        cont.add(table);
        table.setVisible(true);


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


        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Price calculation Event
        j7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String s1 = j6.getText();
                String s2 = j7.getText();
                int qty = Integer.parseInt(s1);
                int price = Integer.parseInt(s2);
                int total = qty * price;
//                int t = total;
//        p = price;

                String result = String.valueOf(total);
                j8.setText(result);
            }

        });

//
//        ArrayList<DataStorage> datafile = new ArrayList<>();
//      event on submit button
        FinalData fdata = new FinalData();
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bname = j1.getText();
                aname = j2.getText();
                String stt = j3.getText();
                id = Integer.parseInt(stt);
                pname = j4.getText();
                dt = j1.getText();
                String st1 = j6.getText();
                p = Integer.parseInt(st1);
                String st2 = j7.getText();
                q = Integer.parseInt(st2);
                String st3 = j8.getText();
                t = Integer.parseInt(st3);

//                try{
//                    FileOutputStream fos = new FileOutputStream("Books.dat");
//                    BufferedOutputStream bos = new BufferedOutputStream(fos);
//                    ObjectOutputStream oos = new ObjectOutputStream(bos);

//                    DataStorage dst = new DataStorage();
//                    dst.bname = bname;
//                    dst.aname = aname;
//                    dst.id = id;
//                    dst.dt = dt;
//                    dst.pname = pname;
//                    dst.p = p;
//                    dst.q = q;
//                    dst.t = t;
//                    datafile.add(dst);
////                    oos.writeObject(dst);
////                    oos.close();
//
//
//                }
//                catch(Exception ex){
//                    ex.printStackTrace();
//                }

//                DataStorage dataob = new DataStorage();
//                dataob.setBname(bname);
//                dataob.setAname(aname);
//                dataob.setBid(id);
//                dataob.setPname(pname);
//                dataob.setDateofpub(dt);
//                dataob.setBookp(p);
//                dataob.setBookq(q);
//                dataob.setTotalcost(t);
                try {
//                    DataStorage dataob = new DataStorage(id,bname,aname,pname,dt,p,q,t);
                 DataStorage dataob = new DataStorage();
                dataob.setBname(bname);
                dataob.setAname(aname);
                dataob.setBid(id);
                dataob.setPname(pname);
                dataob.setDateofpub(dt);
                dataob.setBookp(p);
                dataob.setBookq(q);
                dataob.setTotalcost(t);

                    System.out.println("I am here in read");

                    fdata.addBook(dataob);

                    File f = new File("Books.dat");
                    FileOutputStream fileout = null;
                    fileout = new FileOutputStream("Books.dat", true);

                    // If there is nothing to be write onto file
                    if (f.length() == 0) {
                        ObjectOutputStream oos = new ObjectOutputStream(fileout);
                        oos.writeObject(dataob);
                        oos.close();
                    }

                    // There is content in file to be write on
                    else {

                        MyObjectOutputStream oos = null;
                        oos = new MyObjectOutputStream(fileout);
                        oos.writeObject(dataob);

                        // Closing the FileOutputStream object
                        // to release memory resources
                        oos.close();
                    }

                    // Closing the File class object to avoid
                    // read-write
                    fileout.close();

                    System.out.println("I am here in end");

                }

                // Catch block to handle the exceptions
                catch (Exception ex) {

                    // Print the exception along with the
                    // display message
                    System.out.println("Error Occurred" + ex);
                }
//                try {
//
//
//
//                    objout.writeObject(dataob);
//                    objout.flush();
//                    objout.close();
//
//
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
            }
        });

        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                try{
//                    FileOutputStream fos = new FileOutputStream("Books.dat");
//                    BufferedOutputStream bos = new BufferedOutputStream(fos);
//                    ObjectOutputStream oos = new ObjectOutputStream(bos);
//
//                    oos.writeObject(datafile);
//                    oos.close();
//
//                    FileInputStream fis = new FileInputStream("Books.dat");
//                    BufferedInputStream bis = new BufferedInputStream(fis);
//                    ObjectInputStream ois = new ObjectInputStream(bis);
//
//                    ArrayList datafile2 = (ArrayList<DataStorage>)ois.readObject();
//                    ois.close();
//                    cont.removeAll();

//                    for(int i = 0; i < datafile2.size(); i++){
//
////                        System.out.println(datafile2.toString());
//                        jj.setText(datafile2.toString());
//                    }
//                    DataStorage dts = new DataStorage();

//                    for(Object dts: datafile2) {
//                        jj.setText(dts.toString());
//                    }
//                }
//
//                catch(IOException ex){
//                    ex.printStackTrace();
//                }
//                catch(ClassNotFoundException ex){
//                    ex.printStackTrace();
//                }
//
//            }

                try {
                    System.out.println("I am here in load");

                    DataStorage obj;
                    FileInputStream filein = new FileInputStream("Books.dat");
                    ObjectInputStream objin = new ObjectInputStream(filein);

                    while(filein.available() != 0){
                        obj = (DataStorage)objin.readObject();
                        finaldatalist.add(obj);
                        System.out.println(obj);
                    }
                    filein.close();
                    objin.close();


                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
//        jb3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try{
//
//
//                }
//                catch (IOException ex){
//                    ex.printStackTrace();
//                }
//
//
//            }
//        }


//    @Override
//    public void actionPerformed(ActionEvent ae) {
//        String s1 = l6.getText();
//        String s2 =  l7.getText()
//        int qty = Integer.parseInt(s1);
//        int price = Integer.parseInt(s2);
//        int total = qty*price;
//
//        String result = String.valueOf(total);
//        j8.setText(result);

        //        String st1,st2,st3,st4,st5,st6="";
//        String st = ae.getActionCommand();
//        f = new Font("Calibari",Font.BOLD,15);
//
//
//        if(st.equals("PUSH"))
//        {
//            j2.setText("");
//            j3.setText("");
//            if(top==4)
//            {
//                st1="  STACK OVERFLOW!    ";
//                j1.setText(st1);
//                j1.setFont(f);
//
//            }
//
//            else {
//
//                st2 = j1.getText();
//                num = Integer.parseInt(st2);
//                s[++top]=num;
//                j1.setText("");
//            }
//
//        }
//        else if(st.equals("POP"))
//        {
//            j1.setText("");
//            j3.setText("");
//            if(top==-1)
//            {
//                st3 ="  STACK UNDERFLOW!    ";
//                j2.setText(st3);
//                j2.setFont(f);
//            }
//            else
//            {
//                num = s[top--];
//                st4 = Integer.toString(num);
//                j2.setText(st4);
//                j2.setFont(f);
//            }
//        }
//        else if(st.equals("DISPLAY"))
//        {
//            f1 = new Font("Calibari",Font.BOLD,20);
//            j1.setText("");
//            j2.setText("");
//            int i;
//            if(top==-1)
//            {
//                st5 ="  EMPTY STACK!    ";
//                j3.setText(st5);
//                j3.setFont(f1);
//            }
//            else
//            {
//                String t;
//                for(i=top;i>=0;i--)
//                {
//                    t = Integer.toString(s[i]);
//                    st6 = st6 + t;
//                    st6 = st6 + '\t';
//                }
//                j3.setText(st6);
//                j3.setFont(f1);
//            }
//        }


    }
}
//});
class MyObjectOutputStream extends ObjectOutputStream {

    // Constructor of this class
    // 1. Default
    MyObjectOutputStream() throws IOException
    {

        // Super keyword refers to parent class instance
        super();
    }

    // Constructor of this class
    // 1. Parameterized constructor
    MyObjectOutputStream(OutputStream o) throws IOException
    {
        super(o);
    }

    // Method of this class
    public void writeStreamHeader() throws IOException
    {
        return;
    }
}
public class Book {

    public static void main(String[] args) {
        BookData ss = new BookData();
        ss.setVisible(true);
        ss.setSize(1920,1080);
        ss.setLocation(-8,-4);

    }

}

