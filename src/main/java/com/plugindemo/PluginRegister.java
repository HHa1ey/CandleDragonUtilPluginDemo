package com.plugindemo;


import com.ha1ey.CandleDragon.plugin.PluginManager;
import com.ha1ey.CandleDragon.plugin.Register;


//入口类必须实现PluginManager接口
public class PluginRegister implements PluginManager {
    @Override
    public void registerPlugin(Register register) {
        register.addUtil(new UtilDemo());
    }
}
