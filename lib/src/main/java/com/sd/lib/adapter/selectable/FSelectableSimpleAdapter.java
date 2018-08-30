package com.sd.lib.adapter.selectable;

import android.content.Context;

import com.sd.lib.adapter.FSimpleAdapter;
import com.sd.lib.selectmanager.SelectManager;

public abstract class FSelectableSimpleAdapter<T> extends FSimpleAdapter<T> implements SelectableAdapter<T>
{
    private final SelectManager<T> mSelectManager = new AdapterSelectManager<>(this);

    public FSelectableSimpleAdapter()
    {
    }

    public FSelectableSimpleAdapter(Context context)
    {
        super(context);
    }

    @Override
    public SelectManager<T> getSelectManager()
    {
        return mSelectManager;
    }
}
