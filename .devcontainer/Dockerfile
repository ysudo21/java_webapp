# Tomcatのイメージをダウンロードします。
FROM tomcat:8.5.49-jdk11-openjdk
 
# ローカルのソースコードをマウントするためのディレクトリを作成します。
RUN mkdir /opt/project
 
# Mavenをインストールします。
RUN apt-get update && \
    apt-get -y install maven