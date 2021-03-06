package com.yuliya1303.tests;

import com.yuliya1303.pages.GitIssuesPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class GitIssuesTest extends TestBase {
    String REPOSITORY = "Yuliya1303/homework5---JUnit";

    @Test
    @DisplayName("Issue tab is displayed by default test")
    @Owner("yuliyabyshko")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Repositories - Issues")
    @Story("Issue tab is displayed by default")
    @Tag("Smoke")
    void isIssueTabExists() {
        GitIssuesPage steps = new GitIssuesPage();

        steps.openMainPage();
        steps.searchRepository(REPOSITORY);
        steps.clickOnRepositoryLink(REPOSITORY);
        steps.checkIssueTabExisting();
    }
}
