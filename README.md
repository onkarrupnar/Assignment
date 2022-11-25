# Assignment

About Framework 
 I used hybrid framework with test driven development approach by using page object model design pattern with page factory.
 followed java language for writing script in selenium using TestNG Framework

POM:page object model for creating directory for all webelements present on webpage.Every page has separate pom class and 
that class is responsible for identifying elements and perform operations.

TestNG: Which means Test Next generation it is a test management tool and a framework also which manages the test case execution 
and provides multiple annotations and keywords. 

Utility:Reason behind creating utility is for code reusabiltiy.we have multiple class maintained in utility package.

Properties file: we have config properties file which have data related to different environment url paths and login credentiels, so to 
read this data we have class in utility as configdataprovider.

Library:Which contains common user defined reusable methods.

Reports: We have extent report generator for generating html reports with all test step execution status.

Test Data: The data required for actual testing will we stored in excel format and that will be fetched by excel data provider.

   

