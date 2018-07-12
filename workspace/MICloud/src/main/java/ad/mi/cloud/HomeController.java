package ad.mi.cloud;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/mi.do", method = RequestMethod.GET)
	public String mi(Locale locale, Model model) {
		return "mi";
	}

	@RequestMapping(value = "/ci.do", method = RequestMethod.GET)
	public String ci(Locale locale, HttpServletRequest req, Model model) {
		model.addAttribute("name", req.getParameter("name"));
		
		model.addAttribute("localAddr", req.getLocalAddr());
		model.addAttribute("localPort", req.getLocalPort());
		model.addAttribute("protocol", req.getProtocol());
		model.addAttribute("getRequestURL", req.getRequestURL());
		
		
		model.addAttribute("mac", "33FFDDSSEEEE");
		model.addAttribute("alt", "38.2");
		model.addAttribute("lat", "133.2");
		model.addAttribute("temp", "10");
		
		try {
		// 로컬 IP취득
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println("IP : " + ip.getHostAddress());
		
		// 네트워크 인터페이스 취득
		NetworkInterface netif = NetworkInterface.getByInetAddress(ip);
		
		// 네트워크 인터페이스가 NULL이 아니면
		if (netif != null) {
			// 네트워크 인터페이스 표시명 출력
			System.out.print(netif.getDisplayName() + " : ");
			
			// 맥어드레스 취득
			byte[] mac = netif.getHardwareAddress();
			
			// 맥어드레스 출력
			for (byte b : mac) {
				System.out.printf("[%02X]", b);
			}
			System.out.println();
		}
		}catch (Exception e) {}

		
		return "ci";
	}
	

}
