package cn.wolfcode.utils;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Result {
    private Integer code;   // 响应状态码 1 代表成功; 0 代表失败
    private String msg;     // 响应状态码对应描述的字符串。
    private Object data;    // 服务器返回的数据。

    // 代表成功的方法  针对于增删改（不需要服务器返回数据）
    public static Result success() {
        return new Result(1, "success", null);
    }

    // 代表成功的方法  针对于查询（把查询得到的结果从服务器响应到前端。携带数据）
    public static Result success(Object data) {
        return new Result(1, "success", data);
    }

    // 代表成功的方法  针对于成功只返回一个消息
    public static Result success(String msg) {
        return new Result(1, msg, null);
    }

    // 代表失败的方法
    public static Result err(String msg) {
        return new Result(0, msg, null);
    }
}
