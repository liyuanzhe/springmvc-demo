import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by liyuanzhe on 16-12-18.
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:springmvc-config.xml" })
public class MyTest {
//
//    @Autowired
//    UserServiceImpl userService;
//
//    private Gson gson = new Gson();
//
//    @Ignore
//    public void myTest(){
//
//        String name = userService.searchUser("liyuanzhe");
//        System.out.println(name);
//    }
//
//    @Ignore
//    public void testJson(){
//        Map<String, String> myMap = new HashMap();
//        myMap.put("data","hello");
//        System.out.println(gson.toJson(myMap));
//    }

    @Test
    public void test(){
        System.out.println("test");
    }
}
