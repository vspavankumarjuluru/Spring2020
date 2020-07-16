package com.nt.comp;

public class Student {

	private int sno;
	private String sname;
	private String sadd;
	private float avg;

	// ctrl+space
	public Student() {
		System.out.println("Student::0-param constructor");
	}

	// alt+shift+s, o
	public Student(int sno, String sname, String sadd, float avg) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.avg = avg;
	}

	// alt+shift+s,r
	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSadd(String sadd) {
		this.sadd = sadd;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	// alt+shift+s,s
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", add=" + sadd + ", avg=" + avg + "]";
	}
}
