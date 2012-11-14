package com.unclebob.payroll.transaction.impl;

import java.math.BigDecimal;

import com.unclebob.payroll.domain.PaymentClassification;
import com.unclebob.payroll.domain.PaymentSchedule;
import com.unclebob.payroll.impl.HourlyClassification;
import com.unclebob.payroll.impl.WeeklySchedule;

public class AddHourlyEmployee extends AddEmployeeTransaction {

	private final BigDecimal hourlyRate;

	public AddHourlyEmployee(int employeeId, String name, String address, BigDecimal hourlyRate) {
		super(employeeId, name, address);
		this.hourlyRate = hourlyRate;
	}

	@Override
	protected PaymentClassification getClassification() {
		return new HourlyClassification(hourlyRate);
	}

	@Override
	protected PaymentSchedule getSchedule() {
		return new WeeklySchedule();
	}

}
