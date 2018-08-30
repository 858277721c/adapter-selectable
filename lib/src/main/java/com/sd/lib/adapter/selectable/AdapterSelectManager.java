package com.sd.lib.adapter.selectable;

import com.sd.lib.adapter.Adapter;
import com.sd.lib.adapter.data.DataHolder;
import com.sd.lib.selectmanager.FSelectManager;

import java.util.List;

public class AdapterSelectManager<T> extends FSelectManager<T> implements DataHolder.DataChangeCallback<T>
{
    private final Adapter<T> mAdapter;

    public AdapterSelectManager(Adapter<T> adapter)
    {
        mAdapter = adapter;
        mAdapter.getDataHolder().addDataChangeCallback(this);
    }

    @Override
    protected void onSelectedChanged(boolean selected, T item)
    {
        super.onSelectedChanged(selected, item);

        if (!(item instanceof Selectable))
            throw new RuntimeException("item must be instance of SelectManager.Selectable");

        final int index = mAdapter.getDataHolder().indexOf(item);
        mAdapter.notifyItemViewChanged(index);
    }

    @Override
    public void onDataChanged(List<T> list)
    {
        setItems(list);
    }

    @Override
    public void onDataChanged(int index, T data)
    {
        updateItem(index, data);
    }

    @Override
    public void onDataAdded(int index, List<T> list)
    {
        addItems(index, list);
    }

    @Override
    public void onDataRemoved(int index, T data)
    {
        removeItem(data);
    }
}
