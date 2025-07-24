package com.javaguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.javaguide.Autowireds.firstAuto;
import com.javaguide.Components.FirstComp;
import com.javaguide.controller.PizzaController;

@SpringBootApplication
public class JavaguideApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(JavaguideApplication.class, args);
		ComponentClass componentclass = (ComponentClass) applicationContext.getBean(ComponentClass.class);
		// Both Works
		// ComponentClass componentclass = (ComponentClass) applicationContext.getBean("componentclass");
		System.out.println(componentclass.getMessage());

		OtherComponentMethod otherMethod = (OtherComponentMethod) applicationContext.getBean(OtherComponentMethod.class);
		System.out.println(otherMethod.showMessage());

		// FirstComp firstcomp1 = (FirstComp) applicationContext.getBean("firstcomp1");	// not working
		FirstComp firstcomp1 = (FirstComp) applicationContext.getBean(FirstComp.class);
		System.out.println(firstcomp1.giveMessage());

		// firstAuto firstauto = (firstAuto) applicationContext.getBean(firstAuto.class);		// try calling this in pizzaController
		// System.out.println(firstauto.getPizza());

		PizzaController pizzacontroller = (PizzaController) applicationContext.getBean(PizzaController.class);
		System.out.println(pizzacontroller.getPizza());
	
	}
}

@Component
class ComponentClass{
	public String getMessage(){
		return "This is the Get Message! From Faizan Alam";
	}
}


@Component
class OtherComponentMethod{
	public String showMessage(){
		return "This is just for the testing purpose";
	}
}