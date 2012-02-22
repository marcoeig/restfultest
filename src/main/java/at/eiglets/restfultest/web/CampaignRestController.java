package at.eiglets.restfultest.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import at.eiglets.restfultest.domain.Campaign;
import at.eiglets.restfultest.service.CampaignService;

@Controller
public class CampaignRestController {

	@Autowired
	private CampaignService service;
	
	@RequestMapping(value = "/campaigns", method = RequestMethod.GET)
	@ResponseBody
	public Campaign campaigns(){
		return service.findById(1);
	}
	
	@RequestMapping(value = "/campaigns", method = RequestMethod.POST)
	@ResponseBody
	public Campaign postCampaign(@Valid @RequestBody final Campaign campaign){
		return campaign;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
	public String handleValidationFailure(final MethodArgumentNotValidException e) {
		return e.getMessage();
	}
	
}
