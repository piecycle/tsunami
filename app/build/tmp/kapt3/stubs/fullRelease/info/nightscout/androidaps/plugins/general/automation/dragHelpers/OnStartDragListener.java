package info.nightscout.androidaps.plugins.general.automation.dragHelpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/dragHelpers/OnStartDragListener;", "", "onStartDrag", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_fullRelease"})
public abstract interface OnStartDragListener {
    
    /**
     * Called when a view is requesting a start of a drag.
     *
     * @param viewHolder The holder of the view to drag.
     */
    public abstract void onStartDrag(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder);
}