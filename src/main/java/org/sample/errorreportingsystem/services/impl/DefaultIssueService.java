package org.sample.errorreportingsystem.services.impl;

import org.sample.errorreportingsystem.model.Issue;
import org.sample.errorreportingsystem.repositories.IssueRepository;
import org.sample.errorreportingsystem.services.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

@Service
public class DefaultIssueService implements IssueService {

    @Autowired
    private IssueRepository issueRepository;

    @Override
    public void saveNewIssue(Issue issue) {
        Assert.notNull(issue, "The issue cannot be null.");

        issue.setCreationDate(new Date());

        this.issueRepository.save(issue);
    }

    @Override
    public List<Issue> findAllIssues() {
        return this.issueRepository.findAll();
    }
}
