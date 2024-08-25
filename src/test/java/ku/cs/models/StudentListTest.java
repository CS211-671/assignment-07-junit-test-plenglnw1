package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียนลงใน List แบบ 2 parameters")
    void testAddStudentTwoParameters() {
        StudentList list = new StudentList();
        list.addNewStudent("6610450000","Pong");
        assertEquals("6610450000",list.getStudents().get(0).getId());
        assertEquals("Pong",list.getStudents().get(0).getName());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มนักเรียนลงใน List แบบ 3 parameters")
    void testAddStudentThreeParameters() {
        StudentList list = new StudentList();
        list.addNewStudent("6610450000","Pong",80);
        assertEquals("6610450000",list.getStudents().get(0).getId());
        assertEquals("Pong",list.getStudents().get(0).getName());
        assertEquals("A",list.getStudents().get(0).grade());
    }

    @Test
    @DisplayName("ทดสอบการหานักเรียนใน List ด้วย id แบบหาเจอ")
    void testFindStudentByIdFound() {
        StudentList list = new StudentList();
        list.addNewStudent("6610450000","Pong");
        assertEquals("Pong",list.findStudentById("6610450000").getName());
    }

    @Test
    @DisplayName("ทดสอบการหานักเรียนใน List ด้วย id แบบหาไม้เจอ")
    void testFindStudentByIdNotFound() {
        StudentList list = new StudentList();
        assertEquals(null,list.findStudentById("6610450000"));
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 32.11 ให้กับนักเรียนใน List")
    void testGiveScore() {
        StudentList list = new StudentList();
        list.addNewStudent("6610450000","Pong");
        list.giveScoreToId("6610450000",32.11);
        assertEquals(32.11,list.getStudents().get(0).getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 32.11 ให้กับนักเรียนใน List และตรวจ Grade")
    void testViewGrade() {
        StudentList list = new StudentList();
        list.addNewStudent("6610450000","Pong");
        list.giveScoreToId("6610450000",32.11);
        assertEquals("F",list.viewGradeOfId("6610450000"));
    }
}