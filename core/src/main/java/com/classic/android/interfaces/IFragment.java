package com.classic.android.interfaces;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * 应用名称: BaseProject
 * 包 名 称: com.classic.android.interfaces
 *
 * 文件描述: 规范Fragment接口协议
 * 创 建 人: 续写经典
 * 创建时间: 2015/11/12 10:00
 */
@SuppressWarnings("unused") public interface IFragment extends IProgress {

    /**
     * 获取布局文件
     */
    int getLayoutResId();

    /**
     * Fragment被切换到前台时调用
     */
    void onFragmentShow();

    /**
     * Fragment被切换到后台时调用
     */
    void onFragmentHide();

    /** 第一次启动会执行此方法 */
    void onFirst();

    /**
     * 初始化数据
     */
    void initData();

    /**
     * 初始化控件
     */
    void initView(@NonNull View parentView, @Nullable Bundle savedInstanceState);

    /**
     * 点击事件回调方法
     */
    void viewClick(@NonNull View v);
}
