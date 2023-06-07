/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package help;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.lang.Thread.sleep;
import java.text.DateFormat;
import java.text.Normalizer;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;

public class helper {
    
    static SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
    
    public static boolean isPassword(String password) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        Pattern p = Pattern.compile(regex);

        if (password == null) {
            return false;
        }
        Matcher m = p.matcher(password);

        return m.matches();
    }

    public static boolean isEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public static boolean isUsername(final String username) {
        String USERNAME_PATTERN
                = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    public static String getDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static boolean isBarcode(String username) {
        String USERNAME_PATTERN
                = "\\d+";
        Pattern pattern = Pattern.compile(USERNAME_PATTERN);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    public static void setTextFieldMoney(JTextField txt) {
        String txtGiaBan = txt.getText();
        long tienLuong = SoLong(txtGiaBan);
        txt.setText(SoString(tienLuong));
    }

    public static boolean isFullname(String str) {
        String input = removeAccent(str);
        String regx = "^([a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđĐ]+)((\\s{1}[a-vxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ]+){1,})$";
        Pattern pattern = Pattern.compile(regx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    public static String removeAccent(String s) {

        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("");
    }

    public static void setTableTextCenter(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount() - 1; i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public static void setTableTextCenterFullColumn(JTable table) {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public static boolean isNumberPhone(String str) {
        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

        // Kiem tra dinh dang
        boolean kt = str.matches(reg);
        try {
            if (kt == false) {
                return false;
            } else {

                return true;
            }
        } catch (Exception e) {
        }
        return true;
    }

    public static String LayNgayString(Date date, String Format) {
        DateFormat dateFormat = new SimpleDateFormat(Format);
        return dateFormat.format(date);
    }

    //Hàm chuyển String -> Date
    public static Date LayNgayDate(String ngay, String Format) {
        DateFormat dateFormat = new SimpleDateFormat(Format);
        try {
            return dateFormat.parse(ngay);
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển ngày");
            return null;
        }
    }

    //Chuyển đổi số Double <-> String 10.000.000
    //Hàm chuyển Double -> String
    public static String LongToString(double so) {
        return NumberFormat.getNumberInstance().format(so);
    }

    //Hàm chuyển String -> Double
    public static double StringToLong(String so) {
        try {
            return NumberFormat.getNumberInstance().parse(so).doubleValue();
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển số");
            return 0;
        }
    }

    public static String SoString(long so) {
        return NumberFormat.getNumberInstance().format(so);
    }

    //Hàm chuyển String -> Double
    public static long SoLong(String so) {
        try {
            return NumberFormat.getNumberInstance().parse(so).longValue();
        } catch (ParseException ex) {
            System.out.println("Lỗi chuyển số");
            return 0;
        }
    }
    
    public static void clock(JLabel lbTime) {
        Thread clock = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Date t = new Date();
                        lbTime.setText(ft.format(t));
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        System.out.println("hihih");
        clock.start();

    }
    
    public static void setImageLabel(JLabel label, String fileName) {
        try {
            BufferedImage image = ImageIO.read(new File(fileName));
            int w = label.getSize().width;
            int h = label.getSize().height;
            int iw = image.getWidth();
            int ih = image.getHeight();
            int dw = 0;
            int dh = 0;
            if (w / h > iw / ih) {
                dh = h;
                dw = dh * iw / ih - 10;
            } else {
                dw = w;
                dh = dw * ih / iw - 10;
            }
            ImageIcon icon = new ImageIcon(image.getScaledInstance(dw, dh,
                    Image.SCALE_SMOOTH));
            label.setIcon(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static boolean ktraRong(JTextField txt) {
        if (txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, txt.getName() + " không được rỗng", "Thông báo", 1);
            txt.requestFocus();
            return true;
        }
        return false;
    }
    
    public static String writeFile(String tenFile, String noiDungFile) {
        try {
            File file = new File("src\\file\\" + tenFile + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(noiDungFile);
            bw.close();
            fw.close();
        } catch (Exception e) {
            return null;
        }
        return "";
    }

    public static void openFile(String tenFile) {
        try {
            ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "src/file/" + tenFile + ".txt");
            pb.start();
        } catch (IOException ex) {
        }
    }

}
