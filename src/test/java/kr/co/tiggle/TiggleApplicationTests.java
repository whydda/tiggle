package kr.co.tiggle;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TiggleApplicationTests extends Utils{

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    int randomServerPort;

    @Autowired
    ObjectMapper objectMapper;

    /**
     * 사용자 등록
     * @throws URISyntaxException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public void userRegist() throws URISyntaxException, IOException, ClassNotFoundException {
        Map<String, Object> reqMap = new HashMap<>();
        reqMap.put("id","whydda");
        reqMap.put("pass","1234");
        Assert.assertEquals(200, super.callPostVerificationApi(randomServerPort, "regist", reqMap, this.restTemplate));
    }

}
