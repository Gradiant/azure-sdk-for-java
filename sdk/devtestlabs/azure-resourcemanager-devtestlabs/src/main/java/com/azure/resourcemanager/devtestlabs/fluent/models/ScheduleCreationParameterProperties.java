// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devtestlabs.models.DayDetails;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.HourDetails;
import com.azure.resourcemanager.devtestlabs.models.NotificationSettings;
import com.azure.resourcemanager.devtestlabs.models.WeekDetails;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties for schedule creation. */
@Fluent
public final class ScheduleCreationParameterProperties {
    /*
     * The status of the schedule (i.e. Enabled, Disabled)
     */
    @JsonProperty(value = "status")
    private EnableStatus status;

    /*
     * The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     */
    @JsonProperty(value = "taskType")
    private String taskType;

    /*
     * If the schedule will occur only some days of the week, specify the weekly recurrence.
     */
    @JsonProperty(value = "weeklyRecurrence")
    private WeekDetails weeklyRecurrence;

    /*
     * If the schedule will occur once each day of the week, specify the daily recurrence.
     */
    @JsonProperty(value = "dailyRecurrence")
    private DayDetails dailyRecurrence;

    /*
     * If the schedule will occur multiple times a day, specify the hourly recurrence.
     */
    @JsonProperty(value = "hourlyRecurrence")
    private HourDetails hourlyRecurrence;

    /*
     * The time zone ID (e.g. Pacific Standard time).
     */
    @JsonProperty(value = "timeZoneId")
    private String timeZoneId;

    /*
     * Notification settings.
     */
    @JsonProperty(value = "notificationSettings")
    private NotificationSettings notificationSettings;

    /*
     * The resource ID to which the schedule belongs
     */
    @JsonProperty(value = "targetResourceId")
    private String targetResourceId;

    /** Creates an instance of ScheduleCreationParameterProperties class. */
    public ScheduleCreationParameterProperties() {
    }

    /**
     * Get the status property: The status of the schedule (i.e. Enabled, Disabled).
     *
     * @return the status value.
     */
    public EnableStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the schedule (i.e. Enabled, Disabled).
     *
     * @param status the status value to set.
     * @return the ScheduleCreationParameterProperties object itself.
     */
    public ScheduleCreationParameterProperties withStatus(EnableStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the taskType property: The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     *
     * @return the taskType value.
     */
    public String taskType() {
        return this.taskType;
    }

    /**
     * Set the taskType property: The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     *
     * @param taskType the taskType value to set.
     * @return the ScheduleCreationParameterProperties object itself.
     */
    public ScheduleCreationParameterProperties withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * Get the weeklyRecurrence property: If the schedule will occur only some days of the week, specify the weekly
     * recurrence.
     *
     * @return the weeklyRecurrence value.
     */
    public WeekDetails weeklyRecurrence() {
        return this.weeklyRecurrence;
    }

    /**
     * Set the weeklyRecurrence property: If the schedule will occur only some days of the week, specify the weekly
     * recurrence.
     *
     * @param weeklyRecurrence the weeklyRecurrence value to set.
     * @return the ScheduleCreationParameterProperties object itself.
     */
    public ScheduleCreationParameterProperties withWeeklyRecurrence(WeekDetails weeklyRecurrence) {
        this.weeklyRecurrence = weeklyRecurrence;
        return this;
    }

    /**
     * Get the dailyRecurrence property: If the schedule will occur once each day of the week, specify the daily
     * recurrence.
     *
     * @return the dailyRecurrence value.
     */
    public DayDetails dailyRecurrence() {
        return this.dailyRecurrence;
    }

    /**
     * Set the dailyRecurrence property: If the schedule will occur once each day of the week, specify the daily
     * recurrence.
     *
     * @param dailyRecurrence the dailyRecurrence value to set.
     * @return the ScheduleCreationParameterProperties object itself.
     */
    public ScheduleCreationParameterProperties withDailyRecurrence(DayDetails dailyRecurrence) {
        this.dailyRecurrence = dailyRecurrence;
        return this;
    }

    /**
     * Get the hourlyRecurrence property: If the schedule will occur multiple times a day, specify the hourly
     * recurrence.
     *
     * @return the hourlyRecurrence value.
     */
    public HourDetails hourlyRecurrence() {
        return this.hourlyRecurrence;
    }

    /**
     * Set the hourlyRecurrence property: If the schedule will occur multiple times a day, specify the hourly
     * recurrence.
     *
     * @param hourlyRecurrence the hourlyRecurrence value to set.
     * @return the ScheduleCreationParameterProperties object itself.
     */
    public ScheduleCreationParameterProperties withHourlyRecurrence(HourDetails hourlyRecurrence) {
        this.hourlyRecurrence = hourlyRecurrence;
        return this;
    }

    /**
     * Get the timeZoneId property: The time zone ID (e.g. Pacific Standard time).
     *
     * @return the timeZoneId value.
     */
    public String timeZoneId() {
        return this.timeZoneId;
    }

    /**
     * Set the timeZoneId property: The time zone ID (e.g. Pacific Standard time).
     *
     * @param timeZoneId the timeZoneId value to set.
     * @return the ScheduleCreationParameterProperties object itself.
     */
    public ScheduleCreationParameterProperties withTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
        return this;
    }

    /**
     * Get the notificationSettings property: Notification settings.
     *
     * @return the notificationSettings value.
     */
    public NotificationSettings notificationSettings() {
        return this.notificationSettings;
    }

    /**
     * Set the notificationSettings property: Notification settings.
     *
     * @param notificationSettings the notificationSettings value to set.
     * @return the ScheduleCreationParameterProperties object itself.
     */
    public ScheduleCreationParameterProperties withNotificationSettings(NotificationSettings notificationSettings) {
        this.notificationSettings = notificationSettings;
        return this;
    }

    /**
     * Get the targetResourceId property: The resource ID to which the schedule belongs.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The resource ID to which the schedule belongs.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the ScheduleCreationParameterProperties object itself.
     */
    public ScheduleCreationParameterProperties withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (weeklyRecurrence() != null) {
            weeklyRecurrence().validate();
        }
        if (dailyRecurrence() != null) {
            dailyRecurrence().validate();
        }
        if (hourlyRecurrence() != null) {
            hourlyRecurrence().validate();
        }
        if (notificationSettings() != null) {
            notificationSettings().validate();
        }
    }
}
