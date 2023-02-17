import java.util.*;
//变量
public class Var {
  public static void main(String[] args) {
      //声明变量
      int a;//int代表整数服
      a = 100;//将a赋予值100
      System.out.println(a);//打印a的变量值
       //还这样使用
       int b = 800;//将b赋予值800
       System.out.println(b);
        //记录信息
       int i = 199;//输出整数
       double score = 222.2;//浮点型，写入小数
       char gender = '男';//字符型，写入文字
       String name = "jack";//字符型
       System.out.println("个人信息");
       System.out.println(i);
       System.out.println(score);
       System.out.println(gender);
       System.out.println(name);
       /*ver detail 变量细节
       System.out.println(a);
       int a = 1;
       错误，正确如下*/
       int ak= 100;
       System.out.println(ak);
       /*同类型不能执行不同类
       int ll = "jack";	这是String字符类的输出，你可以交给int整数类
       System.out.println(ll);
       正确如下*/
       int ll = 123;
       System.out.println(ll);
       /*类名不能和之前重名，例如
       int ak = 1900;
       System.out.println(ak);
       因为上面已经有一个ak名称，所以会报错，正确如下*/
       int ah = 1900;
       System.out.println(ah);
       //只需换一个名即可
 }
}