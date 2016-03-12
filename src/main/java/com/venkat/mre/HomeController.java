package com.venkat.mre;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.venkat.mre.domain.Movie;
import com.venkat.mre.repositories.MovieRepository;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
/*	@Autowired
	MovieRepository movieRepository;*/
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		//Accessing MongoDB using MongoTemplate
		MongoOperations mongoOperation = (MongoOperations)mongoTemplate;
		
		Movie movie = new Movie(510, "Flywheel ", "Drama");
		// save
		if(mongoOperation==null){
			logger.info("MongoOperations is null");
		}else{
			logger.info("MongoOperations is not null");
			mongoOperation.save(movie);
			logger.info(movie + "Movie Details successfully saved");
		}
		
		//Accessing MongoDB using MovieRepositories
		Movie movie2 = new Movie(526, "Facing the Giants", "Sport");
		if(mongoOperation==null){
			logger.info("movieRepository is null");
		}else{
			logger.info("movieRepository is not null");
			
			mongoOperation.save(movie2);
			
			logger.info(movie2 + "Movie Details successfully saved");
		}		
	
		return "home";
	}
	
}
