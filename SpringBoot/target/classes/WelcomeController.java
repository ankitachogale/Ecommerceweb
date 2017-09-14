import java.util.Map;
import org.springframework.beans.factory.annotation.value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@controller
public class WelcomeController {
@value("${welcome.message:test}")
private String message="Hello World";
@requestMapping("/")
public String welcome(Map<String,Object>model)
{
	model.put("message",this.message);
	return "welcome";
}
}
