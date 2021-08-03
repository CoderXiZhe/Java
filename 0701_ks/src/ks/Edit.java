package ks;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Edit extends JPanel  {
    JLabel jLabel1,jLabel2,jLabel3;
    JTextField jTextField1,jTextField2;
    JComboBox jComboBox;
    JButton jButton;
    public Edit() {
        setLayout(null);
        init();
    }

    public void init() {
        jLabel1 = new JLabel("输入修改人员的编号：");
        jLabel2 = new JLabel("选择修改的字段：");
        jLabel3 = new JLabel("输入修改后的内容：");
        jButton = new JButton("修改");

        jTextField1 = new JTextField(15);
        jTextField2 = new JTextField(15);
        jComboBox = new JComboBox();

        jLabel1.setBounds(90,20,150,30);
        jLabel2.setBounds(90,70,150,30);
        jLabel3.setBounds(90,120,150,30);

        jTextField1.setBounds(230,20,150,30);
        jTextField2.setBounds(230,120,150,30);
        jComboBox.setBounds(230,70,150,30);
        jButton.setBounds(180,170,60,30);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = jTextField1.getText();
                String s1 = jComboBox.getSelectedItem().toString();
                String s2 = jTextField2.getText();
                String sql = "update people set "+s1+" = '"+s2+"' where 编号= "+id+";";
                if (new Bridge().add(sql)) {
                    JOptionPane.showMessageDialog(null, "修改成功", "提示", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "修改失败！人员不存在!", "错误", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        jComboBox.addItem("编号");
        jComboBox.addItem("姓名");
        jComboBox.addItem("性别");
        jComboBox.addItem("年龄");
        jComboBox.addItem("所在系部");
        jComboBox.addItem("专业");
        jComboBox.addItem("职称");
        jComboBox.addItem("所在实验室");
        jComboBox.addItem("职务");
        jComboBox.addItem("政治面貌");
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jTextField1);
        add(jComboBox);
        add(jTextField2);
        add(jButton);
    }
}

