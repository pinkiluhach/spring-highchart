package com.sample.springhighchart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;
import com.sample.springhighchart.service.GraphService;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GraphController {

    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @RequestMapping("/displayPieChart")
    public String pieChart(Model model) {
      LOGGER.info("Add Attibute value to Pie chart");
        model.addAttribute("chrome", 61.61);
        model.addAttribute("internetexplorer", 11.8);
        model.addAttribute("safari",8.69);
        model.addAttribute("firefox",10.85);
        model.addAttribute("other",7.05);
   return "pieChart";
    }

    @RequestMapping("/displayGame")
    public String test_Game(){
        LOGGER.info("Redirect page to sample game page");
        return "graphics-sample-game";
    }


}
