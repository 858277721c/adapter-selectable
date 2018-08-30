package com.sd.lib.adapter.selectable;

import android.content.Context;

import com.sd.lib.adapter.FRecyclerAdapter;
import com.sd.lib.selectmanager.SelectManager;

public abstract class FSelectableRecyclerAdapter<T> extends FRecyclerAdapter<T> implements SelectableAdapter<T>
{
    private final SelectManager<T> mSelectManager = new AdapterSelectManager<>(this);

    public FSelectableRecyclerAdapter()
    {
    }

    public FSelectableRecyclerAdapter(Context context)
    {
        super(context);
    }

    @Override
    public SelectManager<T> getSelectManager()
    {
        return mSelectManager;
    }
}
