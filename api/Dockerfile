FROM maven:3.3.3-jdk-8


CMD mkdir -p /app
WORKDIR /app
ADD . /app

CMD [ "sh", "-c", "mvn install -Dmaven.test.skip=true && java-Djava.security.egd=file:/dev/./urandom -jar target/samplewebapp-0.0.1-SNAPSHOT.jar" ]
