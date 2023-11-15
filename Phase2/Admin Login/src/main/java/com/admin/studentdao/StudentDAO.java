package com.admin.studentdao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.admin.dbutil.DbUtil;
import com.admin.pojo.Student;

public class StudentDAO {
	public int addStudent(Student student) {
		Session session=DbUtil.dbConn();
		Transaction trans=session.beginTransaction();
		int value=(Integer) session.save(student);
		trans.commit();
		session.close();
		return value;
		
	}
}
