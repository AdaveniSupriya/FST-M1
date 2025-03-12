

package activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

	public class Activity1 {
	    // Test fixtures
	    static ArrayList<String> list;

	    // Initialize test fixtures before each test method
	    @BeforeEach
	    void setUp() throws Exception {
	        list = new ArrayList<String>();
	        list.add("alpha"); // at index 0
	        list.add("beta"); // at index 1
	    }

	    
	    @Test
	    public void insertTest() {
	    	//expectedList
	    	List<String> expectedList = Arrays.asList("alpha","beta","gamma"); 
	        
	    	// Assert the size of the list before adding an element
	        assertEquals(2, list.size());
	        
	        // Add new element
	        list.add(2, "gamma");
	        
	     // Assert the size of the list after adding an element
	        assertEquals(3, list.size());

	     // Assert list elements
	        assertIterableEquals(expectedList, list);
	    }
	        
	

	    @Test
	    public void replaceTest() {
	    	//expectedList
	    	List<String> expectedList = Arrays.asList("alpha","beta","charlie"); 
	        
	    	// Assert the size of the list before adding an element
	        assertEquals(2, list.size());
	        
	        // Add new element
	        list.add(2, "gamma");
	        list.set(2, "charlie");
	        
	     // Assert the size of the list after adding an element
	        assertEquals(3, list.size());

	     // Assert list elements
	        assertIterableEquals(expectedList, list);
	    }
	    
	}
