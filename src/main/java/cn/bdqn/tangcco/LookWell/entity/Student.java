package cn.bdqn.tangcco.LookWell.entity;

public class Student {
    private Integer studentId;

    private String studentNum;

    private Tbuser tbuser;

    private Integer userId;


    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNum='" + studentNum + '\'' +
                ", userId=" + userId +
                '}';
    }

    public Integer getStudentId() {

        return studentId;
    }

    public void setStudentId(Integer studentId) {

        this.studentId = studentId;
    }

    public String getStudentNum() {

        return studentNum;
    }

    public void setStudentNum(String studentNum) {

        this.studentNum = studentNum == null ? null : studentNum.trim();
    }

    public Integer getUserId() {

        return userId;
    }

    public void setUserId(Integer userId) {

        this.userId = userId;
    }
}