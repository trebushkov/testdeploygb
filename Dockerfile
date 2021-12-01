FROM nexus-ci.corp.dev.vtb/public-docker-proxy-registry-redhat-io/ubi8/openjdk-11:latest

ADD target/*.jar /app.jar

ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar