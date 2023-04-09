# SELENIUM CHALLENGE :heavy_check_mark:

For the following challenge, the page http://the-internet.herokuapp.com/ will be used. Java, Maven, and Selenium should be used, as well as a testing library (TestNg is recommended). The code should be uploaded to a Git repository for proper validation.

Read this in other languages: [pt-br](README.pt.br.md).

The following criteria will be evaluated:
1. Project structure (pageObjects, pageTasks); :heavy_check_mark:
2. Object-oriented programming; :heavy_check_mark:
3. Code indentation and clarity; :heavy_check_mark:
4. Correct use of Java patterns will be evaluated (camel case). :heavy_check_mark:

## Challenge 1: :heavy_check_mark:
1. Access the page: http://the-internet.herokuapp.com/;
2. Access the "Add/Remove Elements" link;
3. Click on the "Add Element" button;
4. Validate if the label of the created button is "Delete".
* Extra: Add a message in the assert statement informing that the text is incorrect. :heavy_check_mark:

## Challenge 2: :heavy_check_mark:
This challenge aims to verify if the candidate knows how to use the "Select" class.
1. Access the page: http://the-internet.herokuapp.com/;
2. Access the "Dropdown" link;
3. Select option 2.

## Challenge 3: :heavy_check_mark:
1. Access the page: http://the-internet.herokuapp.com/;
2. Access the "Key Presses" link;
3. Enter a text;
4. Validate that the system returns the last keystroke entered in the label that is located just below.
* Extra: Add a dynamic validation using String manipulation, so that the test works with any text entered. (example: write "test" and the system should return "You entered: T"; write selenium and the system return "You entered: M". :heavy_check_mark:
