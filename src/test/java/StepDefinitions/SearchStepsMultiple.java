package StepDefinitions;

import Entity.Product;
import Implementation.SearchMultiple;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

import java.util.List;


@CucumberContextConfiguration
public class SearchStepsMultiple {

    Product product;
    SearchMultiple searchMultiple;

    @Given("^I have a search field on Ebay Page$")
    public void iHaveASearchFieldOnEbayPage() {
        System.out.println("Step 1: I am on the search page");
    }

    @When("^I search for a product with name (.*) and price (.*)$")
    public void iSearchForAProductWithNameAndPrice(String productName, int productPrice) {
        System.out.println("Step 2: I have search a product with name: " + productName +
                " and price " + productPrice);
        product = new Product(productName, productPrice);
    }

    @Then("^product with name (.*) should be displayed$")
    public void productWithNameShouldBeDisplayed(String productName) {
        System.out.println("Step 3: product " + productName + " is displayed");
        searchMultiple = new SearchMultiple();
        List<String> names = searchMultiple.displayProducts(product);
        if (names == null || names.isEmpty()) {
            throw new RuntimeException("Product Listed not found in search catalog");
        } else {
            System.out.println("Searched products are: " + names);
        }
    }

}
