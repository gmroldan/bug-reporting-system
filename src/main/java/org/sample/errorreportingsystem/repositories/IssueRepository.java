package org.sample.errorreportingsystem.repositories;

import org.sample.errorreportingsystem.model.Issue;

public interface IssueRepository {

    void save(Issue issue);
}
