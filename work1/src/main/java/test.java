import java.util.Scanner;
import factory.factory;
import factory.factorylmp;

public class test {
    public static void main(String args[]){
        System.out.println("请输入要绘制的图形\n" +
                "1：直线\n" +
                "2：矩形\n" +
                "3：圆形\n");
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        factory f = new factorylmp();
        f.create(n);
    }
}
