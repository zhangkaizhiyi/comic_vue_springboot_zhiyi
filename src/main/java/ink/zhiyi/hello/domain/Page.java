package ink.zhiyi.hello.domain;

public class Page {
    private String name;
    private String purl;
    private Integer pid;
    private Integer cid;

    @Override
    public String toString() {
        return "Page{" +
                "name='" + name + '\'' +
                ", purl=" + purl + '\'' +
                ", pid=" + pid +
                ", cid=" + cid +
                '}';
    }

    public Page() {
    }

    public Page(String name, String purl, Integer pid, Integer cid) {
        this.name = name;
        this.purl = purl;
        this.pid = pid;
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}