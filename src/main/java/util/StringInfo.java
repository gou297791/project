package util;

public class StringInfo {
    public  static String filePath="";
    public  static final  String USERORPASSERROR="用户名或密码不能为空";
    public  static final  String  ERRORFILE="上传文件失败！！";

    /**
     * 获得新的文件名
     * @param path
     * @return
     */
    public  static  String getNewFileName(String path){
        path=path.substring(path.lastIndexOf("."),path.length());
       return System.currentTimeMillis()+path;

    }
}
