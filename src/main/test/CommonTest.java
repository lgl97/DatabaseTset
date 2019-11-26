import com.cbim.common.codec.AesUtils;
import com.cbim.common.codec.Md5Utils;
import org.junit.Test;

public class CommonTest {

    @Test
    public void justTest(){
        byte[] obj = AesUtils.genKey();
        int i = 0;
        System.out.println("obj:" + obj);
        String md5 = Md5Utils.md5("423423");
        System.out.println("md5:" + md5);
        if (obj instanceof Object){ // 判断obj是否是Object的实例
            System.out.println("is Object");
        }
    }


}