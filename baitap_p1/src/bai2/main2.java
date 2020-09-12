package bai2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class main2 {
    public static void main(String[] args) {
        StringTokenizer stk;
        Map<String,Integer> mapresult = new HashMap<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("src/bai2/input2.txt"));
            String contentLine = br.readLine();
            while (contentLine !=null){
                stk = new StringTokenizer(contentLine, " .,!=+—");
                while (stk.hasMoreTokens()){
                    String str = stk.nextToken();
                    if(!mapresult.containsKey(str)){
                        mapresult.put(str,1);
                    }
                    else {
                        mapresult.put(str,mapresult.get(str)+1);
                    }
                }
                contentLine = br.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        PrintWriter pw = null;
        try {
             pw = new PrintWriter(new File("src/bai2/output.txt"));
            for (Map.Entry<String,Integer> mape: mapresult.entrySet()) {
                pw.write(mape.getKey() +" "+ mape.getValue());
                pw.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            pw.close();
        }

    }
}
