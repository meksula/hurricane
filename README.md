![picture](hurricane-logo.png)

# Hurricane Documentation Generator

### Features and description
Hurricane is a lightweight tool to rapid documentation generation helps with most popular web technologies like HTML, CSS or even JavaScript.
A process of documentation build is quick thanks to Hurricane - add dependency to your project or use commandline to prepare all staff.
This tool provide few useful features that could replace wearisome activities in everyday work of Software Developer.
- Documentation generation in most common format
- cURL and Postman collection generation based on endpoints exposed in source code
- Integration test files generation in java or groovy (sync or async libraries)
- Code snippets generation
- Full secure workflow: source code stay only in your local hard drive or git remote repository pointed by you
- Documentation in less than one minute from build process to production ready mode
- Free non-commercial hosting of documentation

Hurricane is able to read source code both from local storage and remote git repository server by enter credentials. 
Generated sources are publish ready on your host. If you want to automate Hurricane workflow you can send generated files to remote server over SSH.
You can use our web service to create account and hosting documentation for free!

#### Programming languages and frameworks supported
- [x] Java 8+ with Spring Framework 5 

### Technologies used
- Java 12 (openJDK preferred)
- Kotlin 1.3.14

### How to run
- simply run `java -jar hurricane-doc.jar`

#### Development mode
##### Requirements
- Java 12.0.1 (recommended version)
- Gradle 5.5.1 (highly recommended)

##### How to run
- Build jar archive with gradle by simply run command `gradle clean build`
- Next go to your jar in `build/libs` and run it with command `java -jar hurricane-doc.jar`
- [library as dependency mode ready soon]

### Versions and changelog

| Date          | Events/changes/features                     |
| ------------- | ------------------------------------------- |
| 27-07-2019    | Project initialized, basic structure added  |
| 07-08-2019    | Kotlin added, JavaFX removed                |