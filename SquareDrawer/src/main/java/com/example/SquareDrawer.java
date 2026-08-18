package com.example;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class SquareDrawer extends JPanel {

    public SquareDrawer() {
        // Set a sleek dark background color for a premium look
        setBackground(new Color(24, 24, 37));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        // Enable anti-aliasing for smooth lines
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the color for the square outline and line
        g2d.setColor(new Color(137, 180, 250)); // Soft Pastel Blue

        // Draw a square outline (x, y, width, height)
        g2d.drawRect(100, 100, 200, 200);
    }

    public static void main(String[] args) {
        // Create the application frame
        JFrame frame = new JFrame("Simple Square Outline");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        // Add the drawing panel to the frame
        SquareDrawer panel = new SquareDrawer();
        frame.add(panel);
        
        // Center the window on the screen and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
