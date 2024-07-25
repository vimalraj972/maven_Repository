Feature: Book Hotel Rooms In The Adactin Application
@smoketest
Scenario: User Login Into The Adactin Application


Given user Launch The Adactin Application
When  user Enters The Username In The Username Field
And   user Enters The Password In The Password Field
Then  user Clicks The Login Button And It Navigates To Search Hotel Page  
Then  user Select The Hotel Location At The Location Box
Then  user Select The Hotel Name In The Hotels Box
Then  user Select The Room Type 
Then  user Select The Number Of Rooms
Then  user Entres The Check_in Date 
Then  user Entres The Check_Out Date
Then  user Select The Adults Per Room 
Then  user select The Childrens Per Room
Then  user Click The Search Box And It Navigates To Select The Hottel
And   user Select The Hotel By Click The Radio Button
Then user  Click The Continue Button
Then  user Entres The First Name 
Then  user Entrs  The Last Name
Then   user Entres The Billing Name 
Then   user Entres  The Credit Card Number
Then   user Select  The Creadit Card Type
Then   user  Select  The Card Expire Month 
Then   user   Select The Card Expire Year
Then   User  Entres The Cvv Number
Then   user  Click The Book Now Button
Then   user Take A Screenshot
Then   user Click The Logout Button

