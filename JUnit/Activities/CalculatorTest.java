package examples;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

	Calculator calc = new Calculator();
	
	@Test
	public void mulTest() {
	//perform the test to get the actual result
	int result = calc.multiply(5,2);
	
	//add a assertion statement to verify against the expected result
	assertEquals (10,result);
			
	}
	@Test
	public void addTest() {
	//perform the test to get the actual result
	int result1 = calc.add(10,20);
	int result2 = calc.add(15,15);
	int result3 = calc.add(25,5);
	
	//add a assertion statement to verify against the expected result
	assertAll(
			() -> assertEquals (30,result1),
			() -> assertEquals (30,result2),
			() -> assertEquals (30,result3)
			
			);
	}
		
	@ParameterizedTest
	@ValueSource(ints = {10,20,25,100})
	public void paramSqrtTest(int num1) {
		
		int result = calc.square(num1);
		
		//add a assertion statement to verify against the expected result
		assertEquals (num1 * num1,result);
	}
	
	
	@ParameterizedTest
	@CsvSource({"10,90","50,50","80,20"})
	
	public void paramAddTest(int num1, int num2) {
		//perform the add function to get the actual result
		int result1 = calc.add(num1, num2);
		
		//add a assertion statement to verify against the expected result
		assertEquals (100,result1);
	}

	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/input.csv", nullValues = {"N/A", "NA", "-"})
	public void AggregateTest(ArgumentsAccessor args) {
	System.out.println(args.getString(0) + " has only " + (args.getInteger(3)+3) + " sick days remaining");
	//	System.out.println(args.getString(0));
	}
	
}
