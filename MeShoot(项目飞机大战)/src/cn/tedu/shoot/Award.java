package cn.tedu.shoot;
/** 奖励接口*/
public interface Award {
	public int DOUBLE_FIRE = 0;		//火力值
	public int LIFE = 1;					//生命值
	/** 专门获取奖励类型*/
	public int getType();
}
