## -模拟HTTP服务-帮助Nginx调试
### -使用场景-Nginx做灰度时，模拟两个HTTP服务
```
1.主要用于Nginx测试使用，如：
1.1-Nginx做灰度时，模拟两个服务
```

### -使用指南
```
application.properties放在jar包同目录下调整端口号与地区即可
----------------------
#--------------------------------------#
#server
server.port=18880
# dev环境只控制台输出
spring.profiles.active=dev
#--------------------------------------#
#地区
server.area=SHANG-HAI
#--------------------------------------#
# tomcat最大线程数，默认为200
server.tomcat.max-threads=800
# tomcat的URI编码
server.tomcat.uri-encoding=UTF-8
#--------------------------------------#
spring.http.encoding.charset=UTF-8
spring.http.encoding.force=true
spring.http.encoding.enabled=true
#--------------------------------------#
```
### -文件夹命名
```
第一组：
http-server-demo-28001
==
http-server-demo-0.0.1-SNAPSHOT.jar
application.properties
------------------------------------
第二组：
http-server-demo-28002
==
http-server-demo-0.0.1-SNAPSHOT.jar
application.properties
------------------------------------
```