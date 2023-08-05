import java.io.*;

/**
 * 有关文件的相关API，例如读取和保存.
 * @author Kaminy
 * @version 1.0
 */
public class FileManger {
    /**
     * 将String[]数组以文件形式保存至磁盘的指定路径，保存数据以便下次读取.<br/>
     * 通过File类中的方法实现.
     * @param url 读取路径，在Java应用程序中调试一般用绝对路径，否则会出现问题.
     * @return 若文件存在，返回true，否则返回false.
     * @since 1.0
     */
    public static boolean fileget(String url){
        File file=new File(url);
        return file.exists();
    }
    /**
     * 将String[]数组以文件形式保存至磁盘的指定路径，保存数据以便下次读取.<br/>
     * 配合FileManger.FileLoad()方法使用.<br/>
     * 通过FileWriter类中的方法实现.
     * @param url 保存路径，在Java应用程序中调试一般用绝对路径，否则会出现问题.
     * @param array 要保存的String[].
     * @throws IOException 异常抛出
     * @since 1.0
     */
    public static void FileSave(String url,String[] array) throws IOException {
        FileWriter file=new FileWriter(url);
        for(int i=0;i< array.length;i++){
            file.write(array[i]);
            if(i!=array.length-1){
                file.write("\n");
            }
        }
        file.close();
    }
    /**
     * 读取磁盘的文件并以String[]形式实例至内存以便调用.<br/>
     * 每行都会作为Sting[]的一项，即使是空行或非完整数据.<br/>
     * 配合FileManger.FileSave()方法使用.<br/>
     * 通过流实例化BufferedReader类中的方法实现.
     * @param url 读取路径，在Java应用程序中调试一般用绝对路径，否则会出现问题.
     * @throws IOException 异常抛出
     * @return 数组数据.文件不存在时，返回null.
     * @since 1.0
     */
    public static String[] FileLoad(String url) throws IOException {
        if(fileget(url)){
            FileInputStream fileInputStream=new FileInputStream(url);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            File file=new File(url);
            FileReader fileReader=new FileReader(file);
            LineNumberReader lineNumberReader=new LineNumberReader(fileReader);
            lineNumberReader.skip(Long.MAX_VALUE);
            String[] strings=new String[lineNumberReader.getLineNumber()];
            fileReader.close();
            lineNumberReader.close();
            String str;
            int i=0;
            while ((str= bufferedReader.readLine())!=null){
                strings[i]=str;
                i++;
            }
            return strings;
        }
        return null;
    }
}
