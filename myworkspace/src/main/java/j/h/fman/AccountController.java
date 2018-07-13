package j.h.fman;

import java.util.ArrayList;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AccountController {
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	 public JdbcTemplate template;
	 @Autowired
	 public void setTemplate(JdbcTemplate template) {
		 this.template = template;
		 Constant.template = this.template;
	 }

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/all.me", method = RequestMethod.GET)
	public String all(Locale locale, Model model) {
		logger.info("AccountController /all.me ");
		AccountDao ado = new AccountDao();
		ArrayList<Account> accounts = ado.all();
		model.addAttribute("accounts", accounts);
		return "all";
	}
	

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/all2.me", method = RequestMethod.GET)
	public ModelAndView all2() {
		logger.info("AccountController /all2.me ");
		AccountDao ado = new AccountDao();
		ArrayList<Account> accounts = ado.all();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("all");
		mav.addObject("accounts", accounts);
		return mav;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/stat.me", method = RequestMethod.GET)
	public ModelAndView stat() {
		logger.info("AccountController /all2.me ");
		AccountDao ado = new AccountDao();
		ArrayList<Stat> stats = ado.stat();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("stat");
		mav.addObject("stats", stats);
		return mav;
	}

}
