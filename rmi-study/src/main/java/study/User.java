package study;

import java.io.Serializable;

/**
 * @author lei.liu
 * @since 19-1-11
 */
public class User implements Serializable {
    private static final long serialVersionUID = -5061299617165972989L;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
