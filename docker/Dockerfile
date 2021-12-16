FROM tomcat:9.0.54-jdk11-openjdk-buster

LABEL maintainer="craig.gallen@solent.ac.uk"

ADD ./target/portapp_a /usr/local/tomcat/webapps/portapp_a

EXPOSE 8080

CMD ["catalina.sh", "run"]