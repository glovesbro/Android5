/**
 * Created by 89294 on 2016/11/9.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestDeadLock {
    public static void main(String args []){
    //一次只有一名哲学家可以吃面条。。。。。。感觉这样做整个题都变简单了啦（滑稽）
        //我们假设哲学家们都是逗逼，他们开始了腥风血雨的抢筷子战争，而且必须只能拿自己两旁的筷子
        System.out.println("服务君说：“哲学家大大们可以抢筷子啦！谁先抢到一双筷子谁先吃，第二个抢到的不算哦。”");
       //定义面条总量
        for(int nul = 50;nul>=0;nul--) {

            //五名哲学家列表
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("哲学家1");
            arrayList.add("哲学家2");
            arrayList.add("哲学家3");
            arrayList.add("哲学家4");
            arrayList.add("哲学家5");

            //随机抽取一名哲学家吃面条
            Random random = new Random();
            int x = random.nextInt(arrayList.size());
            String s = arrayList.get(x);
            System.out.println(s+"被允许吃面条");


        }
        System.out.println("服务君说：“面条吃完了，可能有些哲学家大大还没吃多少呢......但这是你们自己的问题，我不管hhhhhh”");
        System.out.println("哲学家们：“我从未见过如此厚颜无耻之徒!!!”");


    }
}
