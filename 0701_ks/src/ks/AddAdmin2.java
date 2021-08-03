package ks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddAdmin2 extends JPanel  {
    JTextField jTextField1,jTextField2,jTextField3,jTextField4,jTextField5,jTextField6,jTextField7,jTextField8;
    JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8;
    JButton jButton;
    JComboBox jComboBox;
    public AddAdmin2() {
        setLayout(null);
        init();
    }
    public void init() {
        jTextField1 = new JTextField(15);
        jTextField2 = new JTextField(15);
        jComboBox = new JComboBox();
        jTextField4 = new JTextField(15);
        jTextField5 = new JTextField(15);
        jTextField6 = new JTextField(15);
        jTextField7= new JTextField(15);
        jTextField8= new JTextField(15);
        jLabel1 = new JLabel("输入人员编号:");
        jLabel2 = new JLabel("输入人员姓名:");
        jLabel3 = new JLabel("选择人员性别:");
        jLabel4 = new JLabel("输入人员年龄:");
        jLabel5 = new JLabel("输入人员所在系部:");
        jLabel6 = new JLabel("输入人员专业:");
        jLabel7 = new JLabel("输入人员职称:");
        jLabel8 = new JLabel("输入人员政治面貌:");
        jLabel1.setBounds(90,20,150,30);
        jLabel2.setBounds(90,60,150,30);
        jLabel3.setBounds(90,100,150,30);
        jLabel4.setBounds(90,140,150,30);
        jLabel5.setBounds(90,180,150,30);
        jLabel6.setBounds(90,220,150,30);
        jLabel7.setBounds(90,260,150,30);
        jLabel8.setBounds(90,300,150,30);
        jTextField1.setBounds(240, 20, 200, 30);
        jTextField2.setBounds(240, 60, 200, 30);
        jComboBox.setBounds(240, 100, 200, 30);
        jTextField4.setBounds(240, 140, 200, 30);
        jTextField5.setBounds(240, 180, 200, 30);
        jTextField6.setBounds(240, 220, 200, 30);
        jTextField7.setBounds(240, 260, 200, 30);
        jTextField8.setBounds(240, 300, 200, 30);
        jComboBox.addItem("男");
        jComboBox.addItem("女");
        jButton = new JButton("添加");
        jButton.setBounds(240,340,80,50);
        jButton.setFont(new Font("楷体", 1, 20));
        add(jLabel1);
        add(jTextField1);
        add(jLabel2);
        add(jTextField2);
        add(jLabel3);
        add(jComboBox);
        add(jLabel4);
        add(jTextField4);
        add(jLabel5);
        add(jTextField5);
        add(jLabel6);
        add(jTextField6);
        add(jLabel7);
        add(jTextField7);
        add(jLabel8);
        add(jTextField8);
        add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = jTextField1.getText();
                String name = jTextField2.getText();
                String gender = jComboBox.getSelectedItem().toString();
                String age = jTextField4.getText();
                String Xi = jTextField5.getText();
                String major = jTextField6.getText();
                String title = jTextField7.getText();
                String ZZMM = jTextField8.getText();
                String sql = "insert into people values('"+id+"','"+name+"','"+gender+"','"+age+"','"+Xi+"','"+major+"','"+title+"',null,null,'"+ZZMM+"');";
                if(id.length()==0||name.length()==0||gender.length()==0||age.length()==0||Xi.length()==0||major.length()==0||title.length()==0||ZZMM.length()==0) {
                    JOptionPane.showMessageDialog(null,"添加失败，信息不完整!","错误",JOptionPane.WARNING_MESSAGE);
                }else {
                    if (new Bridge().add(sql)) {
                        JOptionPane.showMessageDialog(null, "添加成功", "提示", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "添加失败！人员编号重复!", "错误", JOptionPane.WARNING_MESSAGE);
                    }

                }

            }
        });
    }


}
