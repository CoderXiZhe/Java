package ks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Search extends JPanel {
    JPanel jPanel;
    JTextField jTextField;
    JTextArea jTextArea;
    JLabel jLabel;
    JButton jButton;
    public Search(){
        setLayout(new BorderLayout());
        init();
    }
    public void init() {
        jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());
        jTextField = new JTextField(15);
        jLabel = new JLabel("输入人员编号或姓名查询：");
        jButton = new JButton("查询");
        jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        jLabel.setFont(new Font("宋体",1,15));
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        add(jPanel,BorderLayout.NORTH);
        add(new JScrollPane(jTextArea),BorderLayout.CENTER);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jTextField.getText();
                ArrayList<String> result = new Bridge().show(" select * from people where 编号 = '"+s+"' or 姓名 = '"+s+"';");
                if (result.isEmpty()) {
                    jTextArea.setText("");
                    jTextArea.append("未查询到相关结果！\n");
                } else {
                    jTextArea.setText("");
                    jTextArea.setFont(new Font("楷体", 1, 20));
                    jTextArea.append("编号" + "\t" + "姓名" +"\t" + "性别" +"\t" + "年龄" + "\t" +"系部" +"\t"+"所在专业" + " \t" +"职称" +"\t" +
                            "实验室 "+"\t\t" + "职务" + "\t" +"面貌");
                    jTextArea.append("\n");
                    jTextArea.append("--------------------------------------------------------------------------------------------------------");
                    jTextArea.append("\n");
                    for (String s1: result) {
                        jTextArea.append(s1);
                        jTextArea.append("\n");

                    }
                }

            }
        });
    }
}
