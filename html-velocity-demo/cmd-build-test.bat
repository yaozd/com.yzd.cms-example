
call title Maven TEST-EVN
call mvn clean install -Ptest -DskipTests
call echo mvn package end
call pause