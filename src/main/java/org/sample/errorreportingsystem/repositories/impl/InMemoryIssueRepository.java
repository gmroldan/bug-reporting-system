package org.sample.errorreportingsystem.repositories.impl;

import org.sample.errorreportingsystem.model.Issue;
import org.sample.errorreportingsystem.repositories.IssueRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryIssueRepository implements IssueRepository {

    private static final Map<Integer, Issue> ISSUE_MAP = new HashMap<>();

    private static Integer ISSUE_SEQUENCE = 1;

    @Override
    public void save(Issue issue) {
        issue.setId(ISSUE_SEQUENCE++);
        ISSUE_MAP.put(issue.getId(), issue);
    }
}
