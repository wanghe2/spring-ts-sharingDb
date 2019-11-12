package com.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations= {"classpath:META-INF/support/service-loader.xml","classpath:META-INF/support/datasource.xml"})
public class ShareDbApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ShareDbApp.class, args);
    }
}
