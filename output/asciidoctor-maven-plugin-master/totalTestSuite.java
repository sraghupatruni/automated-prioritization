import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({
org.asciidoctor.maven.test.AsciidoctorRefreshMojoTest.class,
org.asciidoctor.maven.test.AsciidoctorMojoExtensionsTest.class,
org.asciidoctor.maven.test.AsciidoctorHttpMojoTest.class,
org.asciidoctor.maven.test.AsciidoctorMojoTest.class,
org.asciidoctor.maven.test.AsciidoctorZipMojoTest.class
})
public class totalTestSuite {
}
