package Assignments.Assign1;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;
import javax.xml.crypto.Data;

class BookData extends JFrame {

    String bname,aname,id,pname,dt;
    int p,q,t;
    JTextField j1,j2,j3,j4,j5,j6,j7,j8;
//    JTextArea j3;
    JButton jb1,jb2,jb3;
    JLabel l1,l2,l3,lab,l4,l5,l6,l7,l8;
    Container cont;
    Font f,f1;
    int s[],top,num;

    BookData()
    {
        super("BOOK DATA");
        s = new int[5];
        top = -1;

        cont = getContentPane();
        cont.setLayout(null);

//        cont.setBackground(Color.DARK_GRAY);
//        cont.setBackground(new Color(53,53,53));
        cont.setBackground(new Color(21,50,67));


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

		jb1 = new JButton("SUBMIT");
		jb2 = new JButton("LOAD");
		jb3 = new JButton("DISPLAY");

        f = new Font("Times",Font.BOLD,38);
        lab.setBounds(660,20,400,100);
        lab.setFont(f);
        lab.setForeground(new Color(180,184,171));

        f = new Font("Calibari",Font.PLAIN,16);

        l1.setBounds(340,120,300,50);
        l2.setBounds(340,190,300,50);
        l3.setBounds(340,260,300,50);
        l4.setBounds(340,330,300,50);
        l5.setBounds(340,400,300,50);
        l6.setBounds(340,470,300,50);
        l7.setBounds(340,540,300,50);
        l8.setBounds(340,610,300,50);


        j1.setBounds(595,133,500,30);
        j2.setBounds(595,203,500,30);
        j3.setBounds(595,273,500,30);
        j4.setBounds(595,343,500,30);
        j5.setBounds(595,413,500,30);
        j6.setBounds(595,483,500,30);
        j7.setBounds(595,553,500,30);
        j8.setBounds(595,623,500,30);


        //TextFiled Design
        Border border = BorderFactory.createEmptyBorder();
        j1.setBackground(new Color(180,184,171));   j1.setBorder(border);
        j1.setForeground(new Color(21,50,67));
        j2.setBackground(new Color(180,184,171));   j2.setBorder(border);
        j2.setForeground(new Color(21,50,67));
        j3.setBackground(new Color(180,184,171));   j3.setBorder(border);
        j3.setForeground(new Color(21,50,67));
        j4.setBackground(new Color(180,184,171));   j4.setBorder(border);
        j4.setForeground(new Color(21,50,67));
        j5.setBackground(new Color(180,184,171));   j5.setBorder(border);
        j5.setForeground(new Color(21,50,67));
        j6.setBackground(new Color(180,184,171));   j6.setBorder(border);
        j6.setForeground(new Color(21,50,67));
        j7.setBackground(new Color(180,184,171));   j7.setBorder(border);
        j7.setForeground(new Color(21,50,67));
        j8.setBackground(new Color(180,184,171));   j8.setBorder(border);
        j8.setForeground(new Color(21,50,67));



        l1.setForeground(new Color(244,249,233));
        l2.setForeground(new Color(244,249,233));
        l3.setForeground(new Color(244,249,233));
        l4.setForeground(new Color(244,249,233));
        l5.setForeground(new Color(244,249,233));
        l6.setForeground(new Color(244,249,233));
        l7.setForeground(new Color(244,249,233));
        l8.setForeground(new Color(244,249,233));


        //Button Design
		jb1.setBounds(700,693,120,30);
        jb1.setBackground(new Color(180,184,171));
        jb1.setForeground(new Color(21,50,67));
        jb1.setBorderPainted(false);

        jb2.setBounds(840,693,120,30);
        jb2.setBackground(new Color(180,184,171));
        jb2.setForeground(new Color(21,50,67));
        jb2.setBorderPainted(false);


        jb3.setBounds(970,693,120,30);
        jb3.setBackground(new Color(180,184,171));
        jb3.setForeground(new Color(21,50,67));
        jb3.setBorderPainted(false);

//		jb2.setBounds(600,210,120,30);
//		jb3.setBounds(980,315,120,45);

//		jb1.addActionListener(this);
//		jb2.addActionListener(this);
//		jb3.addActionListener(this);

        l1.setFont(f);  l2.setFont(f);  l3.setFont(f);   l4.setFont(f);  l5.setFont(f);
        l6.setFont(f);  l7.setFont(f);  l8.setFont(f);

        f = new Font("Calibari",Font.TYPE1_FONT,17);
        j1.setFont(f);  j2.setFont(f);  j3.setFont(f);  j4.setFont(f);  j5.setFont(f);
        j6.setFont(f);  j7.setFont(f);  j8.setFont(f);
        f = new Font("Calibari",Font.TYPE1_FONT,15);
        jb1.setFont(f); jb2.setFont(f);


        cont.add(lab);  cont.add(l1);   cont.add(l2);   cont.add(l3);    cont.add(l4);
        cont.add(l5);   cont.add(l6);   cont.add(l7);   cont.add(l8);

        cont.add(j1);   cont.add(j2);   cont.add(j3);   cont.add(j4);   cont.add(j5);
        cont.add(j6);   cont.add(j7);   cont.add(j8);

        cont.add(jb1);  cont.add(jb2);  cont.add(jb3);


        setDefaultCloseOperation(EXIT_ON_CLOSE);

//       counting action on buttons
        j6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = j6.getText();
                String s2 =  j7.getText();
                int qty = Integer.parseInt(s1);
                int price = Integer.parseInt(s2);
                int total = qty*price;
                p = price;

                String result = String.valueOf(total);
                j8.setText(result);
            }
        });
        j7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = j6.getText();

                String s2 =  j7.getText();
            int qty = Integer.parseInt(s1);
            int price = Integer.parseInt(s2);
            int total = qty*price;
            q = qty;
            t = total;

            String result = String.valueOf(total);
            j8.setText(result);
            }
        });

