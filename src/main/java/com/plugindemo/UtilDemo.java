package com.plugindemo;

import com.ha1ey.CandleDragon.plugin.UtilInfo;
import com.ha1ey.CandleDragon.plugin.UtilPlugin;

public class UtilDemo implements UtilPlugin {
    @Override
    public void setUtilInfo(UtilInfo utilInfo) {
        utilInfo.setView(new ViewNodeDemo().getView());     //向setView()方法中传入一个javafx的Node对象即可
        utilInfo.setUtilName("TabTitle");       //创建Tab标签的显示Title
        utilInfo.setDescription("关于这个插件的使用Tips或者其他描述信息");     //关于这个插件的使用Tips或者其他描述信息
    }
}
