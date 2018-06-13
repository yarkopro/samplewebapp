FROM maven:3.3.3-jdk-8


CMD mkdir -p /app
WORKDIR /app
ADD . /app
RUN [ "sh", "-c", "mvn install -Dmaven.test.skip=true"]
CMD [ "sh", "-c", "java -jar target/samplewebapp-0.0.1-SNAPSHOT.jar" ]
