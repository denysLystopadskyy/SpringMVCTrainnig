package com.luv2code.springdemo.mvc.validation;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @InitBinder
    public void trimLastName(WebDataBinder dataBinder) {
        StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, trimmerEditor);
    }

    @RequestMapping("/processFrom")
    public String processCustomerForm(@Valid @ModelAttribute("customer") Customer theCustomer,
                                      BindingResult bindingResult) {
        System.out.println(theCustomer);
        System.out.println("");
        System.out.println("Binding result: " + bindingResult);
        System.out.println("");


        if (bindingResult.hasErrors()) {
            return "customer-form";
        }

        return "customer-confirmation";
    }

}
