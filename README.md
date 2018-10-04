# octane-gherkin
This script is a simple script to demonstrate the ability to have Cucumber tests results be reported back to Octane (via Jenkins).  You will need to make sure to have the Jenkins [Micro Focus Application Automation Tools](https://wiki.jenkins.io/display/JENKINS/Micro+Focus+Application+Automation+Tools) plug in installed to perform the steps below

If you have an old version of the script or need to put the script in your devops container, use the following steps.  Note: This step was intended for those who are leveraging the Micro Focus demo platform NImbus.  This example can still be used if you are not using Nimbus simply by creating your Jenkins job to point at the [octane-gherkin](https://github.com/admpresales/octane-gherkin) project as part of the build step.
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
NOTE: You can change the execution options based on tags as explained in the [TestRunner.java](https://github.com/admpresales/octane-gherkin/blob/tag-usage/src/test/java/net/mf/TestRunner.java) file

And enter the following for your Post Build actions 

![Jenkins Post Build Section](docImg/jenkinsPostBuild2.png?raw=true)

**NOTE**

Publish JUnit test result report
* the file name shown above comes from the name used in the test project (src/test/java/net.hpe/TestRunner) class

Octane Cucumber test reporter
* Generally speaking, you shouldn't need to enter anything.  The above is based on the use of the Jenkins  [Micro Focus Application Automation Tools](https://wiki.jenkins.io/display/JENKINS/Micro+Focus+Application+Automation+Tools)

