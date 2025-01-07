Steps to Integrate Snyk for Vulnerability Scanning in a Java Project
This guide demonstrates how to integrate Snyk with a Java project hosted on GitHub to automatically scan and fix security vulnerabilities. The steps below outline the process for setting up the project, observing vulnerabilities, and resolving them using Snyk.

**Prerequisites**
A Snyk account (signed up via GitHub)
A Java project (using Maven) with a pom.xml file that contains known vulnerabilities
GitHub repository to host the project
**Steps Followed**
1.)Sign up for Snyk using GitHub:

I signed up for Snyk using my GitHub account.
2.)Push the Java Project to GitHub:

I created a simple Java project with a class App.java that prints "Hello, Snyk!".
I included a pom.xml file that contained a known vulnerability: an old version of Log4j (1.2.17), which is susceptible to a remote code execution vulnerability.
3.)Add the Project to Snyk Dashboard:

After pushing the project to GitHub, I added the repository to my Snyk account through the Snyk Dashboard.
Snyk automatically detected the project dependencies and scanned for vulnerabilities.
4.)Observe the Vulnerabilities in the Snyk Dashboard:

Snyk identified a high-severity vulnerability in the Log4j dependency, version 1.2.17, which is vulnerable to remote code execution.
The vulnerability was clearly displayed in the Snyk Dashboard with detailed information and suggested remediation.
5.)Update pom.xml to Use the Latest Version of Log4j:

I updated the pom.xml file to replace the vulnerable version of Log4j (1.2.17) with a secure version (2.17.1).

6.)Push the Updated Code to GitHub:

After updating the pom.xml file, I pushed the changes back to my GitHub repository.
7.)Observe that Snyk No Longer Detects Any Vulnerabilities:

Once the updated pom.xml was pushed, I refreshed the Snyk Dashboard.
Snyk no longer reported any issues, confirming that the vulnerability had been resolved by updating to the latest version of Log4j.
