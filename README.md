# octane-gherkin
This script is a simple script to demonstrate the ability to have Cucumber tests results be reported back to Octane (via Jenkins).  You will need to make sure to have the Jenkins [HPE Application Automation Tools 5.2](https://wiki.jenkins.io/display/JENKINS/HPE+Application+Automation+Tools) plug in installed to perform the steps below

If you have an old version of the script or need to put the script in your devops container, use the following steps.
```
From a terminal window clone the following 
   git clone --mirror https://github.com/admpresales/octane-gherkin.git

Copy this project into the devops container 
   docker cp octane-gherkin.git devops:/gitrepo

Remove the local git
   rm -rf octane-gherkin.git

```


In Jenkins, you will need to create a Freestyle job and checkout the project from your git repo.

I suggest you use the following for your Maven goals

![Jenkins Build Section](docImg/jenkinsBuild.png?raw=true)

And enter the following for your Post Build actions 

![Jenkins Post Build Section](docImg/jenkinsPostBuild2.png?raw=true)

**NOTE**

Publish JUnit test result report
* the file name shown above comes from the name used in the test project (src/test/java/net.hpe/TestRunner) class

HPE Octane Cucumber test reporter
* Generally speaking, you shouldn't need to enter anything.  The above is based on the use of the Jenkins [HPE Application Automation Tools 5.2](https://wiki.jenkins.io/display/JENKINS/HPE+Application+Automation+Tools)

