package com.demo1.dao;

import com.demo1.entity.Students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentsDao {
    //驱动
    String driver = "com.mysql.cj.jdbc.Driver";
    //连接地址
    String url = "jdbc:mysql://localhost:3306/school?useSSL=false";
    //账号、密码
    String username = "root";
    String password = "a123";


    //添加学生
    public int addStudent(String name,int age,String gender){
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,username,password);
            String sql = "insert into students values (null,?,?,?)";
            PreparedStatement psta = conn.prepareStatement(sql);
            psta.setString(1,name);
            psta.setInt(2,age);
            psta.setString(3,gender);

            int row = psta.executeUpdate();//针对增删改,返回影响行数
            return row;
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;//代表程序异常，添加失败
    }

    //查看学生
    public ArrayList<Students> getAllStudents(){
        ArrayList<Students> list = new ArrayList<>();
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url,username,password);
            String sql = "select * from students";
            PreparedStatement psta = conn.prepareStatement(sql);

            ResultSet set = psta.executeQuery();
            //持续向下移动游标，每指向一行，就要操作一行（获取每个列的数据，封装成一个学生对象，在添加到List中
            while(set.next()){
                int id = set.getInt(1);
                String name = set.getString(2);
                int age = set.getInt(3);
                String gender = set.getString(4);
                Students stu = new Students(id,name,age,gender);
                list.add(stu);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
