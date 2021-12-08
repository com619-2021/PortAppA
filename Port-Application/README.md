![Team Port Application A – Logo](https://user-images.githubusercontent.com/43637240/140811424-dbdb20cd-05e0-41bc-adbc-46bcbc8127b8.png)

[![Build Project](https://github.com/com619-2021/PortAppA/actions/workflows/build.yml/badge.svg?branch=main-application)](https://github.com/com619-2021/PortAppA/actions/workflows/build.yml)

# Port Application – Project set-up

- [Documentation](https://docs.cream.camp/) – remind yourself the best project practices

## Table of Contents
- Installation
- Contribution

## Installation
1. Make a copy of the `.env.sample` file as `.env`
2. Run the following commands in the root dir:

### macOS:
```shell
$ sudo brew install maven # (prevents from using ./ hereinafter)
$ ./mvn clean install
$ ./mvnw package
$ cd docker
$ docker build -t springio/gs-spring-boot-docker .
$ docker-compose up -d
```

### Windows:
Follow the [Official Maven](https://maven.apache.org/install.html) guide on installing Maven for Windows OS. There is also a very detailed guide for that from [Mkyoung](https://mkyong.com/maven/how-to-install-maven-in-windows/).

## Contribution
- [Contribution](https://docs.cream.camp/getting-started/contribution) – remind yourself about working with Github
