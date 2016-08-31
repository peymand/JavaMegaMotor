package com.megamotor.educationsysyem.ui;
/*
 * @Author Mr Farhikhteh
 * */
public class MainFrame {

	MajorPanel majorPanel;
	CoursePanel coursePanel;
	FacultyPanel facultyPanel;
	SemesterPanel semesterPanel;
	
	JTabbedPane tabbedPane;
	
	public void MainFrame(String title){
		super(title);
		setSize(500,500);
		setLayout(new FlowLayout);
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
