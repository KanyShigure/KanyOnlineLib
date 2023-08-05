/**
 * 有关字符或字符串的相关API，不包含一些更具体的引用.
 * @author Kaminy
 * @version 1.0
 */
public class CharManger {
    /**
     * 生成随机小写字母并返回.<br/>
     * 通过在数组中取出随机项来实现.
     * @param capitalize 如果为true，生成范围将包含大写字母
     * @return 生成的随机字母
     * @since 1.0
     */
    public static String randomLetter(boolean capitalize){
        String[] lib;
        if (capitalize){
            lib= new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "g", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        }
        else{
            lib= new String[]{"a","b","c","d","e","f","g","h","i","g","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        }
        return lib[(int) ((Math.random()*lib.length))];
    }
}
