/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XImage;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author NGUYEN VAN TRUONG
 */
public class XImage {
    public static Image getAppIcon(){
        URL url = XImage.class.getResource("/Image/coffee-cup (1).png");
        return new ImageIcon(url).getImage();
    }
}
