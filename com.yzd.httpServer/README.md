### 静态服务器的使用

```
1.
把application.properties放在com.yzd.httpServer-1.0.jar当前目录下
2.
调整application.properties的端口号与设置静态资源目录cms.static.path
例如：application.properties
----
windows环境下
#
server.port=2222
cms.static.path=C:\\Users\\proc\\Documents\\com.yzd.cms-example\\CicadasCMS\\CicadasCms\\cmsstaticfile\\
# 切换不同环境的配置信息
# pro环境不在控制台输出
spring.profiles.active=pro
----
linux环境下
#
server.port=2225
cms.static.path=/data/html/
# 切换不同环境的配置信息
# pro环境不在控制台输出
spring.profiles.active=pro

```
### 设置后台启动

```
1.启动
nohup java -jar com.yzd.httpServer-1.0.jar>/dev/null 2>&1 &
2.检测
ps -au |grep java |grep -v 'grep'
netstat -ntpl

```

### [spring boot 使用application.properties 进行外部配置](https://blog.csdn.net/yingxiake/article/details/51260302?utm_source=blogxgwz5)

```
application.properties大家都不陌生，我们在开发的时候，经常使用它来配置一些可以手动修改而且不用编译的变量，这样的作用在于，打成war包或者jar用于生产环境时，我们可以手动修改环境变量而不用再重新编译。

spring boo默认已经配置了很多环境变量，例如，tomcat的默认端口是8080，项目的contextpath是“/”等等，可以在这里看spring boot默认的配置信息http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#boot-features-external-config

spring boot允许你自定义一个application.properties文件，然后放在以下的地方，来重写spring boot的环境变量或者定义你自己环境变量

当前目录的 “/config”的子目录下
当前目录下
classpath根目录的“/config”包下
classpath的根目录下
1点和2点适合在生产环境下，例如，打包成可执行的jar包
--------------------- 
作者：node2017 
来源：CSDN 
原文：https://blog.csdn.net/yingxiake/article/details/51260302 
版权声明：本文为博主原创文章，转载请附上博文链接！
```
### [CentOS7使用firewalld打开关闭防火墙与端口](https://www.cnblogs.com/moxiaoan/p/5683743.html)

```
CentOS7使用firewalld打开关闭防火墙与端口
1、firewalld的基本使用
启动： systemctl start firewalld
关闭： systemctl stop firewalld
查看状态： systemctl status firewalld 
开机禁用  ： systemctl disable firewalld
开机启用  ： systemctl enable firewalld
 
 
2.systemctl是CentOS7的服务管理工具中主要的工具，它融合之前service和chkconfig的功能于一体。
启动一个服务：systemctl start firewalld.service
关闭一个服务：systemctl stop firewalld.service
重启一个服务：systemctl restart firewalld.service
显示一个服务的状态：systemctl status firewalld.service
在开机时启用一个服务：systemctl enable firewalld.service
在开机时禁用一个服务：systemctl disable firewalld.service
查看服务是否开机启动：systemctl is-enabled firewalld.service
查看已启动的服务列表：systemctl list-unit-files|grep enabled
查看启动失败的服务列表：systemctl --failed

3.配置firewalld-cmd

查看版本： firewall-cmd --version
查看帮助： firewall-cmd --help
显示状态： firewall-cmd --state
查看所有打开的端口： firewall-cmd --zone=public --list-ports
更新防火墙规则： firewall-cmd --reload
查看区域信息:  firewall-cmd --get-active-zones
查看指定接口所属区域： firewall-cmd --get-zone-of-interface=eth0
拒绝所有包：firewall-cmd --panic-on
取消拒绝状态： firewall-cmd --panic-off
查看是否拒绝： firewall-cmd --query-panic
 
那怎么开启一个端口呢
添加
firewall-cmd --zone=public --add-port=80/tcp --permanent    （--permanent永久生效，没有此参数重启后失效）
重新载入
firewall-cmd --reload
查看
firewall-cmd --zone= public --query-port=80/tcp
删除
firewall-cmd --zone= public --remove-port=80/tcp --permanent
```