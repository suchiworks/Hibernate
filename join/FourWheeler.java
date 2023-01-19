package com.InheritanceJoinTable.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "vid")

public class FourWheeler extends Vehicle{
	private int modelno;
	private String modelname;
	private boolean musicSystem;
	private String etype;
	private boolean ac;
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public boolean isMusicSystem() {
		return musicSystem;
	}
	public void setMusicSystem(boolean musicSystem) {
		this.musicSystem = musicSystem;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
}
