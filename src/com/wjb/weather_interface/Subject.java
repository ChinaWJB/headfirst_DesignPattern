package com.wjb.weather_interface;

public interface Subject {
	public void registerObserver(Observer o);	//注册观察者
	public void removeObserver(Observer o);		//删除观察者
	public void notifyObservers();				//发布消息给观察者
}
