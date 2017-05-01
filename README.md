# automated-prioritization

The tool should include atleast the total and additional strategies
furthermore the tool should be easy to use for projects with JUNIT tests
and the Maven build system. For example, after configuring the pom.xml
for the project under test, the user should be able to directly run the
prioritized tests with "mvn test" command. Evaluate the tool on 10 real world
programs from Github.

steps to execute:
1. consider any github project and download it to your local machine
2. include the following plugin
      ```
	<plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
          <configuration>
          	<argLine>-javaagent:C:\Sites\automated-prioritization\target\agent.jar</argLine> 
			     <additionalClasspathElements>
             <additionalClasspathElement>${project.build.sourceDirectory}</additionalClasspathElement>
             <additionalClasspathElement>${project.build.testSourceDirectory}</additionalClasspathElement>
          </additionalClasspathElements>

           <properties>
			     	<property>
			     		<name>listener</name>
			     		<value>edu.utdallas.JUnitExecListener</value>
			     	</property>
			     </properties>  
        </configuration>
      </plugin>
      ```
3. if there is any dependency error regarding asm then make sure to include asm-5.2 jar and mention it as dependency in pom file
    ```	
    <dependency>
      <groupId>asm</groupId>
      <artifactId>asm</artifactId>
      <version>5.2</version>
      <scope>system</scope>
      <systemPath>${project.basedir}/asm-5.2.jar</systemPath>
  </dependency>
  ```
4. Open command prompt and navigate to the directory where the GitHub project is downloaded and run the following command:
	```
	mvn test
	```
5. Now, the total and additional files gets generated.

Note: kindly check the output folder where I have included the output and pom details of the ten github projects on which I have run the tool.

