package ks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Sum extends JPanel {
    JPanel jPanel;
    JLabel jLabel;
    JButton jButton;
    JTextArea jTextArea;
    JComboBox jComboBox;
    public Sum() {
        setLayout(new BorderLayout());
        init();
    }
    public void init() {
        jComboBox = new JComboBox();
        jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        jLabel = new JLabel("选择关键字：");
        jButton = new JButton("点击统计");
        jPanel = new JPanel();
        jComboBox.addItem("人员总数");
        jComboBox.addItem("教师人员");
        jComboBox.addItem("实验员");
        jComboBox.addItem("行政人员");
        jComboBox.addItem("教师兼行政人员");
        jComboBox.addItem("男/女");
        jComboBox.addItem("软件工程专业");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(jLabel);
        jPanel.add(jComboBox);
        jPanel.add(jButton);
        add(jPanel,BorderLayout.NORTH);
        add(jTextArea,BorderLayout.CENTER);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText("");
                jTextArea.setFont(new Font("楷体", 1, 20));
                String s = jComboBox.getSelectedItem().toString();
                int count1 = new Bridge().Sum("员工总数");
                int count = new Bridge().Sum(s);
                if(s.equals("男/女")) {
                    int count2 = count1 - count;
                    jTextArea.setText("男员工总人数为："+count+",女员工总人数:"+count2+"");

                }else{
                    jTextArea.setText(""+s+"总人数为:"+count+"");
                }
            }
        });
    }
}
