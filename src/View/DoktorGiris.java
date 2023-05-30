package View;

import javax.swing.*;
import java.awt.*;

public class DoktorGiris {

    public DoktorGiris(){

        JFrame frame2 = new JFrame();

        JButton doctorbutton = new JButton();
        JButton doctorbutton2 = new JButton();
        JButton doctorbutton3 = new JButton();

        doctorbutton.setBounds(155,340,120,35);
        doctorbutton.setText("Kayıt Ol");
        doctorbutton.addActionListener(event -> System.out.println("Kayıt sayfasına yönlendiriliyorsunuz!"));
        doctorbutton2.setBounds(315,340,120,35);
        doctorbutton2.setText("Giriş Yap");
        doctorbutton2.addActionListener(event -> System.out.println("Giriş başarılı!"));
        doctorbutton3.setBounds(155,380,280,35);
        doctorbutton3.setText("Şifremi Unuttum");
        doctorbutton3.addActionListener(event -> System.out.println("Talebiniz alınmıştır!"));


        JLabel doctorlabel = new JLabel();
        JLabel doctorlabel2 = new JLabel();
        doctorlabel.setText("TC Kmilik No : ");
        doctorlabel.setBounds(143,164,150,40);
        doctorlabel.setForeground(Color.white);
        doctorlabel.setFont(new Font("MV Boli", Font.PLAIN, 15));
        doctorlabel2.setText("Şifre :");
        doctorlabel2.setBounds(143,214,100,40);
        doctorlabel2.setForeground(Color.white);
        doctorlabel2.setFont(new Font("MV Boli", Font.PLAIN,15));

        JPanel doctorpanel = new JPanel();
        JPanel doctorpanel2 = new JPanel();
        doctorpanel.setBackground(new Color(120,100,150));
        doctorpanel.setBounds(120,135,360,160);
        doctorpanel2.setBackground(new Color(120,100,150));
        doctorpanel2.setBounds(120,320,360,115);

        JTextField doctortextField = new JTextField();
        JTextField doctortextField2 = new JTextField();
        doctortextField.setBounds(270,170,177,30);
        doctortextField2.setBounds(270,220,177,30);


        frame2.setTitle("Doktor Girişi");
        frame2.setSize(600,500);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);            // kapat tuşuna basınca sadece o pencereyi kapat
        frame2.getContentPane().setBackground(new Color(110,120,150));
        frame2.setVisible(true);
        frame2.add(doctorbutton);
        frame2.add(doctorbutton2);
        frame2.add(doctorbutton3);
        frame2.add(doctorlabel);
        frame2.add(doctorlabel2);
        frame2.add(doctortextField);
        frame2.add(doctortextField2);
        frame2.add(doctorpanel);
        frame2.add(doctorpanel2);
    };

}
