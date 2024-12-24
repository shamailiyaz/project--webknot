package com.ta.upms.project.userdataservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta.upms.project.model.Userdata;
import com.ta.upms.project.repository.UserdataRepository;

@Service
public class UserServiceuserdata {
	@Autowired
	private UserdataRepository userdataRepository;

	public Userdata userdata(Userdata userdata) {
		return userdataRepository.save(userdata);
	}

	public List<Userdata> getUserdatas() {
		return (List<Userdata>) userdataRepository.findAll();
	}


	public Userdata updateUserdata(Userdata userdata) {
		Long id = userdata.getId();
		Userdata std = userdataRepository.findById(id).get();
		std.setFirstname(userdata.getFirstname());
		std.setLastname(userdata.getLastname());
		std.setEmail(userdata.getEmail());
		std.setMobilenumber(userdata.getMobilenumber());
		std.setPlace(userdata.getPlace());
		return userdataRepository.save(std);
	}

}
