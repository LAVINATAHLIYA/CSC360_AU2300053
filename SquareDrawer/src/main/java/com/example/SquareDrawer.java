package com.example;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Polygon;

public class SquareDrawer extends JPanel {

    public SquareDrawer() {
        // Set a sleek dark background color for a premium look
        setBackground(new Color(24, 24, 37));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        // Enable anti-aliasing for smooth outlines and shapes
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // 1. Blue Square (top-left)
        g2d.setColor(new Color(137, 180, 250)); // Soft Pastel Blue
        g2d.fillRect(50, 50, 150, 150);

        // 2. Red Circle/Oval (top-center)
        g2d.setColor(new Color(243, 139, 168)); // Soft Pastel Red/Pink
        g2d.fillOval(275, 50, 150, 150);

        // 3. Purple Rounded Rectangle (top-right)
        g2d.setColor(new Color(203, 166, 247)); // Soft Pastel Purple
        g2d.fillRoundRect(500, 50, 150, 150, 30, 30);

        // 4. Green Triangle (bottom-left)
        g2d.setColor(new Color(166, 227, 161)); // Soft Pastel Green
        int[] triX = {125, 50, 200};
        int[] triY = {250, 400, 400};
        g2d.fillPolygon(triX, triY, 3);

        // 5. Golden Star (bottom-center)
        g2d.setColor(new Color(249, 226, 175)); // Soft Pastel Yellow/Gold
        int cx = 350;
        int cy = 325;
        int[] starX = new int[10];
        int[] starY = new int[10];
        for (int i = 0; i < 10; i++) {
            double angle = i * Math.PI / 5 - Math.PI / 2;
            double r = (i % 2 == 0) ? 75 : 30;
            starX[i] = cx + (int) (r * Math.cos(angle));
            starY[i] = cy + (int) (r * Math.sin(angle));
        }
        g2d.fillPolygon(starX, starY, 10);

        // 6. Turquoise Hexagon (bottom-right)
        g2d.setColor(new Color(148, 226, 213)); // Soft Pastel Teal/Turquoise
        int hexCx = 575;
        int hexCy = 325;
        int[] hexX = new int[6];
        int[] hexY = new int[6];
        for (int i = 0; i < 6; i++) {
            double angle = i * Math.PI / 3;
            hexX[i] = hexCx + (int) (75 * Math.cos(angle));
            hexY[i] = hexCy + (int) (75 * Math.sin(angle));
        }
        g2d.fillPolygon(hexX, hexY, 6);
    }

    public static void main(String[] args) {
        // Create the application frame
        JFrame frame = new JFrame("Beautiful Shapes Showcase");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 500);
        
        // Add the drawing panel to the frame
        SquareDrawer panel = new SquareDrawer();
        frame.add(panel);
        
        // Center the window on the screen and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
