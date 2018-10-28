package org.sample.errorreportingsystem.repositories.impl;

import org.sample.errorreportingsystem.model.Issue;
import org.sample.errorreportingsystem.repositories.IssueRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class InMemoryIssueRepository implements IssueRepository {

    private static final Map<Integer, Issue> ISSUE_MAP = new HashMap<>();

    private static Integer ISSUE_SEQUENCE = 3;

    static {
        ISSUE_MAP.put(1, new Issue(1, "Pagos", "Homero", "Simpson", "12345678", "hsimpson@fox.com", "Es una prueba de Homero", new Date()));
        ISSUE_MAP.put(2, new Issue(2, "Pagos", "Marge", "Simpson", "12345678", "msimpson@fox.com", "Es una prueba de Marge", new Date()));
    }

    @Override
    public void save(Issue issue) {
        issue.setId(ISSUE_SEQUENCE++);
        ISSUE_MAP.put(issue.getId(), issue);
    }

    @Override
    public List<Issue> findAll() {
        return ISSUE_MAP.values().stream().collect(Collectors.toList());
    }
}
