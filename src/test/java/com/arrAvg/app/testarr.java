package test.java.com.arrAvg.app;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.com.arrAvg.app.arr;
public class testarr{
    @Test
    void testArrAvg(){
        int a[]={10,10,10,10};
        assertEquals(10,arr.arrayAvg(a));
    }
}
