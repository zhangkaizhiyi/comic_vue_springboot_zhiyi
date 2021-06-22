package ink.zhiyi.hello.domain;

public class Users {
    private Integer id;
    private String name;
    private String hobby;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Users(Integer id, String name, String hobby, String password) {
        this.id = id;
        this.name = name;
        this.hobby = hobby;
        this.password = password;
    }

    public Users() {
    }
}