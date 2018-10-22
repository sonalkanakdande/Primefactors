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
        Assert.assertEquals(PrimeFactor.Of(3), ImmutableList.<Integer>of(3) );
    }

    @Test
    public void primeFactorOfFour() {
        Assert.assertEquals(PrimeFactor.Of(4), ImmutableList.<Integer>of(2,2) );
    }

    @Test
    public void primeFactorOfSix() {
        Assert.assertEquals(PrimeFactor.Of(6), ImmutableList.<Integer>of(2,3) );
    }

}
