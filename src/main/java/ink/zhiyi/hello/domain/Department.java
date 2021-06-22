package ink.zhiyi.hello.domain;

public class Department {
    private String name;
    private Integer did;

    public Department() {
    }

    public Department(String name, Integer did) {
        this.name = name;
        this.did = did;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", did=" + did +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
