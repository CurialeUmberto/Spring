 package com.newProject.NewProject;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerSaluti{
	
	@RequestMapping(value="/saluto",method=RequestMethod.GET)
	  public String unSaluto(){
	    return "ciao-mondo";

}
}
