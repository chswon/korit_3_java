package ch16_object;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolname;

    public Teacher(String name, String schoolname) {
        this.name = name;
        this.schoolname = schoolname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    @Override
    public String toString() {
        return name + " 선생님의 근무지는 " + schoolname + "입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolname, teacher.schoolname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolname);
    }
}
