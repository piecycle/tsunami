package info.nightscout.androidaps.plugins.general.automation.dragHelpers;

import java.lang.System;

/**
 * Interface to notify an item ViewHolder of relevant callbacks from [ ].
 *
 * @author Paul Burke (ipaulpro)
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Linfo/nightscout/androidaps/plugins/general/automation/dragHelpers/ItemTouchHelperViewHolder;", "", "onItemClear", "", "onItemSelected", "app_fullRelease"})
public abstract interface ItemTouchHelperViewHolder {
    
    /**
     * Called when the [ItemTouchHelper] first registers an item as being moved or swiped.
     * Implementations should update the item view to indicate it's active state.
     */
    public abstract void onItemSelected();
    
    /**
     * Called when the [ItemTouchHelper] has completed the move or swipe, and the active item
     * state should be cleared.
     */
    public abstract void onItemClear();
}