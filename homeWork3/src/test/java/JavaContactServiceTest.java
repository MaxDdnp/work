import com.skillsup.daoInterface.implem.ContactDAO;
import com.skillsup.impl.Contact;
import com.skillsup.service.implem.JavaContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.time.LocalDate;
<<<<<<< HEAD

import static org.easymock.EasyMock.expectLastCall;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.reset;
=======
>>>>>>> 830b11751903bef92b225c7e624f345bda616eb5


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
