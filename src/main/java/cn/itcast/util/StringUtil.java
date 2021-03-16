package cn.itcast.util;

/**
 * @ClassName: StringUtil
 * @Description:
 * @Author 梁智
 * @Date 2021/3/11
 * @Version 1.0
 */
public class StringUtil {
    public static boolean isEmpty(String str){
        if(str == null || "".equals(str.trim())){
            return  true;
        }
        else
            return  false;
    }
}
