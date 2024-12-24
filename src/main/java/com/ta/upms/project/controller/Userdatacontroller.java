package com.ta.upms.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ta.upms.project.model.Userdata;
import com.ta.upms.project.repository.UserdataRepository;
import com.ta.upms.project.userdataservice.UserServiceuserdata;

@CrossOrigin(allowedHeaders = "*", origins = "*")
@RestController
public class Userdatacontroller {

	@Autowired
	private UserServiceuserdata userServiceuserdata;

	@Autowired
	private UserdataRepository userdataRepository;

	@PostMapping("/ragister")
	public Userdata userdata(@RequestBody Userdata userdata) {
		return userServiceuserdata.userdata(userdata);
	}

	@GetMapping("/getuserdata")
	public List<Userdata> getUserdatas() {
		return userServiceuserdata.getUserdatas();
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Map<String, Boolean>> getDelete(@PathVariable Long id) {
		Userdata dlt = userdataRepository.findById(id)
				.orElseThrow(() -> new SourceNotFoundException("id is not there"));
		userdataRepository.delete(dlt);

		Map<String, Boolean> response = new HashMap<>();

		response.put("delete", Boolean.TRUE);
		return ResponseEntity.ok(response);

	}

	@PutMapping("/updateuserdata")
	public Userdata updateUserdata(@RequestBody Userdata student) {
		return userServiceuserdata.updateUserdata(student);
	}

}
