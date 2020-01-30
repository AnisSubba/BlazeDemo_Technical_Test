# BlazeDemo_Technical_Test

This is a Java Testing project using the IntelliJ IDEA. This project requires me to use the BDD method to automate the scenario(s),
to create automation testing using Java. On the website http://blazedemo.com (Which is a simple Travel Agency, which has departure and destination City.
Help you get the time, flight, price and allows you to choose the flight you desire. 

# IntelliJ IDEA :

In Intellij I had to make sure I have the needed Java Version which is 11.7, Chrome Driver has to be the same version as the Google Chrome.
As well a lot of dependency such as selenium and cucumber-JSON, which will allow one to write Gherkin syntax and write automation test which follows that syntax.

# Achieved :

In this project, I was able to look at various page and access them using automation testing. I was able to create automation code which navigates from the homepage, check various city on departure and destination dropdown box, click on the flight of your choosing and fill out the form.

SOME DEFECT FOUND:

As I was looking at the website I found some defect/data issue as no matter which city you choose it shows the same flight, time and Price.

As I was looking at the detail WebPage I found out that the taxes is always the same, which is higher than the actual flight.

As I was manually testing the login and registering I have found out that it has to function to the actual page as once logged In, there is only one function available which is logged out and if you try to navigate yourself to the travel page you are automatically be logged out.

# Could work on: 

As we have used windows machine all our training and myself personally and been given a mac to do this project, it made my time constrain a lot as I had to download Intellij, google chrome, chrome driver and set up the proper environment. 

I wasn't able to fully function the stepdefs and Gherkin syntax as I was having a minor problem with the chooseFlightPage as it does click it and the test does pass but the actual page doesn't navigate to the detail page. It is something I had to look upon more.
