package zool.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zoolye
 * @date : 2018-10-31 17:02
 * @describe :
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String satHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
