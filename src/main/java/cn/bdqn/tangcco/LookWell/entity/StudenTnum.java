package cn.bdqn.tangcco.LookWell.entity;

public class StudenTnum {
    private Integer grastuId;

    private Integer gradeId;

    private Integer maxNum;

    public StudenTnum() {
    }

    @Override
    public String toString() {
        return "StudenTnum{" +
                "grastuId=" + grastuId +
                ", gradeId=" + gradeId +
                ", maxNum=" + maxNum +
                '}';
    }

    public Integer getGrastuId() {
        return grastuId;
    }

    public void setGrastuId(Integer grastuId) {
        this.grastuId = grastuId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }
}