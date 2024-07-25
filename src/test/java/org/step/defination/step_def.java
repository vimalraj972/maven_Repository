package org.step.defination;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Test_Runner;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step_def {
	
	
	public static WebDriver driver = Test_Runner.driver;
	@Given("user Launch The Adactin Application")
	public void user_launch_the_adactin_application() {
		driver.get("https://adactinhotelapp.com/");
	 }
	@When("user Enters The Username In The Username Field")
	public void user_enters_the_username_in_the_username_field() {
	   driver.findElement(By.id("username")).sendKeys("vimalraj972");
	}
	@When("user Enters The Password In The Password Field")
	public void user_enters_the_password_in_the_password_field() {
	    driver.findElement(By.id("password")).sendKeys("vimal8754");
	}
	@Then("user Clicks The Login Button And It Navigates To Search Hotel Page")
	public void user_clicks_the_login_button_and_it_navigates_to_search_hotel_page() {
	   driver.findElement(By.id("login")).click();
	}
	@Then("user Select The Hotel Location At The Location Box")
	public void user_select_the_hotel_location_at_the_location_box() {
	    WebElement location = driver.findElement(By.id("location"));
	    Select l = new Select(location);
	    l.selectByIndex(1);
	}
	@Then("user Select The Hotel Name In The Hotels Box")
	public void user_select_the_hotel_name_in_the_hotels_box() {
	    WebElement hotels = driver.findElement(By.id("hotels"));
	    Select h = new Select(hotels);
	    h.selectByValue("Hotel Sunshine");
	}
	@Then("user Select The Room Type")
	public void user_select_the_room_type() {
	    WebElement roomtype = driver.findElement(By.id("room_type"));
	    Select r = new Select(roomtype);
	    r.selectByVisibleText("Double");
	}
	@Then("user Select The Number Of Rooms")
	public void user_select_the_number_of_rooms() {
	   WebElement room_type = driver.findElement(By.id("room_nos"));
	   Select t = new Select(room_type);
	   t.selectByIndex(1);
	}
	@Then("user Entres The Check_in Date")
	public void user_entres_the_check_in_date() {
	  driver.findElement(By.id("datepick_in")).sendKeys("30/08/2024");
	  
	   
	}
	@Then("user Entres The Check_Out Date")
	public void user_entres_the_check_out_date() {
		driver.findElement(By.id("datepick_out")).sendKeys("31/08/2024");
	   	}
	@Then("user Select The Adults Per Room")
	public void user_select_the_adults_per_room() {
	   WebElement adult_room = driver.findElement(By.id("adult_room"));
	   Select a = new Select(adult_room);
	   a.selectByIndex(2);
	}
	@Then("user select The Childrens Per Room")
	public void user_select_the_childrens_per_room() {
		WebElement child_room = driver.findElement(By.id("child_room"));
		Select c = new Select(child_room);
		c.selectByIndex(1);
	  	}
	@Then("user Click The Search Box And It Navigates To Select The Hottel")
	public void user_click_the_search_box_and_it_navigates_to_select_the_hottel() {
		driver.findElement(By.id("Submit")).click();
	    	}
	@Then("user Select The Hotel By Click The Radio Button")
	public void user_select_the_hotel_by_click_the_radio_button() {
	    driver.findElement(By.id("radiobutton_0")).click();
	}
	@Then("user  Click The Continue Button")
	public void user_click_the_continue_button() {
	    driver.findElement(By.id("continue")).click();
	}
	@Then("user Entres The First Name")
	public void user_entres_the_first_name() {
	    driver.findElement(By.id("first_name")).sendKeys("vimal");
		
	}
	@Then("user Entrs  The Last Name")
	public void user_entrs_the_last_name() {
	   driver.findElement(By.id("last_name")).sendKeys("raj.A");
	}
	@Then("user Entres The Billing Name")
	public void user_entres_the_billing_name() {
	   driver.findElement(By.id("address")).sendKeys("no1,annaikunam,sallai,elapakkam");
	}
	@Then("user Entres  The Credit Card Number")
	public void user_entres_the_credit_card_number() {
	    driver.findElement(By.id("cc_num")).sendKeys("795466466566452136");
	}
	@Then("user Select  The Creadit Card Type")
	public void user_select_the_creadit_card_type() {
	    WebElement cc_type = driver.findElement(By.id("cc_type"));
	    Select c = new Select(cc_type);
	    c.selectByIndex(2);
	}
	@Then("user  Select  The Card Expire Month")
	public void user_select_the_card_expire_month() {
	    WebElement card_month = driver.findElement(By.id("cc_exp_month"));
	    Select m  = new Select(card_month);
	    m.selectByIndex(3);
	}
	@Then("user   Select The Card Expire Year")
	public void user_select_the_card_expire_year() {
	  WebElement card_year = driver.findElement(By.id("cc_exp_year"));
	  Select y  = new Select(card_year);
	  y.selectByValue("2024");
	}
	@Then("User  Entres The Cvv Number")
	public void user_entres_the_cvv_number() {
	   driver.findElement(By.id("cc_cvv")).sendKeys("565");
	}
	@Then("user  Click The Book Now Button")
	public void user_click_the_book_now_button() throws InterruptedException {
	   driver.findElement(By.id("book_now")).click();
	   Thread.sleep(5000);
	   	}
	@Then("user Take A Screenshot")
	public void user_take_a_screenshot() throws IOException, InterruptedException {
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File des = new File("C:\\Users\\HP\\eclipse-workspace\\Java_Project\\snap.png");
	   FileHandler.copy(src, des);
	   
	}
	
	@Then("user Click The Logout Button")
	public void user_click_the_logout_button() {
	 driver.findElement(By.id("logout")).click();  
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}