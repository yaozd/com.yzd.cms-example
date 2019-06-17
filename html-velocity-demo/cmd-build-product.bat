
call title Maven PRODUCT-EVN
call mvn clean install -Pproduct -DskipTests
call echo mvn package end
call pause