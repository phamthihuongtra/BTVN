package com.example.baitapvenha.Controller;

import com.example.baitapvenha.model.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhoneController {
    @GetMapping("/home")
    public String showFrom(Model model){
        model.addAttribute("phone", new Phone());
        return ("/index");
    }

    @PostMapping("/")
    public String checkValidation (@Validated @ModelAttribute("phone")Phone phone,
                                   BindingResult bindingResult, Model model){
        new Phone().validate(phone, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return ("/index");
        }else {
            model.addAttribute("phone", phone);
            return ("/index");
        }
    }
}
