package View;

import Helper.*;
import Model.Bashekim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//statement, preparedstatement veritabanı ile bağlantı kuran nesnelerdir.
//statement temel sql ifadelerini çalıştırır.

public class LoginGUI extends JFrame {
    private JPanel hasta_panel;
    private JTextField fld_HastaTc;
    private JTextField fld_doktorTc;
    private JPasswordField fld_hastaSifre;
    private JPasswordField fld_doktorSifre;
    private DBConnection conn = new DBConnection();


    public LoginGUI(){

        JLabel basliklbl = new JLabel();
        basliklbl.setBounds(105,20,300,40);
        basliklbl.setText("Hastane Yönetim Sistemine Hoşgeldiniz");
        basliklbl.setFont(new Font("MV Boli", Font.PLAIN, 15));
        basliklbl.setForeground(Color.white);


        JTabbedPane tbpane = new JTabbedPane(JTabbedPane.TOP);
        tbpane.setBounds(30,70,420,250);


        JPanel hasta_panel = new JPanel();
        hasta_panel.setBackground(new Color(110,120,150) );
        tbpane.addTab("Hasta Girişi", null, hasta_panel,null);
        hasta_panel.setLayout(null);

        JPanel doktor_panel = new JPanel();
        doktor_panel.setBackground(new Color(110,120,150));
        tbpane.addTab("Doktor Girişi", null, doktor_panel,null);
        doktor_panel.setLayout(null);


        JLabel lbl_Tc = new JLabel();
        lbl_Tc.setText("TC Kimlik No: ");
        lbl_Tc.setForeground(Color.white);
        lbl_Tc.setFont(new Font("MV Boli", Font.PLAIN, 12));
        hasta_panel.add(lbl_Tc);
        doktor_panel.add(lbl_Tc);

        JLabel lbl_Sifre = new JLabel();
        lbl_Sifre.setText("Şifre : ");
        lbl_Sifre.setForeground(Color.white);
        lbl_Sifre.setFont(new Font("MV Boli", Font.PLAIN,12));
        hasta_panel.add(lbl_Sifre);
        doktor_panel.add(lbl_Sifre);

        JTextField fld_hastaTc = new JTextField();
        fld_hastaTc.setBounds(170,40,180,28);
        fld_hastaTc.setFont(new Font("MV Boli", Font.PLAIN, 12));
        hasta_panel.add(fld_hastaTc);

        JPasswordField fld_hastaSifre = new JPasswordField();
        fld_hastaSifre.setBounds(170,80,180,28);
        fld_hastaSifre.setFont(new Font("MV Boli", Font.PLAIN,12));
        hasta_panel.add(fld_hastaSifre);

        JTextField fld_doktorTc = new JTextField();
        fld_doktorTc.setBounds(210,40,180,28);
        fld_doktorTc.setFont(new Font("MV Boli", Font.PLAIN,12));
        doktor_panel.add(fld_doktorTc);

        JPasswordField fld_doktorSifre = new JPasswordField();
        fld_doktorSifre.setFont(new Font("MV Boli", Font.PLAIN,12));
        fld_doktorSifre.setBounds(210,80,180,28);
        doktor_panel.add(fld_doktorSifre);


        JButton btn_GirisYap = new JButton("Giriş Yap");
        btn_GirisYap.setFont(new Font("MV Boli", Font.PLAIN,12));
        btn_GirisYap.setBounds(40,150,140,35);
        hasta_panel.add(btn_GirisYap);

        JButton btn_Kayit = new JButton("Kayıt Ol");
        btn_Kayit.setFont(new Font("MV Boli", Font.PLAIN,12));
        btn_Kayit.setBounds(210,150,140,35);
        hasta_panel.add(btn_Kayit);

        JButton btn_GirisDoktor = new JButton("Giriş Yap");
        btn_GirisDoktor.setFont(new Font("MV Boli", Font.PLAIN,12));
        btn_GirisDoktor.setBounds(90,150,300,35);
        btn_GirisDoktor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fld_doktorTc.getText().length() == 0 || fld_doktorSifre.getText().length() == 0){
                    Helper.showMsg("fill");
                }
                else {

                    try {
                        Connection con = conn.connDB();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("SELECT * FROM user");       //sorguyu çalıştırır.
                        while (rs.next()){              //database'den çektiğim verileri resultset'te sürekli dönüyorum .
                            if (fld_doktorTc.getText().equals(rs.getString("tcno")) && fld_doktorSifre.getPassword().equals(rs.getString("sifre"))){
                                Bashekim bhekim = new Bashekim();
                                bhekim.setId(rs.getInt("id"));
                                bhekim.setIsim(rs.getString("isim"));
                                bhekim.setSifre(rs.getString("sifre"));
                                bhekim.setTcno(rs.getString("tcno"));
                                bhekim.setType(rs.getString("type"));
                                System.out.println(bhekim.getIsim());

                            }
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        doktor_panel.add(btn_GirisDoktor);








        this.setTitle("Hastane Otomsyonu");
        this.setSize(500,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(110,120,150));
        this.setVisible(true);
        this.add(basliklbl);
        this.add(tbpane);



    //tc label ve şifre label'ı ekleyemiyorum.




    }

}
