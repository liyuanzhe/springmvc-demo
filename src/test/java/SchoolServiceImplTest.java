import com.google.gson.Gson;
import com.lifeoflyz.myfirstmvc.model.gen.School;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolExample;
import com.lifeoflyz.myfirstmvc.model.gen.SchoolMapper;
import com.lifeoflyz.myfirstmvc.service.impl.SchoolServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liyuanzhe on 17-3-6.
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:springmvc-config.xml" })
public class SchoolServiceImplTest {

    @Autowired
    SchoolServiceImpl schoolService;

    @Autowired
    SchoolMapper schoolMapper;

    private Gson gson = new Gson();
    @Test
    public void testInsert(){
        School school = new School();
        school.setName("机械与动力工程学院");
        school.setShortName("机动学院");
        schoolService.insertSchool(school);
    }

    @Test
    public void getSchool(){
        SchoolExample schoolExample = new SchoolExample();
        schoolExample.or().andIdIsNotNull();
        System.out.println(
            gson.toJson(schoolMapper.selectByExample(schoolExample))
        );
    }
}
