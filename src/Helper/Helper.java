package Helper;

//mesajlar göndereceğimiz static metotlar tanımlayacağız. Bu metotlar yardımcı metotlardır ve çok sık kullanacağız.

import javax.swing.*;

public class Helper {
    public static void showMsg(String str){                      //str = dışarıdan girilen string
         String msg;
         switch (str){
             case "fill":                                       //fill : boşluk
                 msg = "Lütfen tüm alanları doldurunuz !";
                 break;
             default:
                 msg = str;
         }
        JOptionPane.showMessageDialog(null, msg, "Mesaj", JOptionPane.INFORMATION_MESSAGE);   //bir uyarı  mesajı yazdırılacağı belirtilmiştir.
    }
}
