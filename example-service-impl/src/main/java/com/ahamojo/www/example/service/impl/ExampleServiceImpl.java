package com.ahamojo.www.example.service.impl;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.log.LogService;

import com.ahamojo.www.example.service.Conference;
import com.ahamojo.www.example.service.ExampleService;
import com.google.common.collect.Lists;

@ProviderType
public class ExampleServiceImpl implements ExampleService {

	private List<Conference> conferences = Lists.newCopyOnWriteArrayList();

	private LogService logService;

	public void setLogService(LogService logService) {
		this.logService = logService;
	}

	public LogService getLogService() {
		return logService;
	}

	public void addConference(Conference conference) {
		conferences.add(conference);
	}

	public List<Conference> listConferences() {
		//System.out.println("==========>>> list conferences.");
		logService.log(LogService.LOG_INFO, "=============>>>> list conferences");
		return conferences;
	}

	public void startUp() {
		//System.out.println("==========>>> Starting Example service.");
		logService.log(LogService.LOG_INFO, "==========>>> Starting Example service.");
	}
}
