package com.Air.entity;

import java.util.Date;

public class Flight {
	//������
	private String f_id;
	//���ʱ��
	private String f_time;
	//Ŀ�ĵ�
	private String f_location;
	//ʣ����λ
	private int f_sitnum;
	//Ʊ��
	private double f_price;
	//��ɵ�
	private String f_departure;
	
	
	public String getF_id() {
		return f_id;
	}
	public void setF_id(String f_id) {
		this.f_id = f_id;
	}
	public String getF_time() {
		return f_time;
	}
	public void setF_time(String f_time) {
		this.f_time = f_time;
	}
	public String getF_location() {
		return f_location;
	}
	public void setF_location(String f_location) {
		this.f_location = f_location;
	}
	public int getF_sitnum() {
		return f_sitnum;
	}
	public void setF_sitnum(int f_sitnum) {
		this.f_sitnum = f_sitnum;
	}
	public double getF_price() {
		return f_price;
	}
	public void setF_price(double f_price) {
		this.f_price = f_price;
	}
	public String getF_departure() {
		return f_departure;
	}
	public void setF_departure(String f_departure) {
		this.f_departure = f_departure;
	}
	
	
}
