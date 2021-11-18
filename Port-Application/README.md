# Docker/Spring – Sample set-up

## Table of Contents
- Running
- Contribution

## Installation
1. Make a copy of the `.env.sample` file as `.env`
2. Run the following commands in the root dir:

### macOS:
```shell
$ ./mvn clean install
$ ./mvnw package
$ cd docker
$ docker build -t springio/gs-spring-boot-docker .
$ docker-compose up -d
```

### Windows:

## Contribution
- [Contribution](https://docs.cream.camp/getting-started/contribution) – remind yourself about working with Github