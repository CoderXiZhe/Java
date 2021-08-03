package ks;
import javax.swing.*;
public class MainFrame extends JFrame {
    public MainFrame() {
        super("高校人员信息管理系统    by 3200608081 李昊");
        init();
        setBounds(250,189,950,520);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void init() {
        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.add("添加教师人员",new AddTeacher());
        jTabbedPane.add("添加实验员",new AddTester());
        jTabbedPane.add("添加行政人员",new AddAdmin());
        jTabbedPane.add("添加教师兼行政人员",new AddAdmin2());
        jTabbedPane.add("删除",new Delete());
        jTabbedPane.add("查找",new Search());
        jTabbedPane.add("编辑",new Edit());
        jTabbedPane.add("显示",new Show());
        jTabbedPane.add("统计",new Sum());
        add(jTabbedPane);
    }
}
