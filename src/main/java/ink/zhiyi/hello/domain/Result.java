package ink.zhiyi.hello.domain;

public class Result<T> {
    private String msg;
    private Integer code;
    private T data;

    public Result(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public Result() {
    }

    public Result(String msg, Integer code, T data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
