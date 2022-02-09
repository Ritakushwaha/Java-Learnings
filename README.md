# Java Learning

# Maven Project creation

## 1. Create Maven Project Architecture

```
mvn archetype:generate -DgroupId=com.example -DartifactId=MavenProject -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## 2. Compile the Maven Java Project

```
mvn clean compile
```
Before running above code make sure your pom file should contain the following properties -

```
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
</properties>
```

```
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-shade-plugin</artifactId>
            <version>3.2.1</version>
            <executions>
                <!-- Run shade goal on package phase -->
                <execution>
                <phase>package</phase>
                <goals>
                    <goal>shade</goal>
                </goals>
                    <configuration>
                        <artifactSet>
                            <excludes>
                                <exclude>org.apache.flink:force-shading</exclude>
                                <exclude>com.google.code.findbugs:jsr305</exclude>
                                <!--exclude>org.slf4j:*</exclude-->
                                <!--exclude>log4j:*</exclude-->
                            </excludes>
                        </artifactSet>
                        <filters>
                            <filter>
                            <!-- Do not copy the signatures in the META-INF folder.
                            Otherwise, this might cause SecurityExceptions when using the JAR. -->
                            <artifact>*:*</artifact>
                            <excludes>
                                <exclude>META-INF/*.SF</exclude>
                                <exclude>META-INF/*.DSA</exclude>
                                <exclude>META-INF/*.RSA</exclude>
                            </excludes>
                            </filter>
                        </filters>
                        <transformers>
                            <transformer implementation="org.apache.maven.plugins.shade.resource.ManifestResourceTransformer">
                                <mainClass>com.example.App</mainClass>
                            </transformer>
                
                            <!-- append default configs -->
                            <transformer implementation="org.apache.maven.plugins.shade.resource.AppendingTransformer">
                                <resource>reference.conf</resource>
                            </transformer>
                        
                        </transformers>
                    </configuration>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

## 3. Run the Maven Java Project

```
java -classpath target/classes/ com.example.App
```

## 4. Package maven project

```
mvn package
```

## 5. Run the jar file

```
java -jar /home/rita/Documents/Java-Learnings/MavenProject/target/MavenProject-1.0-SNAPSHOT.jar 
```
