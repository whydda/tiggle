package kr.co.tiggle;

import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Utils {
    private String getUrlencodedParams(Map<String, Object> params){
        List<String> arr = new ArrayList<>();
        params.forEach((k,v) -> {
            arr.add(k + "=" + v);
        });
        return String.join("&", arr);
    }

    static void print(String s){
        System.out.println(s);
    }


    /**
     *
     * @param port
     * @param callUri
     * @param reqMap
     * @param restTemplate
     * @return
     * @throws URISyntaxException
     */
    public int callPostVerificationOutApi(int port, String callUri, Map<String, Object> reqMap, TestRestTemplate restTemplate) throws URISyntaxException{
        final String baseUrl = callUri;
        URI uri = new URI(baseUrl);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "x-www-form-urlencoded", Charset.forName("UTF-8")));
        HttpEntity request = new HttpEntity(getUrlencodedParams(reqMap), headers);

        ResponseEntity<String> result = restTemplate.postForEntity(
                uri
                , request
                , String.class
        );

        print(result.getBody());

        return result.getStatusCodeValue();
    }

    /**
     *
     * @param port
     * @param callUri
     * @param reqMap
     * @param restTemplate
     * @return
     * @throws URISyntaxException
     */
    public int callPostVerificationApi(int port, String callUri, Map<String, Object> reqMap, TestRestTemplate restTemplate) throws URISyntaxException{
        final String baseUrl = "http://localhost:"+port+ "/" + callUri;
        URI uri = new URI(baseUrl);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "x-www-form-urlencoded", Charset.forName("UTF-8")));
        HttpEntity request = new HttpEntity(getUrlencodedParams(reqMap), headers);

        ResponseEntity<String> result = restTemplate.postForEntity(
                uri
                , request
                , String.class
        );

        print(result.getBody());

        return result.getStatusCodeValue();
    }

    /**
     *
     * @param port
     * @param callUri
     * @param reqMap
     * @param restTemplate
     * @return
     * @throws URISyntaxException
     */
    public int callGetVerificationApi(int port, String callUri, Map<String, Object> reqMap, TestRestTemplate restTemplate) throws URISyntaxException{
        final String baseUrl = "http://localhost:"+port+ "/" + callUri;
        URI uri = new URI(baseUrl);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "x-www-form-urlencoded", Charset.forName("UTF-8")));

        ResponseEntity<String> result = restTemplate.getForEntity(
                uri + "?" + getUrlencodedParams(reqMap)
                , String.class
        );

        print(result.getBody());

        return result.getStatusCodeValue();
    }
}
