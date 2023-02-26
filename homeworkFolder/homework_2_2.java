package homeworkFolder;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class homework_2_2 {
   
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(homework_2_2.class.getName());
        FileHandler fh = new FileHandler("logging.txt");
        logger.addHandler(fh);
        SimpleFormatter sFor = new SimpleFormatter();
        fh.setFormatter(sFor);
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
                    logger.log(java.util.logging.Level.INFO, "Изменение произведено" + Arrays.toString(arr));
                }
                else{

                }
            }
            
        }
        System.out.println(Arrays.toString(arr));
        fh.close();
    }


    }

    
    

