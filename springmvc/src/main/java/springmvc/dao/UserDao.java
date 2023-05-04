package springmvc.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int Userd(springmvc.model.User user)
	{
		Integer id = (Integer) this.hibernateTemplate.save(user);
		return id;
	}

}
