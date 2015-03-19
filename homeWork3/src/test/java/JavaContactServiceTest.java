import com.skillsup.daoInterface.implem.ContactDAO;
import com.skillsup.service.implem.JavaContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


/**
 * Created by mde on 3/19/2015.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/test-context.xml"})
public class JavaContactServiceTest {
    @Resource(name = "contactDAO")
    private ContactDAO contactDAO;
    @Resource(name = "contactService")
    private JavaContactService service;

    @Test
    public void testContact() {

    }
}
