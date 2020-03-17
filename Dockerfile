FROM tomcat:8-jdk8-openjdk
WORKDIR /usr/local/tomcat
RUN rm -rf webapps/ROOT
COPY target/*.war webapps/ROOT.war
RUN unzip webapps/ROOT.war -d webapps/ROOT
ENV JAVA_OPTS="-Xmx1024m -Xms1024m"
ENTRYPOINT ["sh", "-c", "bin/catalina.sh run"]
