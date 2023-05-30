package View;

import javax.swing.*;
import java.awt.*;

public class KayitOl {

    public KayitOl(){
        JFrame kayitframe = new JFrame();

//        JLabel kayitlabel = new JLabel();
//        kayitlabel.setText("Ad : ");
//        kayitlabel.setBounds(300,90,80,40);
//        kayitlabel.setFont(new Font("MV Boli", Font.PLAIN, 15));
//        kayitlabel.setForeground(Color.white);

        JPanel kayitpanel = new JPanel();
        kayitpanel.setBounds(120,135,360,160);
        kayitpanel.setForeground(new Color(120,100,150));
        kayitpanel.setVisible(true);



        //kayit ol sayfasında panel çalışmıyor
        //doktor ve süpervizör girişlerinde de paneller çalışmıyor
        //programı her çalıştırmada ilk sayfanın panellerinde farklılık oluyor
        //hasta ve süpervizör için de ayrı ayrı classlar oluşturulabilir okunabilirlik açısından




        kayitframe.setTitle("Hasta Kayıt Sayfası");
        kayitframe.setSize(600,500);
        kayitframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        kayitframe.getContentPane().setBackground(new Color(110,120,150));
        kayitframe.setVisible(true);
        //kayitframe.add(kayitlabel);
        kayitframe.add(kayitpanel);
    }
}
