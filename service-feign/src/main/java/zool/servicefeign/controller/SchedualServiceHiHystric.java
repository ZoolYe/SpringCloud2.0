package zool.servicefeign.controller;

import org.springframework.stereotype.Component;

/**
 * @author : zoolye
 * @date : 2018-10-31 19:23
 * @describe :
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry: "+name;
    }

}
