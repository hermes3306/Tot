package j.p.Tot;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		return sum();
	}
	
	static Tot tot;
	static {
		tot = new Tot();
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(1,"kw",12000000,"180712"));
		accounts.add(new Account(2,"wr",1000000,"180712"));
		accounts.add(new Account(3,"wr",1000000,"180712"));
		accounts.add(new Account(4,"ke",2000000,"180712"));
		accounts.add(new Account(5,"wo",12000000,"180712"));
		tot.setAccounts(accounts);
	}
	
	@RequestMapping(value = "/show_old.go", method = RequestMethod.GET)
	public ModelAndView show_old() {
		logger.info("/show_old.go");
			ModelAndView mav = new ModelAndView();
			mav.setViewName("show_old");
			mav.addObject("tot", tot);
			BDao b = new BDao();
			List<Account> accounts = b.list();
			mav.addObject("accounts", accounts);
			return mav;
	}
	
	@RequestMapping(value = "/show.go", method = RequestMethod.GET)
	public ModelAndView show() {
		logger.info("/show.go");
			ModelAndView mav = new ModelAndView();
			mav.setViewName("show");
			BDao b = new BDao();
			List<Account> accounts = b.list();
			mav.addObject("accounts", accounts);
			return mav;
	}
	
	@RequestMapping(value = "/sum.go", method = RequestMethod.GET)
	public ModelAndView sum() {
		logger.info("/sum.go");
			ModelAndView mav = new ModelAndView();
			mav.setViewName("sum");
			SumDao s = new SumDao();
			List<Sum> sums = s.list();
			mav.addObject("sums", sums);
			return mav;
	}
	
}
