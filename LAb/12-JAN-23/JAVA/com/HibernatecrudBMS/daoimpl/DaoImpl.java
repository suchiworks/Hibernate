package com.HibernatecrudBMS.daoimpl;

public class DaoImpl {
	public void addAccount() {
		Scanner sc=new Scanner(System.in);
		String n,e,c;
		int d;
		long p;
		System.out.println("Enter name: ");
		n=sc.next();
		System.out.println("Enter Ifsc code");
		c=sc.next();
		System.out.println("Enter Amount Deposit: ");
		d=sc.nextInt();
		System.out.println("Enter email:");
		e=sc.next();
		System.out.println("Enter Phonenumber: ");
		p=sc.nextLong();
		Bank b=new Bank();
		b.setName(n);
		b.setDeposit(d);
		b.setEmail(e);
		b.setPhone(p);
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(b);
		System.err.println("New Account Added");
		t.commit();
	}
	public void updateAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number ");
		int id=sc.nextInt();
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		
		Bank std=session.get(Bank.class, id);
		System.out.println("Enter phone number: ");
		long phone=sc.nextLong();
		std.setPhone(phone);
		session.update(std);
		System.err.println("Update Successfully...");
		t.commit();
	}
	public void deleteAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number ");
		int id=sc.nextInt();
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		Bank std1=session.get(Bank.class, id);
		session.delete(std1);
		System.err.println("Delete Successfully....");
		t.commit();
	}
	public void fetchAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id=sc.nextInt();
		Session session=HibernateUtil.getSessionFactory().openSession();
		Bank s1=session.get(Bank.class, id);
		System.out.println(s1.getAccountNo()+" "+s1.getName()+" "+s1.getIfsccode()+"  "+s1.getDeposit()+" "+s1.getEmail()+" "+s1.getPhone());
	}
}

