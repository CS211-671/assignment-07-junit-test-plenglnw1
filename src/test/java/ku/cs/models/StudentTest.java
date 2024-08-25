package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 60 คะแนน")
    void testAddScore() {
        Student student1 = new Student("6610450000", "Pong");
        student1.addScore(60);
        assertEquals(60, student1.getScore());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 81 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testGrade1() {
        Student student1 = new Student("6610450000", "Pong");
        student1.addScore(80);
        assertEquals("A", student1.grade());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 79 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testGrade2() {
        Student student1 = new Student("6610450000", "Pong");
        student1.addScore(79);
        assertEquals("B", student1.grade());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 69 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testGrade3() {
        Student student1 = new Student("6610450000", "Pong");
        student1.addScore(69);
        assertEquals("C", student1.grade());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 59 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testGrade4() {
        Student student1 = new Student("6610450000", "Pong");
        student1.addScore(59);
        assertEquals("D", student1.grade());
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 49 คะแนน และให้ Object คำนวนเกรดออกมา")
    void testGrade5() {
        Student student1 = new Student("6610450000", "Pong");
        student1.addScore(49);
        assertEquals("F", student1.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อจาก Pong เป็น Bob")
    void testChangeName() {
        Student student1 = new Student("6610450000", "Pong");
        student1.changeName("Bob");
        assertEquals("Bob", student1.getName());
    }
}