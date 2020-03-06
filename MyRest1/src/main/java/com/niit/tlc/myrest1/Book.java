package com.niit.tlc.myrest1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="BOOK")
public class Book {
	
	private String id;
	private String name;
	private String authorname;
	private int volumeNumber;
	private String publisher;
	
	@XmlElement(name="ID",required=true)
	public String getId() {
		return id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement(name="NAME")
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlAttribute
	public String getAuthorname() {
		return authorname;
	}
	
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	
	
	@XmlElement(name="VOLUME")
	public int getVolumeNumber() {
		return volumeNumber;
	}
	public void setVolumeNumber(int volumeNumber) {
		this.volumeNumber = volumeNumber;
	}
	
	
	@XmlTransient//dont want to exchange this data
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	

}
