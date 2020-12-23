import cs.lab.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import java.util.ArrayList;

@Test
public class TestGame {

    private Game game = new Game();

    @Test
    public void test1(){
        List<List<String>> table = new ArrayList<List<String>>();
        for(int i = 0; i < 9; i++){
            List<String> temp = new ArrayList<String>();
            for(int j = 0; j < 9; j++){
                temp.add("-");
            }
        }
        Assert.assertEquals(table, game.getTable());
    }

    /*
    @Test //(expectedExceptions=IllegalStateException.class)
    public void test2() throws Exception{
        
    }
    */

}
