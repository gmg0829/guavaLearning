package math;

import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;

import java.math.RoundingMode;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/7/11  11:12
 */
public class MathUtil {

    public static void main(String[] args) {
        IntMath.checkedAdd(1,2);//加
        IntMath.checkedSubtract(1,2);//减
        IntMath.checkedMultiply(1,2);//乘
        IntMath.divide(2,1, RoundingMode.DOWN);//除 需要指定舍入格式
        IntMath.checkedPow(1,2);//次方
        IntMath.gcd(3,2);//最大公约数
        IntMath.mod(3, 5);//取模
        IntMath.pow(3, 5);//取幂
        IntMath.isPowerOfTwo(4);//是否2的幂
        IntMath.factorial(7);//阶乘
        IntMath.binomial(4, 3);//二项式系数
        //浮点数运算JDK的Math包已经涵盖比较全面 但是guava依旧提供了一些方法
        DoubleMath.isMathematicalInteger(4.0);//判断该浮点数是不是一个整数
        DoubleMath.roundToInt(3.14,RoundingMode.DOWN);//    舍入为int；对无限小数、溢出抛出异常同理tolong，toBigInteger
        DoubleMath.log2(3.14, RoundingMode.DOWN);//2的浮点对数，并舍入为int
    }
}
