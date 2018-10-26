package org.sample.errorreportingsystem.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sample.errorreportingsystem.model.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IssueServiceTest {

    @Autowired
    private IssueService issueService;

    @Test
    public void saveNewIssue_SuccessfullOperation_IfIssueIsNotNull() throws Exception {
        Issue issue = new Issue("Pagos", "Homero", "Simpson", "12345678", "hsimpson@fox.com", "Es una prueba");

        this.issueService.saveNewIssue(issue);
    }

    @Test (expected = IllegalArgumentException.class)
    public void saveNewIssue_ThrowsIllegalArgumentException_IfIssueIsNull() throws Exception {
        this.issueService.saveNewIssue(null);
    }
}