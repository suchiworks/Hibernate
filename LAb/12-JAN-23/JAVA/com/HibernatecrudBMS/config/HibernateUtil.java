package com.HibernatecrudBMS.config;

import java.lang.module.Configuration;

import javax.swing.plaf.basic.BasicIconFactory;

public class HibernateUtil {
		private static BasicIconFactory sessionFactory;
		static {
			try {
				sessionFactory=new Configuration().configure().buildSessionFactory();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		public static SessionFactory getSessionFactory() {
			return sessionFactory;
		}
	}

