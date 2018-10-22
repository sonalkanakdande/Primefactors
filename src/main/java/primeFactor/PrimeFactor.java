package primeFactor;

import com.google.common.collect.Lists;

import java.util.List;

public class PrimeFactor {

    public static List<Integer> Of(int n) {
        List primeFactors = Lists.newArrayList();
        for (int divisor = 2; n > 1; divisor++) {
            for (; n % divisor == 0; n /= divisor) {
                primeFactors.add(divisor);
            }
        }
        return primeFactors;
    }
}
