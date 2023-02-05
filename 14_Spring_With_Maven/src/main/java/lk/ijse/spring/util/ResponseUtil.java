package lk.ijse.spring.util;

/**
 * @author : ShEnUx
 * @time : 5:37 PM
 * @date : 2/5/2023
 * @since : 0.1.0
 **/
public class ResponseUtil {
    private String state;
    private String message;
    private Object data;

    public ResponseUtil() {
    }

    public ResponseUtil(String state, String message, Object data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseUtil{" +
                "state='" + state + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
