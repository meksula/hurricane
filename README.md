![picture](hurricane-logo.png)

# Hurricane Documentation Generator

### Features and description
Hurricane is lightweight tool build to rapid documentation generation in most popular web technologies like HTML, CSS or even JavaScript.
This tool provide few useful features that could replace wearisome activities in everyday work of Software Developer.
- Documentation generation in most common format
- cURL and Postman collection generation based on endpoints exposed in source code
- Integration test files generation in java or groovy (sync or async libraries)
- Code snippets generation
- Full secure workflow: source code stay only in your local hard drive or git remote repository pointed by you

Hurricane is able to read source code both from local storage and remote git repository server by enter credentials. Generated sources are publish ready on your hosting. If you want to automate Hurricane workflow you can send generated files to remote server over SSH. 

#### Programming languages and frameworks supported
- Java 8+ with Spring Framework 5

### Technologies used
- Java 12 (openJDK)
- JavaFX 12

### How to run

#### Development mode
##### Requirements
- Java 12.0.1 (recommended version)
- OpenJFX 12 (javafx-sdk-11.0.2 available in official website)
- Gradle 5.5.1 (highly recommended)

##### How to run
- Build jar archive with gradle by simply run command `$gradle clean build`
- Next go to your jar in `build/libs` and run it with command `java -jar hurricane-doc.jar`
- If you want to run project in Intellij Idea, open Edit configuration button, indicate Main.class and 
  add this row in VM options: `--module-path /Library/Java/Extensions/javafx-sdk-11.0.2/lib --add-modules=javafx.controls`
  Notice that you need to replace path to JavaFX to your own of course.

### Versions and changelog

| Date          | Events/changes/features |
| ------------- | ------------------------------------------- |
| 27-07-2019    | Project initialized, basic structure added  |
