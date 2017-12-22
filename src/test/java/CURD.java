import dao.UserMapper;
import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ${MIND-ZR} on 2017/12/22.
 */



@ContextConfiguration(locations = {"classpath:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CURD {
    @Autowired
    private UserMapper userMapper;

    //查找操作
    @Test
    public void select(){
        User user=userMapper.selectByPrimaryKey(1);

        System.out.println(user);
    }




}
