import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GaoweifengTestController {
    @GetMapping(value = "/rwere")
    public String gdsag() {
        System.out.println("23423423");
        return "124342";
    }
}
