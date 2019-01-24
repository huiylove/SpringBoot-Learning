/**
 * 
 */
package com.huiy.springboot2;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;
import java.util.UUID;

import lombok.extern.log4j.Log4j2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


/**
 * @author huiylove
 * @date 2019年1月22日
 */
@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot2RestApiTests {
	
	@Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;
    
    @Before
    public void setUp(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    
    @Test
    public void whenQuerySuccess() throws Exception {
        String result = mockMvc.perform(
                get("/user").param("username", "jojo").param("age", "18").param("ageTo", "60").param("xxx", "yyy")
                        // .param("size", "15")
                        // .param("page", "3")
                        // .param("sort", "age,desc")
                        .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.length()").value(10))
                .andReturn().getResponse().getContentAsString();
        log.info("/user===="+result);
    }
    
    @Test
    public void whenGetInfoSuccess() throws Exception {
        String result = mockMvc.perform(get("/user/1")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("袁慧"))
                .andReturn().getResponse().getContentAsString();
        log.info("/user/1===="+result);
    }

    
    @Test
    public void whenGetInfoFail() throws Exception {
        mockMvc.perform(get("/user/a")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().is4xxClientError());
    }
//    
    @Test
    public void whenCreateSuccess() throws Exception {
        Date date = new Date();
        String content = "{\"name\":\"tomde11555\",\"age\":\"0\",\"birthday\":"+date.getTime()+"}";
        String reuslt = mockMvc.perform(post("/user")
        		.contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(content))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();
        log.info("post /user===="+reuslt);
    }

    @Test
    public void whenUpdateSuccess() throws Exception {

//        Date date = new Date(LocalDateTime.now().plusYears(1).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
        Date date = new Date();
        System.out.println(date.getTime());
        String content = "{\"id\":2, \"name\":\"tomUUUUUUU\",\"age\":\"58\",\"birthday\":"+date.getTime()+"}";
        String reuslt = mockMvc.perform(put("/user").contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(content))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value("2"))
                .andReturn().getResponse().getContentAsString();

        System.out.println(reuslt);
    }

    @Test
    public void whenDeleteSuccess() throws Exception {
        mockMvc.perform(delete("/user/3")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());
    }

}
