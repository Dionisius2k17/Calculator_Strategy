package com.co;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

public class WindowStrategy implements CalcStrategy{

    String s1;
    String s2;
    String s3;

    WindowStrategy(){
        s1 = s2 = s3 = "";
    }
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JTextField arg1;
    JTextField arg2;
    JTextArea res;
    static JFrame frame;
    JPanel panel;
    String text1;
    String text2;
    char operator;
    double result;
    @Override
    public void calc(){
        frame = new JFrame("Simple Calculator with Strategy Pattern");
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        WindowStrategy ws = new WindowStrategy();
        arg1 = new JTextField(70);
        arg2 = new JTextField(70);
        res = new JTextArea( "Here will be the result", 2, 50);
        arg1.setEditable(true);
        arg2.setEditable(true);
        res.setEditable(false);
        button1 = new JButton("+ ADD");
        button1.setPreferredSize(new Dimension(120, 80));
        button2 = new JButton("- SUBSTRACT");
        button2.setPreferredSize(new Dimension(120, 80));
        button3 = new JButton("* MULTIPLY");
        button3.setPreferredSize(new Dimension(120, 80));
        button4 = new JButton("/ DIVIDE");
        button4.setPreferredSize(new Dimension(120, 80));
        button5 = new JButton("% MODULO");
        button5.setPreferredSize(new Dimension(120, 80));
        button6 = new JButton("= EQUALS");
        button6.setPreferredSize(new Dimension(120, 80));
        panel = new JPanel();
        ActionListener al = new TestActionListener();
        button1.addActionListener(al);
        button2.addActionListener(al);
        button3.addActionListener(al);
        button4.addActionListener(al);
        button5.addActionListener(al);
        button6.addActionListener(al);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(arg1);
        panel.add(arg2);
        panel.add(res);
        frame.add(panel);
        frame.setSize(900,400);
        frame.show();
    }
    public class TestActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String text1 = arg1.getText();
            if (text1.length() <= 0 || text1.matches("[0-9.-]+") == false){
                System.out.println("One of the arguments or both of them is/are empty or not valid");
                System.exit(-1);
            }
            String text2 = arg2.getText();
            if (text2.length() <= 0 || text2.matches("[0-9.-]+") == false){
                System.out.println("One of the arguments or both of them is/are empty or not valid");
                System.exit(-1);
            }
            JButton btn = (JButton) e.getSource();
            if ((text1.charAt(0) >= '0' && text1.charAt(0) <= '9') || text1.charAt(0) == '.')
                s1 = text1;
            if ((text2.charAt(0) >= '0' && text2.charAt(0) <= '9') || text2.charAt(0) == '.')
                s2 = text2;
            double ar1;
            double ar2;
            double r = 0;
            ar1 =  Double.parseDouble(text1);
            ar2 =  Double.parseDouble(text2);

            if (e.getSource() == button1)
                operator = '+';
                //r = ar1 + ar2;
            if (e.getSource() == button2)
                operator = '-';
                //r = ar1 - ar2;
            if (e.getSource() == button3)
                operator = '*';
                //r = ar1 * ar2;
            if (e.getSource() == button4 && ar2 != 0)
                operator = '/';
                //r = ar1 / ar2;
            if (e.getSource() == button5 && ar2 != 0)
                operator = '%';
                //r = ar1 % ar2;
            if (e.getSource() == button6){
                if (operator == '+'){
                    r = ar1 + ar2;
                    res.setFont(new Font("Times New Roman", Font.ITALIC, 16));
                    res.setText("The operation is " + operator + " and the answer is " + r);
                    System.out.println("The result is " + r);
                }
                else if (operator == '-'){
                    r = ar1 - ar2;
                    res.setFont(new Font("Arial", Font.ITALIC, 16));
                    res.setText("The operation is " + operator + " and the answer is " + r);
                    System.out.println("The result is " + r);
                }
                else if (operator == '*'){
                    r = ar1 * ar2;
                    res.setFont(new Font("Courier New", Font.ITALIC, 16));
                    res.setText("The operation is " + operator + " and the answer is " + r);
                    System.out.println("The result is " + r);
                }
                else if (operator == '/' && ar2 != 0){
                    r = ar1 / ar2;
                    res.setFont(new Font("Georgia", Font.ITALIC, 16));
                    res.setText("The operation is " + operator + " and the answer is " + r);
                    System.out.println("The result is " + r);
                }
                else if (operator == '/' && ar2 == 0){
                        System.out.println("Division by zero is prohibited");
                        System.exit(-1);
                }
                else if (operator == '%' && ar2 != 0){
                    r = ar1 % ar2;
                    res.setFont(new Font("Verdana", Font.ITALIC, 16));
                    res.setText("The operation is " + operator + " and the answer is " + r);
                    System.out.println("The result is " + r);
                }
                else if (operator == '%' && ar2 == 0){
                    System.out.println("Division by zero is prohibited");
                    System.exit(-1);
                }
            }
        }
    }
}
