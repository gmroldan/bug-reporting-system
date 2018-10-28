package org.sample.errorreportingsystem.repositories;

import org.sample.errorreportingsystem.model.Issue;

import java.util.List;

public interface IssueRepository {

    void save(Issue issue);

    List<Issue> findAll();
}
