import common.*;
/*
        *@Description:定义Num类，提供计算器的两个数,提供加减乘除运算
        *@Param: double x,double y
        *@return:计算解雇 result
        *@Author:x.
        *@Date:20221028
        */
public class Num {
    double x,y;//类的属性

    //构造函数,通过这个函数，给实例赋值
    public Num(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double Add(double x,double y){
        return x+y;
    }
    public double Subtrat(double x,double y){
        //result=x-y;
        return x-y;
    }
    public double Multiply(double x,double y){
        //result=x*y;
        return x*y;
    }
    public double Divide(double x,double y){

        //result=x/y;
        return x/y;
    }


}
