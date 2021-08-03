package ks;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Delete extends JPanel {
    JTextField jTextField1;
    JLabel jLabel;
    JButton jButton;
    public Delete() {
        setLayout(null);
        init();
    }
    public void init() {
        jTextField1 = new JTextField(15);
        jButton = new JButton("删除");
        jLabel = new JLabel("输入人员编号或姓名删除：");
        jLabel.setBounds(100,20,200,30);
        jTextField1.setBounds(280,20,200,30);
        jButton.setBounds(490,15,60,40);
        add(jLabel);
        add(jTextField1);
        add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jTextField1.getText();
                String sql = " delete from people where 编号 = '"+s+"' or 姓名 = '"+s+"' ;";
                if(new Bridge().add(sql)) {
                    JOptionPane.showMessageDialog(null, "删除成功", "提示", JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,"删除失败！记录为空!","错误",JOptionPane.WARNING_MESSAGE);
                }
            }
        });

    }
}
