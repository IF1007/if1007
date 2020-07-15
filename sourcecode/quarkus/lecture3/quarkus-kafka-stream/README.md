# quarkus-messaging project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Kafka Connector Extension

Connect to Kafka with Reactive Messaging

```
./mvnw quarkus:add-extension -Dextensions="io.quarkus:quarkus-smallrye-reactive-messaging-kafka"
```

## Running the example

### Start Kafta
```` 
docker-compose up
````
## Running the application in dev mode
```
./mvnw quarkus:dev
```
## Access url
```
http://localhost:8080/names.html

http://localhost:8080/names/stream
```


## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `quarkus-messaging-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/quarkus-messaging-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/quarkus-messaging-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.