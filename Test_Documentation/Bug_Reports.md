| | | | | | | | | | | | | |
|-|-|-|-|-|-|-|-|-|-|-|-|-|
|Bug ID|Bug Name|Description|Preconditions|Steps to reproduce|Test Data|Expected results|Actual results|Environment|Reporter|Assignee|Priority|Severity|
|BUG - 01|Submit button in Practice Form functionality in Forms section is not visible|User cant click on submit button, because the submit button is not visible |1. Chrome used 2. Navigate to: https://demoqa.com/|1. Click on Forms section 2. Click Practice Form item on the left navigation 3. Enter First Name 4. Enter Last Name 5. Enter Email 6. Click Gender 7. Enter Mobile 8. Enter Date of Birth 9. Enter Subjects 10. Click Hobbies check box 11. Choose picture 12. Enter Current Address 13. Select State 14. Select City 15. Click Submit|1. First Name input: Petar 2. Last Name input: Petrovic 3. Email input: petarpetrovic@email.com 4. Gender: Male 5. Mobile input: 0678956328 6. Date of Birth input: 05 May 1997 7. Subjects input: English 8. Hobbies: Music 9. Choose picture: D:\image3.png 10. Current Address input: Novosadska 10 11. Select State: NCR 12. Select City: Delhi|Popup message "Thanks for submitting the form" with data should appear|The Submit button is not visible, and the user cannot click on it|QA|Milan Corluka|Developer|Major|Minor|
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
![image](https://user-images.githubusercontent.com/105938336/174463848-b126beb8-c5f9-411e-acdc-11e27ddbccee.png)
 | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
|BUG - 02|Subject in Practice Form functionality in Forms section doesn't work when the user deletes last subject|When the user deletes last subject, website crushes and white screen appears|1. Chrome used 2. Navigate to: https://demoqa.com/|1. Click on Forms section 2. Click Practice Form item on the left navigation 3. Enter Subject 4. Click "x" on subject|1. Subject input: English|Subject should be deleted and input field empty|Website crushes and white screen appears|QA|Milan Corluka|Developer|Critical|Major|
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
| | | | | | | | | | | | | |
|BUG - 03|New Window Message in Browser Windows functionality in Alerts, Frame & Windows section doesn't work properly with automation|WebDriver can not switch to New Window and can not find element that contains text in New Window Message|1. Chrome used 2. Navigate to: https://demoqa.com/|1. Click on  Alerts, Frame & Windows section 2. Click Browser Windows item on the left navigation 3. Click on "New Window Message" button 4. Switch to New Window| |New Window should be opened and message "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization." should appear in that Window|New Window opened and expected message appeared in that Window, but durning automation couldn't switch to that Window and find element |QA|Milan Corluka|Developer|Minor|Minor|
