package dao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import bean.Doctor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource= new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		
		Doctor doctor=(Doctor)beanFactory.getBean("Doct");
		System.out.println(doctor.toString());
		Doctor docto=(Doctor)beanFactory.getBean("Doc");
		docto.displayDoctorInfo();
	}

}
