package org.sample.errorreportingsystem.controllers;

import org.sample.errorreportingsystem.model.Issue;
import org.sample.errorreportingsystem.services.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IssueController {

    @Autowired
    private IssueService issueService;

    @GetMapping("/issues/new")
    public String newIssue(Map<String, Object> model) {
        model.put("issue", new Issue());
        return "issues/createNewIssue";
    }

    @PostMapping("/issues/new")
    public ModelAndView newIssue(Issue issue, BindingResult result) {
        this.issueService.saveNewIssue(issue);
        ModelAndView mav = new ModelAndView("welcome");
        mav.addObject("selections", this.issueService.findAllIssues());
        return mav;
    }

    @GetMapping("/")
    public ModelAndView welcome(Model model) {
        ModelAndView mav = new ModelAndView("welcome");
        mav.addObject("selections", this.issueService.findAllIssues());
        return mav;
    }
}
