package home.back.HomeBack;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {
	@GetMapping(path = "testme")
	public String getMessage()
	{
		String strMsg2 = "Hi Sweya!";
		return strMsg2;
	}
	
	@CrossOrigin
	@GetMapping(path = "/getHome")
	public List<HomeBox> getHomeBoxes()
	{
		return Stream.of(new HomeBox("1", "Rama", "Hyderabad"),
				new HomeBox("2", "Laxman", "Agra"), 
				new HomeBox("3", "Ravan", "Pune")).collect(Collectors.toList());
	}
	
	
}
