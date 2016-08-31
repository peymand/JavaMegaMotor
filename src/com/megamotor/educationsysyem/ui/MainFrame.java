package com.megamotor.educationsysyem.ui;

//import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/*
 * @Author Mr Farhikhteh
 * 
 * Started: 1395/06/10
 * */
public class MainFrame extends JFrame{

	MajorPanel majorPanel;
	CoursePanel coursePanel;
	FacultyPanel facultyPanel;
	SemesterPanel semesterPanel;
	
	JTabbedPane tabbedPane;
	
	public MainFrame(String title){
		super(title);
		setSize(500,500);
//		setLayout(new BorderLayout());
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		majorPanel = new MajorPanel();
		coursePanel = new CoursePanel();
		facultyPanel = new FacultyPanel();
		semesterPanel = new SemesterPanel();
		
		add(majorPanel);
		add(coursePanel);
		add(facultyPanel);
		add(semesterPanel);
		
		
	}
	
}
