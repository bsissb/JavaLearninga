package mineAPI;

/**
 * Created by hp on 2017/4/19.
 */
public enum Status {
    ACTIVE("可用",100),INACTIVE("不可用",-100); //枚举值列表
    private final String name;//final成员
    private final int value;//final成员
    Status(String name,int value){
        this.name = name;
        this.value = value;
    }
    @Override
    public String toString(){
        return name;
    }
    public int getValue(){
        return value;
    }
}
