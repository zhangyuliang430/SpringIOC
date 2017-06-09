package com.zyl.spring.auto;

import org.springframework.stereotype.Component;

/**
 * Component 代表一种组件
 * @author win
 */
@Component("usaGirlFriend")
public class UsaGirlFriend {

	public String speak(){
		return "english";
	}
}
