package com.uap.it1311l.registrationapi.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import com.uap.it1311l.registrationapi.model.Attendee;

@Mapper
public interface RegistrationMybatisRepository {
	@Insert("INSERT INTO attendees(firstName, middleName, lastName, course, age) VALUES (#{firstName}, #{middleName}, #{lastName}, #{course}, #{age})")
	public int insert(Attendee attendee);
}
