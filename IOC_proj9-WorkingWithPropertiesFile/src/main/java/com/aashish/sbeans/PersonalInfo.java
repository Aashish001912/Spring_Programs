package com.aashish.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource(value = "com/aashish/commons/Info.properties")
public class PersonalInfo 
{
	//Inserting the values of properties file to spring bean properties
   @Value("${per.id}")
   private Integer pid;
   @Value("${per.name}")
   private String pname;
   @Value("${per.addrs}")
   private String addrs;
   //injecting the direct values to spring bean properties
   @Value("1234567890")
   private Long mobileNo;
   
   //injecting the system property values
   @Value("${os.name}")
   private String os_name;
   @Value("${os.version}")
   private String os_ver;
   
   //injecting env.. variable values
   @Value("${Path}")
   private String path_data;

@Override
public String toString() {
	return "PersonalInfo [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", mobileNo=" + mobileNo
			+ ", os_name=" + os_name + ", os_ver=" + os_ver + ", path_data=" + path_data + "]";
}
   
   
   
   
   
   
}
