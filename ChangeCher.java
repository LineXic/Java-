import java.util.*;
// 转义字符
public class ChangeCher {
  public static void main(String[] args) {
    //       \t制表位，实现对齐
    System.out.println("北京\t天津\t上海");
  //          \n换行符
   System.out.println("红楼梦\n作者：曹雪芹");
   //          \\转义，输出一个斜杠
   System.out.println("火蝾螈社团\\群聊");
   //            \"输出双引号
   System.out.println("\"好好学习Java，加油\"");
    //           \'单引号输出
    System.out.println("\'加油\'");
    //            \r回到当前行的行首，而不会换到下一行，如果接着输出的话，本行以前的内容会被逐一覆盖
    System.out.println("我的\r世界"); 
    //课堂练习(ChangeCher exercise)
    System.out.println("书名\t 作者\t 价格\t销量\n三国\t罗贯中\t120\t1000");        
  }
}
