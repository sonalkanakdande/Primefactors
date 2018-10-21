package primeFactor;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Test;


public class PrimeFactorTest {

   @Test
    public void primeFactorOfOne() {
       Assert.assertEquals(PrimeFactor.Of(1), ImmutableList.<Integer>of() );
   }

    @Test
    public void primeFactorOfTwo() {
        Assert.assertEquals(PrimeFactor.Of(2), ImmutableList.<Integer>of(2) );
    }

    @Test
    public void primeFactorOfThree() {
        Assert.assertEquals(PrimeFactor.Of(2), ImmutableList.<Integer>of(2) );
    }
}
