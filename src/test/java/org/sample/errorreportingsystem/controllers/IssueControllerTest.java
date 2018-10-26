package org.sample.errorreportingsystem.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sample.errorreportingsystem.services.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@WebMvcTest(value = IssueController.class,
        includeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE))
public class IssueControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IssueService issueServiceMock;

    @Test
    public void newIssue_RedirectsToNewIssueForm_IfEverityngIsOk() throws Exception {
        ResultActions resultActions = this.mockMvc.perform(get("/issues/new"));

        resultActions.andExpect(status().isOk())
                .andExpect(view().name("issues/createNewIssue"));
    }
}
