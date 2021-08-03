package ks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class Show extends JPanel {

    JButton jButton;
    JTextArea jTextArea;
    public Show() {
        setLayout(new BorderLayout());
        init();
    }
    public void init() {

        jButton = new JButton("显示");
        jTextArea = new JTextArea();
        jTextArea.setEditable(false);
        add(jButton,BorderLayout.NORTH);
        add(new JScrollPane(jTextArea),BorderLayout.CENTER);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> result = new Bridge().show("select * from people;");
                if (result.isEmpty()) {
                    jTextArea.append("未查询到相关结果！\n");
                } else {
                    jTextArea.setText("");
                    jTextArea.setFont(new Font("楷体", 1, 20));
                    jTextArea.append("编号" + "\t" + "姓名" +"\t" + "性别" +"\t" + "年龄" + "\t" +"系部" +"\t"+"所在专业" + " \t" +"职称" +"\t" +
                            "实验室 "+"\t\t" + "职务" + "\t" +"面貌");
                    jTextArea.append("\n");
                    jTextArea.append("--------------------------------------------------------------------------------------------------------");
                    jTextArea.append("\n");

                    for (String s : result) {
                        jTextArea.append(s);
                        jTextArea.append("\n");

                    }
                }
            }
        });
    }
}
