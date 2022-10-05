import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class MyJframe extends JFrame implements ActionListener {
    JButton yesBut = new JButton("非常帅");
    JButton midBut = new JButton("非常帅");
    JButton noBut = new JButton("非常帅");

    public MyJframe() throws HeadlessException {
        initJFrame();

        initView();

        this.setVisible(true);
    }

    private void initJFrame() {
        this.setSize(500,600);
        this.setTitle("恶搞好基友");
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setLayout(null);

    }
    private void initView(){
        this.getContentPane().removeAll();
        JLabel text = new JLabel("请选择");
        text.setFont(Font.getFont("微软雅黑"));
        text.setBounds(120,150,300,50);

        yesBut.setBounds(200,250,100,30);
        midBut.setBounds(200,325,100,30);
        noBut.setBounds(160,400,100,30);

        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        noBut.addActionListener(this);


        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(noBut);

        this.getContentPane().repaint();


    }
    public void showJDialog(String content){
        JDialog jDialog = new JDialog();
        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj =e.getSource();
        if(obj==yesBut){
            System.out.println("需要惩罚");
            showJDialog("需要惩罚");
        }else if(obj==midBut){
            System.out.println("需要惩罚");
            showJDialog("需要惩罚");
           // Runtime r =new run
        }else if(obj==noBut){

        }

    }
}
