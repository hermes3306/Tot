package iot.mi.cloud;

import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class yourController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/you.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome my.do! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "you";
	}
	
	
    @RequestMapping(value = "/something2", method = RequestMethod.GET)
    public void handle(@RequestBody String body, Writer writer) throws IOException {
    
    	logger.info("Something 2 !");
    	writer.write("Hello World  2 !!!!!");
    	
    }

}
