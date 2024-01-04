package ku.cs.lab03.services;

import ku.cs.lab03.models.StudentList;

public class StudentHardCodeDatasource implements Datasource<StudentList> {

	@Override
	public StudentList readData() {
		StudentList list = new StudentList();
		list.addNewStudent("6410400001", "First");
		list.addNewStudent("6410400002", "Second");
		list.addNewStudent("6410400003", "Third");
		list.addNewStudent("6410400004", "Fourth");
		return list;
	}

	@Override
	public void writeData(StudentList data) {

	}
}
