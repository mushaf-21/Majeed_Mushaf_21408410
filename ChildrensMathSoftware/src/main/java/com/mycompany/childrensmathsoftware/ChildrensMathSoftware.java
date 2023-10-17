package com.mycompany.childrensmathsoftware;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Scanner;

public class ChildrensMathSoftware {
    public static String identifyShape(int numberOfSides) {
        if (numberOfSides < 3) {
            return "Number is too small";
        } else if (numberOfSides == 3) {
            return "Triangle";
        } else if (numberOfSides == 4) {
            return "Square";
        } else if (numberOfSides > 7) {
            return "Number is too big";
        } else {
            return "Invalid number of sides";
        }
    }

    public static void displayImage(String shapeName) {
        String imagePath = "ISEimages/" + shapeName + ".png";

        try {
            File imageFile = new File(imagePath);
            if (imageFile.exists()) {
                Image image = ImageIO.read(imageFile);

                // Display the image in a simple frame
                JFrame frame = new JFrame(shapeName);
                frame.setLayout(new FlowLayout());
                frame.setSize(300, 300);
                JLabel label = new JLabel(new ImageIcon(image));
                frame.add(label);
                frame.setVisible(true);
            } else {
                System.out.println("Image not found for " + shapeName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double calculateArea(int numberOfSides, double sideLength) {
        if (numberOfSides < 3) {
            return -1; // Invalid
        }

        double area = 0.0;
        if (numberOfSides == 3) { // Triangle
            area = (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
        } else if (numberOfSides == 4) { // Square
            area = Math.pow(sideLength, 2);
        } else if (numberOfSides == 5) { // Pentagon
            // Implement area calculation for pentagon
        } else if (numberOfSides == 6) { // Hexagon
            // Implement area calculation for hexagon
        } else if (numberOfSides == 7) { // Heptagon
            // Implement area calculation for heptagon
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberOfSides = scanner.nextInt();

        System.out.print("Enter the side length: ");
        double sideLength = scanner.nextDouble();

        scanner.close();

        String shape = identifyShape(numberOfSides);
        if (shape.equals("Invalid number of sides")) {
            System.out.println("Invalid number of sides.");
        } else {
            System.out.println("The shape with " + numberOfSides + " sides is a " + shape);
            double area = calculateArea(numberOfSides, sideLength);
            System.out.println("Area: " + area);

            // Display image if needed
            displayImage(shape);

            // Compare area with given situations and display messages
            double givenArea1 = 50.0;
            double givenArea2 = 80.0;

            if (area < givenArea1) {
                System.out.println("Area is too small.");
            } else if (area > givenArea2) {
                System.out.println("Area is too large.");
            } else {
                System.out.println("Area is within the child hand size.");
            }
        }
    }
}

