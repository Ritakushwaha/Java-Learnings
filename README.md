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

## 3. Run the Maven Java Project

```
java -classpath target/classes/ com.example.App
```

## 4. Package maven project

```
mvn package
```


