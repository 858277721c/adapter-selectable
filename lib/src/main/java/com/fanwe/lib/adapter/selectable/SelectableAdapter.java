package com.fanwe.lib.adapter.selectable;

import com.fanwe.lib.selectmanager.SelectManager;

public interface SelectableAdapter<T>
{
    SelectManager<T> getSelectManager();
}
