import com.google.gson.Gson;
import com.lifeoflyz.myfirstmvc.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyuanzhe on 16-12-18.
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:springmvc-config.xml" })
public class MyTest {

    @Autowired
    UserServiceImpl userService;

    private Gson gson = new Gson();

    @Test
    public void myTest(){

        String name = userService.searchUser("liyuanzhe");
        System.out.println(name);
    }

    @Test
    public void testJson(){
        Map<String, String> myMap = new HashMap();
        myMap.put("data","hello");
        System.out.println(gson.toJson(myMap));
    }
}
