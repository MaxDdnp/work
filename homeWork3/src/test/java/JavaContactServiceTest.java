import com.skillsup.daoInterface.implem.ContactDAO;
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


/**
 * Created by mde on 3/19/2015.
 */


@RunWith(MockitoJUnitRunner.class)
@ContextConfiguration(locations = {"/test-context.xml"})
public class JavaContactServiceTest {
    @Mock
    private JavaContactService service;
    @InjectMocks
    private ContactDAO contactDAO = new ContactDAO();

    private final String fstName = "Ivan";
    private final String lstName = "Ivanov";
    private final LocalDate date = LocalDate.of(1980, 06, 28);


    @Test
    public void testCreateContact() {



    }
}
