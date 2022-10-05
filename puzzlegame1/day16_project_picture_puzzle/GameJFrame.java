package com.holicxxx.demo2.day16_project_picture_puzzle;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import static javax.swing.border.BevelBorder.*;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] data = new int [4][4];
    //记录空白位置
    int x=0;
    int y=0;
    String path ="image\\";
    int[][] win={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0},
    };
    int step =0;

    public GameJFrame(){
        initJFrame();
        initJMenuBar();
        //初始化图片
        initData();
        firstLoadImage("animal");
        initImage();


        this.setVisible(true);
    }


    private void initData() {
        int[] tempArr ={0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r =new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int num =r.nextInt(16);
            int temp=tempArr[num];
            tempArr[num]=tempArr[i];
            tempArr[i]=temp;
        }

//        int[][] two_dArr=new int[4][4]{};
        int index=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(tempArr[index]==0){
                    x=i;
                    y=j;

                }

                data[i][j]=tempArr[index];
                index++;

            }
        }

    }


    private void firstLoadImage(String a){
        Random r =new Random();
        if("animal".equals(a)){
            int seek = r.nextInt(8)+1;
            //"D:\\java_project\\java_code_day06\\image\\animal\\animal1\\1.jpg"
            //"D:\java_project\puzzlegame1\day16_project_picture_puzzle\image\animal\animal1\1.jpg"
            path=path+"animal\\animal"+seek+"\\";
        }else if("girl".equals(a)){
            int seek = r.nextInt(13)+1;
            path=path+"girl\\girl"+seek+"\\";
        }else if("sport".equals(a)){
            int seek = r.nextInt(10)+1;
            path=path+"sport\\sport"+seek+"\\";
        }

    }

    private void initImage() {
        this.getContentPane().removeAll();
        if(victory()){
            JLabel win =new JLabel(new ImageIcon("image\\win.png"));
            win.setBounds(203,283,197,73);
            this.getContentPane().add(win);
        }
        JLabel stepCount =new JLabel("步数:"+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = data [i][j];
                //创建一个图片对象
                //创建管理图片的对象
                JLabel jLabel = new JLabel(new ImageIcon((path+num+".jpg")));
                //指定位置

                jLabel.setBounds(105*j+83,105*i+134,105,105);
                jLabel.setBorder(new BevelBorder(LOWERED));
                //把管理对象添加到界面中
                //this.add(jLabel);
                this.getContentPane().add(jLabel);
            }

        }
//        "D:\\java_project\\puzzlegame1\\day16_project_picture_puzzle\\image\\background.png"
        JLabel background = new JLabel(new ImageIcon("image\\background.png"));
        background.setBounds(40,40,508,560);

        this.getContentPane().add(background);
        this.getContentPane().repaint();
    }

    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");
    JMenu changeImage = new JMenu("更换图片");
    JMenuItem girl = new JMenuItem("美女图片");
    JMenuItem animal = new JMenuItem("动物图片");
    JMenuItem sport =new JMenuItem("运动图片");
    private void initJMenuBar() {

        //初始化菜单
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //JMenu rechargeJMenu = new JMenu("充值");
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        functionJMenu.add(changeImage);

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603,680);
        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code =e.getKeyCode();
        if(code==65){
            this.getContentPane().removeAll();
            JLabel all=new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            JLabel background = new JLabel(new ImageIcon("image\\background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory()){
            return;
        }
        int code =e.getKeyCode();
        System.out.println(code);
        if (code == 37) {
            if(y==3){
                return;
            }
            //System.out.println("左移");
            data[x][y]=data[x][y+1];
            data[x][y+1]=0;
            y++;
            step++;
            initImage();
        }else if(code ==38){
            if(x==3){
                return;
            }
            //System.out.println("上移");
            data[x][y]=data[x+1][y];
            data[x+1][y]=0;
            x++;
            step++;
            initImage();
        }else if(code==39){
            if(y==0){
                return;
            }
            data[x][y]=data[x][y-1];
            data[x][y-1]=0;
            y--;
            step++;
            initImage();
        }else if(code ==40){
            if(x==0){
                return;
            }
            //System.out.println("下移");
            data[x][y]=data[x-1][y];
            data[x-1][y]=0;
            x--;
            step++;
            initImage();
        }else if(code == 65){
            initImage();
        }else if(code == 87){
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0},
            };
            initImage();
        }
      }

    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {

                if(data[i][j]!=win[i][j]){
                    return false;
                }


            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj==replayItem){
            initData();
            step=0;
            initImage();
        }else if(obj==reLoginItem){
            this.setVisible(false);
            new LoginJFrame();

        }else if(obj==closeItem){
            System.exit(0);
        }else if(obj==accountItem){
            JDialog jDialog=new JDialog();
            JLabel jLabel=new JLabel(new ImageIcon("image\\-7e7dc7ca7e75a7bb.jpg"));
            jLabel.setBounds(0,0,258,258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);

        }else if(obj==girl){
            initData();
            //改写path路径
            path="image\\";
            firstLoadImage("girl");
            initImage();
        }else if(obj==sport){
            initData();
            path="image\\";
            firstLoadImage("sport");
            initImage();
        }else if(obj==animal){
            initData();
            path="image\\";
            firstLoadImage("animal");
            initImage();
        }
    }
}


//ctrl+alt+left_mouse