package homeworkFolder;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.json.simple.JSONObject;


public class homework_N_2 {

    public static void main(String[] args) {
        Map<String, String> par = new HashMap<String,String>();
        par.put("name","Egor");
        par.put("country","Russia");
        par.put("city","Moscow");
        par.put("age",null);
        System.out.println(getQuery(par));
    }
    public static String getQuery(Map<String, String> params)
    {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet())
        {
            if (pair.getValue() != null)
            {
                s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        s.delete(s.toString().length()-5,s.toString().length());
        return s.toString();


    }

}

