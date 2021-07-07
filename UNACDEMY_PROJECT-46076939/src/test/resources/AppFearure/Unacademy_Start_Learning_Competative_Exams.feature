Feature: Exploring Start Learning Option

  Background: 
    Given browser is launched
    Given User is on Unacdemy page

  Scenario: Choosing a goal in Competative Exams and exploring differen features
    When user clicks on Prepare for Competitive exams Start Learning button
    Then user is on Choose your goal page where the list of topics are displayed
    When user clicks on a Bank Exams to be the goal
    Then user is on goal home page
    When user scrolls down on home to verify different sections are present
    Then user can see sections like What youll get Section,Free Live classes Section,Prepare With Top Educators and so on
    #When user scrolls to find Free Live classes section
    #Then user is on Free Live classes section
    #When user clicks on the video present in Free Live Classes Section
    #Then user is on video page
    #And user clicks on back arrow mark
    #Then user is on Online Free Classes Page
    #And user clicks on Home link on side bar
    #Then user is on goal home page
    When user scrolls to find Free Live classes section
    And user clicks on See all link to explore all Free classes and Free Test Series
    Then user is on Online Free Classes Page
    When user clicks on Home link on side bar
    Then user is on goal home page
    When user scrolls to find Prepare With Top Educators Section
    Then user is on Prepare With Top Educators Section
    When user clicks on profile of Nimisha Bansal
    Then user is on the profile page of the Nimisha Bansal
    When user navigates to goal home page
    Then user is on goal home page
    When user scrolls to find  Comprehensive syllabus section on home page
    Then user can see different topics in the Comprehensive syllabus section
    When user clicks on the Reasoning topic
    Then user is navigated to the syllabus page of the respective topic
    When user navigates to goal home page
    Then user is on goal home page
    When user scrolls to find Get the Learning App Section
    Then user  can see icons to download the app from App Store and Google Play
    When user clicks on Get It On Google Play icon
    Then user is on Google Play Installation Page

  Scenario: Choosing a goal in Class Learning and exploring different features
    When user clicks on Prepare for Class 6 to 12 Start Learning button
    Then user is on Choose your goal page where the list of goals of Class 6 to 12 are displayed
    When user clicks on a Class 12 CBSE to be the goal
    Then user is on Goal Home page
    When user scrolls down on home to view different sections are present
    Then user can see sections like Free Live classes Section,Prepare With Top Educators and so on
    When user scrolls down to find Batches for syllabus completion section
    Then user is on Batches for syllabus completion section
    When user clicks on MCQ Practice Batch for Term-1
    Then user is on MCQs Practice Batch for TERM 1 - Science
    When user navigates to goal home page
    Then user is on Goal Home page
    When user scrolls down to find Courses starting soon section
    Then user is on Courses starting soon section
    When user clicks on Capsule course on inverse trignometry
    Then user is on Capsule course on inverse trignometry page
    When user navigates to back goal home page
    Then user is on Goal Home page
    When user scrolls down to find Best of all time section
    Then user is on Best of all time section
    When user clicks on Detailed Course On English
    Then user is on Detailed Course On English page
    When user navigates to back goal home page
    Then user is on Goal Home page
    When user scrolls down to find Track your preparation section
    Then user is on Track Your Preparation section
    When user clicks on Acadamic Skill Set Test
    Then user is on Acadamic Skill Set Test Enrollment Page
