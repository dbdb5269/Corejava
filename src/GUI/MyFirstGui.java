package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dubo on 16/9/22.
 */
public class MyFirstGui {
    private JFrame frame;
    private Container container;
    private JButton button;
    private JTextField num1;
    private JTextField num2;
    private JTextField result;
    private JLabel label1;
    private JLabel label2;

    public MyFirstGui(){
        //init components and container
        frame=new JFrame();
        container=frame.getContentPane();
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initGui();
    }

    private void initGui(){
        //set Layout
        FlowLayout flowLayout=new FlowLayout();
        container.setLayout(flowLayout);
        //add component
        num1=new JTextField();
        num2=new JTextField();
        result=new JTextField();
        result.setEnabled(false);
        label1=new JLabel("+");
        label2=new JLabel("=");
        button=new JButton("add");
        container.add(num1);
        container.add(label1);
        container.add(num2);
        container.add(label2);
        container.add(result);
        container.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a=Double.parseDouble(num1.getText());
                double b=Double.parseDouble(num2.getText());
                double c=a+b;
                result.setText(""+c);
            }
        });
    }
    public void go(){
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new MyFirstGui().go();

    }
}
