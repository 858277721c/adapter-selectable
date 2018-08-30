package com.sd.lib.adapter.selectable;

import com.sd.lib.selectmanager.SelectManager;

public interface SelectableAdapter<T>
{
    SelectManager<T> getSelectManager();
}
