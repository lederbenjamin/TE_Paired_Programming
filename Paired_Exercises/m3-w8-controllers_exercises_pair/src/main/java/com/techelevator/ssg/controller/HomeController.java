package com.techelevator.ssg.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.ssg.model.calculator.AlienAgeEstimate;
import com.techelevator.ssg.model.calculator.AlienTravelEstimate;
import com.techelevator.ssg.model.calculator.AlienWeightEstimate;
import com.techelevator.ssg.model.forum.ForumPost;
import com.techelevator.ssg.model.forum.JdbcForumDao;
import com.techelevator.ssg.model.store.JdbcProductDao;
import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ShoppingCart;


@Controller
@SessionAttributes({"shoppingCart", "product"})
public class HomeController {
	
	@Autowired
	private JdbcForumDao forumDAO;
	@Autowired
	private JdbcProductDao productDAO;
	
	private ShoppingCart shoppingCart = new ShoppingCart();


	@RequestMapping("/")
	public String displayHomePage() {
		return "homePage";
	}

	@RequestMapping("/alienAgeCalculatorInput")
	public String displayAlienAgeCalculatorInput() {
		return "alienAgeCalculatorInput";
	}

	@RequestMapping("/alienAgeCalculatorOutput")
	public String displayAlienAgeCalculatorOutput(HttpServletRequest request) {

		double planetChoice = Double.parseDouble(request.getParameter("planetChoice"));
		double earthAge = Double.parseDouble(request.getParameter("earthAge"));

		AlienAgeEstimate estimate = new AlienAgeEstimate(planetChoice, earthAge);
		request.setAttribute("estimate", new Double(estimate.getAlienAgeEstimate()));
		request.setAttribute("planet", estimate.getPlanetName());

		return "alienAgeCalculatorOutput";
	}

	@RequestMapping("/alienWeightCalculatorInput")
	public String displayAlienWeightCalculatorInput() {
		return "alienWeightCalculatorInput";
	}

	@RequestMapping("/alienWeightCalculatorOutput")
	public String displayAlienWeightCalculatorOutput(HttpServletRequest request) {

		double planetChoice = Double.parseDouble(request.getParameter("planetChoice"));
		double earthWeight = Double.parseDouble(request.getParameter("earthWeight"));

		AlienWeightEstimate estimate = new AlienWeightEstimate(planetChoice, earthWeight);
		request.setAttribute("estimate", new Double(estimate.getAlienWeightEstimate()));
		request.setAttribute("planet", estimate.getPlanetName());

		return "alienWeightCalculatorOutput";
	}
	
	@RequestMapping("/alienTravelCalculatorInput")
	public String displayAlienTravelCalculatorInput() {
		return "alienTravelCalculatorInput";
	}

	@RequestMapping("/alienTravelCalculatorOutput")
	public String displayAlienTravelCalculatorOutput(HttpServletRequest request) {

		double planetChoice = Double.parseDouble(request.getParameter("planetChoice"));
		double travelMode = Double.parseDouble(request.getParameter("travelMode"));
		double earthAge = Double.parseDouble(request.getParameter("earthAge"));

		AlienTravelEstimate estimate = new AlienTravelEstimate(planetChoice, travelMode, earthAge);
		request.setAttribute("travelEstimate", new Double(estimate.getAlienTravelTime()));
		request.setAttribute("planet", estimate.getPlanetName());
		request.setAttribute("ageEstimate", new Double(estimate.getAlienTravelAge()));
		request.setAttribute("travelMode", estimate.getTravelMode());


		return "alienTravelCalculatorOutput";
	}
	
	@RequestMapping(path="/spaceForumHome", method=RequestMethod.GET)
	public String displaySpaceForumHome(HttpServletRequest request) {
		request.setAttribute("forumPosts", forumDAO.getAllPosts());
		return "spaceForumHome";
	}
	
	@RequestMapping(path="/spaceForumInput", method=RequestMethod.GET)
	public String displaySpaceForumInput(HttpServletRequest request) {	
		return "spaceForumInput";
	}
	
	@RequestMapping(path="/spaceForumInput", method=RequestMethod.POST)
	public String redirectSpaceForumHome(HttpServletRequest request) {
		ForumPost newPost = new ForumPost();
		
		newPost.setUsername(request.getParameter("username"));
		newPost.setSubject(request.getParameter("subject"));
		newPost.setMessage(request.getParameter("message"));
		newPost.setDatePosted(LocalDateTime.now());
		forumDAO.save(newPost);
		
		
		return "redirect:/spaceForumHome";
	}
	
	@RequestMapping(path="/spaceStoreHome", method=RequestMethod.GET)
	public String displaySpaceStoreHome(HttpServletRequest request) {
		request.setAttribute("allProducts", productDAO.getAllProducts());
		return "spaceStoreHome";
	}
	
	@RequestMapping(path="/spaceStoreProductDetail", method=RequestMethod.GET)
	public String displaySpaceStoreProductDetail(HttpServletRequest request) {
		String stringid = request.getParameter("productId");
		Long id = Long.parseLong(stringid);
		for(Product p : storeDAO.getAllProducts())  {
			if(p.getId().equals(id)) {
				request.setAttribute("product", storeDAO.getProductById(id));
			}
		}
		return "spaceStoreProductDetail";
	}
	
	@RequestMapping(path="/spaceStoreProductDetail", method=RequestMethod.GET)
	public String displaySpaceStoreProductDetail(@RequestParam Long id, ModelMap map) {
			map.addAttribute("product", productDAO.getProductById(id));
		return "spaceStoreProductDetail";
	}
	
	
	
	@RequestMapping(path="/spaceStoreProductDetail", method=RequestMethod.POST)
	public String saveProduct(@RequestParam Long id,@RequestParam int quantity, ModelMap map) {
		Product product = productDAO.getProductById(id);
		shoppingCart.addToCart(product, quantity);
		map.addAttribute("shoppingCart", shoppingCart);
		return "redirect:/spaceStoreSummary";
	}
	
	@RequestMapping(path="/spaceStoreSummary", method=RequestMethod.GET)
	public String displayStoreSummary(ModelMap map) {
		map.addAttribute("shoppingCart", shoppingCart);
		return "/spaceStoreSummary";
	}
	
	
	

}
