package primeFactor;

import com.google.common.collect.Lists;

import java.util.List;

public class PrimeFactor {

    public static List<Integer> Of(int n) {
        List primeFactors = Lists.newArrayList() ;
        if (n>1){
            if (n%2==0){
                n/=2;
                primeFactors.add(2);
            }
        }
        return primeFactors;
    }

}
