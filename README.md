# Kotlin, Vert.x and Gradle

A sample project using [Kotlin](http://kotlinlang.org), [Vert.x](http://vertx.io) and [Gradle](http://gradle.org).

## Prerequisites

- JDK8

# Build

Build as follows:

    ./gradlew distZip

# Unpack

Once built, you can find the distribution under the `build/distributions` directory. You can unpack and run it as follows:

## Linux/Mac

    unzip build/distributions/kotlin-vertx -d build/distributions/

## Windows

Assuming you're using Powershell 5+:

    Expand-Archive .\build\distributions\kotlin-vertx.zip  .\build\distributions\

# Run

Once unpacked, run as follows:

    ./build/distributions/kotlin-vertx/bin/kotlin-vertx

The server should start on port 8080. Try hitting: [http://localhost:8080/example](http://localhost:8080/example)
