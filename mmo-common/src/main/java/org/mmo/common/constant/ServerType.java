package org.mmo.common.constant;

/**
 * 服务器类型枚举
 *
 * @author JiangZhiYong
 * @mail 359135103@qq.com
 */
public enum ServerType {

    NONE(0),
    /**
     * 注册中心
     */
    CLUSTER(1),
    /**
     * 网关
     */
    GATE(2),
    /**
     * 登录
     */
    Login(3),
    ;

    private final int type;

    private ServerType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public static ServerType valueof(int type) {
        for (ServerType t : ServerType.values()) {
            if (t.getType() == type) {
                return t;
            }
        }
        return NONE;
    }
}
