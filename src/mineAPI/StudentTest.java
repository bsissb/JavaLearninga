package mineAPI;

public class StudentTest{
    public static void main(String[] args){
        Student stu = new Student("张三",16,'男',"高一（1）班");
        Student stu2 = new Student("李四",23,'女',"软件工程三年级");
        System.out.println(stu);
        System.out.println(stu2.toString());
    }
}