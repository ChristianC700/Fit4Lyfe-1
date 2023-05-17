package com.example.Fit4Lyfe;

import com.example.Fit4Lyfe.controllers.UserController;
import com.example.Fit4Lyfe.services.UserService;
import nl.altindag.log.LogCaptor;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class UserControllerTest {

    @Test
    public void getAllUsersEndpoint() throws Exception
    {
        LogCaptor logCaptor = LogCaptor.forClass(UserController.class);

        UserController userController = new UserController();
        userController.getAllUsers();

        assertThat(logCaptor.getInfoLogs().contains("Successfully returned all users."));
    }
}
