package iot.mi.cloud;



import java.io.IOException;
import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	
    @RequestMapping("/helloworld")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloworld";
    }
    
    @RequestMapping(value="/hello/{name}/world/{fname}", method=RequestMethod.GET)
    public String world(@PathVariable String name, @PathVariable String fname, Model model) {
    	System.out.println("name = " + name);
    	model.addAttribute("name", name);
    	model.addAttribute("fname", fname);
      return "hello";
    }
        
    @RequestMapping(value = "/something3", method = RequestMethod.GET)
    public void handle(@RequestBody String body, Writer writer) throws IOException {
    	writer.write("Hello World 3!!!!!");	
    }
    
    @RequestMapping(value = "/something4", method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld()  {
      return "Hello World";
    }

}

