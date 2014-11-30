package com.emsg.client;

import java.util.List;

import com.emsg.client.beans.IPacket;
import com.emsg.client.beans.Pubsub;

/**
 * 
 * @author liangc
 *
 * @param <T>
 */
public interface PacketListener<T> {
	
	/**
	 * 聊天的请求
	 * @param packet
	 */
	public void processPacket(IPacket<T> packet);

	/**
	 * 打开session 的包
	 * @param packet
	 */
	public void sessionPacket(IPacket<T> packet);

	/**
	 * 离线消息
	 * @param packets
	 */
	public void offlinePacket(List<IPacket<T>> packets);
	
	/**
	 * 订阅消息
	 * @param packets
	 */
	public void pubsubPacket(Pubsub pubsub);

	/**
	 * 类型 type=5 和 type=6 的音频视频拨号请求
	 * @param packet
	 */
	public void mediaPacket(IPacket<T> packet);

}
