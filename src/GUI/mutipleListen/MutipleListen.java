package GUI.mutipleListen;

/**
 * Created by dubo on 16/9/26.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class MutipleListen extends WindowAdapter implements MouseListener,MouseMotionListener{
    private JFrame frame;
    private Container containerPanel;
    private JLabel label1;
    private JLabel label2;
    private JPanel centrlPanel;


    public MutipleListen(){
        frame=new JFrame();
        containerPanel=frame.getContentPane();
        frame.setSize(800,500);
        frame.setLocation(50,50);
        initGui();
    }

    public void initGui(){
        containerPanel.setLayout(new BorderLayout(10,8));
        label1=new JLabel("Event:");
        label1.setFont(new Font("宋体",Font.BOLD,15));

        label2=new JLabel("Point:");
        label2.setFont(new Font("宋体",Font.BOLD,15));
        centrlPanel =new JPanel();
        centrlPanel.setBackground(Color.GREEN);
        centrlPanel.setLayout(new GridLayout(3,3,10,8));
        for(int i=0;i<8;i++){
            JTextField field=new JTextField();
            centrlPanel.add(field,i);
        }
        containerPanel.add(label1,BorderLayout.NORTH);
        containerPanel.add(label2,BorderLayout.SOUTH);
        containerPanel.add(centrlPanel,BorderLayout.CENTER);
        containerPanel.addMouseListener(this);
        containerPanel.addMouseMotionListener(this);
        frame.addWindowListener(this);
    }
    public void go(){
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MutipleListen().go();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label1.setText("Event:mouseClicked");
        label2.setText("Point:("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label1.setText("Event:mousePressed");
        label2.setText("Point:("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label1.setText("Event:mouseReleased");
        label2.setText("Point:("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label1.setText("Event:mouseEntered");
        label2.setText("Point:("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label1.setText("Event:mouseExited");
        label2.setText("Point:("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        label1.setText("Event:Mousedragged");
        label2.setText("Point:("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label1.setText("Event:mouseMoved");
        label2.setText("Point:("+e.getX()+","+e.getY()+")");
    }


    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window closing");
        System.exit(0);
    }


}
