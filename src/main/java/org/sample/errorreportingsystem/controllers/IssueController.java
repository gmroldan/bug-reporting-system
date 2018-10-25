package org.sample.errorreportingsystem.controllers;

import org.sample.errorreportingsystem.model.Issue;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class IssueController {

    @GetMapping("/issues/new")
    public String newIssue(Map<String, Object> model) {
        model.put("issue", new Issue());
        return "issues/createNewIssue";
    }

    @PostMapping("/issues/new")
    public String newIssue(Issue issue, BindingResult result) {
        return "underConstruction";
    }
}