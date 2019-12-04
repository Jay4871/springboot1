import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.DocFlavor;

/**
 * @author jay.wang
 * @create 2019-07-31-10:52
 **/
@Controller
public class HelloworldController2 {

    @ResponseBody
    @RequestMapping("/test2")
    public String helloworld2()
    {
        return "helloworld2";
    }
}
