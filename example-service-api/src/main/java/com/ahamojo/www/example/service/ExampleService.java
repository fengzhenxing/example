package com.ahamojo.www.example.service;

import java.util.List;


public interface ExampleService {
	void addConference(Conference conference);
	List<Conference> listConferences();
	void startUp();
}
