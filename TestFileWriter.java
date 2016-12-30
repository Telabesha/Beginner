import java.io.*;

/**
 * Created by Fantasy on 20
 * \16/12/13.
 */
public class TestFileWriter {
    public static void main(String[] args){
        FileWriter fw = null ;
        try{
            fw = new FileWriter("D:\\last.txt");
            for(int c = 0; c <= 65535 ; c ++){
                fw.write(c);
            }
            fw.close();
        }
        catch(IOException e1){
            e1.printStackTrace();
            System.out.println("文件写入错误");
            System.exit(-1);
        }
    }
}
