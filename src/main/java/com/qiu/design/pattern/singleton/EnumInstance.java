package com.qiu.design.pattern.singleton;

/**枚举创建单利
 * @author QiuYue
 * @version 1.0
 * @date 2022/11/16
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

   public static EnumInstance getInstance(){
        return INSTANCE;
   }
}
