package com.domikado.bit.presentation.screen.schedulelist

import androidx.lifecycle.Observer
import com.domikado.bit.domain.domainmodel.Loading
import com.domikado.bit.domain.domainmodel.Schedule
import com.domikado.bit.presentation.screen.schedulelist.recyclerview.ScheduleModel

interface IScheduleListContract {

    interface View {
        fun startLoadingSchedule(loading: Loading)
        fun dismissLoading()
        fun loadSchedules(schedules: List<ScheduleModel>)
        fun showError(t: Throwable)
        fun setObserver(observer: Observer<ScheduleListEvent>)
    }
}

sealed class ScheduleListEvent {
    object OnStart: ScheduleListEvent()
    data class OnScheduleItemClick(val schedule: Schedule): ScheduleListEvent()
}