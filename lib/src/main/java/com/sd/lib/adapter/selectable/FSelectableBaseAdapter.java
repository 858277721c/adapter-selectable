package com.sd.lib.adapter.selectable;

import android.content.Context;

import com.sd.lib.adapter.FBaseAdapter;
import com.sd.lib.selectmanager.SelectManager;


public abstract class FSelectableBaseAdapter<T> extends FBaseAdapter<T> implements SelectableAdapter<T>
{
    private final SelectManager<T> mSelectManager = new AdapterSelectManager<>(this);

    public FSelectableBaseAdapter()
    {
    }

    public FSelectableBaseAdapter(Context context)
    {
        super(context);
    }

    @Override
    public SelectManager<T> getSelectManager()
    {
        return mSelectManager;
    }
}
