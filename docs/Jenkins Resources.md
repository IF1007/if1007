Jenkins Resources
Seção 5, aula 37
Jenkins

These procedures are explained in the Jenkins lectures. Copy paste the contents of this file to a text file on your computer. To install jenkins yourself, you can copy paste the commands and URLs from this file.

Vagrantfile
Vagrant.configure(2) do |config|

config.vm.define "jenkins" do |jenkins|

jenkins.vm.box = "ubuntu/trusty64"

jenkins.vm.network "private_network", ip: "192.168.0.252"

jenkins.vm.hostname = “jenkins"

jenkins.vm.provider "virtualbox" do |v|

v.memory = 4096

v.cpus = 2

end

end

end

Jenkins Installation
wget -q -O - http://pkg.jenkins-ci.org/debian/jenkins-ci.org.ke... | sudo apt-key add -

sudo -s

echo "deb http://pkg.jenkins-ci.org/debian binary/" >> /etc/apt/sources.list

apt-get update

apt-get install jenkins

service jenkins start

Java 8 Installation
sudo add-apt-repository ppa:webupd8team/java -y

sudo apt-get update

sudo apt-get install oracle-java8-installer

sbt Installation
echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list

sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 642AC823

sudo apt-get update

sudo apt-get install sbt

Play framework
wget https://downloads.typesafe.com/typesafe-activator/...

unzip typsafe-activator-*zip

mv activator-1.3.6-minimal/ bin

. .profile

Running the app
activator new example-app play-java

cd example-app

./activator run # optional

Version control
sudo apt-get install git

git init

git config --global user.email “your@email”

git config --global user.name “your name”

git add .

git commit -am “initial commit”

git remote add origin https://github.com/YOURUSERNAME/play-demo.git

git push -u origin master

Jenkins config
URL: http://192.168.0.252:8080

Plugins to install: git plugin & sbt

JVM config: JVM_HOME: /usr/lib/jvm/java-8-oracle

sbt config: sbt launcher jar: /usr/share/sbt-launcher-packaging/bin/sbt-launch.jar

sbt config: sbt launch arguments: -Xmx512M

Jenkins Packaging
enablePlugins(DebianPlugin)

maintainer := “Your Name <email@address>“

packageSummary := "My custom package"

packageDescription := "Package"

Jenkins Packaging shell script
./activator debian:packageBin

Jenkins artifact storage
sudo apt-get install rng-tools

sudo rngd -r /dev/urandom

sudo su - jenkins

gpg --gen-key

gpg --list-keys

gpg --keyserver keyserver.ubuntu.com --send-key PRIVATEKEYID

exit

sudo apt-get install nginx reprepro

sudo -s

mkdir -p /var/repositories

cd /var/repositories

mkdir conf

cd conf

touch options

cat << EOF > distributions

Codename: trusty

Components: main

Architectures: i386 amd64

SignWith: 06EFF9F7

EOF

chown -R jenkins:jenkins /var/repositories

cat << EOF > /etc/nginx/sites-available/default

server {

## Let your repository be the root directory

root /var/repositories;

access_log /var/log/nginx/repo.access.log;

error_log /var/log/nginx/repo.error.log;

## Prevent access to Reprepro's files

location ~ /(db|conf) {

deny all;

return 404;

}

}

EOF

service nginx restart

Jenkins reprepro
reprepro -b /var/repositories includedeb trusty ./target/example-app_*.deb