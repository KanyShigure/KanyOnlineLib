import java.math.BigDecimal;

/**
 * 有关数学的相关API，不包含一些更具体的引用.
 * @author Kaminy
 * @version 1.0
 */
public class MathManger{
    /**
     * 给定一个百分计的概率，进行一次判定，返回判定的结果.
     * 不需要添加百分号(%).<br/>
     * 通过Math类中的方法，生成随机数来实现.<br/>
     * @param num 概率
     * @return true或false
     * @since 1.0
     */
    public static boolean chance(double num) {
        if (java.lang.Math.random() >= 0.01 * num) {
            return true;
        }
        return false;
    }
    /**
     * 给定一个最大值，在范围[1,给定值]中生成随机整数并返回.<br/>
     * 通过Math类中的方法，生成随机数来实现.<br/>
     * 该方法也可用于生成随机数的数字部分.
     * @param num 给定生成最大值
     * @param C 如果为true，生成数的最小值会是0而非1
     * @return 生成的随机数
     * @since 1.0
     */
    public static int randomInt(int num, boolean C) {
        int result;
        if (C) {
            result = (int) (java.lang.Math.random() * (num + 1));
        } else {
            result = (int) ((java.lang.Math.random() * num) + 1);
        }
        return result;
    }
    /**
     * 给定一个有效数字，再输入一个有效整数，四舍五入保留小数，其整数的部分不会改变.<br/>
     * 在处理转化时会将输入的数字转化为double类型，可能会产生数值溢出.<br/>
     * 通过BigDecimal类中的方法来实现.
     * @param number 给定有效数字，可以是任何数字类型
     * @param digits 要保留的小数位数
     * @return 四舍五入保留后的结果，类型为double
     * @since 1.0
     */
    public static double toFixed(Number number,int digits){
        BigDecimal b = new BigDecimal(number.doubleValue());
        return b.setScale(digits,BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}