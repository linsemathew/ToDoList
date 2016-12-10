package com.linsemathew.todolist;

import android.provider.BaseColumns;

public class TaskContract {
    //Constants to access database
    public static final String DB_NAME = "com.linsemathew.todolist";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}