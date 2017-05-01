import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({
fayder.restcountries.v1.CountryServiceTest.class,
fayder.restcountries.v2.CountryServiceTest.class
})
public class totalTestSuite {
}
