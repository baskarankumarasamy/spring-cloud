package com;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@WebMvcTest(ApplicationControllerTest.class)
@ActiveProfiles("test")
class ApplicationControllerTest {

    @Autowired
    private MockMvc mvc;

    @InjectMocks
    private ApplicationController applicationController;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        this.mvc =  MockMvcBuilders.standaloneSetup(applicationController).build();
    }
    

    @Test
    public void testContextLoads(){
        assertEquals("Hello JUnit 5", "Hello JUnit 5");
    }

}