/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edutainment;

/**
 *
 * @author Drinkopi
 */
//Kelas bantuan untuk membuat JButton bulat
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

public class Edutainment implements Border {

    private int radius;

    //Konstruktor dengan parameter radius
    public Edutainment(int radius) {
        this.radius = radius;
    }

    //Menggambar border bulat
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }

    //Mengembalikan insets border
    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
    }

    //Mengembalikan true jika border transparan
    @Override
    public boolean isBorderOpaque() {
        return true;
    }
}
