//------------------------------------------CALCULATOR PROJECT----------------------------------------------------------
package CALCULATE;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    JTextArea textArea=new JTextArea(2,12);
    JButton button1 =new JButton();
    JButton button2 =new JButton();
    JButton button3 =new JButton();
    JButton button4 =new JButton();
    JButton button5 =new JButton();
    JButton button6 =new JButton();
    JButton button7 =new JButton();
    JButton button8 =new JButton();
    JButton button9 =new JButton();
    JButton button0 =new JButton();
    JButton buttonadd =new JButton();
    JButton buttonsub =new JButton();
    JButton buttonmul =new JButton();
    JButton buttondiv =new JButton();
    JButton buttonclear =new JButton();
    JButton buttondot =new JButton();
    JButton buttonequal =new JButton();

    double num1,num2,result;
    int addc=0,subc=0,mulc=0,divc=0;
    public calculator()
    {
        //--------LAYOUT--------
        frame.setSize(400,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setName("CALCULATOR");
        frame.setResizable(true);
        frame.add(panel);
        panel.setBackground(Color.white);
        Border border=BorderFactory.createLineBorder(Color.green,6);
        panel.add(textArea);
        textArea.setBackground(Color.black);
        textArea.setBorder(border);
        Border tborder=BorderFactory.createLineBorder(Color.red,3);
        textArea.setBorder(tborder);
        Font font= new Font("ariel",Font.BOLD,30);
        textArea.setFont(font);
        textArea.setForeground(Color.white);
        textArea.setPreferredSize(new Dimension(2,12));
        textArea.setLineWrap(true);
        //-------BUTTON---------
        button1.setPreferredSize(new Dimension(100,40));
        button1.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\button1.png"));
        button2.setPreferredSize(new Dimension(100,40));
        button2.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\button2.png"));
        button3.setPreferredSize(new Dimension(100,40));
        button3.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\button3.png"));
        button4.setPreferredSize(new Dimension(100,40));
        button4.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\button4.png"));
        button5.setPreferredSize(new Dimension(100,40));
        button5.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\button5.png"));
        button6.setPreferredSize(new Dimension(100,40));
        button6.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\button6.png"));
        button7.setPreferredSize(new Dimension(100,40));
        button7.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\button7.png"));
        button8.setPreferredSize(new Dimension(100,40));
        button8.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\button8.png"));
        button9.setPreferredSize(new Dimension(100,40));
        button9.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\button9.png"));
        button0.setPreferredSize(new Dimension(100,40));
        button0.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\button0.png"));
        buttonadd.setPreferredSize(new Dimension(100,40));
        buttonadd.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\buttonadd.png"));
        buttonsub.setPreferredSize(new Dimension(100,40));
        buttonsub.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\buttonsub.png"));
        buttonmul.setPreferredSize(new Dimension(100,40));
        buttonmul.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\buttonmul.png"));
        buttondiv.setPreferredSize(new Dimension(100,40));
        buttondiv.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\buttondiv.png"));
        buttonequal.setPreferredSize(new Dimension(100,40));
        buttonequal.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\buttonequal.png"));
        buttonclear.setPreferredSize(new Dimension(100,40));
        buttonclear.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\buttonclear.png"));
        buttondot.setPreferredSize(new Dimension(100,40));
        buttondot.setIcon(new ImageIcon("C:\\Users\\KIIT\\IdeaProjects\\Calculator\\Caculator Buttons\\buttondot.png"));
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(buttonadd);
        panel.add(buttonsub);
        panel.add(buttonmul);
        panel.add(buttondiv);
        panel.add(buttonequal);
        panel.add(buttonclear);
        panel.add(buttondot);

        button1.addActionListener((ActionListener) this);
        button2.addActionListener((ActionListener) this);
        button3.addActionListener((ActionListener) this);
        button4.addActionListener((ActionListener) this);
        button5.addActionListener((ActionListener) this);
        button6.addActionListener((ActionListener) this);
        button7.addActionListener((ActionListener) this);
        button8.addActionListener((ActionListener) this);
        button9.addActionListener((ActionListener) this);
        button0.addActionListener((ActionListener) this);
        buttonadd.addActionListener((ActionListener) this);
        buttonsub.addActionListener((ActionListener) this);
        buttonmul.addActionListener((ActionListener) this);
        buttondiv.addActionListener((ActionListener) this);
        buttonequal.addActionListener((ActionListener) this);
        buttonclear.addActionListener((ActionListener) this);
        buttondot.addActionListener((ActionListener) this);

    }
    public void actionPerformed(ActionEvent e )
    {
        Object source=(Object) e.getSource();
        if(source==buttonclear)
        {
            num1=0.0;
            num2=0.0;
            textArea.setText("");

        }
        if(source==button1)
        {
            textArea.append("1");
        }
        if(source==button2)
        {
            textArea.append("2");
        }
        if(source==button3)
        {
            textArea.append("3");
        }
        if(source==button4)
        {
            textArea.append("4");
        }
        if(source==button5)
        {
            textArea.append("5");
        }
        if(source==button6)
        {
            textArea.append("6");
        }
        if(source==button7)
        {
            textArea.append("7");
        }
        if(source==button8)
        {
            textArea.append("8");
        }
        if(source==button9)
        {
            textArea.append("9");
        }
        if(source==button0)
        {
            textArea.append("0");
        }
        if(source==buttondot)
        {
            textArea.append(".");
        }
        if(source==buttonadd)
        {
            num1=number_reader();
            textArea.setText("");
            addc=1;
            divc=0;
            mulc=0;
            subc=0;
        }
        if(source==buttonsub)
        {
            num1=number_reader();
            textArea.setText("");
            addc=0;
            divc=0;
            mulc=0;
            subc=1;
        }
        if(source==buttonmul)
        {
            num1=number_reader();
            textArea.setText("");
            addc=0;
            divc=0;
            mulc=1;
            subc=0;
        }
        if(source==buttondiv)
        {
            num1=number_reader();
            textArea.setText("");
            addc=0;
            divc=1;
            mulc=0;
            subc=0;
        }
        if(source==buttonequal)
        {
            num2=number_reader();
            if(addc>0)
            {
                result=num1+num2;
                textArea.setText(Double.toString(result));
            }
            if(subc>0)
            {
                result=num1-num2;
                textArea.setText(Double.toString(result));

            }
            if(mulc>0)
            {
                result=num1*num2;
                textArea.setText(Double.toString(result));

            }
            if(divc>0)
            {
                result=num1/num2;
                textArea.setText(Double.toString(result));

            }

        }


    }
    public double number_reader()
    {
        double n1;
        String text;
        text=textArea.getText();
        n1=Double.valueOf(text);
        return n1;
    }


}
