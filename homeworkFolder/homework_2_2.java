package homeworkFolder;
import java.util.logging.LogManager;
import java.io.FileInputStream;
import java.util.logging.Logger;
import java.lang.System.Logger.Level;
import java.util.Arrays;

public class homework_2_2 {
    static Logger LOGGER;
    static {
        try(FileInputStream ins = new FileInputStream("C:\\Users\\Admin\\Desktop\\Working with java\\Java_GB\\log.config")){
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(homework_2_2.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,1,20,123,5,2,7,22,57};

        boolean isSorted = false;

        int buffer;
        while(!isSorted){
            isSorted = true;
            for (int i =0; i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    isSorted = false;
                    buffer = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buffer;
                    String msg;
                    for (int j = 0; i<arr.length;j++){
                        msg = msg+ " " + arr[i] ;
                    }
                    LOGGER.log(Level.INFO, " "+ msg);
                }
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }


    }

    
    

