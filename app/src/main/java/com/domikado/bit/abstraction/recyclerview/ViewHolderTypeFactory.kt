package com.domikado.bit.abstraction.recyclerview

import android.view.View
import com.domikado.bit.data.viewentitiy.ScheduleItemModel

interface ViewHolderTypeFactory {
    fun type(itemModel: ScheduleItemModel): Int
    fun createViewHolder(
        itemView: View,
        viewType: Int
    ): AbstractViewHolder<*>
}