package com.style.pattern.state.web;

/**
 * @author leon
 * @date 2021-04-18 15:40:29
 */
public class Test {
	public static void main(String[] args) {
		Context context = new Context();
		context.favorite();
		context.comment("好文章 一键三连");
		System.out.println("======================");
		//状态模式与责任链模式
		//行为型模式
		//状态模式与策略模式
		//
		//优点
		//1. 结构清晰 每个状态独立为类 消除多余if else
		//2. 将状态显示化 通常状态都是内部设置不同数值表示不同状态 状态切换是通过赋值的表现 不够直观
		// 状态模式 切换使用不同的状态类 更加直观 转化目的更为明确
		//3. 状态类责任明确且具有扩展性
		//缺点
		//1. 类膨胀 某个状态太多 将会有太多的状态类
		//2 状态模式实现和结构都比较复杂  如果使用不当将导致程序结构和代码的混乱
		//3. 对开闭原则支持不好 对于可切换的状态模式 增加新的状态 需要修改那些负责状态转换的源代码
		// 否则无法切换到新增状态 而且修改某个状态类行为也需要修改对应类的源代码

		//状态模式中的桥接模式
		// 连接抽象维度和具体

	}
}