package com.demo1.ui;

import com.demo1.dao.StudentsDao;
import com.demo1.entity.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class StartProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentsDao dao = new StudentsDao();
        while(true){
            System.out.println("请选择操作：");
            System.out.println("1.添加学生");
            System.out.println("2.查看所有学生");
            System.out.println("3.退出");
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("请输入姓名：");
                String name = scanner.next();
                System.out.println("请输入年龄：");
                int age = scanner.nextInt();
                System.out.println("请输入性别：");
                String gender = scanner.next();

                //调用StudentsDao里的添加方法
                //传入姓名、年龄、性别，得到是否成功添加的依据
                int row = dao.addStudent(name,age,gender);
                //根据依据，显示正确的语句
                if(row>0){
                    System.out.println("添加成功");
                }else{
                    System.out.println("添加失败");
                }

            }else if(choice == 2){
                //alt+回车
                ArrayList<Students> list = dao.getAllStudents();
                System.out.println("所有学生信息：");
                for(int i=0 ; i<list.size() ; i++){
                    Students s = list.get(i);
                    System.out.println(s);
                }
            }else{
                System.out.println("退出程序");
                break;
            }
        }
    }
}
