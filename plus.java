import java.util.*;
//加号的使用
public class plus {
  public static void main(String[] args) {
    System.out.println("100"+98);//字符串100代表幺零零
    System.out.println(100+98);//整体
    System.out.println(100+3+"hello");//前面整体先相加，输出103hello
    System.out.println("hello"+100+3);//先运行整体hello，然后是引号内100+3
    //运算顺序是从左到右的
  }
}
