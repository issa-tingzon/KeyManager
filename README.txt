For self-signed certificates, the cerificate must first be imported to %JAVA_HOME%/jre/lib/security/cacerts directory. To do this, type the following in the command line.

sudo keytool -import -alias my-cert -file <location_of_certificate> -keystore %JAVA_HOME%/jre/lib/security/cacerts

