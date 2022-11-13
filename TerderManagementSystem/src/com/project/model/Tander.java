package com.project.model;

public class Tander {
	
	@Override
	public String toString() {
		return "Tander [tid=" + tid + ", tnmae=" + tnmae + ", price=" + price + ", place=" + place + ", duration="
				+ duration + "]";
	}
	private int tid;
	private String tnmae ;
	private int price;
	private String place;
	private String duration;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTnmae() {
		return tnmae;
	}
	public void setTnmae(String tnmae) {
		this.tnmae = tnmae;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Tander(int tid, String tnmae, int price, String place, String duration) {
		super();
		this.tid = tid;
		this.tnmae = tnmae;
		this.price = price;
		this.place = place;
		this.duration = duration;
	}
	public Tander(String tnmae, int price, String place, String duration) {
		super();
		this.tnmae = tnmae;
		this.price = price;
		this.place = place;
		this.duration = duration;
	}
	
	

}
