package linklist;

/**
 * 递归函数执行顺序
 *
 * 递归函数中，位于递归调用前的语句和各级被调用函数具有相同的执行顺序； 递归函数中，位于递归调用后的语句的执行顺序和各个被调用函数的顺序相反
 *
 * @author gl
 * @create 2018-08-21 20:11
 **/
public class RecursiveTest {
    public static void main(String[] args) {
        num(2, 5);
    }

    static void num(int n, int m) {
        System.out.println("before:" + n);
        if (n < m) {
            num(n + 1, m);
            System.out.println("after:" + n);
        }
    }

    /**
     * before:2
     *before:3
     *before:4
     *before:5
     *after:4
     *after:3
     *after:2
     */
}
