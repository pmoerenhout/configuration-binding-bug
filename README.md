# Getting Started

## Overview
This project demonstrates the use of relaxed binding within the application.properties.


## Build
The build the Docker image:
```
mvn clean verify jib:dockerBuild -Pjib
```
## Run
It demonstrates that the relaxed binding can be used in the prefix for the @ConfigurationProperties annotation,
but not when there is a dash in the prefix.

Either run it locally, or the Docker image via Docker compose. Via de the Docker, environment variables can be used.