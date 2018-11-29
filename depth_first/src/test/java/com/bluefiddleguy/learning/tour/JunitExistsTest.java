import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class JunitExistsTest{
    // Test the annotation is there because 
    @Test
    public void areyouThere(){
	// assert is available because the static import calls it. 
	assertEquals(true,true);
    }
}