//        event for getting each data
        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bname = j1.getText();
            }
        });
        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aname = j2.getText();
            }
        });
        j3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id = j3.getText();
            }
        });
        j4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pname = j4.getText();
            }
        });
        j5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dt = j1.getText();
            }
        });
//        j6.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String st1 = j1.getText();
//                p = Integer.parseInt(st1);
//            }
//        });
//        j7.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String st2 = j1.getText();
//                q = Integer.parseInt(st2);
//            }
//        });
        ArrayList<DataStorage> datafile = new ArrayList<>();
//      event on submit button
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
//                    FileOutputStream fos = new FileOutputStream("Books.dat");
//                    BufferedOutputStream bos = new BufferedOutputStream(fos);
//                    ObjectOutputStream oos = new ObjectOutputStream(bos);

                    DataStorage dst = new DataStorage();
                    dst.bname = bname;
                    dst.aname = aname;
                    dst.id = id;
                    dst.dt = dt;
                    dst.pname = pname;
                    dst.p = p;
                    dst.q = q;
                    dst.t = t;
                    datafile.add(dst);
//                    oos.writeObject(dst);
//                    oos.close();

                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    FileOutputStream fos = new FileOutputStream("Books.dat");
                    BufferedOutputStream bos = new BufferedOutputStream(fos);
                    ObjectOutputStream oos = new ObjectOutputStream(bos);

                    oos.writeObject(datafile);
                    oos.close();
                }
                catch(IOException ex){
                    ex.printStackTrace();
                }

            }
        });
        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    FileInputStream fis = new FileInputStream("Books.dat");
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    ObjectInputStream ois = new ObjectInputStream(bis);

                    ArrayList datafile2 = (ArrayList<DataStorage>)ois.readObject();
                    ois.close();
                    cont.removeAll();
                    for(Object d:datafile2){
                        System.out.println(bname+" "+id+" "+pname);
                    }

                }
                catch (IOException ex){
                    ex.printStackTrace();
                }
                catch(ClassNotFoundException ex){
                    ex.printStackTrace();
                }

            }
        });

    }



//    Action action = new AbstractAction() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            String s1 = j6.getText();
//            String s2 =  j7.getText();
//            int qty = Integer.parseInt(s1);
//            int price = Integer.parseInt(s2);
//            int total = qty*price;
//
//            String result = String.valueOf(total);
//            j8.setText(result);
//        }
//    };


//    @Override
    public void actionPerformed(ActionEvent ae) {
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
public class Book {

    public static void main(String[] args) {
        BookData ss = new BookData();
        ss.setVisible(true);
        ss.setSize(1920,1080);
        ss.setLocation(-8,-4);

    }

}

