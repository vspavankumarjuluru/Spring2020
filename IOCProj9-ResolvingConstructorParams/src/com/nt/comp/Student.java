package com.nt.comp;

public class Student {

	private int sno;
	private String sname;
	private String sadd;
	private float avg;

	// alt+shift+s, o
	public Student(int sno, String sname, String sadd, float avg) {
		System.out.println("Student:: 4-param constructor");
		this.sno = sno;
		this.sname = sname;
		this.sadd = sadd;
		this.avg = avg;
	}

	// alt+shift+s,s
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", add=" + sadd + ", avg=" + avg + "]";
	}
}
