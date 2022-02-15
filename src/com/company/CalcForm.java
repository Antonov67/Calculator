package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcForm extends JFrame{
    private JPanel rootPanel;
    private JTextField tabloField;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a0Button;
    private JButton ravnoButton;
    private JButton plusButton;
    private JButton umnogenieButton;
    private JButton delenieButton;
    private JButton minusButton;
    private JButton CEButton;
    private JButton pointButton;
    //наши переменные
    static String operation;
    static double a,b;
    static String aText="", bText="";
    static int number = 1;
    static boolean isFinish = false;



    //конструктор
    public CalcForm(){
        setLocation(300,300);
        setTitle("Калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        //кнопка очистки
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabloField.setText("");
            }
        });

        //внутренний класс для кнопок цифр
        class NumberButtonActionListener implements ActionListener{
            String numberText;

            //конструктор
            public NumberButtonActionListener(String numberText) {
                this.numberText = numberText;
            }
            @Override
            public void actionPerformed(ActionEvent e) {
                if (number == 1){
                    if (isFinish){
                        tabloField.setText("");
                        isFinish = false;
                    }
                    aText += numberText;
                    a = Double.parseDouble(aText);
                }
                else {
                    bText += numberText;
                    b = Double.parseDouble(bText);
                }
                tabloField.setText(tabloField.getText() + numberText);
            }

        }
        //кнопки цифр
        a1Button.addActionListener(new NumberButtonActionListener("1"));
        a2Button.addActionListener(new NumberButtonActionListener("2"));
        a3Button.addActionListener(new NumberButtonActionListener("3"));
        a4Button.addActionListener(new NumberButtonActionListener("4"));
        a5Button.addActionListener(new NumberButtonActionListener("5"));
        a6Button.addActionListener(new NumberButtonActionListener("6"));
        a7Button.addActionListener(new NumberButtonActionListener("7"));
        a8Button.addActionListener(new NumberButtonActionListener("8"));
        a9Button.addActionListener(new NumberButtonActionListener("9"));
        a0Button.addActionListener(new NumberButtonActionListener("0"));


    }
}