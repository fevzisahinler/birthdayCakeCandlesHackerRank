import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int maxnumber= 1;
        int count = 0;
        // ilk for döngüsü ile maximum uzunluktaki mumu buluyoruz
        for(int i = 0 ; i<candles.size()-1 ; i++){
            if(candles.get(i)>maxnumber){
                maxnumber = candles.get(i);
            }
        }
        // ikinci for döngüsü ile maximum uzunluktaki mumun kaç adet olduğunu buluyoruz
        for(int j : candles){
            if( j == maxnumber){
                count +=1;
            }
                
        }
        return count;
    }
    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
