package com.bookit.step_definitions;

import com.bookit.database.UserDB;
import com.bookit.pages.SelfPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class SelfStepDefinitions {

    SelfPage selfpage = new SelfPage();
    UserDB userDB= new UserDB();

    //      | first-name | last-name | email                       | password | role                | campus-location | batch-number | team-name      |
    //      | Lesly      | SDET      | 133lessleefromb15@email.com | 1111     | student-team-member | VA              | 15           | Online_Hackers |
    @Then("user verifies that information displays correctly:")
    public void user_verifies_that_information_displays_correctly(List<Map<String ,String>> dataTable) {
        System.out.println("=======================UI VALIDATION===================");
        String fullName = dataTable.get(0).get("first-name")+" "+dataTable.get(0).get("last-name");
        Assert.assertEquals(fullName,selfpage.getUserInfo("name"));
        Assert.assertEquals(dataTable.get(0).get("role"),selfpage.getUserInfo("role"));
        Assert.assertEquals(dataTable.get(0).get("campus-location"),selfpage.getUserInfo("campus"));
        Assert.assertEquals("#"+dataTable.get(0).get("batch-number"),selfpage.getUserInfo("batch"));
        Assert.assertEquals(dataTable.get(0).get("team-name"),selfpage.getUserInfo("team"));

        System.out.println("=======================DB VALIDATION===================");
        Assert.assertTrue(userDB.checkIfUserExistInDB(dataTable.get(0).get("email")));



    }

}
