import java.util.List;

public class birthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {  
        int maxnumber= 1;
        int count = 0;
        
        // ilk for döngüsü ile maximum uzunluktaki mumu bulduk 
        for(int i = 0 ; i<candles.size()-1 ; i++){ 
            if(candles.get(i)>maxnumber){ 
                maxnumber = candles.get(i);
            }
        }
        // bu for döngüsü ile bulduğumuz maximum uzunluktaki mumları saydık 
        for(int j : candles){
            if( j == maxnumber){
                count +=1;
            }
                
        }
        return count;
    }
}
