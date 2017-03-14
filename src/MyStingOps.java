/**
 * Created by Work on 12.03.2017.
 */

public class MyStingOps {

    private int hTemp;

    MyStingOps(int ht) {
        hTemp = ht;
    }

    boolean sameTemp(MyStingOps ht2){
        return hTemp == ht2.hTemp;
    }
}
