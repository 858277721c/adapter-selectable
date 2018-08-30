package com.sd.lib.adapter.selectable;

import android.content.Context;

import com.sd.lib.adapter.FSimpleRecyclerAdapter;
import com.sd.lib.selectmanager.SelectManager;

public abstract class FSelectableSimpleRecyclerAdapter<T> extends FSimpleRecyclerAdapter<T> implements SelectableAdapter<T>
{
    private final SelectManager<T> mSelectManager = new AdapterSelectManager<>(this);

    public FSelectableSimpleRecyclerAdapter()
    {
    }

    public FSelectableSimpleRecyclerAdapter(Context context)
    {
        super(context);
    }

    @Override
    public SelectManager<T> getSelectManager()
    {
        return mSelectManager;
    }
}
