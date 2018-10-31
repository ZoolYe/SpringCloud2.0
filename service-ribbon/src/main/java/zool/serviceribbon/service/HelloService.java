package zool.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author : zoolye
 * @date : 2018-10-31 16:27
 * @describe :
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError") //@HystrixCommand注解。该注解对该方法创建了熔断器的功能,并指定了fallbackMethod熔断方法
    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }

}
