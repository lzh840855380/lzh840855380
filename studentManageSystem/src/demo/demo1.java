package demo;


import domain.student;

import java.util.ArrayList;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<student> studentManageSystem = new ArrayList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---欢迎---");
            System.out.println("1添加学生");
            System.out.println("2删除学生");
            System.out.println("3修改学生");
            System.out.println("4查看学生");
            System.out.println("5退出");
            System.out.println("请输入你的选择");

            int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    addstu(studentManageSystem, sc);
                    break;
                case 2:
                    System.out.println("进行删除学生");
                    System.out.println("请输入名字");
                    String name2 = sc.next();
                    for (int i = 0; i < studentManageSystem.size(); i++) {
                        if(studentManageSystem.get(i).getName().equals(name2)) {
                            studentManageSystem.remove(i);
                            i--;
                            System.out.println("已移除");
                            break;
                        }else if(i == studentManageSystem.size() -1) {
                            System.out.println("您输入的学生系统不存在");
                        }
                    }

                    break;
                case 3:
                    System.out.println("进行修改学生");
                    System.out.println("您要修改第几个学生");
                    int stuNumber = sc.nextInt() - 1;
                    System.out.println("请输入修改名字");
                    String name3 = sc.next();
                    System.out.println("请输入年龄");
                    int age3 = sc.nextInt();
                    student stu3 = new student(name3, age3);
                    studentManageSystem.set(stuNumber,stu3);
                    break;
                case 4:
                    System.out.println("进行查看学生");
                    for (int i = 0; i < studentManageSystem.size(); i++) {
                        System.out.println("学生:" + studentManageSystem.get(i).getName() + "   " + "年龄:" + studentManageSystem.get(i).getAge());
                    }
                    break;
                case 5:
                    System.out.println("已返回主界面");
                    break;
                default:
                    System.out.println("您输入有误");
            }
        }
    }

    public static void addstu(ArrayList<student> studentManageSystem, Scanner sc) {
        System.out.println("进行添加学生");
        System.out.println("请输入名字");
        String name1 = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        student stu = new student(name1, age);
        studentManageSystem.add(stu);
        System.out.println("录入成功,返回主界面");
    }
}

