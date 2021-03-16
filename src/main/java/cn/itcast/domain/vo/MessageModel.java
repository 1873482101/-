package cn.itcast.domain.vo;

/**
 * @ClassName: MessageModel
 * @Description:
 * @Author 梁智
 * @Date 2021/3/11
 * @Version 1.0
 */
public class MessageModel {
    private Integer code=1 ;//状态码
    private String msg = "成功";//提示信息
    private Object object;//回显对象

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
