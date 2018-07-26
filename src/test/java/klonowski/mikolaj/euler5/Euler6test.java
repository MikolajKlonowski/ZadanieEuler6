package klonowski.mikolaj.euler5;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.assertj.core.api.Assertions.assertThat;


public class Euler6test {
    @Test
    public void shouldReturn385() {

        Euler6 euler6 = new Euler6();
        int a = 10;

        int wynik = euler6.sumaKwadaratowLiczb(a);

        Assert.assertThat(wynik, CoreMatchers.is(385));
    }
    @Test
    public void shouldReturn3025(){
        Euler6 euler6 = new Euler6();
        int a = 10;

        int wynik = euler6.kwadratSumyLiczb(a);

  Assert.assertThat(wynik, CoreMatchers.is(3025));


    }
}
