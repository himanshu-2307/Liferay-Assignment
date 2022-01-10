package com.liferay.service.impl;

import com.liferay.service.SampleServiceInterface;
import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			// TODO enter required service properties
		},
		service = SampleServiceInterface.class
	)
public class SampleServiceImpl implements SampleServiceInterface {

	@Override
	public int add(int number1, int number2) {
		System.err.println("###########Calling add() method##################");
		return number1 + number2;
	}

}
