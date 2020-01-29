# BlazeDemo_Technical_Test

# Introduction:

This is a Java Testing project using the Intellij IDEA. This project requires me use the BDD method to automate the scenario(s),
to create automation testing using Java. On the website http://blazedemo.com (Which is a simple Travel Agency, which has departure and destination City.
Help you get the time, flight, price and allows you to choose the flight you desire. 

# Intellij IDEA :

In Intellij I had to make sure I have the needed Java Version which is 11.7, Chrome Driver has to be the same version as the Google Chrome.
As well lot of dependency such as selenium and cucumber-json, which will allow one to write gherkin syntax and write automation test which follow that syntax.

# Achieved :

In this project I was able to look at various different page and access them using automation testing. I was able to create automation code which navigate from the homepage, check various city on departure and destination dropdown box, click on the flight of your choosing and fill out the form.

SOME DEFECT FOUND:

As I was looking at the website I found some defect/data issue as no matter which city you choose it shows the same flight, time and Price.

As I was looking at the detail WebPage I found out that the taxes is always the same, which is higher then actual flight.

wAs well when log In and registering i have found out that it has to funtion to the actuall page as once logIn and navigating you self to the travel page you are automatically logged out.

# Could work on: 

As we have used windows machine all our traning and myself personally and been given a mac to do this project, it made me time constrain a lot as I had to download Intellij, google chrome, chrome driver and set up the proper environment. 

I wasn't able to write the stefdef as I was having a minor problem with the chooseFlightPage as it do click it and the test does pass but the actuall page doesn't navigate to the detailPage. It is something I had to look upon more.

