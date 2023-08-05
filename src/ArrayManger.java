/**
 * 有关数组的相关API，不包含一些更具体的引用.
 * @author Kaminy
 * @version 1.0
 */
public class ArrayManger {
    /**
     * 自动在数组最近空位添加指定数据，从0位开始检测空位.<br/>
     * 如果成功的添加了，会返回true.
     * 否则，返回false.<br/>
     * 目前仅支持String[].
     * @param array 数组名
     * @param value 要添加的数据
     * @return true或false
     * @since 1.0
     */
    public static boolean ArraySequence(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[i] = value;
                return true;
            }
        }
        return false;
    }
    /**
     * 在数组指定位置插入指定数据.<br/>
     * 若目标位置无数据并插入成功，会返回true.
     * 将force设为true，会覆盖原本的数据强制插入.<br/>
     * 否则，返回false.<br/>
     * 目前仅支持String[].
     * @param array  数组名
     * @param number 要插入的位置
     * @param value  要插入的数据
     * @param force  是否强制替换
     * @return true或false
     * @since 1.0
     */
    public static boolean ArrayInsert(String[] array, int number, String value, boolean force) {
        if (array[number] == null || (array[number] != null && force)) {
            array[number] = value;
            return true;
        }
        return false;
    }
    /**
     * 打印数组的所有数据并打印到控制台.<br/>
     * 目前仅支持String[].
     * @param array 数组名
     * @since 1.0
     */
    public static void ArrayCheck(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    /**
     * 将数组指定位置的数据删除.<br/>
     * 目前仅支持String[].
     * @param array 数组名
     * @param number 要删除的位置
     * @since 1.0
     */
    public static void ArrayDelete(String[] array, int number) {
        if(array[number]!=null){
            array[number]=null;
        }
    }
}
