package com.deliang.minihome.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name="MINIHOME_HOUSE")
@Entity
public class House {

	private Integer id;
	private double price;
	private double size;
	private byte floor;
	private String imgPath;
	private Date createTime;
	private byte onSell;
	
	private User user;
	
	public House() { }

	public House(double price, double size, byte floor, String imgPath,
			Date createTime, byte onSell, User user) {
		super();
		this.price = price;
		this.size = size;
		this.floor = floor;
		this.imgPath = imgPath;
		this.createTime = createTime;
		this.onSell = onSell;
		this.user = user;
	}


	@GeneratedValue
	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public byte getFloor() {
		return floor;
	}

	public void setFloor(byte floor) {
		this.floor = floor;
	}

	@Column(name="IMG_PATH")
	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Temporal(TemporalType.TIME)
	@Column(name="CREATE_TIME")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name="ON_SELL")
	public byte getOnSell() {
		return onSell;
	}

	public void setOnSell(byte onSell) {
		this.onSell = onSell;
	}

	@JoinColumn(name="USER_ID")
	@ManyToOne(targetEntity=User.class)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", price=" + price + ", size=" + size
				+ ", floor=" + floor + ", imgPath=" + imgPath + ", createTime="
				+ createTime + ", onSell=" + onSell + ", user=" + user + "]";
	}
	
	
}
