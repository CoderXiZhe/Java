package ks;
import java.sql.*;
import java.util.ArrayList;
public class Bridge {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    public Bridge() {

    }
    public boolean add(String sql) {
        boolean addSuccess = false;
        //JDBC代码
            try {
                 Class.forName("com.mysql.jdbc.Driver");
                 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ks","root","333");
                 stmt = conn.createStatement();
                 if (0 != stmt.executeUpdate(sql)) {
                    return true;
                 }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                if (stmt != null) {
                    try {
                        stmt.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
        return addSuccess;
    }
    public ArrayList<String> show(String sql) {
        ArrayList<String> result = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ks","root","333");
            //String sql = "select * from people;";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String[] s = new String[10];
                String s2 = "";
                s[0] ="|"+ rs.getString("编号");
                s[1] = "|"+rs.getString("姓名");
                s[2] = "|"+rs.getString("性别");
                s[3] = "|"+rs.getString("年龄");
                s[4] = "|"+rs.getString("所在系部");
                s[5] = "|"+rs.getString("专业");
                s[6] = "|"+rs.getString("职称");
                s[7] = "|"+rs.getString("所在实验室");
                s[8] = "|"+rs.getString("职务");
                s[9] ="|"+ rs.getString("政治面貌");
                if(s[5].length()<5) {
                    s[5] = s[5] +"\t";
                }
                if(s[5].equals("|null")){
                   s[5]= s[5].replace("|null","|"+"\t");
                }

                if(s[7].equals("|null")){
                    s[7]= s[8].replace("|null","|"+"\t");
                }
                for(int i= 0;i <10;i++) {
                    s[i] = s[i].replace("|null","|");
                    s2 +=  s[i] + "\t";
                }
                String s3 = s2.replace("null","无");
                result.add(s2);
            }


        }catch (Exception e) {
                e.printStackTrace();
        }finally {
            if (ps!= null) {
                try {
                    ps.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return  result;
    }
        public int Sum(String s) {
            int count[] = new int[12];
            try {
                for(int i :count) {
                    i=0;
                }
                String s1[] = new String[10];
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ks","root","333");
                String sql = "select * from people;";
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    count[9]++;
                    s1[0] = rs.getString("性别");
                    if(s1[0].equals("男")){
                        count[0]++;//男
                    }else {
                        count[1]++;//女
                    }
                    s1[1] = rs.getString("专业")+"";
                    if(s1[1].equals("null")) {
                        count[3]++;//非教师
                    }
                    if(s1[1].equals("软件工程")) {
                        count[2]++;//软件工程
                    }
                    s1[2] = rs.getString("政治面貌")+"";
                    if(s1[2].equals("null")) {
                        count[4]++;//非行政
                    }
                    s1[3] = rs.getString("所在实验室")+"";
                    if(s1[3].equals("null")) {
                        count[5]++;//非实验员
                    }
                }

            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                if (ps!= null) {
                    try {
                        ps.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            }
            count[6] = count[9] - count[3];//教师总
            count[7] = count[9] - count[5];//实验人员数量
            count[8] = count[6] - (count[9] - count[4] - (count[5] - count[6]));//教师
            count[11] = count[6]  - count[8];//兼
            count[10] = count[5] - count[6];//行政
            if(s.equals("实验员")) {
                return count[7];
            }
            if(s.equals("教师人员")) {
                return count[8];
            }
            if(s.equals("行政人员")) {
                return count[10];
            }
            if(s.equals("教师兼行政人员")) {
               return count[11];
            }
            if(s.equals("男/女")) {
                return count[0];
            }
            if(s.equals("软件工程专业")) {
                return  count[2];
            }
            else return count[9];
        }
}
