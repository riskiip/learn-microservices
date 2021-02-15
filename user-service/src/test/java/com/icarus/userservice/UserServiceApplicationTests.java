package com.icarus.userservice;

import com.icarus.userservice.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@ExtendWith(MockitoExtension.class)
class UserServiceApplicationTests {

	@InjectMocks
	private UserService userService;

	@Test
	void contextLoads() {
	}

}
