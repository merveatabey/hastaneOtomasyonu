/*package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame{
    public Login(){
        JButton button = new JButton();
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();
        JButton button4 = new JButton();


        button.setBounds(155,340,120,35);
        button.setText("Kayıt Ol");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new KayitOl();
            }
        });
        button1.setBounds(315,340,120,35);
        button1.setText("Giriş Yap");
        button1.addActionListener(e -> System.out.println("Giriş başarılı!"));
        button1.addActionListener(e -> setEnabled(false));
        button2.setBounds(155,380,280,35);
        button2.setText("Şifremi Unuttum");
        button2.addActionListener(e -> System.out.println("Talebiniz alınmıştır!"));
        button2.addActionListener(e -> setEnabled(false));
        button3.setBounds(128,80,110,25);
        button3.setText("Hasta Girişi");
        button3.addActionListener(e -> System.out.println("Hasta Giriş Sayfası"));
        button4.setText("Doktor Girişi");
        button4.setBounds(230,80,110,25);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                    //Buton4'e tıklandığında doktor girişi sayfasına yönlendirir
                new DoktorGiris();
            }
        });

        JLabel label = new JLabel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        label.setText("HASTANE YÖNETİM SİSTEMİNE HOŞGELDİNİZ");
        label.setBounds(135,30,330,40);
        label.setForeground(Color.white);
        label.setFont(new Font("MV Boli", Font.PLAIN,15));
        label1.setText("TC Kimlik No :");
        label1.setBounds(143,164,150,40);
        label1.setForeground(Color.white);
        label1.setFont(new Font("MV Boli", Font.PLAIN,15));
        label2.setText("Şifre :");
        label2.setBounds(143,214,100,40);
        label2.setForeground(Color.white);
        label2.setFont(new Font("MV Boli", Font.PLAIN,15));


        JPanel panel = new JPanel();
        panel.setBackground(new Color(120,100,150));
        panel.setBounds(120,135,360,160);

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(120,100,150));
        panel1.setBounds(120,320,360,115);

        JTextField textField = new JTextField();
        JTextField textField1 = new JTextField();
        textField.setBounds(270,170,177,30);
        textField1.setBounds(270,220,177,30);

        JOptionPane optionPane = new JOptionPane();
        optionPane.setBounds(120,135,360,160);



        this.setTitle("Hastane Otomsyonu");
        this.setSize(600,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            //kapat tuşuna basınca tüm pencereleri kapat
        this.getContentPane().setBackground(new Color(110,120,150));     //frame arkaplan renk ayarı
        this.setVisible(true);              //frame'i görünür yap
        this.add(button);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(label);
        this.add(label1);
        this.add(label2);
        this.add(textField);
        this.add(textField1);
        this.add(panel);
        this.add(panel1);

    }

} */
