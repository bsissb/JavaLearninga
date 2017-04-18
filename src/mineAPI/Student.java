package mineAPI;

/**
 * Created by hp on 2017/4/18.
 */
public class Student {
    private String name;//姓名
    private int age;
    private char gender; //性别
    private String grade;

    @Override
    public boolean equals(Object obj){  //覆盖的equals方法
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Student other = (Student)obj;
        if ((this.name==null)?(other.name!=null):!this.name.equals(other.name)){
            return false;
        }
        if (this.age !=other.age) return false;
        if (this.gender != other.gender) return false;
        if ((this.grade==null)?(other.grade!=null):!this.grade.equals(other.grade)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 17 * hash + (this.name!=null?this.name.hashCode():0);
        hash = 17 * hash +this.age;
        hash = 17 * hash + this.gender;
        hash = 17 * hash + (this.grade!=null?this.grade.hashCode():0);
        return hash;
    }
}
