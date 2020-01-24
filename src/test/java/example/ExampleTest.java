package example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
 
@SpringBootTest
public class ExampleTest {
	@Test
	public void testName() throws Exception {
		assertThat(1 , equalTo(5));
	}
}
