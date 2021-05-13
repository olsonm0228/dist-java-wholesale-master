package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.repos.WholesaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class theController {
    @Autowired
    private WholesaleOrderRepository orderRepository;

    @RequestMapping("/")
    public String showOrderPage(Model model){
        model.addAttribute("orderList", orderRepository.findAll());
        return "index";
    }
}
