# API Automated testing for reqres.in (https://reqres.in/)

## :page_with_curl:         Content

➠ [Covered functionality](#globe_with_meridians-covered-functionality)

➠ [Technology stack](#computer-technology-stack)

➠ [Running tests from the terminal](#technologist-running-tests-from-the-terminal)

➠ [Build in Jenkins](#-jenkins-build-main-page)

➠ [Test results report in Allure Report](#-test-results-report-in-allure-report)

➠ [Integration with Allure TestOps](#-integration-with-allure-testops)

➠ [Telegram notifications using a bot](#-telegram-notifications-using-a-bot)

## <a name="globe_with_meridians-covered-functionality"></a>:globe_with_meridians: Covered functionality

### API

- [x] Successful Login
- [x] Unsuccessful Login
- [x] Successful Register
- [x] Unsuccessful Register
- [x] Check list resource
- [x] Check response for non-existent user
- [x] Creating user

## :computer: Technology stack

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Allure TestOps" src="images/logo/alluretestops.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
<img width="6%" title="Rest Assured" src="images/logo/rest.png">
</p>

```mermaid        
    stateDiagram-v2
        State1: START
        State2: Java & IntelliJ IDEA
        State3: Selenide & JUnit5
        State4: Gradle
        State5: GitHub
        State6: Jenkins
        State7: Allure Report and Allure TestOps
        State8: Telegram
        State9: STOP
        State1 --> State2
        State2 --> State3
        State3 --> State4
        State4 --> State5
        State5 --> State6
        State6 --> State7
        State7 --> State8
        State8 --> State9
        note right of State2 : Working with code
        note left of State3 : Frameworks
        note right of State4 : Project build
        note left of State5 : Version control system and project hosting
        note right of State6 : Parameterization and run build
        note right of State7 : Reporting
        note left of State8 : Notifications
```

## :technologist: Running tests from the terminal

### Local test run:

```
gradle clean test
```

### Remote test run:

```
clean
test
```

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Jenkins Build Main Page

<p align="center">
  <img src="images/screenshots/jenkinsMainPage.jpg">
</p>

## <img width="4%" title="Allure Report" src="images/logo/Allure_Report.svg"> Test results report in Allure Report

### :pushpin: Main page of the Allure report

<p align="center">
<img title="Allure Overview" src="images/screenshots/mainAR.jpg">
</p>

### :pushpin: Page with tests


<p align="center">
<img title="Allure Behaviors" src="images/screenshots/pageWithTest.jpg">
</p>

### :pushpin: Window with charts

<p align="center">
<img width="30%"  title="Allure Overview Dashboard" src="images/screenshots/chartsR.jpg">
</p>



## <img width="4%" title="Allure TestOps" src="images/logo/alluretestops.svg"> Integration with Allure TestOps

### :pushpin: Test cases with launch history

<p align="center">
<img title="Allure Overview" src="images/screenshots/testCAseTesOps.jpg">
</p>

### :pushpin: Dashboard


<p align="center">
<img title="Allure Behaviors" src="images/screenshots/dashboardTO.jpg">
</p>



## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Telegram notifications using a bot

> After the build is completed, the bot created in <code>Telegram</code> automatically processes and sends a message with a report.
<p align="center">
<img width="30%"  title="Telegram Notifications" src="images/screenshots/telegBot.jpg">
</p>


<a target="_blank" href="https://t.me/YuriyMqa">t.me/dmitrishin13</a>
