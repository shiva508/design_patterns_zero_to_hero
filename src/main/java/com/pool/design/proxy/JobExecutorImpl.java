package com.pool.design.proxy;

import java.io.IOException;
import java.io.OutputStream;

public class JobExecutorImpl implements JobExecutor {

	@Override
	public void deleteInActive(String command) {
		try {
			Process proces = Runtime.getRuntime().exec(command);
			System.out.println(proces.toString());
			OutputStream outputStream=proces.getOutputStream();
			System.out.println(command);
			System.out.println(proces.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
