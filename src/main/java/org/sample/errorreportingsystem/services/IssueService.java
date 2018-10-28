package org.sample.errorreportingsystem.services;

import org.sample.errorreportingsystem.model.Issue;

import java.util.List;

public interface IssueService {

    void saveNewIssue(Issue issue);

    List<Issue> findAllIssues();
}
